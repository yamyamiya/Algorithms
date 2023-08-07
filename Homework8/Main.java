package lesson9.Homework8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.push(20));
        System.out.println(stack.items);

        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.items);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.items);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(0);
        System.out.println(stack.getMin1());
        System.out.println(stack.getMin2());
        stack.pop();
        System.out.println(stack.getMin1());
        System.out.println(stack.getMin2());
        stack.pop();

        System.out.println(stack.getMax1());
        System.out.println(stack.getMax2());


    }
}
