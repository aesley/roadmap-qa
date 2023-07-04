algoritmo "Fibonacci"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 3 aula 11 ]
// Descrição   : [Entender estruturas de repetição 3]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
   numTermos, fib1, fib2, fibAtual, i: inteiro

inicio
   escreval("Quantos termos da sequência de Fibonacci você quer: ")
   leia(numTermos)

   fib1 <- 0
   fib2 <- 1

   escreva(fib1, " ")
   escreva(fib2, " ")

   para i de 2 ate numTermos-1 faca
      fibAtual <- fib1 + fib2
      escreva(fibAtual, " ")
      fib1 <- fib2
      fib2 <- fibAtual
   fimpara

fimalgoritmo