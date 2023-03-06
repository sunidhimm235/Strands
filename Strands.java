public class Strands 
{
    public static int spaces_sequence[] = {2, 2, 2, 3, 4, 5, 5, 5, 4, 3};
    public static int spaces_index = 0;

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
        // Found a way to use DRY Principle using this function by calling the next function, come back to it later to change it.
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

    public static int getNumOfSpaces()
    {
        int n = 0;

        if (spaces_index == 0)
        {
            n = 3;
            spaces_index += 1;
        }
        else
        {
            n = spaces_sequence[spaces_index - 1];
        }

        return n;
    }

    public static void meanderingPath(String str) 
    {
        int len = str.length();

        for(int i = 0; i < len; i++, spaces_index++)
        {
            int j = getNumOfSpaces();
            
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
        }
    }

    public static void classicRapunzel(String [] strings) {
        int s1Len = strings[0].length();
        int s2Len = strings[1].length();
        int s3Len = strings[2].length();

        for(int i = 0, spaces_index = 0; i < s1Len || i < s2Len || i < s3Len; i++, spaces_index++)
        {
            int j = getNumOfSpaces();
            
            // Add more code related 

            if(spaces_index == 10)
            {
                spaces_index = 0;
            }
        }
    }

    public static void main(String[] args) 
    {
        meanderingPath("spin spin spin straw to gold");
    }
}