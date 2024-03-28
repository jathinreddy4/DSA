public class twosum 
{
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = find(arr, target);
        System.out.println(ans);
    }  
    
    public static String find(int arr[],int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    
                    System.out.println("The sum of = " + arr[i] + " + " + arr[j] + "= " + target);
                    
                }

            }
        }
        return "no";
        
    }
}
