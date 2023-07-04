algoritmo "Soma de inteiros"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Comando de Entrada e Operadores]
// Descrição   : [Soma inteiros] (função)]
// Autor(a)    : [Aesley Soares]
// Data atual  : [28/05/2023]
// ---------------------------
// Operadores - Nome                                       - Operação
// +          - Adição                                     - A + B
// -          - Subtração                                  - A - B
// *          - Multiplicação                              - A * B
// /          - Divisão                                    - A / B
// \          - Divisão inteira (parte inteira da /)       - A \ B
// ^          - Exponenciação                              - A ^ B
// %          - Módulo (resto da /)                        - A % B
// ---------------------------
// Ordem de precedência
// Simbolo    - Nome
// ()         - Parênteses
// ^          - Exponenciação
// * /        - Multiplicação e Divisão
// + -        - Soma e Subtração
var

N1, N2, s: inteiro
M: real
inicio

escreval("Informe o primeiro número: ")
leia(N1)
escreval("Informe o segundo número: ")
leia(N2)
s <- N1 + N2
escreval("A soma de", N1, "com", N2, "é igual a: ", s)
M <- (N1 + N2)/2
escreval("A média de", N1, "e", N2, "é igual a: ", M)

fimalgoritmo