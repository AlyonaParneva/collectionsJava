package ReflectionApi;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("До обнуления: " + cat);
        ObjectResetUtil.nullifyFields(cat);
        System.out.println("После обнуления: " + cat);

        Dog dog = new Dog("Sharik", 5, Arrays.asList("Ball", "Bone"));
        System.out.println("До: " + dog);
        ObjectResetUtil.nullifyFields(dog);
        System.out.println("После: " + dog);
    }
}
