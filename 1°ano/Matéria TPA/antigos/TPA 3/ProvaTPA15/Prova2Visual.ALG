Algoritmo "exc1"
//  
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
// Se��o de Declara��es das vari�veis 
idade:inteiro
nome:caractere
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
Escreva("Digite seu nome:")
leia(nome)
Escreva("Digite sua idade:")
leia(idade)
se (idade <= 12) entao
escreval("Seu nome �: ",nome)
escreval("Voc� � crian�a")
Fimse
se (idade >= 13) e (idade<=20) entao
escreval("Seu nome �: ",nome)
escreval("Voc� � adolescente")
Fimse
se (idade >= 21) entao
escreval("Seu nome �: ",nome)
escreval("Voc� � adulto")
Fimse
Fimalgoritmo
