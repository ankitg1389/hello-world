public class CheckParenthesis {
    public static void main(String[] args) {
        String str = "{}{{}}";
        boolean isValid = hasValidParenthesis(str);
        System.out.println(isValid);
    }

    private static boolean hasValidParenthesis(String str) {
        int open=0;
        for (int i = 0; i < str.length(); i++) {
            if(open<0) return false;
            if(str.charAt(i) == '{') open++;
            if(str.charAt(i) == '}') open--;
        }
        return open==0;
    }

}
