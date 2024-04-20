<?php 
    $nomeForm = $_POST['nome'] ?? "";
    $enderecoForm = $_POST['endereco'] ?? "";
    $bairroForm = $_POST['bairro'] ?? "";
    $cepForm = $_POST['cep'] ?? "";
    $cidadeForm = $_POST['cidade'] ?? "";
    $estadoForm = $_POST['estado'] ?? "";

    define('MYSQL_HOST' , 'localhost:3306');
    define('MYSQL_USER' , 'root');
    define('MYSQL_PASSWORD' , '');
    define('MYSQL_DB_NAME' , 'bd_sistemas');

    try {
        $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);
        $atualizar = $pdo->prepare("UPDATE clientes SET nome='$nomeForm' , endereco='$enderecoForm' , bairro='$bairroForm' , cep='$cepForm' , cidade='$cidadeForm' , estado='$estadoForm' WHERE id=$_GET[id]");
        $atualizar->execute();

    } catch (PDOException $ex) {
        echo "Erro ao tentar fazer a conexão com MYSQL: " . $ex->getMessage();
    }

    $id = (int) $_GET['id'];

    if ($resultDelete !== false) {

        header("Location: consulta.php");
        exit();
    } else {
    
        echo "Erro ao excluir os dados.";
    }
?>           