public class StatsBars
{
    static int money = 0;
    static int playerHP=10;
    static int playerMaxHP=15;
    static int playerHunger=10;
    static int playerSleep=10;

    static void display()
    {

        System.out.printf("$%d$\n", money);
        money++;
        displayHP();
        displayHunger();
        displaySleep();
    }


    static void displayHP()
    {

        /*for(int x=0; x<playerMaxHP; x++)
        {
            if(playerHP>x)
            {
                System.out.print("❤ ");
            }
            else
            {
                System.out.print("🤍 ");
            }
        }*/

        for(int x=0; x<playerHP; x++)
        {
            System.out.print("❤️");
        }
        for(int y=playerHP; y<playerMaxHP; y++)
        {
            System.out.print("🤍");
        }

        if(playerHP>0)
        {
            playerHP--;
        }
        System.out.print("\n");
    }


    static void displayHunger()
    {
        for (int x=0; x<playerHunger; x++)
        {
            System.out.print("🥩");
        }
        playerHunger--;
        System.out.print("\n");
    }


    static void displaySleep()
    {
        for (int x=0; x<playerSleep; x++)
        {
            System.out.print("💤");
        }
        playerSleep--;
        System.out.print("\n");
    }

}
