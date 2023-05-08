public class shortestPath {

    public static double getPath(String path) {
        int x=0,y=0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //East
            else if (dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String s = "NSSN";
        System.out.println(getPath(s));   
    }
}

//time complexity : O(n)
