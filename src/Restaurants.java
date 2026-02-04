public class Restaurants
{
    String restaurantName;
    String[] mealName = new String[2];
    int mealCost;
    int mealValue;

    Restaurants(String restaurantName)
    {
        this.restaurantName = restaurantName;

    }

    void MealAdd(int mealID, String mealName, int mealCost, int mealValue)
    {

        this.mealName[mealID] = mealName;
        this.mealCost = mealCost;
        this.mealValue = mealValue;
    }


}

