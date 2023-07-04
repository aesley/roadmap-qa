algoritmo "VALORES PARES"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 14 ]
// Descrição   : [Entender vetores]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  n: vetor[1..7] de Inteiro
  i, TotPar: Inteiro
inicio
   Para i <- 1 ate 7 faca
      Escreva("Digite o ", i, "o. valor: ")
      Leia(n[i])
   FimPara
   
   LimpaTela
   
   Para i <- 1 ate 7 faca
      Se (n[i] % 2 = 0) entao
         TotPar <- TotPar + 1
         EscrevaL("Valor ", n[i], " na posicao ", i, " e PAR!")
      FimSe
   FimPara
fimalgoritmo