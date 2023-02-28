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
        System.out.println("- Fish");
        System.out.println("- Frog");
        
        String animal = "";

        while (true) 
        {
            System.out.print("\nI want to see a: ");
            animal = validateString();

            if (animal.equalsIgnoreCase("Dog"))
            {
                System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
                break;
            }
            else if (animal.equalsIgnoreCase("Cat"))
            {
                System.out.println("\n|\\__/,|   (`\\\n |_ _  |.--.) )\n ( T   )     /\n(((^_(((/(((_/");
                break;
            }
            else if (animal.equalsIgnoreCase("Fish"))
            {
                System.out.println("\n    _/./\n ,-\'    `-:..-\'/\n: o )      _  (\n\"`-....,--; `-.\\\n    `\'");
                break;
            }
            else if (animal.equalsIgnoreCase("Frog"))
            {
                System.out.println("           .--._.--.\n          ( O     O )\n          /   . .   \\\n         .`._______.\'.\n        /(           )\\\n      _/  \\  \\   /  /  \\_\n   .~   `  \\  \\ /  /  \'   ~.\n  {    -.   \\  V  /   .-    }\n_ _`.    \\  |  |  |  /    .\'_ _\n>_       _} |  |  | {_       _<\n /. - ~ ,_-\'  .^.  `-_, ~ - .\\\n         \'-\'|/   \\|`-`");
                break;
            }
            else 
            {
                System.out.println("That was not an animal.");
            }
        }
    }
}