algoritmo "DEPENDENTES FUNCIONARIOS"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [03/06/2023]
// --------------------------------------------------

var

nome: caractere
sal, nsal: real
dep: inteiro

inicio

escreval("QUAL O NOME DO FUNCIONÁRIO?")
leia(nome)
escreval("QUAL O SALÁRIO DO FUNCIONÁRIO?")
leia(sal)
escreval("QUAL É A QUANTIDADE DE DEPENDENTES?")
leia(dep)
escolha dep
caso 0
    nsal <- sal + sal*0.05
caso 1
    nsal <- sal + sal*0.10
caso 4, 5, 6
    nsal <- sal + sal*0.15
outrocaso
nsal <- sal + sal*0.18
fimescolha
escreval("SEU SALARIO BASE EM R$:", sal)
escreval("SEU SALARIO COM BASE EM SEUS DEPENDENTES EM R$:", nsal)
fimalgoritmo