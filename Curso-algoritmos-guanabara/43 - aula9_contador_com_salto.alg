algoritmo "CONTAR ATÉ VALOR DE ENTRADA"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 1 aula 9 ]
// Descrição   : [Entender estruturas de repetição 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

CONT, V, S: inteiro

inicio

CONT <- 0
escreval("QUER CONTAR ATÉ QUANTO?")
leia(V)
escreval("QUAL SERÁ O VALOR DO SALTO?")
leia(S)
enquanto (CONT <= V) faca
    escreval(CONT)
    CONT <- CONT + S
fimenquanto

fimalgoritmo