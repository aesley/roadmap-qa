algoritmo "Matriz identidade"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 15 ]
// Descrição   : [Entender matrizes]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  mID: vetor[1..3, 1..3] de Inteiro
  i, j: Inteiro
inicio
    Para i <- 1 ate 3 faca
       Para j <- 1 ate 3 faca
          Se (i = j) entao
             mID[i,j] <- 1
          senao
             mID[i,j] <- 0
          FimSe
       FimPara
    FimPara
    
    Para i <- 1 ate 3 faca
       Para j <- 1 ate 3 faca
          Escreva (mID[i,j]:3)
       FimPara
       EscrevaL()
    FimPara
    
fimalgoritmo