<?php


if(isset($_POST['Sonic'])){
    $voto = fopen("dados.txt", "a");
    fwrite($voto, $_POST['Sonic'] . "\n");
    fclose($voto); 
}else if(isset($_POST['Mario'])){
    $voto = fopen("dados.txt", "a");
    fwrite($voto, $_POST['Mario'] . "\n");
    fclose($voto); 
}

    function Registrar(){
        $voto = "dados.txt";
        $vt = fopen($voto , "r");
        $total = fread($vt , filesize($voto));

		$votoMario = 0;
        $votoSonic = 0;

        $votoMario = substr_count($total , "Mario");
        $votoSonic = substr_count($total , "Sonic");


		if($votoSonic > $votoMario){
			echo "<p class='resultado'>Sonic: " . $votoSonic . " votos.</p>";
			echo "<p class='resultado'>Mario: " . $votoMario . " votos.</p>";
			echo "<p class='resultado'>Sonic venceu a votação.</p>";
		}else if($votoMario > $votoSonic){
			echo "<p class='resultado'>Mario: " . $votoMario . " votos.</p>";
			echo "<p class='resultado'>Sonic: " . $votoSonic . " votos.</p>";
			echo "<p class='resultado'>Mario venceu a votação.</p>";
		}else if($votoMario == $votoSonic){
			if($votoMario == 1){
				echo "<p class='resultado'>Sonic: " . $votoSonic . " voto.</p>";
				echo "<p class='resultado'>Mario: " . $votoMario . " voto.</p>";
				echo "<p class='resultado'>Empate.</p>";
 			}else if($votoMario > 1){
				echo "<p class='resultado'>Sonic está com: " . $votoSonic . " votos.</p>";
				echo "<p class='resultado'>Mario está com: " . $votoMario . " votos.</p>";
				echo "<p class='resultado'>Empate.</p>";
			}
		}
	}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container text-center">
        <form method="POST" action="">
            <div class="row">
                <div class="col">
                    <h1> Melhor Personagem <h1><br>
                </div>
            </div>
            <div class="row">     
                <div class="col">
                    <img src="img/Mario.jpg" alt="">
                    <input type="submit" name="Mario" id="Mario" value="Mario"><br>
                </div> 
                <div class="col">
                    <img src="img/Sonic.jpg" alt="">
                    <input type="submit" name="Sonic" id="Sonic" value="Sonic"><br>
                </div>   
            </div>  
        </form>    
        <form action="resultado.php">
            <div class="row">
                <div class="col">
                    <input type="submit" name="Registrar" id="Registrar" value="resultado">
                </div>
            </div>    
        </form>
    </div>        
</body>
</html>


