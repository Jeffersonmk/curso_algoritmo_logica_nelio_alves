Algoritmo "duracao"
// 
//  
// Descrição   : Problema "duracao"
//Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
//formato horas:minutos:segundos.
//Problema "duracao"
//Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
//formato horas:minutos:segundos.
//Exemplo 1:
//Digite a duracao em segundos: 300
//0:5:0
//Exemplo 2:
//Digite a duracao em segundos: 12506
//3:28:26
//Exemplo 3:
//Digite a duracao em segundos: 140811
//39:6:51
// Autor(a)    : Jefferson
// Data atual  : 05/10/2023
Var

        duracao,minutos,segundos,resto,hora:inteiro


Inicio


        escreva("Digite a duracao em segundos: ")
        leia(duracao)
        
        hora <-duracao \3600
        
        resto <-duracao % 3600
        
        minutos <-resto \60
        
        segundos <-resto % 60

        escreva(hora,":",minutos,":",segundos)


Fimalgoritmo