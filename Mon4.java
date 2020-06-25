interface Reidai{
  void pro();
}

class Samplea implements Reidai{
  public void pro(){
    System.out.print("A");
  }
}
public class Mon4 extends Samplea{
  public static void main(String[] args){
    Samplea s = new Mon4();
    Samplea s2 = new Samplea();
    test(s);
    test(s2);
    }

  public static void test(Reidai r){
    r.pro();
  }

  public void pro(){
    System.out.println("B");
  }
}