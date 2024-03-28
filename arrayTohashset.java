import java.util.*;
public class arrayTohashset
{
    


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,6};
        int arr1[] = {1,2,3,4,5,6};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);

        for(int i=0; i<arr1.length; i++)
        {
            if(set.contains(arr1[i]))
            {
                System.out.println("same");
            }
            else
            {
                System.out.println("not same");
            }
        }

    }
}

//this is how we add array elemtns to array