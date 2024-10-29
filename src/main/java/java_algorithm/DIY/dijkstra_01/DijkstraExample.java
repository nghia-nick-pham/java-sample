package java_algorithm.DIY.dijkstra_01;

public class DijkstraExample {

    public static final int vertexies = 9;

    int getEvaluatingIndex(int[] dest, boolean[] evaluated){
        int index = -1;
        int m = Integer.MAX_VALUE;

        for (int vx = 0; vx < vertexies; vx++) {
            if(evaluated[vx] == false && dest[vx] <= m) {
                m = dest[vx];
                index = vx;
            }
        }
        return index;
    }
    void dijkstra(int[][]grph, int s){

        //definition
        int defVal = Integer.MAX_VALUE;
        int[] dest = new int[9];
        boolean[] evaluated = new boolean[9];


        //Initillization for arrays
        for (int i = 0; i < vertexies; i++) {
            dest[i] = defVal;
            evaluated[i] = false;
        }
        //Initillization for the source
        dest[s] = 0;



        for (int count = 0; count < vertexies; count++) {
            //find the vertex evaluating
            int ux = getEvaluatingIndex(dest, evaluated);
            evaluated[ux] = true;

            for (int vx = 0; vx < vertexies; vx++) {
                //replace value of connection vertexies.
                if (!evaluated[vx] && evaluated[ux] && grph[ux][vx] != -1 & (dest[ux] + grph[ux][vx] < dest[vx])) {
                    dest[vx] = dest[ux] + grph[ux][vx];
                }
            }
        }

        print(dest);

    }

    void print(int[] dest){
        for (int i = 0; i < vertexies; i++) {
            System.out.println("dinstance from src to vertex " + i + " is " + dest[i]);
        }
    }
    // main method
    public static void main(String argvs[])
    {
// A 9 * 9 matrix is created.
// arr[x][y] = - 1 means, there is no any edge that connects the nodes x and y directly
        int grph[][] = new int[][] { { -1, 3, -1, -1, -1, -1, -1, 7, -1 },
                { 3, -1, 7, -1, -1, -1, -1, 10, 4 },
                { -1, 7, -1, 6, -1, 2, -1, -1, 1 },
                { -1, -1, 6, -1, 8, 13, -1, -1, 3 },
                { -1, -1, -1, 8, -1, 9, -1, -1, -1 },
                { -1, -1, 2, 13, 9, -1, 4, -1, 5 },
                { -1, -1, -1, -1, -1, 4, -1, 2, 5 },
                { 7, 10, -1, -1, -1, -1, 2, -1, 6 },
                { -1, 4, 1, 3, -1, 5, 5, 6, -1 } };

// creating an object of the class DijkstraExample
        DijkstraExample obj = new DijkstraExample();
        obj.dijkstra(grph, 0);
    }
}
