 
package Hafta8;
 
public class Factorial {
    
    public int calculate(int n){
        if(n==0){
           return 1; 
        }
        return calculate(n-1)*n;
    }
    
}
