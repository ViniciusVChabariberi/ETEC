<?php


if(isset($_POST['branco'])){
    $voto = fopen("dados.txt", "a");
    fwrite($voto, $_POST['branco'] . "\n");
    fclose($voto); 
}else if(isset($_POST['vermelho'])){
    $voto = fopen("dados.txt", "a");
    fwrite($voto, $_POST['vermelho'] . "\n");
    fclose($voto); 
}

    function Registrar(){
        $voto = "dados.txt";
        $vt = fopen($voto , "r");
        $total = fread($vt , filesize($voto));

		$votoVermelho = 0;
        $votoBranco = 0;

        $votoVermelho = substr_count($total , "Vermelho");
        $votoBranco = substr_count($total , "Branco");


		if($branco > $vermelho){
			echo "<p>branco: " . $branco . " votos.</p>";
			echo "<p>vermelho: " . $vermelho . " votos.</p>";
			echo "<p>branco venceu.</p>";
		}else if($vermelho > $branco){
			echo "<p>vermelho: " . $vermelho . " votos.</p>";
			echo "<p>branco: " . $branco . " votos.</p>";
			echo "<p>vermelho venceu.</p>";
		}else if($vermelho == $branco){
			if($vermelho == 1){
				echo "<p>branco: " . $branco . " voto.</p>";
				echo "<p>vermelho: " . $vermelho . " voto.</p>";
				echo "<p>Empate.</p>";
 			}else if($vermelho > 1){
				echo "<p>branco: " . $branco . " votos.</p>";
				echo "<p>vermelho: " . $vermelho . " votos.</p>";
				echo "<p>Empate.</p>";
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
</head>
<body>
    <div class="container text-center">
        <form method="POST" action="">
            <div class="row">
                <div class="col">
                    <h2> Votação <h2>
                </div>
                <div class="col">
                    Branco: <input type="submit" name="branco" id="branco"><br>
                </div> 
                <div class="col">
                    Vermelho: <input type="submit" name="vermelho" id="vermelho"><br>
                </div>    
            </div>    
        </form>    
        <form action="resultado.php">
            <div class="row">
                <div class="col">
                    <input type="submit" name="Registrar" id="Registrar" value="registrar">
                </div>
            </div>    
        </form>
    </div>        
</body>
</html>


