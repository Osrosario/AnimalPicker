import java.util.Scanner;

public class AnimalPicker
{
    private static Scanner userInput = new Scanner(System.in);

    public static String validateString()
    {
        char[] inputChars;
        StringBuilder sb;

        while (true)
        {
            String input = userInput.nextLine();
            inputChars = input.toCharArray();
            sb = new StringBuilder();

            for (char c : inputChars)
            {
                if (Character.isAlphabetic(c))
                {
                    sb.append(c);
                }
                else
                {
                    System.out.print("\nInvalid input. Please enter only letters: ");
                    sb.delete(0, sb.length());
                    break;
                }
            }

            if (sb.toString().length() > 0)
            {
                break;
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println("\nWelcome to Animal Picker!");
        System.out.println("\nChoose enter an animal you wish to see:");
        System.out.println("- Dog");
        System.out.println("- Cat");
        
        String animal = "";

        while (true) 
        {
            System.out.print("\nI want to see a: ");
            animal = validateString();

            if (animal.equalsIgnoreCase("Dog"))
            {
                System.out.println("\nDOG ASCII ART HERE");
                break;
            }
            else if (animal.equalsIgnoreCase("Cat"))
            {
                System.out.println("\nCAT ASCII ART HERE");
                break;
            }
            else 
            {
                System.out.println("That was not an animal.");
            }
        }
    }
}