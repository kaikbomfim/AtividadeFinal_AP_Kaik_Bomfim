/*Programa em Java que recebe 3 valores A, B e C e informa se estes valores podem formar um triângulo. O ABC é triângulo apenas se A < B + C e B < A + C e C < A + B.
Ex:
Informe o valor de A: 5
Informe o valor de B: 4
Informe o valor de C: 3
R: Os valores informados formam um triâgulo*/

import java.util.Scanner;

class questao_4{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);

    double a, b, c;

    System.out.print("\n============ FORMAÇÃO DE TRIÂNGULOS ============\n");

    System.out.print("\nInforme o valor de A: ");
    a = keyboard.nextDouble();

    System.out.print("Informe o valor de B: ");
    b = keyboard.nextDouble();

    System.out.print("Informe o valor de C: ");
    c = keyboard.nextDouble();

    if ((a < b + c) && (b < a + c) && (c < a + b)){
      System.out.print("\nOs valores " + a + ", " + b + " e " + c  + " formam um triângulo.");
    }else{
      System.out.print("\nOs valores " + a + ", " + b + " e " + c  + " não formam um triângulo.");
    }
  }
}
