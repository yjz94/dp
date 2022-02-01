package cn.lessann.dp.creative.build;

public class BuildDemo {
    public static void main(String[] args) {
        MealBuild mealBuild = new MealBuild();

        Meal meal = mealBuild.meal1();

        System.out.println(meal.getCost());

        meal.showItems();
    }
}
