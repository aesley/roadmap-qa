algoritmo "Exercicio 5 - APROVADO OU REPROVADO"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 7 ]
// Descrição   : [Entender estruturas condicionais 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]
// --------------------------------------------------
var

N1, N2, MED: real

inicio
escreval("----------------------------")
escreval("  ESCOLA  JAVALI  CANSADO  ")
escreval("----------------------------")
escreva("Primeira Nota: ")
leia(N1)
escreval(N1)
escreva("Segunda Nota: ")
leia(N2)
escreval(N2)
MED <- (N1 + N2)/2
escreval("-----------------------------")
escreval ("MEDIA: ", MED:2:1)
se (MED>=7) entao
    escreval ("ALUNO APROVADO")
senao
    escreval ("ALUNO REPROVADO")
fimse
escreval("----------------------------")
fimalgoritmo