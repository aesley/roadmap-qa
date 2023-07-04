algoritmo "Super contador"
// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estrutura de repetição 2 aula 10 ]
// Descrição   : [Entender estruturas de repetição 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [05/06/2023]
// --------------------------------------------------

var
   opc, ct: inteiro

inicio
   repita
      escreval("")
      escreval("=================")
      escreval("|    M E N U    |")
      escreval("=================")
      escreval("| [1] De 1 a 10 |")
      escreval("| [2] De 10 a 1 |")
      escreval("| [3] Sair      |")
      escreval("=================")
      leia(opc)

      se (opc = 1) entao
        ct <- 1
        repita
            escreva(ct, "..")
            ct <- ct + 1
        ate (ct > 10)
      senao
        se (opc = 2) entao
            ct <- 10
        repita
            escreva(ct, "..")
            ct <- ct - 1
        ate (ct < 1)
        senao
            se (opc = 3) entao
                escreval("SAINDO...")
            senao
                escreval("INVALIDO!")
            fimse
        fimse
      fimse
    ate (opc = 3)
fimalgoritmo
