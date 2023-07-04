algoritmo "TABUADA"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

CONT, N, RES: inteiro

inicio

escreval("QUER VER A TABUADA DE QUAL NUMERO?")
leia(N)
CONT <- 1

repita
RES <- N * CONT
escreval(N, "x", CONT, "=", RES)
CONT <- CONT + 1
ate (CONT > 10)

fimalgoritmo