import java.util.Scanner;
import java.util.Random;
public class Main
{
    static int miejsce =1;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true)
        {

            System.out.println("\n\nChoose a program to run:\n1. Shop game\n2. Game Options\n3. Exit");

            int program = scanner.nextInt();
            scanner.nextLine();

            if (program == 3)
            {
                System.out.println("\nSee ya next time You 9-5 b##ch");
                Sleep.sleep(4);
                break;
            }

            else if (program == 1)
            {
                System.out.print("\nWelcome to the Shop game\n");
                Sleep.sleep(4);



                while (true)
                {

                    //125line ends game
                    if (miejsce == 0)
                    {
                        break;
                    }
                    //game:


                    // HOME
                    if (miejsce == 1)
                    {
                        if (StatsBars.playerHP<=0){break;}
                        System.out.print("Home...\n\n");
                        Sleep.sleep(2);

                        for (int x = 1; x < 31; x++) //Home
                        {
                            Clock24.clock24();
                            if (StatsBars.playerHP<=0){break;} // end game once hp hits 0
                            StatsBars.display();
                            Sleep.sleep(1);
                            //Option to use bed to restore sleep and skip time
                            System.out.print(x + "\n\n");


                        }
                        miejsce =3;
                    }


                    // Restaurant
                    else if (miejsce == 2)
                    {
                        if (StatsBars.playerHP<=0){break;}
                        System.out.print("\nRestaurant...\n");

                        // use random (,) times method random (,) to define which id from array Menu[] is on the menu(define prices in constructor)

                    }


                    // Job
                     if (miejsce == 3)
                    {
                        boolean isPlayerAlive = true;
                        if (StatsBars.playerHP<=0){break;}
                        int shift = random.nextInt(6,10);
                        //int shiftTime = shift * 60;
                        int shiftTime = 40;


                        System.out.printf("\nJob...\ntoday's shift is %d hours\n", shift);
                        Sleep.sleep(2);

                        for(int x=0; x<shiftTime; x++)
                        {

                            Clock24.clock24();
                            if (StatsBars.playerHP<=0){isPlayerAlive=false; break;} // end game once hp hits 0
                            StatsBars.display();
                            System.out.print(x +"\n\n");

                        }
                        //You need to leave your home in 15 minute period before 9.

                        // use random (6,10) to define amount of hours of today's shift.
                        // every m in job is losing hunger and sleep faster

                        //leaving job:

                                System.out.printf("\nMy shift of %d hours is finished.\n" +
                                                    "Where am I heading to?...\n",
                                                    shift);
                        Sleep.sleep(4);
                        while(isPlayerAlive==true)
                        {
                            Clock24.timeDisplay();
                            StatsBars.display();
                            System.out.print("\n1. Home, 2. Restaurant\n");
                            miejsce = scanner.nextInt();
                            scanner.nextLine();
                            if(miejsce==1 || miejsce == 2)
                            {

                                for(int x=0; x<15;x++)
                                {
                                    if (StatsBars.playerHP<=0){break;}
                                    Clock24.clock24();
                                }
                                StatsBars.playerHP=0;
                                break;
                            }



                            System.out.print("Think about proper option now.\n");
                            Sleep.sleep(4); //sleep
                        }

                    }




                }
                //once player is dead
                Sleep.sleep(2);
                System.out.print("Yes...\nYou are dead\nbye bye\n");
                Sleep.sleep(2);
                break;
            }

        }
    }

}