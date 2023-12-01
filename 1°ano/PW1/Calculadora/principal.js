class Calculadora{

    somar(n1, n2){
        return n1+n2
    }

    subtrair(n1, n2){
        return n1-n2
    }
    multiplicar(n1, n2){
        return n1*n2
    }
    dividir (n1, n2){
        return n1/n2
    }
}
    function Somar() {
    n1 = Number
    n2 = Number
    let minhacalculadora = new Calculadora();
    var num1 = document.querySelector('input#num1')
    var num2 = document.querySelector('input#num2')
    var n1 = Number(num1.value)
    var n2 = Number(num2.value)
    var calculo = document.querySelector('div#calculo')
    let resultadodaminhasoma = minhacalculadora.somar(n1,n2)  
    calculo.innerHTML = `${n1} + ${n2} = ${resultadodaminhasoma}`
    }
    function Subtrair() {
        n1 = Number
        n2 = Number
        let minhacalculadora = new Calculadora();
        var num1 = document.querySelector('input#num1')
        var num2 = document.querySelector('input#num2')
        var n1 = Number(num1.value)
        var n2 = Number(num2.value)
        var calculo = document.querySelector('div#calculo')
        let resultadodaminhasubtracao = minhacalculadora.subtrair(n1,n2)  
        calculo.innerHTML = `${n1} - ${n2} = ${resultadodaminhasubtracao}`
        }
    function Multiplicar() {
        n1 = Number
        n2 = Number
        let minhacalculadora = new Calculadora();
        var num1 = document.querySelector('input#num1')
        var num2 = document.querySelector('input#num2')
        var n1 = Number(num1.value)
        var n2 = Number(num2.value)
        var calculo = document.querySelector('div#calculo')
        let resultadodaminhamultiplicacao = minhacalculadora.multiplicar(n1,n2)  
        calculo.innerHTML = `${n1} * ${n2} = ${resultadodaminhamultiplicacao}`
        }   
    function Dividir() {
        n1 = Number
        n2 = Number
        let minhacalculadora = new Calculadora();
        var num1 = document.querySelector('input#num1')
        var num2 = document.querySelector('input#num2')
        var n1 = Number(num1.value)
        var n2 = Number(num2.value)
        var calculo = document.querySelector('div#calculo')
        let resultadodaminhadivisao= minhacalculadora.dividir(n1,n2)  
        calculo.innerHTML = `${n1} / ${n2} = ${resultadodaminhadivisao}`
} 

    function excluir() {
        let res = document.getElementById('calculo')
        let pos = document.getElementById('num1')
        let ta = document.getElementById('num2')
        res.innerHTML = ""  
        pos.innerHTML = ""
        ta.innerHTML = ""
    }