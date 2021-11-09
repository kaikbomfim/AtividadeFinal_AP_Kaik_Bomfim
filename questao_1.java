/*Programa em Java que recebe um valor e calcula quantas notas de 50, 10 e 1 real são necessárias para pagar este valor. (apenas valores inteiros)
Ex:
Informe o valor: 71
R: 1 notas de 50, 2 notas de 10 e 1 nota de 1*/

import java.util.Scanner;

class questao_1{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    int valor, qtd_notas50, qtd_notas10, qtd_notas1;

    System.out.print("\n====== CALCULADORA DE QUANTIDADE DE NOTAS ======\n");
    
    System.out.print("\nInforme a sua quantia em dinheiro: R$ ");
    valor = keyboard.nextInt();

    qtd_notas50 = valor/50;
    qtd_notas10 = (valor - (qtd_notas50 * 50))/10;
    qtd_notas1 = (valor - (qtd_notas50 * 50) - (qtd_notas10*10))/1;

    System.out.print("\n================================================\n");

    System.out.print("\nPara pagar " + valor + " reais são necessárias:\n\n" + qtd_notas50 + " nota(s) de R$ 50\n" + qtd_notas10 + " nota(s) de R$ 10\n" + qtd_notas1 + " nota(s) de R$ 1");
  }
}