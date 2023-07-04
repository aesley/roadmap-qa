algoritmo "Fibonacci Procedimento"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Procedimentos aula 12 ]
// Descrição   : [Entender procedimentos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
   numTermos, fib1, fib2, fibAtual, i: inteiro

procedimento proxfibonacci()
var
   C: inteiro
inicio
   C <- fib1 + fib2
   fibAtual <- C
   escreva(fibAtual, " ")
   fib1 <- fib2
   fib2 <- fibAtual
fimprocedimento

inicio
   escreva("Quantos termos da sequência de Fibonacci você quer: ")
   leia(numTermos)

   fib1 <- 0
   fib2 <- 1

   escreva(fib1, " ")
   escreva(fib2, " ")

   para i de 3 ate numTermos faca
      proxfibonacci()
   fimpara

fimalgoritmo
