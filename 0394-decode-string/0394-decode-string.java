class Solution {
    private int i = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) { 
                num = num * 10 + (ch - '0'); 
                i++;
            } else if (ch == '[') { 
                i++;
                String nested = decodeString(s); 
                
                while (num > 0) {
                    result.append(nested);
                    num--;
                }
            } else if (ch == ']') {
                i++;
                return result.toString();
            } else {
                result.append(ch);
                i++;
            }
        }

        return result.toString();
    }
}