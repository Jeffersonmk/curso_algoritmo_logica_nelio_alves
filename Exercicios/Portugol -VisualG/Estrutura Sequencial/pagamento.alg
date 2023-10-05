Algoritmo "pagamento"
// 
//  
// Descrição   : Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
//quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
//uma mensagem explicativa, conforme exemplo.
//Exemplo 1:
//Nome: Joao Silva
//Valor por hora: 50.00
//Horas trabalhadas: 60
//O pagamento para Joao Silva deve ser 3000.00
//Exemplo 2:
//Nome: Maria Dias
//Valor por hora: 60.00
//Horas trabalhadas: 100
//O pagamento para Maria Dias deve ser 6000.00
// Autor(a)    : Jefferson
// Data atual  : 04/10/2023
Var

        nome:caractere
        
        valor,pagamento:real
        
        hora:inteiro


Inicio


      escreva("Nome: ")
      leia(nome)
      
      escreva("Valor por hora: ")
      leia(valor)
      
      escreva("Horas trabalhadas: ")
      leia(hora)
      
      pagamento <- valor*hora

      escreva("O pagamento para ",nome, " deve ser ",pagamento:8:2)
      



Fimalgoritmo