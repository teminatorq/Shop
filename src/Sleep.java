public class Sleep
{
    static void sleep(double s ) //sleep in seconds based on the argument
    {

        try {Thread.sleep((int)(s*1000));} catch (InterruptedException e) {}

    }


    static void sleep_m() // tick rate for Clock24
    {

        try {Thread.sleep(20);} catch (InterruptedException e) {}

    }

}