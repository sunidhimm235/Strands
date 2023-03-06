public class Strands 
{

    // Hours spent on the assignment.
    public static double hoursSpent() 
    {
        return 0.25;
    }

    // Difficulty rating of the assignment.
    public static double difficultyRating() 
    {
        return 1;
    }

    // This method takes a string and prints it out, one character per line, with two spaces in front of each character.
    public static void straightAndNarrow(String str) 
    {

        if(str == null || str.length() == 0) 
        {
            System.out.println("Pshh!");
            return;
        }

        int len = str.length();

        for(int i = 0; i < len; i++) 
        {
            if (str.charAt(i) == ' ')
            {
                System.out.println();
            } 
            else 
            {
                System.out.println("  " + str.charAt(i));
            }
        }
    }

    // This method takes a string and an integer, and prints one character per line, with n number of spaces in front of each character.
    public static void straightAndNarrow(String str, int n) 
    {

        if(str == null || str.length() == 0) 
        {
            System.out.println("Pshh!");
            return;
        }

        int len = str.length();

        for(int i = 0; i < len; i++) 
        {
            if (str.charAt(i) == ' ')
            {
                System.out.println();
            } 
            else 
            {
                for(int j = 0; j < n; j++)
                {
                    System.out.print(" ");
                }
                System.out.println(str.charAt(i));
            }
        }

    }

    public static void meanderingPath(String str) 
    {
        int spaces_sequence[] = {2, 2, 2, 3, 4, 5, 5, 5, 4, 3};

        int len = str.length();

        for(int i = 0, spaces_index = 0; i < len; i++)
        {
            int j = 0;

            if (spaces_index == 0)
            {
                j = 3;
                spaces_index += 1;
            }
            else
            {
                j = spaces_sequence[spaces_index - 1];
            }
            
            if(str.charAt(i) == ' ') 
            {
                System.out.println();
            }
            else
            {  
                for(;j > 0; j--)
                {
                    System.out.print(" ");
                }

                System.out.println(str.charAt(i));

            }

            if(spaces_index == 10)
            {
                spaces_index = 0;
            }

            spaces_index++;
        }
    }
}