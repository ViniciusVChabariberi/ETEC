<?php
    require_once("../conexao.php");

    class Agendamentos extends Conexao{
        private $Nome;
        private $Telefone;
        private $Origem;
        private $DataContato;
        private $Observacao;

        //GET & SET
        public function setNome($string){
            $this->Nome = $string;
        }

        public function getNome(){
            return $this->Nome;
        }

        public function setTelefone($string){
            $this->Telefone = $string;
        }

        public function getTelefone(){
            return $this->Telefone;
        }

        public function setOrigem($string){
            $this->Origem = $string;
        }

        public function getOrigem(){
            return $this->Origem;
        }

        public function setData($string){
            $this->DataContato = $string;
        }

        public function getData(){
            return $this->DataContato;
        }

        public function setObservacao($string){
            $this->Observacao = $string;
        }

        public function getObservacao(){
            return $this->Observacao;
        }

        public function incluir(){
            return $this->setAgendamentos($this->getNome(), $this->getTelefone(), $this->getOrigem(), $this->getData(), $this->getObservacao());
        }
    }


?>