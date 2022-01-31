import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {

    public static Scanner scn = new Scanner(System.in);

    public static boolean countTheBracketsInTheString(String brackets) {
        int length = brackets.length();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            char ch = brackets.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }else {
                char c;
                switch (ch) {
                    case ']':
                        c = stack.pop();
                        if (c == '{' || c == '(') {

                            System.out.println(stack.size());
                            return false;
                        }
                        break;

                    case '}':
                        c = stack.pop();
                        if (c == '[' || c == '(') {

                            System.out.println(stack.size());
                            return false;
                        }
                        break;

                    case ')':
                        c = stack.pop();
                        if (c == '{' || c == '[') {

                            System.out.println(stack.size());
                            return false;
                        }
                        break;

                    default: {
                        break;
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        System.out.println(stack.size());
        return false;
    }

    public static void main(String[] args) {
        String brackets = scn.nextLine();
        boolean result = countTheBracketsInTheString(brackets);
        if(result){
            System.out.println("The entered String has Balanced Brackets");
        }else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }

    }
}
