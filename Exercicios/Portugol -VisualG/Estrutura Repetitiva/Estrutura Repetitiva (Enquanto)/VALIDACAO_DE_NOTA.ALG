Algoritmo "validacao_de_nota"
//  
//  
// 
//  
// Descrição   : Problema "validacao_de_nota" (adaptado de URI 1117)
//Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
//média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
//intervalo [0,10]). Cada nota deve ser validada separadamente.
//Exemplo 1:
//Digite a primeira nota: 3.5
//Digite a segunda nota: 10.0
//MEDIA = 6.75
// Autor(a)    : Jefferson
// Data atual  : 03/11/2023
Var
        PrimeiraNota,SegundaNota,media:real


Inicio

        escreva("Digite a primeira nota:")
        leia(PrimeiraNota)

        enquanto (PrimeiraNota<0) ou (PrimeiraNota>10) faca

           escreva("Valor invalido! Tente novamente:")
           leia(PrimeiraNota)

        fimenquanto
        
        escreva("Digite a segunda nota:")
        leia(SegundaNota)
        
        enquanto (SegundaNota<0) ou (SegundaNota>10) faca

           escreva("Valor invalido! Tente novamente:")
           leia(SegundaNota)

        fimenquanto
        
        media<-(PrimeiraNota+SegundaNota)/2
        
        escreva("MEDIA = ",media)



Fimalgoritmo