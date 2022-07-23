package section01_JavaBasics.topic10_String.practice;

public class PizzaIngredients {
    public static void main(String[] args) {
        String[] array1 = {"dough", "tomato", "pepperoni", "dough"};
        String[] array2 = {"tomato", "pepperoni", "dough"};
        String[] array3 = {"dough", "tomato", "pepperoni", "dough","dough","dough"};
        String[] array4 = {"tomato", "pepperoni"};

        System.out.println(doughIsEnough(array1));
        System.out.println(doughIsEnough(array2));
        System.out.println(doughIsEnough(array3));
        System.out.println(doughIsEnough(array4));

    }
    public static boolean doughIsEnough(String[] ingredients) {
        int count = 0;
        boolean doughEnough = false;

        for (String ingredient : ingredients){
            if (ingredient.equals("dough")){
                count++;
            }
            if (count >= 2){
                doughEnough = true;
            }
        }
        return doughEnough;
    }
}
