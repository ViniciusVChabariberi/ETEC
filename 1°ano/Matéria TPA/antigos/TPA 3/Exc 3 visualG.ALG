Algoritmo "semnome"
// Disciplina  :  [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/06/2022
Var
// Se��o de Declara��es das vari�veis 
nota1, nota2, nota3, nota4, I:inteiro
media:real
nomealuno:caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
I <- 1
para I de 1 ate 7 passo 1 faca
escreval("")
escreval("Digite o nome do aluno: ")
leia(nomealuno)
escreval("")
escreval("Informe a primeira nota: ")
leia(nota1)
escreval("")
escreval("Informe a segunda nota: ")
leia(nota2)
escreval("")
escreval("Informe a terceira nota: ")
leia(nota3)
escreval("")
escreval("Informe a quarta nota: ")
leia(nota4)
escreval("")
media <- (nota1+nota2+nota3+nota4)/4
escreva("Sua m�dia anual foi de:", media)
escreval("")
escreva("O nome do aluno � ", nomealuno)
fimpara
Fimalgoritmo