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
                <h2>Entrar na sua conta</h2><br>
            </div>
            <form action="verificar.php" method="POST">
                <div class="col">
                    <label for="email" class="formulario__titulos">Digite o email: </label><br>
                    <input type="email" pattern=".+@gmail.com" name="emailLogin" id="email" required><br>
                </div>
                <div class="col">
                <label for="senha" class="formulario__titulos--senha">Digite sua Senha: </label><br>
                <label for="senha" class="formulario__titulos">(mínimo com 8 caracteres)</label><br>
                <input type="password" minlength="8" name="senhaLogin" id="" placeholder="********" required><br>
                </div>
                <div class="col">
                    <br><input type="submit" value="Login" class="botao">
                </div>
            </form>    
        </div>
    </div>
    
</body>
</html>