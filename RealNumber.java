public class RealNumber {

  private double value;

  public RealNumber (double value ) {

  }

  public double getValue() {
    return 10;
  }

  public void setValue( double newval) {

  }

  public String toString() {
    return "" + getValue();
  }

  public double add(RealNumber other){
     return this.value + other.getValue();
   }

   public double multiply(RealNumber other){
    return this.value * other.getValue();
  }

  public double divide(RealNumber other){
   return this.value / other.getValue();
 }

 public double subtract(RealNumber other){
  return this.value - other.getValue();
}
}
