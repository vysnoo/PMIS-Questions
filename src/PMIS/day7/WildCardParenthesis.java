package PMIS.day7;

public class WildCardParenthesis {
    public static void main(String[] args) {
        System.out.println(wildParen("(*))",0));
        System.out.println(wildParen("(()*(",0));
        System.out.println(wildParen("*)()((*",0));
        System.out.println(wildParen("(((*)",0));
    }
    private static int wildParen(String s,int max) {
        if(!s.contains("*")) {
            max = Math.max(max, checkMax(s));
            return max;
        }

        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='*'){
                str[i] = '(';
                max = wildParen(new String(str),max);
                str[i] = ')';
                max = wildParen(new String(str),max);
                str[i] = ' ';
                max = wildParen(new String(str),max);
                break;
            }

        }
        return max;
    }

    private static int checkMax(String s) {
        // Remove spaces (treated as empty)
        s = s.replace(" ", "");
        //System.out.println(s);

        int maxLen = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(-1); // base for length calculation

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else { // ')'
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        //System.out.println(maxLen);
        return maxLen;
    }
}
