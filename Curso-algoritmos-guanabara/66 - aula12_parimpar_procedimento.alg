algoritmo "PAR OU IMPAR COM PROCEDIMENTO"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Procedimentos aula 12 ]
// Descrição   : [Entender procedimentos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
   N: Inteiro
Procedimento POUI(VALOR: Inteiro)
inicio
      Se (VALOR % 2 = 0) entao
      EscrevaL("O NUMERO ", VALOR, " É PAR")
   senao
      EscrevaL("O NUMERO ", VALOR, " É IMPAR")
   FimSe
FimProcedimento
inicio
   Escreva("DIGITE UM NÚMEOR: ")
   Leia (N)
   POUI(N)
fimalgoritmo