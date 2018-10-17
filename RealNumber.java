public class RealNumber {

  private double value;

  public RealNumber (double val ) {
    value = val;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue( double newval) {
    value = newval;
  }

  public String toString() {
    return "" + getValue();
  }

  public double add(RealNumber other){
     return this.value + (double)other.getValue();
   }

   public double multiply(RealNumber other){
    return this.value * (double)other.getValue();
  }

  public double divide(RealNumber other){
   return this.value / (double)other.getValue();
 }

 public double subtract(RealNumber other){
  return this.value - (double)other.getValue();
}
}
