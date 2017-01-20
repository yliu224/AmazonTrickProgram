import java.util.Stack;

/**
 * Created by Yiding Liu on 1/19/2017.
 */
public class ValidParatheses {
    public boolean isValid(String s) {
        char[] c=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char cc:c){
            if(stack.isEmpty()){
                stack.push(cc);
                continue;
            }
            if(match(cc,stack.peek())) stack.pop();
            else stack.push(cc);
        }
        return stack.empty();
    }
    public boolean match(char a,char b){
        if(a=='('&&b==')'|| a=='['&&b==']'|| a=='{'&&b=='}') return true;
        else return false;
    }
}
