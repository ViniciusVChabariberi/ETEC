    $(function(){
        $.getJSON("automoveis.json", function(data) {
            for(var i = 0; i <  data['automoveis'].length; i++){
                $("#TableData").append("<tr>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['MARCA'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CARRO'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CAMBER_DIANTEIRO_MIN'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CAMBER_DIANTEIRO_MAX'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CASTER_DIANTEIRO_MIN'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CASTER_DIANTEIRO_MAX'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CONVERGENCIA_DIANTEIRA_MIN'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CONVERGENCIA_DIANTEIRA_MAX'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CAMBER_TRASEIRA_MIN'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CAMBER_TRASEIRA_MAX'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CONVERGENCIA_TRASEIRA_MIN'] + "</td>");
                $("#TableData").append("<td scope='col'>" + data['automoveis'][i]['CONVERGENCIA_TRASEIRA_MAX'] + "</td>");
                $("#TableData").append("</tr>");
            }
        });
    });
    // Associa uma função ao evento de envio do formulário com ID "pesquisa"
    $(function () {
    $("#pesquisa").submit(function (event) {
        event.preventDefault(); // Impede o comportamento padrão do formulário
        handleSearch(); // Chama a função responsável por lidar com a pesquisa
    });

     // Função que lida com a lógica de pesquisa
    function handleSearch() {
        // Obtém os valores dos campos de entrada e converte para maiúsculas
        var carro = $("#carro").val().toUpperCase();
        var marca = $("#marca").val().toUpperCase();
        // Limpa o conteúdo da tabela antes de preencher com novos resultados
        $("#TableData").empty();

        // Faz uma requisição para carregar dados do arquivo JSON
        $.getJSON("automoveis.json", function (data) {
            displayResults(data, carro, marca);
        });
    }

    // Função para exibir os resultados na tabela com base nos critérios de pesquisa
    function displayResults(data, carro, marca) {
        // Interage sobre cada automóvel no array 'automoveis' do JSON
        data['automoveis'].forEach(function (automovel) {
            // Verifica se o carro ou marca coincide com os critérios de pesquisa
            if ((carro === '' || automovel['CARRO'].includes(carro)) &&
                (marca === '' || automovel['MARCA'].includes(marca))) {
                // Adiciona uma nova linha na tabela com os detalhes do automóvel
                appendTableRow(automovel);
            }
        });
    }

    // Função para adicionar uma nova linha na tabela com os detalhes do automóvel
    function appendTableRow(automovel) {
        var row = "<tr>";
        for (var prop in automovel) {
            row += "<td scope='col'>" + automovel[prop] + "</td>";
        }
        row += "</tr>";
        // Adiciona a linha à tabela com ID "TableData"
        $("#TableData").append(row);
    }
});

