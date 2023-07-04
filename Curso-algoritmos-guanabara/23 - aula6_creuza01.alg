algoritmo "Creuza01"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Exercícios de algoritimos aula 6 ]
// Descrição   : [Entender os operadores lógicos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]

var

ano_atual: inteiro
ano_nascimento: inteiro
id: inteiro

inicio

escreval("Em que ano nós estamos? ")
leia(ano_atual)
escreval("Em que ano você nasceu? ")
leia(ano_nascimento)
id <- ano_atual - ano_nascimento
escreval("Minha idade será ", id)

fimalgoritmo