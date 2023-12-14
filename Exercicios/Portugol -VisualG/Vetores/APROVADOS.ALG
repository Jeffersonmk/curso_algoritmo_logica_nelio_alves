Algoritmo "aprovados"
//  
//  
// 
//  
// Descricao   : Problema "aprovados"
//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
//Exemplo:
//Quantos alunos serao digitados? 4
//Digite nome, primeira e segunda nota do 1o aluno:
//Joao Silva
//7.0
//8.5
//Digite nome, primeira e segunda nota do 2o aluno:
//Maria Teixeira
//9.2
//6.5
//Digite nome, primeira e segunda nota do 3o aluno:
//Carlos Carvalho
//5.0
//6.0
//Digite nome, primeira e segunda nota do 4o aluno:
//Teresa Pires
//5.5
//6.5
//Alunos aprovados:
//Joao Silva
//Maria Teixeira
//Teresa Pires
// Autor(a)    : Jefferson
// Data atual  : 13/12/2023
Var

        N,i:inteiro
        nota1:vetor [0..99] de real
        nota2:vetor [0..99] de real
        nomes:vetor [0..99] de caractere
        media:real

Inicio

       escreva("Quantos alunos serao digitados? ")
       leia(N)
       
       para i de 0 ate N-1 faca
            escreval("Digite nome, primeira e segunda nota do ",i+1,"o aluno:")
            leia(nomes[i])
            leia(nota1[i])
            leia(nota2[i])
       fimpara
       
       
       escreval("Alunos aprovados:")
       
       para i de 0 ate N-1 faca
            media<-(nota1[i]+nota2[i])/2
            se media >= 6 entao
               escreval(nomes[i])
            fimse
       fimpara
            
            
            
            



Fimalgoritmo