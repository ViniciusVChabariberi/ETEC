Algoritmo "exc"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
// Seção de Declarações das variáveis 
Pagamento, PrecoFinal, Desconto, Parce1, Parce2, Parce3, Parce4, Acrescido, SC:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Bem-vindo ao Hipermercado Nextra!")
escreval("")
escreval("Informe o valor da compra: ")
leia(SC)
escreval("")
escreval("Nossas opções de pagamento são:")
escreval("1 = À vista com 8% de desconto")
escreval("2 = À vista no cartão com 4% de desconto")
escreval("3 = em 2x com o preço normal sem juros")
escreval("4 = em 4x com o preço acrescido de 8%")
escreval("")
escreval("Digite a forma de pagamento: ")
leia(Pagamento)

se (Pagamento=1) entao
escreval("Escolha confirmada: À vista com 8% de desconto.")
escreval("")
Desconto<- SC*0.08
PrecoFinal<- SC-Desconto
escreval("O valor será de: ", PrecoFinal)
Fimse

se (Pagamento=2) entao
escreval("Escolha confirmada: À vista no cartão com 4% de desconto")
escreval("")
Desconto<-SC*0.04
PrecoFinal<- SC-Desconto
escreval("O valor será de: ", PrecoFinal)
Fimse

se (Pagamento=3) entao
escreval("Escolha confirmada: em 2x com o preço normal sem juros")
Parce1<- SC/2
escreval("A primeira parcela é: " ,Parce1)
escreval("")
escreval("A segunda parcela é: " ,Parce1)
escreval("")
Fimse

se (Pagamento=4) entao
escreval("Escolha confirmada: em 4x com o preço acrescido de 8%")
escreval("")
Acrescido<-SC*0.08
SC<-Acrescido+SC
Parce1<- SC/4
escreval("A primeira parcela é: " ,Parce1)
escreval("")
escreval("A segunda parcela é: " ,Parce1)
escreval("")
escreval("A terceira parcela é: " ,Parce1)
escreval("")
escreval("A quarta parcela é: " ,Parce1)
escreval("")
Fimse
Fimalgoritmo
