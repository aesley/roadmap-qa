Algoritmo "SoImportaComC"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 14 ]
// Descrição   : [Entender vetores]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
Var
nome: caractere
SoC: vetor [1..10] de caractere
c, tot: inteiro

Inicio
   Para c<-1 ate 10 faca
     Escreva("Digite seu nome: ")
     Leia(nome)
     Se (copia(maiusc(nome), 1, 1) = "C")  entao
        tot<- tot + 1
        SoC[tot]<- nome
     FimSe
   FimPara
   LimpaTela
   Escreval("LISTAGEM FINAL")
   Para c <- 1 ate tot faca
   Escreval(SoC[c])
   FimPara
Fimalgoritmo