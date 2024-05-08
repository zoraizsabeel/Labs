# High Level Approach
    - create a array that holds the coin combos, in each value we store more than the amount this way we have a comparator that we can never reach
    - after setting first value to 0
        - create a for loop:
        - we compare each coin to see if it is less than amount, then update the min amount of coins needed for i
    - return amount of coins or
    - return -1 if amount is not possible

