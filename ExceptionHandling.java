import java.util.Scanner;

public class ExceptionHandling
{
    public static  void main(String args[])
    {
        try
        {
            display();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void display() throws Exception
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        try {
            int c = a / b;
            System.out.println("The value is " + c);
            System.out.println("End");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Deekshith");
        }
        finally
        {
            System.out.println("Forever...");
        }
    }
}

