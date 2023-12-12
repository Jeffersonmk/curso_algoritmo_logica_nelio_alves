Algoritmo "glicose"
//  
//  
// 
//  
// Descricao   :  Problema "glicose"
//Fazer um programa para ler a quantidade de glicose
//no sangue de uma pessoa e depois mostrar na tela a
//classificação desta glicose de acordo com a tabela de
//referência ao lado.
// Exemplo 1:
//Digite a medida da glicose: 90.0
//Classificacao: normal
//Exemplo 2:
//Digite a medida da glicose: 140.0
//Classificacao: elevado
//Exemplo 3:
//Digite a medida da glicos
// Autor(a)    : Jefferson
// Data atual  : 18/10/2023
Var

        glicose:real


Inicio
        escreva("Digite a medida da glicose: ")
        leia(glicose)
        
        se glicose<=100 entao
        
        escreva("Classificacao: normal")
        
        senao

           se glicose<=140 entao

              escreva("Classificacao: elevado")

              senao
              
                escreva("Classificacao: diabetes")

                fimse

         fimse

Fimalgoritmo