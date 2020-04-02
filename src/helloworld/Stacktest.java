package helloworld;

import java.util.Stack;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/23 11:16 上午
 */
public class Stacktest {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
