algoritmo " PAR OU IMPAR COM FUNÇÃO"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Funções aula 13 ]
// Descrição   : [Entender funções]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  N: Inteiro
  R: Caractere
  
Funcao ParOuImpar(V: Inteiro): Caractere
inicio
   Se (V%2 = 0) entao
      Retorne "PAR"
   senao
      Retorne "IMPAR"
   FimSe
FimFuncao
  
inicio
   Escreva("DIGITE UM NÚMERO: ")
   Leia(N)
   R <- ParOuImpar(N)
   Escreva ("O NÚMERO ", N, " É UM VALOR ", R)
fimalgoritmo