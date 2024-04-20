<?php
    define('MYSQL_HOST', 'localhost:3306');
    define('MYSQL_USER', 'root');
    define('MYSQL_PASSWORD', '');
    define('MYSQL_DB_NAME', 'bd_sistemas');
 
     try {
        $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);

    } catch (PDOException $ex) {
        echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
    }
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/reset.css">
    <script src="https://cdn.lordicon.com/bhenfmcm.js"></script>
    <title>PHP - Sistema de Acesso ao Banco de Dados</title>
</head>
<body class="body">
        <div class="container">
            <div class="row">
            <div class="col">
                <nav class="navbar">
                    <a href="consulta.php" class="navbar-brand title"><p class="p">Consulta de Dados</p></a>
                        <a href="index.php" class="navbar-brand"><h3 class="title">SISTEMA WEB</h3></a>
                    <a href="index.php" class="navbar-brand title"><p class="p">Cadastro de Clientes</p></a>
                </nav>
            </div>   
            </div>
            <br>
            <div class="linha">
            <h2 class="subtitle_2 consulta">Consultar - Contatos Agendados</h2>
            </div>
            <a href="cadastroPag.php" class="Options">Não tem um cadastro? Clique aqui para cadastrar.</a>
            <br>
            <br>
            <table class="table Options tabela table-responsive table-hover table-light table-bordered">
                <thead>
                    <tr>
                    <th scope="col">Nome</th>
                    <th scope="col">Endereço</th>
                    <th scope="col">Bairro</th>
                    <th scope="col">CEP</th>
                    <th scope="col">Cidade</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Opções</th>
                    </tr>
                </thead>
                <tbody class="table-group-divider table-dark Options">
                    <tr>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query($sql);
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                echo $rows[$i]['nome'] . "<br><br><br>";
                                }
                            ?>
                        </td>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query( $sql );
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                echo $rows[$i]['endereco'] . "<br><br><br>";
                                }
                            ?>
                        </td>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query( $sql );
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                echo  $rows[$i]['bairro'].  "<br><br><br>";
                                }
                            ?>
                        </td>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query( $sql );
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                echo  $rows[$i]['cep'].  "<br><br><br>";
                                }
                            ?>
                        </td>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query( $sql );
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                echo  $rows[$i]['cidade'] . "<br><br><br>";
                                }
                            ?>
                        </td>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query( $sql );
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                echo  $rows[$i]['estado'] . "<br><br><br>";
                                }
                            ?>
                        </td>
                        <td><?php
                                $sql = "SELECT * FROM clientes";
                                $result = $pdo->query( $sql );
                                $rows = $result->fetchAll();

                                for ($i=0; $i < count($rows); $i++) { 
                                    
                                echo "<a  style='padding: 0px; margin: 0px 20px 0px 0px;' href='atualizarPag.php?id=". $rows[$i]['id'] . "' class='Options btn btn-sm' role='button'><lord-icon  src='https://cdn.lordicon.com/weoiqraa.json' trigger='hover' colors='primary:#0fb6e0' style='width:25px;height:25px' </lord-icon>      </a>";
                                echo "<a style='padding: 0px; margin: 0px;' href='deletar.php?id=". $rows[$i]['id'] . "' class='Options btn btn-sm' style='padding: 0px; margin: 0px;' role='button'>      <lord-icon  src='https://cdn.lordicon.com/kfzfxczd.json' trigger='hover' colors='primary:#0fb6e0' style='width:25px;height:25px' </lord-icon></a>". "<br><br>";
                                }
                                
                            ?>
                        
                        </td>
                    </tr>
                </tbody>
                </table>
        <br>
        <br>
        <br>      
        </div>      
    </body>        
</html>    