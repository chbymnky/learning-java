import java.io.Console;

public class TreeStory {

  public static void main(String[] args) {
    Console console = System.console();
    /*  Some terms:
        noun - Person, place or thing
        verb - An action
        adjective - A description used to modify or describe a noun
        Enter your amazing code here!
    */
    String name = console.readLine("Enter your name:  ");
    String adjective = console.readLine("Enter an adjective:  ");

    // printing with multiple variables
    console.printf("%s is very %s.\n", name, adjective);

    // __Name__ is a __adjective__ __noun__. They are always __adverb__ __verb(ing)__.
    String yourName = console.readLine("Enter your name:  ");
    String nameAdjective = console.readLine("Enter an adjective:  ");
    String nameNoun = console.readLine("Enter a noun:  ");
    String adverb = console.readLine("Enter an adverb: ");
    String verbing = console.readLine("Enter a verb ending in -ing:  ");

    console.printf("The Tree Story:\n------------------\n");
    console.printf("%s is a %s %s. They are always %s %s.\n", yourName, nameAdjective, nameNoun, adverb, verbing);
  }

}