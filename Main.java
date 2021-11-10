/*This program is to make an average calculation between 3 numbers*/

import java.util.Scanner;

class Main{
  public static void main(String [] args){
    float number1, number2, number3, average;

    Scanner keyboard = new Scanner(System.in);


    System.out.print("Informe a primeira nota: ");
    number1 = keyboard.nextFloat();

    System.out.print("Informe a segunda nota: ");
    number2 = keyboard.nextFloat();

    System.out.print("Informe a terceira nota: ");
    number3 = keyboard.nextFloat();

    average = (number1 + number2 + number3) / 3;

    System.out.println("A média entre as três notas é: " + average);

  }

 
}