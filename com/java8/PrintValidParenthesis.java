public class PrintValidParenthesis {
    public static void main(String[] args) {
        int n=2;
        char[] str = new char[2*n];
        printAllValidParenthesis(str, n);
    }

    private static void printAllValidParenthesis(char[] str, int n) {
        if(n>0) _printAllValidParenthesis(str, n, 0, 0, 0);
    }

    private static void _printAllValidParenthesis(char[] str, int n, int pos, int open, int close) {
        if(close == n){
            System.out.println(str);
        } else {
            if(open > close) {
                str[pos] = '}';
                _printAllValidParenthesis(str, n, pos+1, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                _printAllValidParenthesis(str, n, pos+1, open+1, close);
            }
        }
    }
}
