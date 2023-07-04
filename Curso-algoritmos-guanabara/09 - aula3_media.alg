algoritmo "Média de números"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Comando de Entrada e Operadores]
// Descrição   : [Média de números] (função)]
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
// ---------------------------
// Funções Aritméticas
// Função     - Nome Função          - Entrada       - Saída
// Abs        - Valor absoluto       - Abs(-10)      - 10
// Exp        - Exponenciação        - Exp(2,2)      - 4
// Int        - Valor inteiro        - Int(2,2)      - 2
// RaizQ      - Raiz quadrada        - Int(4)        - 2
// Pi         - Retorna Pi           - Pi            - 3,14..
// Sen        - Seno (rad)           - Sen(0.523)    - 0.5
// Cos        - Cosseno (rad)        - Cossen(0.523) - 0.86
// Tan        - Tangente (rad)       - Tan(0.523)    - 0.57
// GraupRad   - Graus para Radianos  - GraupRa(30)   - 0.52
var

N1, N2: inteiro
M: real

inicio

escreval("Informe o primeiro número: ")
leia(N1)
escreval("Informe o segundo número: ")
leia(N2)
M <- (N1 + N2)/2
escreval("A média de", N1, "e", N2, "é igual a: ", M)

fimalgoritmo