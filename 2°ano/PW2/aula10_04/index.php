<?php

    if(isset($_POST['nome'])){
        $arquivo = fopen("dados.txt" , "a");
        fwrite($arquivo , "Nome: " . $_POST['nome'] . "\n");
        fclose($arquivo);
    }

    if(isset($_POST['votob'])){
        $voto = fopen("voto.txt" , "a");
        fwrite($voto , "Voto: branco" . "\n");
        fclose($voto);
    }

    if(isset($_POST['votov'])){
        $voto = fopen("voto.txt" , "a");
        fwrite($voto , "Voto: vermelho " . "\n");
        fclose($voto);
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
        Nome:<input type="text" name="nome" id="nome" required><br>
       <br> Votação <br>

        Branco: <input type="radio" name="votob" id="votob"><br>
        Vermelho: <input type="radio" name="votov" id="votov"><br>
        <input type="submit" name="cadastrar" id="cadastrar" value="Cadastrar">
    </form>
</body>
</html>


