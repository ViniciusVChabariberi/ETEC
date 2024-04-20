<?php

require_once("class.php");

class Teste{
    private $principal;

    public function __construct(){
        $principal = new Principal();

        $principal->setNome($_POST['nome']);
        echo $principal->getNome();

        echo "<br>";

        $principal->setTelefone($_POST['telefone']);
        echo $principal->getTelefone();

        echo "<br>";

        $principal->setOrigem($_POST['origem']);
        echo $principal->getOrigem();

        echo "<br>";

        $principal->setData($_POST['data']);
        echo $principal->getData();

        echo "<br>";

        $principal->setObservacao($_POST['observacao']);
        echo $principal->getObservacao();
    }
}new Teste();

?>