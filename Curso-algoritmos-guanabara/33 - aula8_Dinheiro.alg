algoritmo "Viajem (disney) ou (familia) ou (ficar em casa)"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [01/06/2023]
// --------------------------------------------------
var

dinheiro: real

inicio
escreval("Informe o valor em R$ do seu dinheiro:")
leia(dinheiro)
escreval("Meu dinheiro em R$:", dinheiro)
se (dinheiro >= 10000) entao
    escreval ("Partiu disney")
senao
    se ((dinheiro >= 5000) e (dinheiro < 10000)) entao
        escreval ("Visitar familia")
    senao
        escreval ("#Chateadão")
    fimse
fimse

fimalgoritmo