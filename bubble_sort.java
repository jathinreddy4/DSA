public class bubble_sort {

    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    
   public static void main(String[] args) 
   {
        
        int arr[] = {2,5,7,3,9};
        //bubble sort

        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])                         //this condition gives arrary basically in asccending 
                {                                             // reverse that to get decending
                //swap
                int temp = arr[j];
                arr[j]   = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        System.out.println("sorted array : ");
        print(arr);


        
    }
    
}
