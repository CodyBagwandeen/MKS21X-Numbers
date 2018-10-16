public class RationalNumber extends RealNumber {
  private int numerator;
  private int denominator;

  public RationalNumber( int num, int den) {
    super(0.0);
  }

  public static int gcd(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
   }

   public double getValue(){
    return numerator / denominator;
  }

   private void reduce(){
     int divider = gcd( this.numerator, this.denominator);
     this.numerator = this.numerator / divider;
     this.denominator = this.denominator / divider;
}

  public int getNumerator(){
    return this.numerator;
  }

  public int getDenomintaor(){
    return this.denominator;
  }


  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(  this.denominator, this.numerator);
    return recip;
  }

  public boolean equals(RationalNumber other){
    return ( this.numerator == other.numerator) && ( this.denominator == other.denominator);
  }

public RationalNumber multiply(RationalNumber other){
   RationalNumber product = new RationalNumber( ( this.numerator * other.numerator), (this.denominator * other.denominator) ) ;
   return product;
  }


  public String toString() {
    return "";
  }



}
