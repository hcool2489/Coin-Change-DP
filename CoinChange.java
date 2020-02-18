public class CoinChange{
	public static int minCoins(int coins[], int len, int amt){
		if(amt == 0)
			return 0;
		int res = Integer.MAX_VALUE;
		for(int i=0;i<len;i++){
			if(coins[i] <= amt){
				int sub_res = minCoins(coins, len, amt-coins[i]);
				if(sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
					res = sub_res + 1;
			}
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}