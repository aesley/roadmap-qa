algoritmo "APROVEITAMENTO DO ALUNO"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var

N1, N2, CLA: real


inicio
escreval("-----------------------")
escreval(" ESCOLA JAVALI CANSADO ")
escreval("-----------------------")

escreva("INSIRA SUA PRIMEIRA NOTA: ")
leia(N1)
escreval(N1)
escreva("INSIRA SUA SEGUNDA NOTA: ")
leia(N2)
escreval(N2)
escreval("-----------------------")
CLA <- (N1 + N2)/2
escreval("CLASSIFICAÇÃO EM NÚMERO:", CLA:3:1)


se (CLA < 5) entao
    escreval ("SEU APROVEITAMENTO É:F")
senao
    se (CLA >= 5) e (CLA <= 5.9) entao
        escreval ("SEU APROVEITAMENTO É: E")
    senao
        se (CLA >= 6) e (CLA <= 6.9) entao
            escreval ("SEU APROVEITAMENTO É: D")
        senao
            se (CLA >= 7) e (CLA <= 7.9) entao
                escreval ("SEU APROVEITAMENTO É: C")
            senao
                se (CLA >= 8) e (CLA <= 8.9) entao
                    escreval ("SEU APROVEITAMENTO É: B")
                senao
                    escreval ("SEU APROVEITAMENTO É: A")
                fimse
            fimse
        fimse
    fimse
fimse
escreval("-----------------------")
fimalgoritmo