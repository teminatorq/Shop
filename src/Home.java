import java.util.Scanner;
import java.util.Random;

public class Home
{
    static boolean todaysNap=false;
    static boolean hadTodayLongSleep = true;
    static int nap =0;
    static int longSleepDay = 1;

    public static void watchTV(Scanner scanner)
    {

        System.out.print("\nWhat am I watching?\n1. Tv-series\n2. A movie\n");
        int tvStatement = scanner.nextInt();
        scanner.nextLine();

        if (tvStatement == 1)
        {
            for (int x = 0; x < 45; x++)
            {
                if (StatsBars.playerHP<=0){break;}
                Clock24.clock24();
            }

        }

        else if (tvStatement == 2) {
            for (int x = 0; x < 90; x++)
            {
                if (StatsBars.playerHP<=0){break;}
                Clock24.clock24();
            }

        }
    }


    public static void playOrecraft(Scanner scanner, Random random)
    {
        System.out.print("\nFor how long(minutes) am I gonna play?\n");
        final int count = scanner.nextInt();
        scanner.nextLine();

        for (int x=0; x<count; x++)
        {
            if (StatsBars.playerHP <= 0) {break;}
            Clock24.clock24();
        }

        int diamonds = random.nextInt(1,64);
        System.out.printf("\nI have found %d diamonds while playing\n", diamonds);
        Sleep.sleep(2);


    }


    public static void todaysLongSleep(Scanner scanner, Random random)
    {
        int alarmHours = 0;
        int alarmMinutes = 0;

        System.out.print("I usually sleep for about 8-9 hours.\nTurn the alarm clock?\n 1. Yes\n 2. No\n");
        final int checkAlarm = scanner.nextInt();
        scanner.nextLine();
        int sleepHoursDifference=0;
        final int sleep = random.nextInt(8,10);
        if(checkAlarm == 1)
        {
            System.out.print("after how many hours and minutes do i want to get up?\nhours: ");
            alarmHours = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\nminutes: ");
            alarmMinutes = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            if (alarmHours<sleep)
            {
                sleepHoursDifference = sleep - alarmHours;

                if (alarmMinutes<30){StatsBars.playerSleep += 1;}
                else { StatsBars.playerSleep += 2;}

                for (int k=0; k<alarmMinutes; k++)
                {
                    if (StatsBars.playerHP <= 0) {break;}
                    Clock24.clock24();

                }


            }
        }

        final int finalSleepHours = sleep - sleepHoursDifference;
        for (int i=0; i<finalSleepHours; i++)
        {
            StatsBars.playerSleep += 3;
            if (StatsBars.playerHP <= 0) {break;}
            for (int j = 0; j < 60; j++)
            {
                if (StatsBars.playerHP <= 0) {break;}
                Clock24.clock24();

            }
        }



        hadTodayLongSleep=true;
        longSleepDay = Clock24.day;
        todaysNap=false;
        nap = 0;
    }


    public static void goToBed(Scanner scanner, Random random)
    {
        final int checkTime = Clock24.hour;
        System.out.println();

        if(Clock24.day>longSleepDay)
        {
            hadTodayLongSleep=false;
        }

        //under: if did not have long sleep last night/s let to sleep long
        if (hadTodayLongSleep==false)
        {
            todaysLongSleep(scanner, random);
        }

        //under: between 6 00 - 13 00
        else if (checkTime>=6 && checkTime<13 )
        {
            System.out.print("I can't fall asleep");
        }

        //under: between 13 00 - 21 00 + length of today's nap if were one
        else if (checkTime>=13 && checkTime<21+nap)
        {

            if (todaysNap == true) {
                System.out.print("I have already had a nap. Too early for longer sleep");
                Sleep.sleep(2);

            }
            else
            {
                //don't ask for an alarm, you gonna wake up after a random nap that lasted between 1-2 hours
                nap = random.nextInt(1, 3);
                for (int i = 0; i < nap; i++) {
                    StatsBars.playerSleep += 3;
                    for (int j = 0; j < 60; j++) {
                        if (StatsBars.playerHP <= 0) {break;}
                        Clock24.clock24();
                    }
                    todaysNap = true;
                }
            }

        }


        //under: after 21 00 + length of today's nap if were one - 5 00
        else if (checkTime>=21+nap || checkTime<6)
        {
            todaysLongSleep(scanner, random);

        }
    }

}
