algoritmo "Nome do Programa"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 1 aula 9 ]
// Descrição   : [Entender estruturas de repetição 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

ct, n, s, M, men: inteiro

inicio

ct <- 1
s <- 0
M <- 0
men <- 0

enquanto (ct <= 5) faca
    escreva ("DIGITE O ", ct, "º VALOR: ")
    leia(n)
    escreval(n)
    
    se (ct = 1) entao
        M <- n
        men <- n
    senao
        se (n > M) entao
            M <- n
        fimse
        se (n < men) entao
            men <- n
        fimse
    fimse
    
    s <- s + n
    ct <- ct + 1
fimenquanto

escreval("-------------------------------------------")
escreval("A SOMA DE TODOS OS VALORES DIGITADOS É: ", s)
escreval("O MAIOR VALOR DIGITADO FOI: ", M) 
escreval("O MENOR VALOR DIGITADO FOI: ", men)
escreval("-------------------------------------------")

fimalgoritmo
