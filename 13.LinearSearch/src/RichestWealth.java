public class RichestWealth {
    public static void main(String[] args) {
        int[][] wealth = {{2,8,7},{7,1,3},{1,9,5}};
        int result = totalAmount(wealth);
        System.out.println(result);
    }

    static int totalAmount(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int totalAmount = 0;
            for (int account : person) {
                totalAmount = totalAmount + account;

            }
            if(totalAmount>max){
                max = totalAmount;

            }

        }

return max;

    }

}
