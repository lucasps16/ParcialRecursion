/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

/**
 *
 * @author Estudiante
 */
public class Implementacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(0, 2);
        list.add(1, 3);
        list.add(2, 6);
        list.add(3, 12);
        list.add(4, 10);
        list.add(5, 9);
        list.add(6, 7);



        
        System.out.println(list.sequenceSize);
        
        System.out.println(list.maxAscending());
        
    }
    
}
