algoritmo "Turma"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 14 ]
// Descrição   : [Entender vetores]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------

Var
   nome: vetor[1..4] de caractere
   n1: vetor[1..4] de real
   n2: vetor[1..4] de real
   m: vetor[1..4] de real
   i: Inteiro
   
Inicio
   Para i<-1 ate 4 faca
     Escreval("ALUNO ", i)
     Escreva ("NOME: ")
     Leia(nome[i])
     Escreva ("Primeira Nota: ")
     Leia (n1[i])
     Escreval("Segunda Nota: ")
     Leia (n2[i])
     m[i] <- (n1[i] +n2[i])/2
   FimPara
   
   LimpaTela
   Escreval ("LISTAGEM DE ALUNOS")
   Escreval ("---------------------")
   Para i <- 1 ate 4 faca
      Escreval(nome[i]: 15, m[i])
    FimPara
Fimalgoritmo