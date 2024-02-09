public class max 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,76,7};
        System.out.println(max( arr, 0, 3));
    }

    static  int max (int arr[] , int start, int end)
    {
        int max = arr[start];
        for (int i = 0; i < end; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        
        }
        return max;
    }
    
}
