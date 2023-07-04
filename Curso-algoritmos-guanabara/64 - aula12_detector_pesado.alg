algoritmo "DETECTOR DE PESADO PROCEDIMENTADO"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Procedimentos aula 12 ]
// Descrição   : [Entender procedimentos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var

  I: Inteiro

  N, Pesado: Caractere

  P, Mai: Real
procedimento topo()
inicio
LimpaTela

  EscrevaL("------------------------------------")

  EscrevaL(" D E T E C T O R   DE   P E S A D O ")

  EscrevaL(" Maior Peso ate agora: ", Mai, "Kg")

  EscrevaL("------------------------------------")
fimprocedimento
inicio

  topo()

  Para I <- 1 ate 5 faca

     Escreva("Digite o nome: ")

     Leia(N)

     Escreva("Digite o peso de ", N, ": ")

     Leia(P)

     Se (P>Mai) entao

        MAI <- P

        Pesado <- N

     FimSe

     topo()

  FimPara

  topo()

  EscrevaL("A pessoa mais pesada foi ", Pesado, ", com ", Mai, " quilos.")

fimalgoritmo