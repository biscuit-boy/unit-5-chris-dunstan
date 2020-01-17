public class Num implements Comparable{
  private int value;

  public Num(int value){
    this.value = value;
  }

  public Num(){
    this.value = 0;
  }

  public void setValue(int value){
    this.value = value;
  }

  public int getValue(){
    return value;
  }

  public String toString(){
    return "" + value;
  }

  public boolean equals(Num other) {
      if (this.value == other.getValue()) {
          return true;
      } else {
          return false;
      }
  }

  public int compareTo(Object other){
      Num otherNum = (Num) other;
      return this.getValue() - otherNum.getValue();
  }


}
