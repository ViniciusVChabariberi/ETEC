<?php

define('SERVIDOR' , 'localhost:3306');
define('USUARIO' , 'root');
define('SENHA' , '');
define('BANCO' , 'clientes');


class Conexao{

    protected $mysqli;

    public function __construct(){
        $this ->conexaoMysql();
    }

    public function conexaoMysql(){
        $this->mysqli = new mysql(SERVIDOR, USUARIO, SENHA, BANCO);
    }

    public function setAgendamentos($nome, $telefone, $origem, $data_contato, $observacao){
        $stmt = $this->mysqli->prepare("INSERT INTO clientes('Nome' , 'Telefone' , 'Origem' , 'DataContato' , 'Observacao') VALUES(?,?,?,?,?)");
        $stmt->bind_param("sssss", $nome, $telefone, $origem, $data_contato, $observacao);
        if($stmt->execute() == TRUE){
            return true;
        } else {
            return false;
        };
    }
}

?>