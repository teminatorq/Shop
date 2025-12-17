public class Clock24 //24h clock visible entire time
{
    //variables:
    static double clockh = 6;  //prolly gonna use int eventually(double from previous version of  function)
    static double clockm = 00; //prolly gonna use int eventually(double from previous version of  function)
    //1h = 1m irl 2m=1s irl


    public static void clock24()
    {
        timeDisplay();
        //if (clockh>24)clockh=0; //day++}
        clockm++;
        Sleep.sleepm();
        if (clockm > 59) {
            clockh ++;
            clockm =0;
        }

    }



    public static void timeDisplay()
    {
        if(clockm<9.99)
        {
            System.out.printf("%.0f", clockh); System.out.print(":0"); System.out.printf("%.0f\n", clockm);
        }
        else
        {
            System.out.printf("%.0f:%.0f\n", clockh, clockm);
        }

    }
}

/*
Clock24.timeDisplay();
Clock24.clock24();
 */