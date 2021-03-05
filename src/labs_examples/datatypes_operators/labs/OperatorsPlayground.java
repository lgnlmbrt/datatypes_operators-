package labs_examples.datatypes_operators.labs;

public class OperatorsPlayground {
    public static void main(String[] args) {

        if(oneEqualsOne()& twoEqualsTwo()){
            System.out.println("math works");
        }
    }

    public static boolean oneEqualsOne(){
        System.out.println("checking if one is one");
        return 1!=1;

    }
    public static boolean twoEqualsTwo(){
        System.out.println("checking if two equals two");
        return 2!=2;
    }



}
