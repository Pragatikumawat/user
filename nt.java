import java.util.*;

class Demo 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter phone number in letters: ");
        String telInput = kb.nextLine();
        int i;
        int count = 0;

        System.out.print("Phone number you entered is: ");

        for(i = 0; i <= telInput.length()-1; i++)
        {
            if(count == 0)
            {
                System.out.print("-");
            }
            char phoneChar = telInput.charAt(i);
            if (count == 1)
            {
                System.out.println("");
                break;
            }
            else{
                if( 
                    phoneChar == 'A' || phoneChar == 'a' ||
                    phoneChar == 'B' || phoneChar == 'b' ||
                    phoneChar == 'C' || phoneChar == 'c') 
                {
                    System.out.print("2");
                    count++;
                }
                else if(
                        phoneChar == 'D' || phoneChar == 'd' ||
                        phoneChar == 'E' || phoneChar == 'e' ||
                        phoneChar == 'F' || phoneChar == 'f')
                {
                    System.out.print("3");
                    count++;
                }
                else if(
                        phoneChar == 'G' || phoneChar == 'g' ||
                        phoneChar == 'H' || phoneChar == 'h' ||
                        phoneChar == 'I' || phoneChar == 'i')
                {
                    System.out.print("4");
                    count++;
                }
                else if(
                        phoneChar == 'J' || phoneChar == 'j' ||
                        phoneChar == 'K' || phoneChar == 'k' ||
                        phoneChar == 'L' || phoneChar == 'l')
                {
                    System.out.print("5");
                    count++;
                }
                else if(
                        phoneChar == 'M' || phoneChar == 'm' ||
                        phoneChar == 'N' || phoneChar == 'n' ||
                        phoneChar == 'O' || phoneChar == 'o')
                {
                    System.out.print("6");
                    count++;
                }
                else if(
                        phoneChar == 'P' || phoneChar == 'p' ||
                        phoneChar == 'Q' || phoneChar == 'q' ||
                        phoneChar == 'R' || phoneChar == 'r' ||
                        phoneChar == 'S' || phoneChar == 's')
                {
                    System.out.print("7");
                    count++;
                }
                else if(
                        phoneChar == 'T' || phoneChar == 't' ||
                        phoneChar == 'U' || phoneChar == 'u' ||
                        phoneChar == 'V' || phoneChar == 'v')
                {
                    System.out.print("8");
                    count++;
                }
                else if(
                        phoneChar == 'W' || phoneChar == 'w' ||
                        phoneChar == 'X' || phoneChar == 'x' ||
                        phoneChar == 'Y' || phoneChar == 'y' ||
                        phoneChar == 'Z' || phoneChar == 'z')
                {
                    System.out.print("9");
                    count++;
                }
            }
        }     
    }
}