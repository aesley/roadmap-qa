algoritmo "CONTADOR DE NEGATIVOS"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

N, C, TN: inteiro

inicio

C <- 1
TN <- 0
repita
    
    escreva("DIGITE UM NUMERO: ")
    leia(N)
    escreval(N)
    
    se(N < 0) entao
        TN <- TN + 1    
    fimse
    
    C <- C + 1

ate(C > 5)

escreval("FORAM DIGITADOS: ", TN, " VALORES NEGATIVOS")

fimalgoritmo
