public class Basics {
    public static void main(String[] args) {
        // string
        String literal = "abc";
        String literal2 = "abc";
        String object1 = new String("abc");
        String object2 = new String("abc");

        String name = "George Boadu Junior";
        int age = 29;
        String country = "Ghana";
        String company = "Amalitech";

        String formatted = String.format("My name is %s. I am from %s. I am %d years old. I work for %s", name, country,
                age, company);

        System.out.println("Hello World! I am " + name + ". I am from " + country + " and I am " + age + " years old.");
        System.out.println(name.contains("g"));
        System.out.println(object1 == object2);
        System.out.println(formatted);

    }
}
