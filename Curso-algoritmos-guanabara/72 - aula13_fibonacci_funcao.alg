algoritmo "FIBONACCI FUNÇÃO"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Funções aula 13 ]
// Descrição   : [Entender funções]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
funcao fibonacci(n: inteiro): inteiro
var
   fib, fibant, fibantant: inteiro
inicio
   se (n <= 1) entao
      retorne n
   senao
      fibantant <- 0
      fibant <- 1
      fib <- 0
      para i de 2 ate n faca
         fib <- fibant + fibantant
         fibantant <- fibant
         fibant <- fib
      fimpara
      retorne fib
   fimse
fimfuncao

var
   i: inteiro

inicio
   para i de 0 ate 12 faca

    escreval("0º  : fib ", fibonacci(0) ,"       ->  ", (fibonacci(0) = 0))
    escreval("1º  : fib ", fibonacci(1) ,"       ->  ", (fibonacci(1) = 1))
    escreval("2º  : fib ", fibonacci(2) ,"       ->  ", (fibonacci(2) = 1))
    escreval("3º  : fib ", fibonacci(3) ,"       ->  ", (fibonacci(3) = 2))
    escreval("4º  : fib ", fibonacci(4) ,"       ->  ", (fibonacci(4) = 3))
    escreval("5º  : fib ", fibonacci(5) ,"       ->  ", (fibonacci(5) = 5))
    escreval("6º  : fib ", fibonacci(6) ,"       ->  ", (fibonacci(6) = 8))
    escreval("7º  : fib ", fibonacci(7) ,"      ->  ", (fibonacci(7) = 13))
    escreval("8º  : fib ", fibonacci(8) ,"      ->  ", (fibonacci(8) = 21))
    escreval("9º  : fib ", fibonacci(9) ,"      ->  ", (fibonacci(9) = 34))
    escreval("10º : fib ", fibonacci(10) ,"      ->  ", (fibonacci(10) = 55))
    escreval("11º : fib ", fibonacci(11) ,"      ->  ", (fibonacci(11) = 89))
    escreval("12º : fib ", fibonacci(12) ,"     ->  ", (fibonacci(12) = 144))
   fimpara
fimalgoritmo