algoritmo "FATORIAL FUNÇÃO"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Funções aula 13 ]
// Descrição   : [Entender funções]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  N, F: Inteiro

Funcao Fatorial(V: Inteiro):Inteiro
Var
  C, R: Inteiro
Inicio
   R <- 1
   Para C <- 1 ate V faca
       R <- R * C
   FimPara
   Retorne R
FimFuncao

inicio
   Escreva("DIGITE UM NÚMERO: ")
   Leia(N)
   F <- Fatorial(N)
   EscrevaL("O VALOR DE: ", N, "! É IGUAL A: ", F)
fimalgoritmo