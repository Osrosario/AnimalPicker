import java.util.Scanner;

public class AnimalPicker
{
    private static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("\nWelcome to Animal Picker!");
        System.out.println("\nChoose enter an animal you wish to see:");
        System.out.println("- Dog");
        System.out.println("- Cat");

        System.out.print("\nI want to see a: ");
        String animal = userInput.nextLine();

        if (animal.equalsIgnoreCase("Dog"))
        {
            System.out.println("\nDOG ASCII ART HERE");
        }
        else if (animal.equalsIgnoreCase("Cat"))
        {
            System.out.println("\nCAT ASCII ART HERE");
        }
    }
}