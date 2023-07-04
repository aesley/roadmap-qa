algoritmo "ANALISADOR DE VALORES"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 3 aula 11 ]
// Descrição   : [Entender estruturas de repetição 3]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  Valor, Cont, Sm, Divpor5, Nulos, Somap: Inteiro
  Med: Real
inicio
    Sm <- 0
    Divpor5 <- 0
    Nulos <- 0
    Somap <- 0
    Cont <- 1
    repita
         Escreva("Digite o ",Cont,"o. Valor: ")
         Leia(Valor)
         Sm <- Sm + Valor
         Se (Valor%5=0) entao
            Divpor5 <- Divpor5 + 1
         FimSe
         Se (Valor=0) entao
            Nulos <- Nulos + 1
         FimSe
         Se (Valor%2=0) entao
            Somap <- Somap + Valor
         FimSe
         Cont <- Cont + 1
    ate (Cont > 7)
    Med <- Sm / 7
    EscrevaL("A soma entre os valores é ", Sm)
    EscrevaL("A média entre os valores é ", Med:5:1)
    EscrevaL("Valores divisíveis por cinco: ", Divpor5)
    EscrevaL("Valores Nulosos: ", Nulos)
    EscrevaL("A soma dos valores pares é ", Somap)

fimalgoritmo
