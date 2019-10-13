/*打印出星星菱形图案
*2019.10.5
*liunanyan
*《java面向对象程序设计-张桂珠》
*/
public class Star{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(j =1;j<= 2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = 3; i>=1;i--){
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}