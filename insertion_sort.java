public class insertion_sort {
    
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        
        //insertion sort
        int arr[] = {3,6,2,1,5};

        for(int i=0; i<arr.length; i++)
        {
            int current = arr[i];
            int j = i-1;

           
            while( j>=0 && arr[j] > current)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;

        }
        System.out.println("Selection sort : ");
        print(arr);
    }
    
}
