import java.util.Stack;

public class SmallestNoToLeft {

    public static void main(String[] args) {
        int[] arr = {1,3,0,6,4,8};
        findSmallestNoToLeft(arr);
    }

    private static void findSmallestNoToLeft(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for (int j : arr) {
            while (!s.isEmpty() && s.peek() >= j) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.println("_, ");
            } else {
                System.out.println(s.peek() + ", ");
            }
            s.push(j);
        }
    }
}
