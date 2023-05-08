public class linearsearch {

    static int linearSearch(int [] arr,int x)
    {
        if(arr.length==0)
        {
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            int e = arr[i];
            if(e == x)
            {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5,6,7,8};
        int x=-1;
        System.out.println(linearSearch(arr, x));
    }
}
