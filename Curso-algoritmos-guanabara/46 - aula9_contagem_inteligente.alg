algoritmo "Contagem Inteligente"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 1 aula 9 ]
// Descrição   : [Entender estruturas de repetição 1]
// Autor(a)    : [Aesley Soares]
// Data atual  : [04/06/2023]
// --------------------------------------------------
var
   INI, FIM, CONT: Inteiro

inicio
escreval("CONTAGEM INTELIGENTE")
escreval("--------------------")
escreva("Inicio: ")
leia(INI)
escreval(INI)
escreva("Fim: ")
leia(FIM)
escreval(FIM)
escreval("--------------------")
escreval("C O N T A N D O ... ")
escreval("--------------------")

se (FIM > INI) entao
    CONT <- INI
    enquanto (CONT <= FIM) faca
    escreva(CONT)
    CONT <- CONT + 1
    se (CONT <= FIM) entao
        escreva(".. ")
    fimse
    fimenquanto
    escreval("")
    escreval("CONTAGEM CRESCENTE")
senao
    CONT <- INI
    enquanto (CONT >= FIM) faca
    escreva(CONT)
    CONT <- CONT - 1
    se (CONT >= FIM) entao
        escreva(".. ")
    fimse
    fimenquanto
    escreval("")
    escreval("CONTAGEM DECRESCENTE")
fimse

fimalgoritmo
