class Lab8:
    @staticmethod
    def coinChange(coins, amount):
        holder = [amount + 1] * (amount + 1)
        
        holder[0] = 0

        for i in range(1, amount + 1):
            for coin in coins:
                if coin <= i:
                    holder[i] = min(holder[i], holder[i - coin] + 1)

        if holder[amount] > amount:
            return -1
        else:
            return holder[amount]

    @staticmethod
    def main():
        coins1 = [1, 5, 10, 25, 50, 100]
        coins2 = [1, 10, 25, 50, 100]

        print(Lab8.coinChange(coins1, 40))  # Should be 3 since we have 5
        print(Lab8.coinChange(coins2, 40))  # Should be 4 since we don't have 5


# Calling the main method
Lab8.main()
