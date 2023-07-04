algoritmo "TORNEIO DE FUTEBOL"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Vetores aula 14 ]
// Descrição   : [Entender vetores]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------

var
  time: vetor[1..3] de Caractere
  j, i: Inteiro
inicio
   EscrevaL("------------------")
   EscrevaL("CAMPEONATO FUTEBOL")
   EscrevaL("------------------")
   Para i <- 1 ate 3 faca
      Escreva ("Nome do ", i, "o. time: ")
      Leia(time[i])
   FimPara
   
   LimpaTela
   EscrevaL("-------------------")
   EscrevaL(" TABELA DE PARTIDAS")
   EscrevaL("-------------------")
   Para j<- 1 ate 3 faca
      Para i <- 1 ate 3 faca
         Se (j <> i) entao
            EscrevaL(time[j]:12, " [ ] x [ ] ", time[i]:12)
         FimSe
      FimPara
   FimPara
fimalgoritmo