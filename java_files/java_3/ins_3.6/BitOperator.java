public class BitOperator{
    public static void main(String args[]){
        byte a = 025,b=4;                                   // a为8进制数，转换为8位二进制数 00000000 00010101
        System.out.println("~"+a+"="+(~a));                // 按位取反                    11111111 11101010  负数，按位取反再加1
        System.out.println(a + "&" + b + "=" + (a&b));     // 位与                        00000000 00010110
        System.out.println(a + "|" + 6 + "=" + (a|6));     // 位或
        System.out.println(a + "^" + b + "=" + (a^b));     // 按位异或
        a = 59;
        System.out.println(a + "<<"+2+"="+(a<<2));         // 左移运算
        System.out.println(a + ">>"+2+"="+(a>>1));         // 右移运算
        a = -77;
        System.out.println(a+"<<"+1+"="+(byte)(a<<1));    // 如果两个数据长度不同。如a&b,a为byte类型，b为int类型，对它们进行位运算时，系统
        System.out.println(a+">>>"+1+"="+(byte)(a>>>1));  // 首先会将a的左侧24位填满，若a为正，则填满0，若a为负，则填满1
    }
}

/*
boolean    8
char       16
byte       8
short      16
int        32
long       64
float      32
double     64
*/