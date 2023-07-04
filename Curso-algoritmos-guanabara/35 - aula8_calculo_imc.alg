algoritmo "Calculo do IMC"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [01/06/2023]
// --------------------------------------------------
var

M, A, IMC: real


inicio

escreval("Massa em (Kg): ")
leia(M)
escreval("Altura em (m): ")
leia(A)
IMC <- M/(A*A)
escreval("IMC: ", IMC:5:2)
se (IMC < 17) entao
    escreval ("mUITO ABAIXO DO PESO")
senao
    se (IMC >= 17) e (IMC <= 18.5) entao
        escreval ("ABAIXO DO PESO")
    senao
        se (IMC >= 18.5) e (IMC < 25) entao
            escreval ("PESO IDEAL")
        senao
            se (IMC >= 25) e (IMC < 30) entao
                escreval ("SOBREPESO")
            senao
                se (IMC >= 30) e (IMC < 35) entao
                    escreval ("OBESIDADE")
                senao
                    se (IMC >= 35) e (IMC < 40) entao
                        escreval ("OBESIDADE SEVERA")
                    senao
                        escreval ("OBESIDADE MORBIDA")
                    fimse
                fimse
            fimse
        fimse
    fimse
fimse
fimalgoritmo