<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastrar - Contato</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous">
    </script>
</head>

<body>
    @include('components.navbar')
    <div class="container mt-5">
        <div class="container mt-5 text-center" id="sobre">
            <h2>ETEC Zona Leste</h2>
            <p class="fs-5">A Escola Técnica da Zona Leste é uma instituição dedicada a oferecer cursos técnicos de alta qualidade nas áreas de tecnologia, administração, logística, entre outros.</p>
        </div>

        <div class="container mt-5" id="cursos">
            <h2>Nossos Cursos - período da manhã</h2>
            <div class="row">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Recursos Humanos</h5>
                            <p class="card-text">Aprenda os conhecimentos e estudos utilizados na contratação de novos funcionários de uma empresa.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Administração</h5>
                            <p class="card-text">Aprenda os princípios fundamentais da administração e desenvolva planejamentos com organização e controle de recursos.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Desenvolvimento de Sistemas</h5>
                            <p class="card-text">Desenvolva aplicações e crie projetos incríveis utilizando ferramentas e computadores preparados para o uso.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container mt-5" id="cursos">
            <h2>Nossos Cursos - período da tarde</h2>
            <div class="row">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Logística</h5>
                            <p class="card-text">Aprenda as habilidades de cálculo e raciocínio lógico de maneira prática.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Administração</h5>
                            <p class="card-text">Aprenda os princípios fundamentais da administração e desenvolva planejamentos com organização e controle de recursos.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Novotec Desenvolvimento de Sistemas AMS</h5>
                            <p class="card-text">Desenvolva aplicações e crie projetos incríveis com o patrocínio de uma empresa de tecnologia.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container mt-5" id="cursos">
            <h2>Nossos Cursos - período da noite</h2>
            <div class="row">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Serviços Jurídicos</h5>
                            <p class="card-text">Estude e entenda as áreas do direitoe como elas funcionam no Brasil.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Contabilidade</h5>
                            <p class="card-text">Aprenda a organizar e administrar uma planilha de contas de maneira prática.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">Desenvolvimento de Sistemas</h5>
                            <p class="card-text">Desenvolva aplicações e crie projetos incríveis utilizando ferramentas e computadores preparados para o uso.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <form method="POST" action="/adicionar">
            @csrf
            <div class="form-group mb-2">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" name="email" placeholder="E-mail">
            </div>
            <div class="form-group mb-2">
                <label for="exampleInputPassword1">Telefone</label>
                <input type="text" class="form-control" name="telefone" placeholder="Telefone">
            </div>
            <div class="form-group mb-2">
                <label for="exampleInputPassword1">Nome</label>
                <input type="text" class="form-control" name="nome" placeholder="Nome">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>

        <table class="table mt-5">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Telefone</th>
                    <th scope="col">Email</th>
                    <th scope="col">Ação</th>
                </tr>
            </thead>
            <tbody>
                @if (count($contato) > 0)
                @foreach ($contato as $cont)
                <tr>
                    <th>{{ $cont->id }}</th>
                    <th>{{ $cont->nome }}</th>
                    <th>{{ $cont->telefone }}</th>
                    <th>{{ $cont->email }}</th>
                    <th><a href="/editar/{{ $cont->id }}" class="btn btn-primary">Editar</a>
                        <a href="/excluir/{{ $cont->id }}" class="btn btn-danger">Excluir</a>
                    </th>
                </tr>
                @endforeach
                @else
                <tr>
                    <th>Sem registros!</th>
                </tr>
                @endif
            </tbody>
        </table>
    </div>
    @include('components.footer')
</body>

</html>
