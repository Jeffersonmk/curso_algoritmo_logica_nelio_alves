Algoritmo "retangulo"
//  
//  
// 
//  
// Descricao   : Problema "retangulo"
//Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
//da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
//Exemplo 1:
//Base do retangulo: 4.0
//Altura do retangulo: 5.0
//AREA = 20.0000
//PERIMETRO = 18.0000
//DIAGONAL = 6.4031
//Exemplo 2:
//Base do retangulo: 10.3
//Altura do retangulo: 13.1
//AREA = 134.9300
//PERIMETRO = 46.8000
//DIAGONAL = 16.6643 (função)
// Autor(a)    : Jefferson
// Data atual  : 03/10/2023
Var


   base,altura,perimetro,diagonal,area:real
   


Inicio
      escreval("Base do retangulo: ")
      leia(base)
      
      escreval("Altura do retangulo:: ")
      leia(altura)
      
      area <- base * altura
      perimetro <- 2*(base+altura)
      diagonal <-RaizQ(base ^2 + altura ^2)
      

      
      escreval("AREA = ",area:8:4)
      escreval("PERIMETRO = ",perimetro:8:4)
      escreval("DIAGONAL = ",diagonal:8:4)
      

      

Fimalgoritmo