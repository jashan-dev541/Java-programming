public class recurssion3 {
    // public static void arrange(String s, String p){
    //     if(s.length() == 0){
    //         System.out.print(p + " ");
    //         return;
    //     }
    //     for(int i=0; i<s.length();i++){
    //         char current = s.charAt(i);
    //         String newS = s.substring(0,i) + s.substring(i+1); 
    //         arrange(newS, p+current);
    //     }
    // }


    // public static int countPaths(int i, int j, int m, int n){
    //     if(i==m || j==n) return 0;
    //     if(i==m-1 && j==n-1) return 1;

    //     int down = countPaths(i+1, j, m, n);
    //     int right = countPaths(i, j+1, m, n);
    //     return down+right;
    // }


    // public static int tiles(int n, int m){

    //     if(n==m) return 2;
    //     if(n<m) return 1;
    //     //vertically
    //     int vert = tiles(n-m,m);

    //     //horizontally
    //     int hori = tiles(n-1,m);
    //     return vert + hori;
    // }


    public static int guests(int n){
        if(n<=1) return 1;
        //single
        int way1 = guests(n-1);
        //pair
        int way2 = (n-1)*guests(n-2);

        return way1*way2;
    }

    public static void main(String[] args) {
        // arrange("baca","");

        // System.out.println(countPaths(0,0,3,4));

        // System.out.println(tiles(4,2));
    }
 }
