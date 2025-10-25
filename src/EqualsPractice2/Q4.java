package EqualsPractice2;

import EqualsPractice.RationalNumber;

public class Q4 {
    public  static void main(String []args){
        EqualsPractice.RationalNumber r1=new EqualsPractice.RationalNumber(10,5);
        EqualsPractice.RationalNumber r2=new RationalNumber(10,5);
        Object o1=r1;
        Object o2=r2;
        System.out.println(r1.equals(r2));
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(o2));
        System.out.println(o1.equals(r2));
        System.out.println(r1.equals(o1));
    }
}
