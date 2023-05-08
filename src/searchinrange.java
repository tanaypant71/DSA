public class searchinrange {

    static int linearSearch(int [] arr,int x, int start , int end)
    {
        if(arr.length==0)
        {
            return Integer.MAX_VALUE;
        }

        for (int i = start; i <= end; i++) {
            int e = arr[i];
            if(e == x)
            {
                return i;
            }
        }

        return -1;

    }


    public static void main(String[] args) {
        int [] arr = {18,12,-7,2,48};
        int x = 1;
        System.out.println(linearSearch(arr, x, 1, 4));
    }
}
