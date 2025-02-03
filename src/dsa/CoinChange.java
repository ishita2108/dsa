package dsa;

//Question: Given a set of coins, find the minimum number of coins needed to make a specific amount.
//Solution: Use dynamic programming to build a solution from the bottom up.

import java.util.Arrays;

public class CoinChange {
	private static int coinChange(int[] coins, int amount, int[] dp) {
		// TODO Auto-generated method stub

		if (amount == 0)
			return 0;
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < coins.length; i++) {
			if (amount - coins[i] >= 0) {
				int subAns = 0;
				if(dp[amount-coins[i]] != -1) {
					subAns = dp[amount-coins[i]];
				}
				subAns = coinChange(coins, amount - coins[i], dp);
				if (subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 7, 5 }; // Example coin denominations
		int amount = 18; // Example target amount
		int[] dp = new int[amount+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		int result = coinChange(coins, amount, dp);
		
		if (result != -1) {
			System.out.println("Minimum coins required: " + result);
		} else {
			System.out.println("Not possible to make the amount with the given coins.");
		}

	}

}
