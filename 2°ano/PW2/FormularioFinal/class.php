<?php

    class Principal{
        private $nome;
        private $telefone;
        private $origem;
        private $data;
        private $observacao;

        //Método GET
        public function getNome(){
            return $this->nome;
        }

        //Método SET
        public function setNome($nome){
            $this->nome = $nome;
        }

        //Metodo get
        public function getTelefone(){
            return $this->telefone;
        }
        //Metodo set
        public function setTelefone($telefone){
            $this->telefone = $telefone;
        }

        public function getOrigem(){
            return $this->origem;
        }

        public function setOrigem($origem){
            $this->origem = $origem;
        }

        public function getData(){
            return $this->data;
        }

        public function setData($data){
            $this->data = $data;
        }

        public function getObservacao(){
            return $this->observacao;
        }

        public function setObservacao($observacao){
            $this->observacao = $observacao;
        }

    }
?>