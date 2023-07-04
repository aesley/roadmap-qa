algoritmo "SOMA FUNÇÃO"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Funções aula 13 ]
// Descrição   : [Entender funções]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  V1, V2, S: Inteiro

Funcao Soma(X, Y: Inteiro): Inteiro
Inicio
    Retorne X + Y
FimFuncao

inicio
  Escreva("DIGITE O PRIMEIRO VALOR: ")
  Leia(V1)
  Escreva("DIGITE O SEGUNDO VALOR: ")
  Leia(V2)
  S <- Soma(V1, V2)
  EscrevaL("A SOMA ENTRE ", V1, " E ", V2, " É IGUAL A: ", S)
fimalgoritmo