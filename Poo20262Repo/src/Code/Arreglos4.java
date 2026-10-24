/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Code;


public class Arreglos4 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,7,8,9,10};
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(i==(a.length-1)){
                b[0]=a[i];
            }
            else
                b[i+1]=a[i];
            System.out.println("-"+b[i]);
        }
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
    
    }
}
