Algoritmo "senha_fixa"
// 
//  
// Descrição   :Problema "senha_fixa"
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
//senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
//for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
//encerrado. Considere que a senha correta é o valor 2002.
//Exemplo:
//Digite a senha: 2312
//Senha Invalida! Tente novamente: 2010
//Senha Invalida! Tente novamente: 1022
//Senha Invalida! Tente novamente: 2002
//Acesso permitido!
// Autor(a)    : Jefferson
// Data atual  : 2/11/2023
Var

    senha:inteiro


Inicio

      escreva("Digite a senha: ")
      leia(senha)

      enquanto senha<>2002 faca
      
         escreva("Senha Invalida! Tente novamente: ")
         leia(senha)
      
      fimenquanto
      
      escreva("Acesso permitido!")
      
      

Fimalgoritmo