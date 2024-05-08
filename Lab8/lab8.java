package Labs.Lab8;
import java.util.*;

public class lab8 {
    public static int coinChange(int[] coins, int amount) {
        int[] holder = new int[amount+1];
        for(int i= 1; i <= amount; i++)
        {
            holder[i] = amount + 1;
        } //holds 1 more than per cell than in original amount ex amount = 99, arr = [100,100,100,100,100, 100];

        holder[0] = 0;

        for(int i = 1; i <= amount; i++)
        {
            for(int coin: coins)
            {
                if(coin <= i)
                {
                    holder[i] = Math.min(holder[i], holder[i - coin] + 1);
                }
            }
        }

        if(holder[amount]>amount)
        {
            return -1;
        }
        else
        {
            return holder[amount];
        }
    }
    public static void main(String[] args)
    {
        int[] coins1 = {1, 5, 10, 25, 50, 100};
        int[] coins2 = {1, 10, 25, 50, 100};

        System.out.println(coinChange(coins1, 40)); // Should be 3 since we have 5
        System.out.println(coinChange(coins2, 40)); // Should be 4 since we don't have 5
    }
}
