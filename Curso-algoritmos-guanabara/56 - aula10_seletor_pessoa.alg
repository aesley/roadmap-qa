algoritmo "SELETOR DE PESSOA"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

   SX, RSP: caractere

   ID, CAB, TH18, TM25: inteiro



inicio

   repita

      limpatela

      escreval("==========================")

      escreval("    SELETOR DE PESSOAS    ")

      escreval("==========================")

      escreva("QUAL O SEXO? [M/F] ")

      leia(SX)

      escreva("QUAL A IDADE? ")

      leia(ID)

      escreval("QUAL A COR DO CABELO?")

      escreval("---------------------")

      escreval("[1] PRETO")

      escreval("[2] CASTANHO")

      escreval("[3] LOIRO")

      escreval("[4] RUIVO")

      leia(CAB)

      se (SX = "M") e (ID > 18) e (CAB = 2) entao

         TH18 <- TH18 + 1

      fimse

      se (SX = "F") e ((ID >= 25) e (ID <= 30)) e (CAB = 3) entao

         TM25 <- TM25 + 1

      fimse

      escreva("QUER CONTINUAR? [S/N] ")

      leia(RSP)

   ate (RSP = "N")

   limpatela

   escreval("------------------------------------")

   escreval(" RESULTADO FINAL ")

   escreval("------------------------------------")

   escreval("TOTAL DE HOMENS COM MAIS DE 18 E CABELOS CASTANHOS ", TH18)

   escreval("TOTAL DE MULHERES ENTRE 25 E 30 E CABELOS LOIROS ", TM25)

fimalgoritmo