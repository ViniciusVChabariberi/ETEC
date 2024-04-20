<?php

    require_once("class.php");

    class Teste{
    private $principal;

    public function __construct(){
    $principal = new Principal();

    $principal->setNome($_POST['nome']);
    echo $principal->getNome();

    $principal->setTelefone($_POST['telefone']);
    echo $principal->getTelefone();


    $principal->setOrigem($_POST['origem']);
    echo $principal->getOrigem();


    $principal->setData($_POST['data']);
    echo $principal->getData();

    $principal->setObservacao($_POST['observacao']);
    echo $principal->getObservacao();
    }
}new Teste();
?>    