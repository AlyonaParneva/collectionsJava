package ReflectionApi;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String nickname;
    private int weight;
    private List<String> toys = new ArrayList<>();

    public Dog(String nickname, int weight, List<String> toys) {
        this.nickname = nickname;
        this.weight = weight;
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", weight=" + weight +
                ", toys=" + toys +
                '}';
    }
}
