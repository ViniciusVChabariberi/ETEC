<?php

class ControllerAgendamentos{

    private $cadastro;

    public function __construct(){
        $this->cadastro = new Agendamentos();
        $this->incluir();
    }

    private function incluir(){
        $this->cadastro->setNome($_POST['nome']);
        $this->cadastro->setTelefone($_POST['telefone']);
        $this->cadastro->setOrigem($_POST['origem']);
        $this->cadastro->setData($_POST['data']);
        $this->cadastro->setObservacao($_POST['observacao']);
    }

}

?>