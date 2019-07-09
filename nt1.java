import java.util.*;
class Demo 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter letters: ");
        String telInput = kb.nextLine();
        int i;
        int count = 0;

        System.out.print("you entered digits are: ");

        for(i = 0; i <= telInput.length()-1; i++)
        {
            char p = telInput.charAt(i);
            if (p == ' ')
            {
                System.out.print("\t");
            }
            else{
                 if(p == 'A' || p == 'a') 
                {
                    System.out.print("001");
                    count++;
                }
                else if(p == 'B' || p == 'b')
                {
                    System.out.print("010");
                    count++;
                }
                else if(p == 'C' || p == 'c' )
                {
                    System.out.print("011");
                    count++;
                }
                else if(p == 'D' || p == 'd')
                {
                    System.out.print("100");
                    count++;
                }
                else if(p == 'E' || p == 'e')
                {
                    System.out.print("101");
                    count++;
                }
                else if( p == 'F' || p == 'f')
                {
                    System.out.print("110");
                    count++;
                }
                else if(p == 'G' || p == 'g')
                {
                    System.out.print("111");
                    count++;
                }
                else if(p == 'H' || p == 'h')
                {
                    System.out.print("000");
                    count++;
                }
  		 else if( p == 'I' || p == 'i')
                {
                    System.out.print("110");
                    count++;
                }
                else if(p == 'J' || p == 'j')
                {
                    System.out.print("111");
                    count++;
                }
                else if(p == 'K' || p == 'k')
                {
                    System.out.print("000");
                    count++;
                }
            }
        }     
    }
}