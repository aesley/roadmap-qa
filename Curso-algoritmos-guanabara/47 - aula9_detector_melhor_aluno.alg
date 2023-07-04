algoritmo "DETECTOR DE MELHOR ALUNO DA TURMA"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 1 aula 9 ]
// Descrição   : [Entender estruturas de repetição 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------

var
   total, ct: Inteiro
   nome, melhordaturma: Caractere
   nota, notamaisalta: Real

inicio
   escreval("------------------------")
   escreval(" Escola Santa Paciencia ")
   escreval("------------------------")
   escreval("Quantos alunos a turma tem? ")
   leia(total)

   ct <- 1
   notamaisalta <- 0

   enquanto (ct <= total) faca
      escreval("---------------")
      escreval("ALUNO ", ct)
      escreva("Nome do aluno: ")
      leia(nome)
      escreval(nome)
      escreva("Nota de ", nome, ": ")
      leia(nota)
      escreval(nota)

      Se (ct = 1) entao
         notamaisalta <- nota
         melhordaturma<- nome
      Senao
         Se (nota > notamaisalta) entao
            notamaisalta <- nota
            melhordaturma<- nome
         FimSe
      FimSe

      ct <- ct + 1
   fimenquanto

   escreval("-------------------")
   escreval("O melhor aproveitamento foi de: ", melhordaturma, " com a nota: ", notamaisalta:3:1)
      
fimalgoritmo
