<?php
    require_once('conexao.php');

    $nome = $_POST['nome'] ?? "";
    $telefone = $_POST['telefone'] ?? "";
    $origem = $_POST['origem'] ?? "";
    $data = $_POST['data'] ?? "";
    $observacao = $_POST['observacao'] ?? "";

    
    $sql = "INSERT INTO agendamento (nome, telefone, origem, data_contato, observacao) VALUES ('$nome' , '$telefone' , '$origem' , '$data' , '$observacao')";
    $stmt = $pdo->prepare($sql);

    if($stmt->execute()){
        header("Location: consulta.php");
    }
?>