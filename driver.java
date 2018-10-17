
public class driver{
  public static void main(String[] args){

    System.out.println("real number testing\n");

    RealNumber a = new RealNumber(2.0);
    RealNumber b = new RealNumber(4.0);
    RealNumber c = new RealNumber(195.7528720570);
    RealNumber d = new RealNumber(2.5);

    System.out.println(a.multiply(b));
    System.out.println(a.subtract(d));
    System.out.println(c.multiply(c));
    System.out.println(d.divide(c));
    System.out.println(a);
    System.out.println(a.toString());

    System.out.println("\n");

    System.out.println("rational number testing\n");

    RationalNumber ra1 = new RationalNumber(1, 1);
    RationalNumber ra2 = new RationalNumber(4, 2);
    RationalNumber ra3 = new RationalNumber(6, 2);
    RationalNumber ra4 = new RationalNumber(196, 14);
    RationalNumber ra5 = new RationalNumber(500000, 10);
    RationalNumber ra6 = new RationalNumber(0, 5);


    System.out.println(ra1.getNumerator());
    System.out.println(ra2.getValue());
    System.out.println(ra3.getValue());
    System.out.println(ra4.getDenominator());
    System.out.println(ra6.reciprocal().getNumerator());
    System.out.println(ra5.reciprocal().getDenominator());
    System.out.println(ra3.multiply(ra2));
    System.out.println(ra3.divide(ra2));
    //System.out.println(4/2);
  }
}
