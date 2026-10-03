class Solution {
    public String finalString(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'i') {
                String rev = "";

                for (int j = ans.length() - 1; j >= 0; j--) {
                    rev = rev + ans.charAt(j);
                }

                ans = rev;
            } 
            else {
                ans = ans + ch;
            }
        }

        return ans;
    }
}