algoritmo "PARTIDA DE FUTEBOL"

// --------------------------------------------------
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : [Gustavo Guanabara]
// Conteúdo    : [Estruturas condicionais aula 8 ]
// Descrição   : [Entender estruturas condicionais 2]
// Autor(a)    : [Aesley Soares]
// Data atual  : [03/06/2023]
// --------------------------------------------------

var

G1, G2, SDG: real

inicio

escreval("-----------------------")
escreval("   BANGU x MADUREIRA   ")
escreval("-----------------------")
escreva("QUANTOS GOLS DO BANGU: ")
leia(G1)
escreval(G1)
escreva("QUANTOS GOLS DO MADUREIRA: ")
leia(G2)
escreval(G2)
    se (G1 > G2) entao
      SDG <- G1 - G2
        senao
            SDG <- G2 - G1
    fimse
escreval("-----------------------")
escreval(" DIFERENCA DE GOLS: ", SDG)
escolha SDG
    caso 0
        escreval(" STATUS: EMPATE ")
    caso 1, 2, 3
        escreval(" STATUS: PARTIDA NORMAL ")
    caso 4, 5, 6
        escreval(" STATUS: GOLEADA ")
    outrocaso
        escreval(" STATUS: TENHA PENA DO OUTRO TIME. ")
fimescolha
escreval("-----------------------")
fimalgoritmo