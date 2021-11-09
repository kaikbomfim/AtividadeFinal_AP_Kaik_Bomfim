/*Programa em Java com estrutura de repetição "FOR" que permite a entrada de 3 valores e faz a contagem do primeiro deles até o segundo com o passo dado pelo terceiro. (considera que os valores digitados
serão sempre possíveis)
Ex:
Informe o primeiro valor: 2
Informe o segundo valor: 19
Informe o terceiro número: 3
R: 2 5 8 11 14 17 (pode ser um valor em cada linha)*/

import java.util.Scanner;

class questao_6_for{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    double valor1, valor2, passo, counter;

    System.out.print("\n====== FOR - CONTAGEM ENTRE DOIS NÚMEROS =====\n");

    System.out.print("\nInforme o primeiro valor: ");
    valor1 = keyboard.nextDouble();

    System.out.print("Informe o segundo valor: ");
    valor2 = keyboard.nextDouble();

    System.out.print("Informe o terceiro valor: ");
    passo = keyboard.nextDouble();

    if (valor1 < valor2){

      System.out.print("\n==============================================\n" + "\nA sequência numérica, de " + passo + " em " + passo + ", entre " + valor1 + " e " + valor2 + " é:\n\n");

      for(counter = valor1; counter <= valor2; counter += passo){
        System.out.println(counter);
      }

    }else{

      System.out.print("\n==============================================\n" + "\nA sequência numérica, de " + passo + " em " + passo + ", entre " + valor1 + " e " + valor2 + " é:\n\n");
      
      for(counter = valor1; counter >= valor2; counter -= passo){
        System.out.println(counter);
      }
    }
  }
}