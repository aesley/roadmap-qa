algoritmo "0Somador com Enquanto"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

N , S: inteiro
resp: caractere

inicio

S <- 0
resp <- "S"
enquanto (resp = "S") faca
    escreval("Digite o valor: ")
    leia(N)
    escreval(N)
    S <- S + N
    escreval("VOCE QUER CONTINUAR? [Sim > S /Não > N]")
    leia(resp)
    escreval(resp)
fimenquanto
escreval("A SOMA DE TODOS OS VALORES DIGITADOS FOI: ", S)

fimalgoritmo