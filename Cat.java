public class Cat extends Animal {

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;

    String name;

    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("Meow");
    }

    public static int getCatCount() {
        return catCount;
    }

    public Cat() {
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    @Override
    public void makeNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + ", livesRemaining=" + livesRemaining + "]";
    }
}
