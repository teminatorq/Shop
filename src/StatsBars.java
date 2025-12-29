public class StatsBars
{
    static int money = 0;
    static int playerHP=10;
    static int playerMaxHP=10;
    static int playerHunger=14;
    static int playerMaxHunger=18;
    static int playerSleep=14;
    static int playerMaxSleep=18;

    static void statsDecreasing() //decrease hourly stats with Clock24.clock24
    {

        if(playerHunger>0)
        {
            playerHunger--; //playerHunger decreases over time
        }

        else
        {
            playerHP--;      //playerHP decreases due to hunger
            playerSleep--;   //playerSleep decreases due to hunger
        }


        if(playerSleep>0)
        {
            playerSleep--;  //playerSleep decreases over time
        }


        else
        {
            playerHP--;     //playerHP decreases due to lack of sleep
            playerHunger--; //playerHunger decreases due to hunger
        }


        if (playerHP<=0)                  { Main.miejsce=0;        } //end game once hp hits 0

        //prevent stats in StatsBars from going beyond limits:
        if (playerHP>playerMaxHP)         { playerHP=playerMaxHP;         }
        if (playerHunger>playerMaxHunger) { playerHunger=playerMaxHunger; }
        if (playerSleep>playerMaxSleep)   { playerSleep=playerMaxSleep;   }
        if (playerHunger<0)               { playerHunger=0;               }
        if (playerSleep<0)                { playerSleep=0;                }

    }

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

        for (int x=0; x<playerHP; x++)
        {
            System.out.print("❤️");
        }
        for (int y=playerHP; y<playerMaxHP; y++)
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
