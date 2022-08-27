package array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] input = {{1,2,0},{1,7,3},{2,2,3}};
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int maxWealth = richestCustomerWealth.maximumWealth(input);
        System.out.println("maximum wealth : " + maxWealth);
    }

    public int maximumWealth(int[][] accounts) {
        int maxIncome = 0;
        for(int row=0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum = sum + accounts[row][col];
            }
            if (maxIncome < sum) {
                maxIncome = sum;
            }

        }

        return maxIncome;
    }
}
