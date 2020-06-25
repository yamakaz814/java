public class Mon10_31 {
  void test() throws Exception{
    System.out.println("test");
  }

  void hoge() throws RuntimeException{
    System.out.println("hoge");
  }

  public static void main(String[] args){
    Mon10_31 m = new Mon10_31();
    try {
      m.test();
    }catch(Exception e){
      System.out.println(e);
    }
    m.hoge();
  }
  
}