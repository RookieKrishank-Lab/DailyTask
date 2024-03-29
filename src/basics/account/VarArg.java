package basics.account;

public class VarArg {
    //number of argument can be 0 to n for var arg
    /*



    //Part1     (summation)
    public static void m1(int... x){
//        System.out.println("var-arg method");
        System.out.println("No. of argument "+x.length);
        int total=0;
        for(int x1:x){
            total +=x1;
        }
        System.out.println("Sum is: "+total);
    }

    public static void main(String[] args){
        m1();
        m1(1,2);
        m1(1,2,3);
    }



    //Part 2
    public static void m1(int... x){
        System.out.println("Var_arg");
    }

    public static void m1(int x){
        System.out.println("General");
    }
    public static void m1(){
        System.out.println("Zero");
    }


    public static void main(String[] args) {
        m1();                                       // will print Var_arg because var arg method can called using any numner of int value (including 0 as well)
        m1(1,2);
        m1(1);
    }*/

    //  Part 3
    public static void m1(int[]... x){
        for(int[] x1:x){
            System.out.println(x1[0]);
        }
    }
    public static void main(String[] args){
        int []a={1,2,3};
        int []b={4,5,6};
        m1(a,b);
    }
}
