algoritmo "Nome do Programa"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

C, N, CD: inteiro

inicio

C <- 1
CD <- 0

escreva("DIGITE UM NÚMERO: ")
leia(N)
escreval(N)
repita
    escreva(C, " ")
    se (N % C = 0) entao
        CD <- CD + 1
    fimse
C <- C + 1
ate (C > N)
escreval("")
se (CD > 2) entao
    escreval ("O VALOR,", N, "NÃO É PRIMO")
senao
    escreval ("O VALOR,", N, "É PRIMO")
fimse
escreval("Ao todo existem", CD, "Valores diviveis")
fimalgoritmo