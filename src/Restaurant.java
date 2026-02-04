import java.util.*;
class Meal
{
    public String name;
    public int price;
    public int value;

    static Meal[] menu=
            {
                    new Meal("Hotdog", 2,2),
                    new Meal("Padthai", 14, 12),
                    new Meal("Cheeseburger", 14, 10),
                    new Meal("Pasta with Bolognese", 10 ,9),
                    new Meal("Golden steak", 200 ,6),
                    new Meal("Tuna with crispy fries", 28, 10)

            };

    Meal(String name, int price, int value)
    {
        this.name = name;
        this.price = price;
        this.value = value;
    }

}



public class Restaurant
{

    static Meal[] showMenu()
    {
        List<Meal> mealList = new ArrayList<>(Arrays.asList(Meal.menu));
        Collections.shuffle(mealList);

        Meal[] shownMeals = new Meal[3];

        for (int i = 0; i < 3; i++) {
            shownMeals[i]= mealList.get(i);
            System.out.println((i+1) + ". " + shownMeals[i].name + " - $" + shownMeals[i].price);
        }
        System.out.print("\n");
        return shownMeals;
    }


}

