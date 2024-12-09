import java.util.Stack;

public class ValidExpression {
    public static void main(String[] args) {
        String s = "[";
        String input = "[]";
       // Stack<Character> stack = new Stack<>();
        boolean b = true;
//        for(int i = 0;i<input.length();i++){
//            if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[' ){
//                stack.push(input.charAt(i));
//            }else if(input.charAt(i) == '}'){
//                if(!stack.empty() && stack.peek() == '{')
//                {
//                    stack.pop();
//                }else{
//                    b = false;
//                    break;
//                }
//            }
//            else if(input.charAt(i) == ']'){
//                if(!stack.empty() && stack.peek() == '[')
//                {
//                    stack.pop();
//                }else{
//                    b = false;
//                    break;
//                }
//            }
//            else if(input.charAt(i) == ')'){
//                if(!stack.empty() && stack.peek() == '(')
//                {
//                    stack.pop();
//                }else{
//                    b = false;
//                    break;
//                }
//            }
//
//        }
//        if(!stack.empty()){
//            System.out.println("false");
//        }else{
//            System.out.println(b);
//        }


//        for(int i = 0;i<input.length();i++){
//            if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[' ){
//                stack.push(input.charAt(i));
//            }else if(!stack.empty() && ((input.charAt(i)=='}' && stack.peek()=='{') || (input.charAt(i)==')' && stack.peek()=='(') || (input.charAt(i)==']' && stack.peek()=='[')))
//            {
//                stack.pop();
//            }
//            else{
//                stack.push(input.charAt(i));
//            }
//
//        }
//
//        if(!stack.empty()){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
//        }

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));

            }
            else if((!stack.empty()) &&
                    (s.charAt(i) == '}' && stack.peek() == '{') ||
                    (s.charAt(i) == ')' && stack.peek() == '(') ||
                    (s.charAt(i) == ']' && stack.peek() == '[') )
            {
                stack.pop();
            }else{
                b = false;
                break;
            }
        }
        if(!stack.empty()){
            b = false;
        }
        System.out.println(b);
    }

    }

