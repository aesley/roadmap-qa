Algoritmo "OrdenaVetor"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 14 ]
// Descrição   : [Entender vetores]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
Var
vet: vetor[1..4] de inteiro
i, j: inteiro

Inicio
   Para i<- 1 ate 4 faca
     Escreva("Digite um valor: ")
     Leia(vet[i])
   FimPara
   
   Para i<- ate 3 faca
        Para j<- i + 1 ate 4 faca
          Se(vet[i] > vet [j]) entao
          aux <- vet[i]
          vet[i]<- vet[j]
          vet[j]<- aux
          FimSe
        FimPara
   FimPara

   Para i<- 1 ate 4 faca
   Escreva("{", vet[i], "}")
   FimPara
Fimalgoritmo