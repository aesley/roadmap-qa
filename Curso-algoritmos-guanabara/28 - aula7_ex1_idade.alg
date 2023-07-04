algoritmo "Exercicio 1 - Idade"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 7 ]
// Descrição   : [Entender estruturas condicionais 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]
// --------------------------------------------------
// Exemplo 1 : Condicional simples
// se (condição) então
//      escreva("resposta condição")
// fimse
// --------------------------------------------------
// Exemplo 2 : Condicional composta
// se (condição) então
//      escreva("resposta condição") - resposta se
// senao
//      escreva("resposta condição") - resposta senao
// fimse
// --------------------------------------------------

var

ano, nasc, ida : inteiro

inicio

escreval("Em que ano estamos?")
leia(ano)
escreval(ano)
escreval("Em que ano você nasceu?")
leia(nasc)
escreval(nasc)
ida <- (ano - nasc)
escreva("Em ", ano, " você terá ", ida)
se (ida>=21) entao
    escreval (" e já terá atingido a maior idade")
fimse

fimalgoritmo