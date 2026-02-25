package PMIS.day11;

import java.util.Stack;

public class RemoveContDuplicate {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbaacc")); // ""
        System.out.println(removeDuplicates("abcd"));     // "abcd"
        System.out.println(removeDuplicates("abccdb"));   // "abdb"
    }

    public static String removeDuplicates(String s) {
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty() && stack.peek().ch == current) {
                // Increase count
                stack.peek().count++;
            } else {
                // Before pushing new char,
                // check if previous block must be removed
                if (!stack.isEmpty() && stack.peek().count >= 2) {
                    stack.pop();
                    i--; // reprocess this character (chain reaction)
                } else {
                    stack.push(new Pair(current, 1));
                }
            }
        }
        // Final cleanup (important)
        if (!stack.isEmpty() && stack.peek().count >= 2) {
            stack.pop();
        }
        // Build result
        StringBuilder result = new StringBuilder();

        for (Pair p : stack) {
            for (int j = 0; j < p.count; j++) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }

    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}