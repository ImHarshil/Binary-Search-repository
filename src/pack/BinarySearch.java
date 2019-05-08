/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Nikhil
 */
public class BinarySearch {
    private static int size;
    private static int array[];
    private BinarySearch(){
        
    }
    public BinarySearch(int size,int array[]){
        this.size=size;
        this.array=array;
    }
    
    public boolean binarySearch(int number,int lb,int ub){
        int mid = (lb+ub)/2;
        
        if(array[mid] == number)
            return true;
        
        if(lb>=ub)
            return false;
        
        if(array[mid] < number)
            return binarySearch(number,mid+1,ub);
        else
            return binarySearch(number,lb,mid-1);
    }
}
