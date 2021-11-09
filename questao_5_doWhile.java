/*Programa em Java com estrutura de repetição "DO WHILE" que permite a entrada de 2 valores inteiros e
faz a contagem decrescente do maior até o menor valor. Ex:
Informe o primeiro valor: 52
Informe o segundo valor: 65
R: 65 64 63 62 61 60 59 58 57 56 55 54 53 52 (pode ser um valor em cada linha)*/

import java.util.Scanner;

class questao_5_doWhile{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    int valor1, valor2, counter;

    System.out.print("\n====== DO WHILE - CONTAGEM DESCRESCENTE =====\n");

    System.out.print("\nInforme o primeiro valor: ");
    valor1 = keyboard.nextInt();

    System.out.print("Informe o segundo valor: ");
    valor2 = keyboard.nextInt();

    if(valor1 > valor2){

      System.out.print("\n=============================================\n" + "\nA sequência descrescente entre " + valor1 + " e " + valor2 + " é:\n\n");

      counter = valor1 + 1;

      do{
        counter--;
        System.out.println(counter);
      }while(counter >= valor2 + 1);

    }else{

       System.out.print("\n============================================\n" + "\nA sequência descrescente entre " + valor2 + " e " + valor1 + " é:\n\n");

      counter = valor2 + 1;
      do{
        counter--;
        System.out.println(counter);
      }while(counter >= valor1 + 1);
    }
  }
}