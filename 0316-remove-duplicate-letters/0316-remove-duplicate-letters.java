class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        char[] stack = new char[26];
        int top = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (seen[idx]) continue;

            while (top > 0 && stack[top - 1] > ch && lastIndex[stack[top - 1] - 'a'] > i) {
                seen[stack[top - 1] - 'a'] = false;
                top--;
            }
            stack[top++] = ch;
            seen[idx] = true;
        }
        return new String(stack, 0, top);
    }
}