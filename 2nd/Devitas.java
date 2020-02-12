import java.util.Scanner;
class Devintas {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Parasykite metus: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " Kelemieji metai");
        }
        else
        {
            System.out.println(year + " Nekelemieji metai");
        }
    }
}