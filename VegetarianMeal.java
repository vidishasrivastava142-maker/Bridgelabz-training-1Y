interface MealPlan {}

class VegetarianMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
}

class Test {
    static <T extends MealPlan> void generate(T plan) {
        System.out.println(plan);
    }

    public static void main(String[] args) {
        generate(new VegetarianMeal());
    }
}