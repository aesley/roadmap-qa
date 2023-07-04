algoritmo "AnalisadorStrings"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Funções aula 13 ]
// Descrição   : [Entender funções]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------
var
  N: Caractere
  C: Inteiro
inicio
   Escreva("Digite seu nome: ")
   Leia(N)
   EscrevaL("Total de letras do seu nome: ", Compr(N))
   EscrevaL("Seu nome em maiusculas é: ", Maiusc(N))
   EscrevaL("Seu nome em minusculas é: ", Minusc(N))
   EscrevaL("A primeira letra do seu nome é: ", Copia(N, 1, 1))
   EscrevaL("A ultima letra do seu nome é: ", Copia(Maiusc(N), Compr(N), 1))
   EscrevaL("Seu nome tem a letra A na posicao: ", Pos("A", Maiusc(N)))
   EscrevaL("O codigo da letra A é ", Asc("A"))
   EscrevaL("A letra de codigo 65 é: ", Carac(65))
   
   Para C <- Compr(N) ate 1 passo -1 faca
     Escreva(Copia(Maiusc(N),C,1))
   FimPara
fimalgoritmo