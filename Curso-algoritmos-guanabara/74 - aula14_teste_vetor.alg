algoritmo "TESTE VETOR"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 14 ]
// Descrição   : [Entender vetores]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

V: vetor[1..6] de inteiro
C: inteiro

inicio

para C <- 1 ate 6 faca
    escreval ("DIGITE O ", C, "º VALOR")
    leia(V[C])
fimpara

para C <- 1 ate 6 faca
    escreva ("{", V[C], "}")
    leia(V[C])
fimpara

fimalgoritmo