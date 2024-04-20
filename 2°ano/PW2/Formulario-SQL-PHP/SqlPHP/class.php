<?php

    class Principal{
        private $nome;
        private $endereco;
        private $bairro;
        private $cep;
        private $cidade;
        private $estado;

        //Método GET
        public function getNome(){
            return $this->nome;
        }

        //Método SET
        public function setNome($nome){
            $this->nome = $nome;
        }

        public function getEndereco(){
            return $this->endereco;
        }

        public function setEndereco($endereco){
            $this->endereco = $endereco;
        }

        //Metodo get
        public function getBairro(){
            return $this->bairro;
        }
        //Metodo set
        public function setBairro($bairro){
            $this->bairro = $bairro;
        }

        public function getCep(){
            return $this->cep;
        }

        public function setCep($cep){
            $this->cep = $cep;
        }

        public function getCidade(){
            return $this->cidade;
        }

        public function setCidade($cidade){
            $this->cidade = $cidade;
        }

        public function getEstado(){
            return $this->estado;
        }

        public function setEstado($estado){
            $this->estado = $estado;
        }

    }
?>