algoritmo "Criança Esperança"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [03/06/2023]
// --------------------------------------------------
var

D, valor: inteiro

inicio

escreval("---------------------------")
escreval("---- CRIANÇA ESPERANÇA ----")
escreval("---------------------------")
escreval("- MUITO OBRIGADO POR DOAR -")
escreval(" [1] PARA DOAR R$ 10")
escreval(" [2] PARA DOAR R$ 25")
escreval(" [3] PARA DOAR R$ 50")
escreval(" [4] PARA DOAR OUTROS VALORES")
escreval(" [5] PARA CANCELAR")
leia(D)
escreval("OPÇÃO SELECIONADA: ",D)
escolha D
    caso 1
        valor <- 10
    caso 2
        valor <- 25
    caso 3
        valor <- 50
    caso 4
        escreval("QUAL O VALOR DA DOAÇÃO? R$:")
        leia(valor)
    caso 5
        valor <- 0
fimescolha
escreval("---------------------------")
escreval("SUA DOAÇÃO FOI DE R$:", valor)
escreval("---------------------------")
escreval("----- MUITO OBRIGADO! -----")
escreval("---------------------------")

fimalgoritmo