import javax.swing.*; 
class Abc
{
   public static void main(String args[])
   {
      String r= "welcome";
     int arr[]=new int [20];
 
        int i;
        int count = 0;

       

        for(i = 0; i <= r.length()-1; i++)
        {
		arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a no"));
		 System.out.print("your entered code is: ");
            if(count == 0)
            {
		
                System.out.print("-");
            }
            char p = r.charAt(i);
            if (count == 9)
            {
                System.out.println("");
                break;
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
 		  System.out.print("error");
}

}
}