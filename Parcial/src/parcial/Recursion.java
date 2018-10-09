/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiante
 */
public class Recursion {
    
    public static int pico(int[] A, int n){
        A = new int[n];
        int idx = 0;
        
        for (int i : A) {
            for (int j = 1; j < A.length -1; j++) {
                if(A[i]<A[j]){
                    idx++;
                }
            }

        }
        return idx;
    }
}
