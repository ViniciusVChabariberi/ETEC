<?php


    if(isset($_POST['votob'])){
        $voto = fopen("voto.txt" , "a");
        fwrite($voto , "Voto: branco" . "\n");
        fclose($voto);
    } else if(isset($_POST['votov'])){
        $voto = fopen("voto.txt" , "a");
        fwrite($voto , "Voto: vermelho " . "\n");
        fclose($voto);
    }

    function Registrar(){
        $voto = "dados.txt";

        $contarVotoBranco = fopen($voto, "r");
        $votoBranco = fread($contarVotoBranco, filesize($voto));
        $branco = substr_count(' '.$votoBranco.' ', 'Voto Registrado: Branco');

        $contarVotoVerde = fopen($voto, "r");
        $votoVerde = fread($contarVotoVerde, filesize($voto));
        $verde = substr_count(' '.$votoVerde.' ', 'Voto Registrado: Verde');

        if($verde<$branco){
            $voto = fopen("dados.txt" , "a");
            fwrite($voto, "Voto verde venceu " . $verde . " votos \n");
			fclose($voto);
			echo "<p>Voto verde: " . $verde . " votos.<p>";
			echo "<p>Voto branco: " . $branco . " votos.</p>";
			echo "<p>Voto verde venceu.</p>";
        } else if($branco<$verde){
            $voto = fopen("dados.txt" , "a");
            fwrite($voto, "Voto branco venceu " . $branco . " votos \n");
			fclose($voto);
			echo "<p>Voto branco: " . $branco . " votos.<p>";
			echo "<p>Voto verde: " . $verde . " votos.</p>";
			echo "<p>Voto branco venceu.</p>";
        }else if($branco == $verde){
            if($branco == 1){
                $voto = fopen("dados.txt" , "a");
                fwrite($voto, "O voto verde empatou com o voto branco. Quantidade de votos " . $verde . "voto cada. \n");
                fclose($voto);
                echo "<p>Voto verde: " . $verde . " voto.<p>";
                echo "<p>Voto branco: " . $branco . " voto.</p>";
                echo "<p>Empate.</p>";
            } else if {
                $voto = fopen("dados.txt" , "a");
                fwrite($voto, "O voto verde empatou com o voto branco. Quantidade de votos " . $verde . "voto cada. \n");
                fclose($voto);
                echo "<p>Voto verde: " . $verde . " voto.<p>";
                echo "<p>Voto branco: " . $branco . " voto.</p>";
                echo "<p>Empate.</p>";
            }
        }
    }
    
    if($_SERVER['REQUEST_METHOD'] == "POST" && isset($_POST['Registrar'])){
        Registrar();
    }

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body style="background-color: <?php if(isset($_POST['nome'])) { echo '#CCCCCC'; } else { echo 'f3f3f3'; }?>">
    <form name="dados_pessoais" method="POST" action="">
       <br> Votação <br>

        Branco: <input type="radio" name="votob" id="votob"><br>
        Vermelho: <input type="radio" name="votov" id="votov"><br>
        <input type="submit" name="cadastrar" id="cadastrar" value="Cadastrar">
    </form>
</body>
</html>


