Algoritmo "combustivel"
//  
//  
// 
//  
// Descrição   : Problema "combustivel" (adaptado de URI 1134)
//Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
//1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
//4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
//código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
//como as quantidades de cada combustível.
// Autor(a)    : Jefferson
// Data atual  : 11/3/2023
Var


        alcool,diesel,gasolina:inteiro
        codigo:caractere


Inicio

        escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
        leia(codigo)
        
        alcool<-0
        diesel<-0
        gasolina<-0
        
        enquanto codigo <> "4" faca
        
           se codigo = "1" entao
              alcool<-alcool+1
           senao
                se codigo = "2" entao
                   gasolina<-gasolina+1
                senao
                     se codigo = "3" entao
                        diesel<-diesel+1
                     fimse
                fimse
           fimse
             
        escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
        leia(codigo)
        
        fimenquanto
        
       escreval("MUITO OBRIGADO")
       escreval("Alcool:",alcool)
       escreval("Gasolina:",gasolina)
       escreval("Diesel: ",diesel)
       
             
             
        
        
        
        
        
        
        

Fimalgoritmo