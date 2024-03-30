public class lab1 {

    public static int[] findSum(int arr[], int target)
    {
        int sum = -1;
        int index [] = new int[2];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                sum = arr[j] + arr[i];
                if(sum == target)
                {
                    index[0] = j;
                    index[1] = i;
                    return index;
                }
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        int arr [] = {2, 3, 45, 2, 6, 7, 8};
        int target = 4;
        int [] index = findSum(arr, target); 
        System.out.println("indexes are: " + index[0] + ", " + index[1]);
    }
}
