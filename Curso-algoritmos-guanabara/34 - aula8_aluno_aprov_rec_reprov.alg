algoritmo "Exercício - APROVADO OU RECUPERAÇÃO OU REPROVADO"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [01/06/2023]
// --------------------------------------------------
var

N1, N2, MED: real

inicio
escreval("----------------------------")
escreval("     ESCOLA  MICK  HILL     ")
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
    se (MED >=5) e (MED < 7) entao
        escreval ("ALUNO DE RECUPERAÇÃO")
    senao
        escreval ("ALUNO REPROVADO")
    fimse
fimse
escreval("----------------------------")
fimalgoritmo