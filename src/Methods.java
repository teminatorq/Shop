public class Methods
{

    static void cls() //clearing screen
    {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (Exception e) {}
    }


    static void sleep(double s ) //sleep in seconds based on the argument
    {

        try {Thread.sleep((int)(s*1000));} catch (InterruptedException e) {}

    }

}
