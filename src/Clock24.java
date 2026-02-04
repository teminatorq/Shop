public class Clock24 //24h clock visible entire time
{

    static int hour;
    static int minute;
    static int day;



    public static void clock24()
    {
        Sleep.sleep_m(); // tick rate for Clock24

        minute++;
        if (minute > 59) {
            StatsBars.statsDecreasing();
            hour++;
            minute =0;
        }

        if (hour >= 24)
        {
            hour = 0;
            day++;

        }

    }


    public static void timeDisplay()
    {
        if (minute <9.99)
        {
            System.out.printf("%d", hour); System.out.print(":0"); System.out.printf("%d   ", minute); System.out.printf("Day %d\n", day);
        }
        else
        {
            System.out.printf("%d:%d   Day %d\n", hour, minute, day);
        }

    }
}