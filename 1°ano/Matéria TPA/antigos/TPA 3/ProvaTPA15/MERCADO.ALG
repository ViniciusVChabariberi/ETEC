Algoritmo "exc"
//  
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
// Se��o de Declara��es das vari�veis 
Pagamento, PrecoFinal, Desconto, Parce1, Parce2, Parce3, Parce4, Acrescido, SC:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Bem-vindo ao Hipermercado Nextra!")
escreval("")
escreval("Informe o valor da compra: ")
leia(SC)
escreval("")
escreval("Nossas op��es de pagamento s�o:")
escreval("1 = � vista com 8% de desconto")
escreval("2 = � vista no cart�o com 4% de desconto")
escreval("3 = em 2x com o pre�o normal sem juros")
escreval("4 = em 4x com o pre�o acrescido de 8%")
escreval("")
escreval("Digite a forma de pagamento: ")
leia(Pagamento)

se (Pagamento=1) entao
escreval("Escolha confirmada: � vista com 8% de desconto.")
escreval("")
Desconto<- SC*0.08
PrecoFinal<- SC-Desconto
escreval("O valor ser� de: ", PrecoFinal)
Fimse

se (Pagamento=2) entao
escreval("Escolha confirmada: � vista no cart�o com 4% de desconto")
escreval("")
Desconto<-SC*0.04
PrecoFinal<- SC-Desconto
escreval("O valor ser� de: ", PrecoFinal)
Fimse

se (Pagamento=3) entao
escreval("Escolha confirmada: em 2x com o pre�o normal sem juros")
Parce1<- SC/2
escreval("A primeira parcela �: " ,Parce1)
escreval("")
escreval("A segunda parcela �: " ,Parce1)
escreval("")
Fimse

se (Pagamento=4) entao
escreval("Escolha confirmada: em 4x com o pre�o acrescido de 8%")
escreval("")
Acrescido<-SC*0.08
SC<-Acrescido+SC
Parce1<- SC/4
escreval("A primeira parcela �: " ,Parce1)
escreval("")
escreval("A segunda parcela �: " ,Parce1)
escreval("")
escreval("A terceira parcela �: " ,Parce1)
escreval("")
escreval("A quarta parcela �: " ,Parce1)
escreval("")
Fimse
Fimalgoritmo
