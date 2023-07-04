algoritmo "FATORIAL"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

C, N, F :inteiro
RES: caractere
inicio
repita

escreval("DIGITE UM NÚMERO: ")
leia(N)
C <- N
F <- 1

repita
    F <- F * C
    C <- C - 1
ate (C < 1)

escreval("O VALOR DO FATORIAL DE",N,"! É IGUAL A:", F )
escreva("QUER CONTINUAR? [S/N]: ")
leia(RES)
escreval(RES)
limpatela
ate (RES = "N")
fimalgoritmo