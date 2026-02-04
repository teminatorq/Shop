import java.time.Clock;
import java.util.Scanner;
import java.util.Random;


public class Main
{

    static int location =1;
    static boolean isLocation;

    public static void main(String[] args)
    {
        Clock24.hour = 6;
        Clock24.minute = 0;
        Clock24.day = 1;
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
                    if (StatsBars.playerHP<=0){break;}

                    //game:


                    // HOME
                    if (location == 1)
                    {

                            System.out.print("Home...");
                            Sleep.sleep(2);

                            isLocation=true;
                            while (isLocation) //Home
                            {
                                System.out.print("\n\n");
                                Clock24.timeDisplay();
                                StatsBars.display();
                                if (StatsBars.playerHP<=0){break;}
                                System.out.print("\nWhat to do...\n1. Watch Tv\n2. Play Orecraft\n3. Go to bed\n4. Head out\n");
                                int homeStatement = scanner.nextInt();
                                scanner.nextLine();
                                switch (homeStatement)
                                {

                                    case 1:
                                    {
                                        Home.watchTV(scanner);
                                        break;
                                    }
                                    case 2:
                                    {
                                        Home.playOrecraft(scanner, random);
                                        break;
                                    }
                                    case 3:
                                    {
                                        Home.goToBed(scanner, random);
                                        break;
                                    }
                                    case 4:
                                    {
                                        Methods.headOut(scanner);
                                        break;
                                    }


                                }

                            }

                    }



                    // Job
                    else if (location == 2)
                    {
                        if (StatsBars.playerHP<=0){break;}
                        Clock24.timeDisplay();
                        StatsBars.display();

                        boolean isWeekend=false;
                        int Weekend = Clock24.day % 7;
                        if (Weekend==0 || Weekend==6){isWeekend=true;}

                        if(isWeekend==true)
                        {
                            System.out.printf("\nIt's weekend, wtf am I doin' here...\n");
                            Sleep.sleep(2);
                            Methods.headOut(scanner);
                        }

                        else if(Clock24.hour ==9 && Clock24.minute>15 || Clock24.hour>9)
                        {
                            System.out.printf("\nYou are late for your Job\n");
                            Sleep.sleep(2);
                            Methods.headOut(scanner);
                        }

                        else
                        {
                            final int shift = random.nextInt(7, 10);

                            System.out.printf("\nJob...\ntoday's shift is %d hours\n", shift);
                            Sleep.sleep(2);
                            final int shiftFinishHour = Clock24.hour + shift;
                            final int shiftFinishMinute = Clock24.minute;

                            isLocation = true;
                            while (isLocation)
                            {
                                if (StatsBars.playerHP<=0){break;}
                                System.out.print("\nWhich task to do?\n1. Move packages\n2. Stand as a cashier\n3. Help clients\n");
                                int jobStatement = scanner.nextInt();
                                scanner.nextLine();


                                switch (jobStatement)
                                {
                                    case 1:
                                    {
                                        System.out.print("\nMoving packages...\n");
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.print("\nStaying at the register...\n");
                                        break;
                                    }
                                    case 3:
                                    {
                                        System.out.print("\nHelping clients...\n");
                                        break;
                                    }
                                }
                                int anHour = 60;
                                for (int i=0; i<anHour; i++)
                                {
                                    Clock24.clock24();
                                }

                                //Job's shift is finished
                                if (Clock24.hour==shiftFinishHour && Clock24.minute==shiftFinishMinute )
                                {
                                    StatsBars.money += shift*11;
                                    StatsBars.display();
                                    Sleep.sleep(1);
                                    System.out.print("It's \n"); Clock24.timeDisplay(); System.out.print("already");
                                    Methods.headOut(scanner);
                                }

                            }

                        }
                    }




                    // Restaurant
                    else if (location == 3)
                    {
                        if (StatsBars.playerHP<=0){break;}
                        Clock24.timeDisplay();
                        StatsBars.display();

                        System.out.print("\nRestaurant...\n");
                        Sleep.sleep(1);
                        System.out.print("\nTaking free seat\n");
                        Sleep.sleep(1);

                        boolean ordering=true;
                        while(ordering)
                        {
                            System.out.print("\nOpening the Menu\n");
                            Meal[] currentMenu = Restaurant.showMenu();
                            Sleep.sleep(2);
                            System.out.print("\nOrder ");
                            int mealOrder =scanner.nextInt();
                            scanner.nextLine();
                            Meal chosenMeal = currentMenu[mealOrder - 1];
                            StatsBars.money -= chosenMeal.price;
                            StatsBars.playerHunger += chosenMeal.value;
                            System.out.print("\nEating...\n");
                            Sleep.sleep(4);

                            int eatTime = 15;
                            for (int i=0; i<eatTime; i++)
                            {
                                Clock24.clock24();
                            }
                            StatsBars.Check();
                            StatsBars.display();

                            System.out.print("\nDo I want to order again?");
                            System.out.print("\n1. Yes\n2. No\n");
                            int keepOrdering = scanner.nextInt();
                            scanner.nextLine();

                            ordering = (keepOrdering == 1);



                        }
                        Methods.headOut(scanner);




                        // use random (,) times method random (,) to define which id from array Menu[] is on the menu(define prices in constructor)

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