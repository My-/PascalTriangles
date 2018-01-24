package my.math;

public class PaskalTriangles {
    /**
     *   method outputs Pascal triange of given value
     */
    public static int[][] pascalTriangle(final int n){
        int[][] p = new int[n][];
//        p[1] = new int[]{1};
//        p[0] = new int[1];
//        p[0][0] = 1;

        for(int y = 0; y < p.length; y++){
//            int middle = y / 2 +(y %2 == 0 ? 1 : 0);
            p[y] = new int[y +1];
            p[y][0] = 1;

            for(int x = 1; x < p[y].length-1; x++){
                int value = p[y -1][x -1] +p[y -1][x];
                p[y][x] = value;
            }
        }
        return p;
    }

    /**
     *   prints 2D array
     */
    public static void printPascalTriangle(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            int offset = (arr.length /2 -row/2)*6 +(row % 2 == 0 ? 3 : 0);
            System.out.print(String.format("%"+ offset +"s", " "));

            for(int i = 0; i < arr[row].length; i++ ){
//                if( arr[row][i] == 0 ){ break; }
                System.out.print(String.format("%6d", arr[row][i]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printPascalTriangle(pascalTriangle(16));
    }




}
