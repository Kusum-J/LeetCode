class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                // Either stack empty or mismatch
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }

        // All brackets should be matched
        return stack.isEmpty();
    }
}
