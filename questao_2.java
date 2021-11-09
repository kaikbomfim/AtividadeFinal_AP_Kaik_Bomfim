/*Programa em Java que calcula contribuições do INSS, baseado nos seguintes critérios: 

• Salário bruto até 3 salários mínimos – 8%;
• Salário bruto acima de 3 salários mínimos – 10%;
• Para as contribuições que seriam maiores que 1 salário mínimo, a importância é limitada a 1 salário
mínimo. (considere o salário mínimo como R$ 1.000,00)
Ex.
Informe o salário bruto: 2500
R: INSS: 200 / Salário líquido: 2300*/

import java.util.Scanner;

class questao_2{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double salario, taxa, novoSalario;

    System.out.print("\n====== CÁLCULO DO INSS =====\n");

    System.out.print("\nInforme o seu salário bruto: R$ ");
    salario = keyboard.nextDouble();

    System.out.print("\n============================\n" + "\nApós os cálculos, temos que:\n ");

    if (salario <= 3000){
      taxa = salario * 8/100;
      novoSalario = salario - taxa;
      
      System.out.print("\nQuantia do salário deduzida para o INSS: R$ " + taxa + "\nSalário líquido (após dedução do INSS): R$ " + novoSalario);

    }else{
        taxa = salario * 10/100;
        if (taxa >= 1000){
          taxa = 1000;
          novoSalario = salario - taxa;

          System.out.print("\nQuantia do salário deduzida para o INSS: R$ " + taxa + "\nSalário líquido (após dedução do INSS): R$ " + novoSalario);

        }else{
          novoSalario = salario - taxa;

          System.out.print("\nQuantia do salário deduzida para o INSS: R$ " + taxa + "\nSalário líquido (após dedução do INSS): R$ " + novoSalario);
        }
      }
    }
  }
