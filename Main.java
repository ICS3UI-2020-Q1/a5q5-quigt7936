import java.util.Scanner;
/**
 * Program creates astrics relating to the number given
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get the users number from 1-10, if the number is't 1-10 then ask again
    int userNumber = 0;
    while (userNumber > 10 || userNumber < 1) {
      System.out.println("Please enter a number between 1 and 10");
      userNumber = input.nextInt();
    }
    
    // for loop that stops when it reaches 1 less than the number
    for (int i = 0; i < userNumber; i++) {
      // print an astric
      System.out.print("*");
    }
    
  }
}
