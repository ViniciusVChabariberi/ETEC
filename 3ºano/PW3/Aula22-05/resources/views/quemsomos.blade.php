<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>ETEC ZL</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body>
  @include('components.navbar')
  <div class="container mt-5 text-center" id="sobre">
    <h2>ETEC Zona Leste</h2>
    <p class="fs-5">A Escola Técnica da Zona Leste é uma instituição dedicada a oferecer cursos técnicos de alta qualidade nas áreas de tecnologia, administração, logística, entre outros.</p>
  </div>

  <div class="container mt-5 fs-4 mb-5">
    <h2>Sobre Nós</h2>
    <p>- Nossa missão é capacitar nossos alunos com as habilidades práticas e teóricas necessárias para ter sucesso em suas carreiras.</p>
    <p>- Nossos instrutores são profissionais experientes em suas respectivas áreas, e nosso currículo é constantemente atualizado para refletir as últimas tendências e tecnologias do setor. Além disso, oferecemos uma variedade de recursos de apoio, incluindo orientação acadêmica, serviços de colocação profissional e oportunidades de networking.</p>
    <p>- Na Escola Técnica da Zona Leste, estamos comprometidos com a excelência educacional e com o sucesso de nossos alunos. Estamos ansiosos para ajudá-lo a alcançar seus objetivos educacionais e profissionais.</p>
  </div>
  <br>

  @include('components.footer')

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>
