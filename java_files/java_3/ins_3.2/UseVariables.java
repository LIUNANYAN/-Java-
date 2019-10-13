public class UseVariables{
    public static void main(String[] args){
        final int PRICE = 30;
        long l = 1234l;
        int num,total;
        float r,v,h = 3.5f;
        double w = 3.1415;
        boolean truth = true;
        boolean false1;
        char c;
        c = 'A';
        num = 10;
        total = num * PRICE;
        r = 2.5f;
        v = 3.14159f * r * r * h;
        false1 = 6 > 7;
        String s = "I am a student";
        System.out.println("final int PRICE = "+PRICE);
        System.out.println("long l="+l);
        System.out.println("int num ="+num+"\ntotal ="+ total);
        System.out.println("boolean truth ="+truth);
        System.out.println("boolean false1="+false1);
        System.out.println("char c="+c);
        System.out.println("float r="+r);
        System.out.println("float v="+v);
        System.out.println("String s="+s);
    }
}