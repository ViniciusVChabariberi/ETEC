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
            <nav class="navbar navbar-expand-lg">
                <div class="container-fluid">
                     <a class="navbar-brand" href="#"><h3 id="text">SISTEMA WEB</h3></a>
                     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                      <span class="navbar-toggler-icon"></span>
                     </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link active" id="text4" aria-current="page" href="#">Cadastrar</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled text-white-50" id="text4">Consultar</a>
                            </li>
                        </ul>
                    </div>
                </div>   
            </nav>
            <div class="formulario">
                <form method="POST" action="teste.class.php">
                    <p id="text2">Cadastrar - Agendamento de Potenciais Clientes</p>
                    <p id="text3">Sistema utilizado para Agendamento de serviços.</p>

                    <div class="mb-3">
                        <label id="text5" for="nome">Nome:</label> 
                        <input type="text" class="form-control" name="nome" id="nome" aria-label="Username" aria-describedby="basic-addon1">
                    </div>  
                    <div class="mb-3">
                        <label id="text5" for="tele">Telefone:</label> 
                        <input type="tel" class="form-control" placeholder="(xx)xxxxx-xxxx" name="telefone" id="telefone" aria-label="Recipient's username" aria-describedby="basic-addon2">
                    </div> 
                    <div class="mb-3">
                        <label for="select" class="form-label">Origem:</label>
                        <select class="form-select" aria-label="select" name="origem" id="origem">
                            <option value="celular">Celular</option>
                            <option value="fixo">Fixo</option>
                        </select>  
                    </div>
                    <div class="mb-3">
                        <label id="text5" for="data">Data do Contato:</label> 
                        <input type="date" class="form-control" aria-label="Username" id="data" name="data" aria-describedby="basic-addon1">
                    </div>
                    <div class="mb-3">
                        <p id="text3">Observação</p>
                        <textarea class="form-control" name="observacao" rows="3"></textarea>
                    </div>    
                        <br>
                    <div class="mb-3">    
                         <input  class="btn btn-primary botao" type="submit" name="Cadastrar" value="Cadastrar">
                    </div>    
                        <br>
                </form>
            </div>
    </div>        
  </body>
</html>