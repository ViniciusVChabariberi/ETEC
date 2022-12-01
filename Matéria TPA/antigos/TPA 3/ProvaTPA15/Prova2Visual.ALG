Algoritmo "exc1"
//  
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
// Seção de Declarações das variáveis 
idade:inteiro
nome:caractere
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite seu nome:")
leia(nome)
Escreva("Digite sua idade:")
leia(idade)
se (idade <= 12) entao
escreval("Seu nome é: ",nome)
escreval("Você é criança")
Fimse
se (idade >= 13) e (idade<=20) entao
escreval("Seu nome é: ",nome)
escreval("Você é adolescente")
Fimse
se (idade >= 21) entao
escreval("Seu nome é: ",nome)
escreval("Você é adulto")
Fimse
Fimalgoritmo
