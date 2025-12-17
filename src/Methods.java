public class Methods
{

    static void cls()
    {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (Exception e) {}
    }


    static void sleep(double s )
    {

        try {Thread.sleep((int)(s*1000));} catch (InterruptedException e) {}

    } //sleep


}
