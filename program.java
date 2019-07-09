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
		int charCode = Integer.parseInt(info, 2);
		String str = new Character((char)charCode).toString();
        System.out.print("you entered digits are: ");

        for(i = 0; i <= telInput.length()-1; i++)
        {
            if(count == 3)
            {
                System.out.print("-");
            }
            char p = telInput.charAt(i);
            if (p == ' ')
            {
                System.out.print("\t");
            }
            else{
                 if(p == 'A' || p == 'a') 
                {
                    System.out.print("1");
                    count++;
                }
                else if(p == 'B' || p == 'b')
                {
                    System.out.print("2");
                    count++;
                }
                else if(p == 'C' || p == 'c' )
                {
                    System.out.print("3");
                    count++;
                }
                else if(p == 'D' || p == 'd')
                {
                    System.out.print("4");
                    count++;
                }
                else if(p == 'E' || p == 'e')
                {
                    System.out.print("5");
                    count++;
                }
                else if( p == 'F' || p == 'f')
                {
                    System.out.print("6");
                    count++;
                }
                else if(p == 'G' || p == 'g')
                {
                    System.out.print("7");
                    count++;
                }
                else if(p == 'H' || p == 'h')
                {
                    System.out.print("8");
                    count++;
                }
            }
        }     
  
    }
}