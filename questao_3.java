/*Programa em Java que leia um valor inicial, o número de períodos (normalmente em meses) e a taxa de juros (normalmente a.m.) e calcule o valor final a ser pago.*/

import java.util.Scanner;

class questao_3{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double valorInicial, valorFinal, taxa, tempo;

    System.out.print("\n====== CALCULADORA DE MULTA POR ATRASO DE PAGAMENTO =====\n");

    System.out.print("\nInforme o valor inicial do contrato: R$ ");
    valorInicial = keyboard.nextDouble();

    System.out.print("Informe o período de atraso do pagamento (em meses): ");
    tempo = keyboard.nextDouble();

    System.out.print("Informe a taxa de juros do contrato (ao mês):  ");
    taxa = keyboard.nextDouble();

    System.out.print("\n=========================================================\n" + "\nApós os cálculos, temos que:\n");

    valorFinal = valorInicial * Math.pow((1 + taxa/100), tempo);

    System.out.printf("O valor final da parcela é: R$ %.2f ", valorFinal); 
  }
}
