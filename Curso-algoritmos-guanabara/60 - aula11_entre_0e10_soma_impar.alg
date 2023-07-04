algoritmo "VERIFICA NUMEROS ENTRE 0 A 10 E SOMA OS IMPARES"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 3 aula 11 ]
// Descrição   : [Entender estruturas de repetição 3]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

   T10, V, C, SIMP: inteiro

inicio

   T10 <- 0
   SIMP <- 0
   para C <- 1 ate 6 faca
      escreva("DIGITE UM VALOR:")
      leia(V)
      se (V >= 0) e (V <= 10) entao
         T10 <- T10 + 1
         se (V%2=1)entao
            SIMP <- SIMP + V
         fimse
      fimse
   fimpara
   escreval("AO TODO FORAM", T10," VALORES ENTRE 0 E 10")
   escreval("A SOMA DOS NUMEROS IMPARES ENTRE 0 E 10 FOI DE: ", SIMP)
fimalgoritmo