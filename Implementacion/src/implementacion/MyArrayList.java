/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E>{
    
    private int DEFAULT_SIZE = 10;
    
    public int sequenceSize;
    private E[] sequence = (E[]) new Object[10];
    
    public MyArrayList(){
        this.sequenceSize = 0;
        ensureCapacity(DEFAULT_SIZE);
    }
    
    
    public void add(int idx, E element){
        if(sequence.length == sequenceSize){
            ensureCapacity(sequenceSize*2 + 1);
        }
        for(int index = sequenceSize; index > idx; index--){
            sequence[index] = sequence[index - 1];
        }
        this.sequence[idx] = element;
        this.sequenceSize++;
    }
    
    public boolean isEmpty(){
        return sequenceSize==0?true:false;
    }
    
    private void ensureCapacity(int newSize){
        if(newSize < sequenceSize){
            return;
        }
        E[] oldSequence = sequence;
        E[] newSequence = (E[]) new Object[newSize];
        for(int index=0;index<sequenceSize;index++){
            newSequence[index] = oldSequence[index];
        }
        this.sequence = newSequence;  
    }
    
    public int maxAscending(){
        E[] newSequence = sequence;
        int n = 1;
        int temp = 1;
        for (int i = 1; i < newSequence.length; i++) {
            if(newSequence[i] > newSequence[i-1]){
                System.out.println(newSequence[i]);
                n++;
            } else{
                n =1;
            }
            
            if(n>temp){
                temp = n;
            }
        }
        
        return temp;
        
    }

    @Override
    public Iterator iterator() {
        return new MyArrayListIterator();
    }
    
    public class MyArrayListIterator implements Iterator<E>{
        private int currentPos = 0;
                
        @Override
        public boolean hasNext() {
           return currentPos < sequenceSize;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return sequence[currentPos++];
        }
    
    }
    
}