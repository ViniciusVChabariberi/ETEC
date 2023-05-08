<?php

//$con = mysql_connect("localhost","root","") or die ("Erro de conexão");
//mysql_select_db("bd_sistemas",$con);

define( 'MYSQL_HOST', 'localhost:3306' );
define( 'MYSQL_USER', 'root');
define( 'MYSQL_PASSWORD', '');
define( 'MYSQL_DB_NAME', 'bd_sistemas' );

try {
    $PDO = new PDO( 'mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);
} catch ( PDOException $e ) {

    echo  'Erro ao conectar com o MySQL: ' . $e->getMessage();
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP - Sistema de Acesso ao Banco de Dados</title>
</head>
<body>
    <?php
        $sql = "SELECT * FROM clientes";
        $result = $PDO->query( $sql );
        $rows = $result->fetchAll();

        for ($i=0; $i < count($rows); $i++) { 
            echo "Nome: " .   $rows[$i]['nome'] . "<br>";
            echo "Endereço: " .   $rows[$i]['endereco'] . "<br>";
            echo "Bairro: " .   $rows[$i]['bairro'].  "<br>";
            echo "Cep: " .   $rows[$i]['cep'].  "<br>";
            echo "Cidade: " .   $rows[$i]['cidade'] . "<br>";
            echo "Estado: " .   $rows[$i]['estado'] . "<br><br>";
                
        }
    ?>
</body>
</html>