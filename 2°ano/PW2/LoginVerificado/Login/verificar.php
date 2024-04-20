<?php 
    function verificar($emailLogin, $senhaLogin){
        $arquivo = 'cadastros.txt'; 
        if(file_exists($arquivo)){
            $arq = fopen($arquivo , 'r');

            $texto = fread($arq , filesize($arquivo));

            if(isset($emailLogin) && isset($senhaLogin)){
                if(str_contains($texto , $emailLogin) && str_contains($texto , $senhaLogin)){
                    echo "<h2>Seja bem vindo(a) ao site!</h2>";    
                }else{
                    echo "Seu cadastro não foi encontrado.";
                }
            }else{
                echo "Sua senha e/ou email cadastrados não foram encontrados, tente novamente!";
            }
        }else{
            echo "Nenhum cadastro com essa senha e/ou email foram encontrados no sistema.";
        }
    }
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <title>Login</title>
</head>
<body class="body">
    <div class="container text-center">
        <div class="box">
            <div class="col">
                <h2>Verificador de conta...</h2><br>
            </div>
            <form action="cadastrado.php" method="POST">
                <?php 
                    require_once('verificar.php');
                    $emailLogin = $_POST['emailLogin'];
                    $senhaLogin = $_POST['senhaLogin'];
                    verificar($emailLogin, $senhaLogin)
                ?>
            <div class="col">
            <br><a href="index.php" class="link">Não tem cadastro ainda?</a>
            </div>    
            </form>
        </div>
    </div>
    
</body>
</html>