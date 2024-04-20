<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
  </head>
    <body class="body">
        <div class="container">
            <div class="row">
                <div class="col">
                    <nav class="navbar navbar-expand-lg">
                        <div class="container-fluid">
                            <a class="navbar-brand" href="#"><h3 class="title">SISTEMA WEB</h3></a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNav">
                                <ul class="navbar-nav">
                                    <li class="nav-item">
                                        <a class="nav-link active text-white Options" aria-current="page" href="index.php">Cadastrar</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link active text-white-50 Options" aria-current="page" href="dados.php">Consultar</a>
                                    </li>
                                </ul>
                            </div>
                        </div>   
                    </nav>
                </div>    
            </div>

            <div class="linha">
            <h2 class="subtitle_2 consulta">Consultar - Contatos Agendados</h2>
            </div>
            
            <div class="linha">
                <div class="table-responsive"> 
                
                    <table class="tabela table table-borderless">
                        <thead>
                            <tr class="tabela_linha">
                                <td class="tabela_dados">Nome</td>
                                <td class="tabela_dados">Telefone</td>
                                <td class="tabela_dados">Origem</td>
                                <td class="tabela_dados">Contato</td>
                                <td class="tabela_dados">Observação</td>
                                <td class="tabela_dados">Ação</td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="tabela_c">
                                    <?php
                                    require_once("class.php");
                                    $principal = new Principal();
                                    $principal->setNome($_POST['nome']);
                                    echo $principal->getNome();
                                    ?>
                                </td>
                                <td class="tabela_c">
                                    <?php
                                    require_once("class.php");
                                    $principal = new Principal();
                                    $principal->setTelefone($_POST['telefone']);
                                    echo $principal->getTelefone();
                                    ?>
                                </td>
                                <td class="tabela_c">
                                    <?php
                                    require_once("class.php");
                                    $principal = new Principal();
                                    $principal->setOrigem($_POST['origem']);
                                    echo $principal->getOrigem();
                                    ?>
                                </td>
                                <td class="tabela_c">
                                    <?php
                                    require_once("class.php");
                                    $principal = new Principal();
                                    $principal->setData($_POST['data']);
                                    echo $principal->getData();
                                    ?>
                                </td>
                                <td class="tabela_c">
                                    <?php
                                    require_once("class.php");
                                    $principal = new Principal();
                                    $principal->setObservacao($_POST['observacao']);
                                    echo $principal->getObservacao();
                                    ?> 
                                </td>
                                <td class="tabela_c">
                                </td>    
                            </tr>
                        </tbody>
                    </table>   
                </div>
            </div>
        <br>
        <br>
        <br>      
        </div>      
    </body>        
</html>                