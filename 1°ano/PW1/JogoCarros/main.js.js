console.log("meu main carregou")

class Carro {

    constructor(cor){
        this.cor = cor;
    }

    acelerar(){
        console.log("Carro "+this.cor+" -> Vruummm")
    }
}

let cAz = new Carro("azul")
let cV = new Carro("vermelho")
cV.acelerar();
cAz.acelerar();
console.log(cV);
