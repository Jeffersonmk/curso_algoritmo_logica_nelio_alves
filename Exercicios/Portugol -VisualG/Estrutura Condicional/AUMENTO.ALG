Algoritmo "aumento"
//  
//  
// 
//  
// Descricao   : Problema "aumento" (adaptado de URI 1048)
//Uma empresa vai conceder um aumento percentual de
//sal�rio aos seus funcion�rios dependendo de quanto
//cada pessoa ganha, conforme tabela ao lado. Fazer um
//programa para ler o sal�rio de uma pessoa, da� mostrar
//qual o novo sal�rio desta pessoa depois do aumento,
//quanto foi o aumento e qual foi a porcentagem de
//aumento.
//Sal�rio atual
//At� R$ 1000.00
//Acima de R$ 1000.00
//at� R$ 3000.00
//Acima de R$ 3000.00
//at� R$ 8000.00
//Acima de R$ 8000.00
//Aumento
//20%
//15%
//10%
//5%
//Exemplo 1:
//Digite o salario da pessoa: 2500.00
//Novo salario = R$ 2875.00
//Aumento = R$ 375.00
//Porcentagem = 15 %
//Exemplo 2:
//Digite o salario da pessoa: 8000.00
//Novo salario = R$ 8800.00
//Aumento = R$ 800.00
//Porcentagem = 10 %
// Autor(a)    : Jefferson
// Data atual  : 24/10/2023
Var

    SalarioAtual,NovoSalario,Aumento,Porcentagem:real





Inicio

      escreva("Digite o salario da pessoa: ")
      leia(SalarioAtual)
      
      se SalarioAtual<=1000 entao
      
         Porcentagem<-0.20*100

         Aumento<-SalarioAtual*0.20
         
      senao
      
           se SalarioAtual<=3000 entao
           
               Porcentagem<-0.15*100

               Aumento<-SalarioAtual*0.15

           senao

              se SalarioAtual<=8000 entao

                 Porcentagem<-0.10*100

                 Aumento<-SalarioAtual*0.10

               senao

                  se SalarioAtual>8000 entao

                     Porcentagem<-0.05*100

                     Aumento<-SalarioAtual*0.05

                  fimse
               fimse
           fimse
       fimse
       
      NovoSalario<-SalarioAtual+Aumento
                        
      escreval("Novo salario =  R$",NovoSalario:8:2)
      escreval("Aumento = R$",Aumento:8:2)
      escreval("Porcentagem = ",Porcentagem,"%")
      
      



Fimalgoritmo
