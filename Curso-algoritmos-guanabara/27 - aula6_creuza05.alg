algoritmo "Creuza05"

// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Exercícios de algoritimos aula 6 ]
// Descrição   : [Entender os operadores lógicos]
// Autor(a)    : [Aesley Soares]
// Data atual  : [29/05/2023]
var

juro, emprestimo, pagara : real

inicio

escreval("Quanto ela quer/precisa?")
leia(emprestimo)
escreval("O emprestimo foi de: R$", emprestimo)
juro <- emprestimo * 0.2
escreval("O juros será de: R$", juro)
pagara <- (emprestimo + juro)
escreval("Ela pagará um total R$" , pagara, "de emprestimo ao banco!")
escreval("Ela pagara 10 parcelas de R$" , pagara/10)

fimalgoritmo