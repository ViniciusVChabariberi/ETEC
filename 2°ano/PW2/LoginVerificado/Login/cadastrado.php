<?php 
    function cadastro(){
        $email = $_POST['email'];
        $senha = $_POST['senha'];

        $arquivo = fopen('cadastros.txt' , 'a');
        fwrite($arquivo , "$email-$senha\n");
    }

    cadastro();
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
    <title>cadastrando</title>
</head>
<body class="body__cadastrado">
    <div class="container text-center">
        <div class="box__cadastrado">
            <div class="col">
                <h1>Cadastrando sua conta...</h1><br>
            </div>
            <form action="cadastrado.php" method="POST">
                <div class="col">
                    <h3>Parabéns! Cadastro realizado com sucesso.</h3><br>
                    <br><a href="index.php" class="link" style="color: blue">Voltar para a tela de Sign in</a>
                </div>
            </form>
        </div>
    </div>
    
</body>
</html>