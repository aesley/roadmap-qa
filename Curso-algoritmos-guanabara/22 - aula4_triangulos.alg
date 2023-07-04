algoritmo "Triangulos"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Operadores lógicos e relacionais]
// Descrição   : [Entender os operadores lógicos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [28/05/2023]
var

L1, L2, L3: real
Equilatero, Escaleno, Triangulo: logico

inicio

escreval("Digite o primeiro lado: ")
leia(L1)
escreval(L1)
escreval("Digite o segundo lado: ")
leia(L2)
escreval(L2)
escreval("Digite o terceiro lado: ")
leia(L3)
escreval(L3)

Triangulo <- (L1 < L2 + L3) e (L2 < L1 + L3) e (L3 < L1 + L2)
Equilatero <- (L1 = L2) e (L2 = L3)
Escaleno <- (L1<>L2) e (L2<>L3) e (L1<>L3)

escreval("Pode formar um triangulo?", "Resposta:", Triangulo)
escreval("O triangulo é equilatero?", "Resposta:",Equilatero)
escreval("O triangulo é escaleno?", "Resposta:",Escaleno)

fimalgoritmo