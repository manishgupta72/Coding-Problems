import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Horse");
        animals.push("Dog");
        animals.push("Cat");
        System.out.println("Stack ="+animals);
        System.out.println("peak element  ="+animals.peek());
        animals.pop();
        System.out.println("peak element  ="+animals.peek());
        System.out.println("stack="+animals);


    }
}
