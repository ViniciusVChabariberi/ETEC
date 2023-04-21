<?php
    //Classe
    class Pessoa{
        //Atributos
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
            return $this->$endereco;
        }

        public function setEndereco($endereco){
            $this->endereco = $endereco;
        }
    }
?>