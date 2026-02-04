public class StatsBars
{
    static int money = 0;
    static int playerHP=10;
    static int playerMaxHP=10;
    static int playerHunger=16;
    static int playerMaxHunger=22;
    static int playerSleep=16;
    static int playerMaxSleep=22;

    static void statsDecreasing() //decrease hourly stats with Clock24.clock24
    {

        if (playerHunger > 0) {
            //playerHunger--; //playerHunger decreases over time
            playerHunger--;
        } else {
            playerHP--;      //playerHP decreases due to hunger
            playerSleep--;   //playerSleep decreases due to hunger
        }


        if (playerSleep > 0) {
            playerSleep--;  //playerSleep decreases over time
        } else {
            playerHP--;     //playerHP decreases due to lack of sleep
            playerHunger--; //playerHunger decreases due to hunger
        }
        Check();
    }

    static void Check()
        {
            if (playerHP <= 0) {
                Main.location = 0;
            } //end game once hp hits 0

            //prevent stats in StatsBars from going beyond limits:
            if (playerHP > playerMaxHP) {
                playerHP = playerMaxHP;
            }
            if (playerHunger > playerMaxHunger) {
                playerHunger = playerMaxHunger;
            }
            if (playerSleep > playerMaxSleep) {
                playerSleep = playerMaxSleep;
            }
            if (playerHunger < 0) {
                playerHunger = 0;
            }
            if (playerSleep < 0) {
                playerSleep = 0;
            }
        }


    static void display()
    {
        System.out.printf("%d$\n", money);
        displayHP();
        displayHunger();
        displaySleep();
    }


    static void displayHP()
    {

        final int forplayerHP = playerHP;
        for (int x=0; x<forplayerHP; x++)
        {
            System.out.print("❤️");
        }

        final int forplayerMaxHP = playerMaxHP;
        for (int y=forplayerHP; y<forplayerMaxHP; y++)
        {
            System.out.print("🤍");
        }

        System.out.print("\n");
    }


    static void displayHunger()
    {
        for (int x=0; x<playerHunger; x++)
        {
            System.out.print("🥩");
        }
        for (int y=playerHunger; y<playerMaxHunger; y++)
        {
            System.out.print("🦴");
        }

        System.out.print("\n");
    }

    static void displaySleep()
    {
        for (int x=0; x<playerSleep; x++)
        {
            System.out.print("😎");
        }
        for (int y=playerSleep; y<playerMaxSleep; y++ )
        {
            System.out.print("😴");
        }

        System.out.print("\n");
    }

}
