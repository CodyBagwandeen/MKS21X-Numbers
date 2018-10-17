public class RationalNumber extends RealNumber {
  private int numerator;
  private int denominator;

  public RationalNumber( int  nume , int  deno ){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if ( denominator == 0) {
      numerator = 0;
      denominator = 1;
    }
    this.reduce();
  }

  public RationalNumber( RationalNumber num) {
    super( 0.0);
    numerator = num.numerator;
    denominator = num.denominator;
    this.reduce();
  }


  public static int gcd(int p, int q) {
       while (q != 0) {
           int temp = q;
           q = p % q;
           p = temp;
       }
       return p;
   }

   public double getValue(){
    return numerator / (double)denominator;
  }

   private void reduce(){
     int num = this.numerator;
     int den = this.denominator;

     int divider = gcd( num , den);
     this.numerator = num / divider;
     this.denominator = den / divider;
}

  public int getNumerator(){
    return this.numerator;
  }

  public int getDenominator(){
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

  public RationalNumber divide(RationalNumber other){
      RationalNumber quotient = new RationalNumber( this.multiply( other.reciprocal()) );
      return quotient;
    }



  public String toString() {
    if( numerator == 0)
    return "" +0;
    if ( denominator == 1)
    return ""+numerator;
    return this.numerator + "/" + this.denominator;
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber new1 = new RationalNumber( ( this.numerator * other.denominator), (this.denominator * other.numerator));
    RationalNumber new2 = new RationalNumber( ( this.numerator * other.denominator), (this.denominator * other.numerator));
    RationalNumber sum = new RationalNumber( (new1.numerator + new2.numerator), new1.denominator);
    return sum;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber new1 = new RationalNumber( ( this.numerator * other.denominator), (this.denominator * other.numerator));
    RationalNumber new2 = new RationalNumber( ( this.numerator * other.denominator), (this.denominator * other.numerator));
    RationalNumber diff = new RationalNumber( (new1.numerator - new2.numerator), new1.denominator);
    return diff;
  }

}
