import java.io.Console;

public class Introductions {

  public static void main(String[] args) {
    Console console = System.console();
    // Welcome to the Introductions program!  Your code goes below here

    // Variable declaration
    // Java is trongly typed so we have to define the type of the variabe
    String firstName = "Myron";

    // format string uses %s as a placeholder in the .printf method
    console.printf("Hello, my name is %s\n", firstName);
    console.printf("%s is learning how to write Java\n", firstName);

    // console method for capturing inputted text from the user in the console
    String userName = console.readLine("What's your name?  ");
    console.printf("Welcome %s, let's get started with Java.\n", userName);
  }
}