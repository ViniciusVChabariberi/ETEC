<?php
    //Classe
    public class Pesso(){
        //Atributos
        private $nome;
        private $endereco;
        private $bairro;
        private $cep;
        private $cidade;
        private $estado;

        //Método GET
        public function getNome(){
            return $this->$nome;
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

        public function getBairro(){
            return $this->$bairro;
        }

        public function setBairro($bairro){
            $this->bairro = $bairro;
        }

        public function getCep(){
            return $this->$cep;
        }

        public function setCep($cep){
            $this->cep = $cep;
        }        

        /*
        .
        .
        .
        Deve-se colocar todos os métodos GET e SET correspondentes e classe Pessoa()
        */
    }
?>