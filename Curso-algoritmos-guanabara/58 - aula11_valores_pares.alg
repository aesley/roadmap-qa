algoritmo "VALORES PARES"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 3 aula 11 ]
// Descrição   : [Entender estruturas de repetição 3]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

CT, V: inteiro

inicio

escreva("DIGITE UM VALOR:")
leia(V)
se (V%2 = 1) entao
    V <- V - 1
fimse
para CT<-V ate 0 passo -2 faca
    escreval (CT)
fimpara
fimalgoritmo