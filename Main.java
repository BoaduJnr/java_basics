import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import Question.Question;
import Question.Quiz;

class Main {

        void print(int num, int from, int to) {
            for (int i = from; i <= to; i++) {
                System.out.printf("%d X %d = %d", num, i, num * i).println();
            }
        }

    void table(int num) {
            print(num, 1, 10);

    }
    void table(){
       table(5);
    }
    void table(int num, int from, int to){
        print(num, from, to);
    }
    public static void main(String[] args) throws IOException {

    Main test = new Main();
        test.table();
        test.table(8);
        test.table(10, 10, 100);






        String[] options = { "Africa", "Europe", "America" };

        ArrayList<Question> questions = new ArrayList<Question>();

        questions.add(new Question("Where is Sudan", options, "Africa"));

        Quiz quiz = new Quiz(questions);

        for (Question question : quiz.questions) {

            System.out.println(question.question);
            System.out.println(question.options.toString());
        }

         int age = 45;
         System.out.println("i am " + age + " years old");
         System.out.println(Cat.getCatCount());

         Cat myCat = new Cat();
         myCat.name = "Black";
         myCat.age = 13;
         System.out.println(Cat.getCatCount());
         myCat.meow();

         List<Integer> array = new ArrayList<Integer>();

         Collections.addAll(array, 34, 78, 4, 65, 75, 78, 689);

         array
         .forEach(System.out::print);
         System.out.println();
         IntStream.range(1, 10)
         .map(x -> x * 2)
         .forEach(x -> System.out.println(x));
         System.out.println();
         System.out.println(IntStream
         .rangeClosed(1, 5)
         .reduce((int total, int curr) -> total + curr));
         GenericList<String> list = new GenericList<String>();

         list.add("a");
         list.add("b");

         array.add(5);
         for (int item : array)
         System.out.println(array.toString());

    }
}