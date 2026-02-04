import java.util.Scanner;

public class Methods
{

   static void headOut(Scanner scanner)
    {

        Main.isLocation = false;

        System.out.print("\nWhere am I headed to?\n");
        final int currentLocation = Main.location;
        while(true)
        {
            //Show an array of location without the current one//im too newbie to do this
            System.out.print("\n1. Home\n2. Job\n3. Restaurant\n");
            Main.location = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n");
            if (Main.location == currentLocation)
            {
                System.out.print("\nI am already here\n");
                Sleep.sleep(1);
            }
            if(Main.location != currentLocation) {
                for (int i = 0; i < 15; i++)
                {
                    Clock24.clock24();
                }
                break;
            }
        }
    }

    static void cls() //clearing screen
    {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (Exception e) {}
    }


}
