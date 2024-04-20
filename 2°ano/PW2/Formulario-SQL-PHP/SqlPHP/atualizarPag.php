<?php
    define('MYSQL_HOST', 'localhost:3306');
    define('MYSQL_USER', 'root');
    define('MYSQL_PASSWORD', '');
    define('MYSQL_DB_NAME', 'bd_sistemas');
 

     try {
        $PDO = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);

    } catch (PDOException $ex) {
        echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
    }

    $id = (int) $_GET['id'];
    $sql = "SELECT * FROM clientes WHERE id = $id";
    $stmt = $PDO->prepare($sql);
   
    $stmt->execute();
    
    if ($stmt->rowCount() > 0) {
        $row = $stmt->fetch(PDO::FETCH_ASSOC);
    
        $nome = $row['nome'];
        $endereco = $row['endereco'];
        $bairro = $row['bairro'];
        $cep = $row['cep'];
        $cidade = $row['cidade'];
        $estado = $row['estado'];
    } else {
        echo 'Registro não encontrado.';
    }
    



?>    
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/reset.css">
  </head>
    <body class="body--atualizar">
        <div class="container">
            <div class="row">
            <div class="col">
                <nav class="navbar rosa">
                    <a href="consulta.php" class="navbar-brand title"><p class="p">Consulta de Dados</p></a>
                        <a href="index.php" class="navbar-brand"><h3 class="title">SISTEMA WEB</h3></a>
                    <a href="index.php" class="navbar-brand title"><p class="p">Cadastro de Clientes</p></a>
                </nav>
            </div>  
            </div>
            <div class="row">
                <div class="col">
                    <p class="subtitle--atualizar">Editar dados do cliente</p>
                </div>
            </div>
            <div class="row">    
                <div class="col formulario">
                    <form action="atualizar.php?id=<?=$_GET['id']?>" method="POST">
                        <div class="mb-3">
                            <label class="formulario_titulos--atualizar" for="nome">Nome:</label> 
                            <input type="text" class="form-control" name="nome" id="nome" autocomplete= off value="<?php echo $nome;?>" required>
                        </div>  

                        <div class="mb-3">
                            <label class="formulario_titulos--atualizar" for="tele">Endereço:</label> 
                            <input type="text" class="form-control"  name="endereco" id="endereco" autocomplete= off value="<?php echo $endereco; ?>" required>
                        </div> 

                        <div class="mb-3">
                            <label for="select" class="form-label formulario_titulos--atualizar">Bairro:</label>
                            <input type="text" class="form-control" name="bairro" id="bairro" autocomplete= off value="<?php echo $bairro; ?>" required>
                        </div>

                        <div class="mb-3">
                            <label class="formulario_titulos--atualizar" for="data">CEP:</label> 
                            <input type="tel" class="form-control" placeholder="xxxxx-xxx" id="cep" name="cep" autocomplete= off value="<?php echo $cep; ?>" required>
                        </div>

                        <div class="mb-3">
                            <label for="select" class="form-label formulario_titulos--atualizar">Cidade:</label>
                            <input type="text" class="form-control" name="cidade" id="cidade" autocomplete= off value="<?php echo $cidade; ?>" required>
                        </div>
                        
                        <div class="mb-3">
                        <label for="select" class="form-label formulario_titulos--atualizar">Estado:</label>
                            <select class="form-select" name="estado" id="estado" autocomplete= off value="<?php echo $estado; ?>" required>
                                <option value="sp">SP</option>
                                <option value="rj">RJ</option>
                                <option value="mg">MG</option>
                                <option value="es">ES</option>
                            </select>  
                        </div>
                        <div class="mb-3">    
                            <input  class="btn botao--atualizar" type="submit" name="editar" value="Editar">
                        </div>    
                    </form>
                </div>
            </div>
    </div>        
  </body>
</html>
