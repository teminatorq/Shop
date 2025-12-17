import java.util.Scanner;
import java.util.Random;
public class Main
{

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
                Sleep.sleep4();
                break;
            }

            else if (program == 1) {
                System.out.print("\nWelcome to the Shop game\n");
                Sleep.sleep4();


                int miejsce =1;
                while (true) {




                    //global variables above

                    //use these methods below separately or check to use 1 method to show all these methods
                    //method; to display money

                    //bars below
                    //method(); to display health bar
                    //method(); to display hunger bar
                    //methos(); to display sleep  bar

                    //global things above

                    //game:
                    //while zamiast if?
                    System.out.print("Home...\n\n");
                    Sleep.sleep2();

                    if (miejsce == 1)
                    {
                        for (int x = 0; x < 30; x++) //Home
                        {
                            Clock24.clock24();

                            //Option to use bed to restore sleep and skip time
                            System.out.print(x + "\n\n");


                        }
                        miejsce =3;
                    }


                    else if (miejsce == 2) // Restaurant
                    {

                        System.out.print("\nRestaurant...\n");

                        // use random (,) times method random (,) to define which id from array Menu[] is on the menu(define prices in constructor)
                        //

                    }

                     if (miejsce == 3) // Job
                    {
                        int shift = random.nextInt(6,10);
                        //int shiftTime = shift * 60;
                        int shiftTime = 40;


                        System.out.printf("\nJob...\ntoday's shift is %d hours\n", shift);
                        Sleep.sleep2();

                        for(int x=0; x<shiftTime; x++)
                        {

                            Clock24.clock24();

                            System.out.print(x +"\n\n");
                        }
                        //You need to leave your home in 15 minute period before 9.


                        // use random (6,10) to define amount of hours of today's shift.
                        // every m in job is losing hunger and sleep faster

                        //leaving job:

                                System.out.printf("\nMy shift of %d hours is finished.\n" +
                                                    "Where am I heading to?...\n",
                                                    shift);
                        Sleep.sleep4();
                        while(true)
                        {
                            Clock24.timeDisplay();

                            System.out.print("\n1. Home, 2. Restaurant\n");
                            miejsce = scanner.nextInt();
                            scanner.nextLine();
                            if(miejsce==1 || miejsce == 2)
                            {

                                for(int x=0; x<15;x++)
                                {
                                    Clock24.clock24();
                                }
                                break;
                            }

                            System.out.print("Think about proper option now.\n");
                            Sleep.sleep4(); //sleep
                        }
                    }




                }
            }

        }
    }

}



/*
          try
                  {
                  Thread.sleep(4000);
    }
            catch(InterruptedException e){}
        System.out.println("It is 2nd program");
                try
                        {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
            catch (Exception e) {}*/