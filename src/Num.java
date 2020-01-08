public class Num{
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
}
