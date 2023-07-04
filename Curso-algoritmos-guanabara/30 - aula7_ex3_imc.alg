algoritmo "Exercicio 3 - IMC"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 7 ]
// Descrição   : [Entender estruturas condicionais 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]
// --------------------------------------------------
// IMC = Massa/Altura²
// peso ideal -> 18,5 < imc < 25
// peso ideal -> 18,5 < imc < 25 
var

M, A, IMC: real


inicio

escreval("Massa em (Kg): ")
leia(M)
escreval("Altura em (m): ")
leia(A)
IMC <- M/(A*A)
escreval("IMC: ", IMC:5:2)
se (IMC>=18.5) e (IMC<25) entao
    escreval ("Parabens vc está no seu peso ideal")
senao
    escreval ("Você não está no peso ideal")
fimse

fimalgoritmo