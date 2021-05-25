//Muhammad Haidar Rasyiq
package Tugas_2;
public class no_2 {
    public static void main(String[] args){
    int [][] A = {
      {4, 5},
      {6, 7},
      {8,9}
    };

    int [][] B = {
      {10, 11},
      {12, 13},
      {14, 15},
    };
      if((A.length == B.length) && (A[0].length == B[0].length)){
         int[][] C = new int [A.length] [A[0].length];
        for(int i=0; i<A.length; i++){
          for(int j=0; j<A[0].length; j++){
              C[i][j] = A[i][j] - B[i][j];
          }
      }
        for(int[] c: C){
            for(int q: c){
                System.out.print(q+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(C[1][1]);
      }
      else{
          System.out.println("Cek Dahulu ukura matriksnya");
      }
      System.out.println();
      System.out.println("Muhammad Haidar Rasyiq");
    }
}
