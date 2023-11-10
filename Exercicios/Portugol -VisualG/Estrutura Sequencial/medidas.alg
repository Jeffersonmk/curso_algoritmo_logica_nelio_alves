Algoritmo "medidas"
//  
//  
// 
//  
// Descricao   : Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
//com quatro casas decimais):
//a) a área do quadrado que tem lado A
//b) a área do triângulo retângulo que base A e altura B
//c) a área do trapézio que tem bases A e B, e altura C
//Exemplo 1:
//Digite a medida A: 4.0
//Digite a medida B: 3.5
//Digite a medida C: 5.2
//AREA DO QUADRADO = 16.0000
//AREA DO TRIANGULO = 7.0000
//AREA DO TRAPEZIO = 19.5000
//Exemplo 2:
//Digite a medida A: 7.13
//Digite a medida B: 8.05
//Digite a medida C: 11.912
//AREA DO QUADRADO = 50.8369
//AREA DO TRIANGULO = 28.6983
//AREA DO TRAPEZIO = 90.4121
// Autor(a)    : Jefferson
// Data atual  : 04/10/2023
Var

        medida1,medida2,medida3,area1,area2,area3:real
        



Inicio

      escreva("Digite a medida A: ")
      leia(medida1)

      escreva("Digite a medida B: ")
      leia(medida2)
      
      escreva("Digite a medida C: ")
      leia(medida3)
      
      area1 <- medida1^2
      
      area2 <- (medida1*medida2)/2
      
      area3 <- ((medida1+medida2)/2)*medida3
      
      escreval("AREA DO QUADRADO = ",area1:8:4)
      escreval("AREA DO TRIANGULO = ",area2:8:4)
      escreva("AREA DO TRAPEZIO = ",area3:8:4)


Fimalgoritmo