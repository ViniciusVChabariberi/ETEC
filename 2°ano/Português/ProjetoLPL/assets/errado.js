var botaoVoltar = document.getElementById("botao-voltar");

function botaoVoltar(paginaAnterior) {

    var paginaAnterior = document.referrer;

    if (paginaAnterior.includes("opcao1.html")) {
        window.location.href = "opcao1.html";
    } else if (paginaAnterior.includes("opcao2.html")) {
        window.location.href = "opcao2.html";
    } else if (paginaAnterior.includes("opcao3.html")) {
        window.location.href = "opcao3.html";
    } else if (paginaAnterior.includes("opcao4.html")) {
        window.location.href = "opcao4.html";
    } else if (paginaAnterior.includes("opcao5.html")) {
        window.location.href = "opcao5.html";
    } else if (paginaAnterior.includes("opcao6.html")) {
        window.location.href = "opcao6.html";
    } else if (paginaAnterior.includes("opcao7.html")) {
        window.location.href = "opcao7.html";
    }
};