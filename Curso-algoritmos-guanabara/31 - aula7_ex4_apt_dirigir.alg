algoritmo "Exercicio 4 - DETRAN"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 7 ]
// Descrição   : [Entender estruturas condicionais 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]
// --------------------------------------------------
var

ANO_ATUAL, ANO_NASC, ida: inteiro

inicio
escreval("----------------------------")
escreval(" DEPARTAMENTO DE TRANSITO ")
escreval("----------------------------")
escreva("Digite o ano atual: ")
leia(ANO_ATUAL)
escreval(ANO_ATUAL)
escreva("Digite o ano de nascimento: ")
leia(ANO_NASC)
escreval(ANO_NASC)
ida <- (ANO_ATUAL - ANO_NASC)
escreval("-----------status-----------")
escreval ("IDADE: ",ida, "ANOS")
se (ida>=18) entao
    escreval ("APTO A TIRAR CARTEIRA")
senao
    escreval ("INAPTO A TIRAR CARTEIRA")
fimse
escreval("----------------------------")
fimalgoritmo