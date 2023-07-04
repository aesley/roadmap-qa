algoritmo "CONVERSOR DINHEIRO LAÇO + ENTRADA"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 1 aula 9 ]
// Descrição   : [Entender estruturas de repetição 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

ct, qt: inteiro
reais, dolares : real

inicio

ct <- 1
escreval("QUANTAS VEZES VOCÊ QUER CONVERTER? ")
leia(qt)
enquanto (ct <= qt) faca
    escreval ("QUAL O VALOR EM R$? ")
    leia(reais)
    dolares <- reais/4.99
    escreval("O VALOR CONVERTIDO E US$: ", dolares:5:2)
    ct <- ct + 1
fimenquanto
fimalgoritmo