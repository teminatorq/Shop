public class Methods
{

    static void cls() //clearing screen
    {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (Exception e) {}
    }


}
