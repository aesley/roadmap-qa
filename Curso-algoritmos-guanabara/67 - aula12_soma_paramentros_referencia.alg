algoritmo "SOMA PARAMETROS REFERÊNCIA"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Procedimentos aula 12 ]
// Descrição   : [Entender procedimentos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  X, Y: Inteiro
Procedimento Soma (A, B: Inteiro)
inicio
   A <- A + 1
   B <- B + 2
   EscrevaL("Valor de A = ", A)
   EscrevaL("Valor de B = ", B)
   EscrevaL("Soma A + B = ", A+B)
FimProcedimento
inicio
   X <- 4
   Y <- 8
   Soma (X, Y)
   EscrevaL("Valor de X = ", X)
   EscrevaL("Valor de Y = ", Y)
fimalgoritmo