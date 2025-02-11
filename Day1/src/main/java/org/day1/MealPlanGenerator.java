package org.day1;

import java.util.*;

// MealPlan interface
interface MealPlan {
    void showMeal();
}

// Specific meal types implementing MealPlan
class VegetarianMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Grilled vegetables, Lentil soup, Salad");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu stir-fry, Quinoa, Mixed fruit");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Keto Meal: Grilled chicken, Avocado salad, Cheese platter");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("High-Protein Meal: Steak, Egg whites, Protein shake");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void showPlan() {
        mealPlan.showMeal();
    }
}

// Main class to test meal plan generator
public class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        return new Meal<>(mealPlan);
    }

    public static void main(String[] args) {
        // User selection simulation
        Meal<VegetarianMeal> vegetarian = generateMealPlan(new VegetarianMeal());
        vegetarian.showPlan();

        Meal<VeganMeal> vegan = generateMealPlan(new VeganMeal());
        vegan.showPlan();

        Meal<KetoMeal> keto = generateMealPlan(new KetoMeal());
        keto.showPlan();

        Meal<HighProteinMeal> highProtein = generateMealPlan(new HighProteinMeal());
        highProtein.showPlan();
    }
}
