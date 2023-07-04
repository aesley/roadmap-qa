algoritmo "Exercicio 2 - Par ou impar"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 7 ]
// Descrição   : [Entender estruturas condicionais 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]
// --------------------------------------------------
// Exemplo 2 : Condicional composta
// se (condição) então
//      escreva("resposta condição") - resposta se
// senao
//      escreva("resposta condição") - resposta senao
// fimse
// --------------------------------------------------
var

N : inteiro

inicio

escreval("Digite um número qualquer: ")
leia(N)
    se (N % 2 = 0) entao
        escreval ("O número ", N, " é Par")
            senao
                escreval ("O número ", N, " é Impar")
    fimse

fimalgoritmo