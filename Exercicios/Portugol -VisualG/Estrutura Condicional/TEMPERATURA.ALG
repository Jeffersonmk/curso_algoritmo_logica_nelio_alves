Algoritmo "temperatura"
// 
//  
// Descrição   : Problema "temperatura"
//Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
//isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
//informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala comduas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
//5
//deduzir a fórmula de Celsius para Fahrenheit): C ? ( F ? 32)
//9
//Exemplo 1:
//Voce vai digitar a temperatura em qual escala (C/F)? F
//Digite a temperatura em Fahrenheit: 75.00
//Temperatura equivalente em Celsius: 23.89
//Exemplo 2:
//Voce vai digitar a temperatura em qual escala (C/F)? C
//Digite a temperatura em Celsius: 28.15
//Temperatura equivalente em Fahrenheit: 82.67
// Autor(a)    : Jefferson
// Data atual  : 10/18/2023
Var

        Fahrenheit,Celsius,FormulaFahrenheit,FormulaCelsius:real
        Escala:caractere
        



Inicio

         escreva("Voce vai digitar a temperatura em qual escala (C/F)?")
         leia(Escala)

         se escala= "F" entao

            escreva("Digite a temperatura em Fahrenheit: ")
            leia(Fahrenheit)

            FormulaFahrenheit<-(Fahrenheit-32)/1,8

            escreva("Temperatura equivalente em Celsius: ",FormulaFahrenheit)

         se nao

            se escala=C entao

            escreva("Digite a temperatura em Celsius: ")
            leia(Celsius)

            FormulaCelsius<-(Celsius-32)/1,8

            escreva("Temperatura equivalente em Fahrenheit: ",FormulaCelsius)

            se nao

            escreva("Valor Incorreto:Digite o valor F ou C")

            fimse

         fimse
         

            



Fimalgoritmo