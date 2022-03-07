public class KthNumInGrammar {
    public static void main(String[] args) {
        int result = findKthNumInGrammar(2,2);
        System.out.println(result);
    }

    private static int findKthNumInGrammar(int n, int k) {
        if(n==1 && k==1) return 0;
        int mid = (int) ((Math.pow(2,n-1))/2);
        if (k <= mid){
            return findKthNumInGrammar(n-1, k);
        } else {
            int res = findKthNumInGrammar(n-1, k-mid);
            return res ==0 ? 1 : 0;
        }
    }
}