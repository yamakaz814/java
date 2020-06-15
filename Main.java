public class Main{
  public static void main(String[] args){
    String val2 = "A";
    Function f = (val) -> {
      System.out.println(val);
        
      };
      f.test("B");
    }
  }
  interface Function{
    void test(String val);
  }










// public class Main{
//   public static void main(String[] args){
//     String hoge = "foo";//文字列fooをメモリに保持
//     String fuga = "foo";//文字列fooをメモリに保持
//     System.out.println(hoge == fuga);//同じ参照を持つためtrueが返る
//     hoge += "bar";//barを加えた新しい文字列のインスタンスが生成
//     fuga += "bar";//barを加えた新しい文字列のインスタンスが生成 上とは別
//     System.out.println(hoge == fuga);//文字列は同じでも異なるインスタンスの参照を持つためfalseが返る

//     // String str = "abc";
//     // String str = "a";
//     // str += "de";

//     // System.out.print(str);

    
//   }
// }
//   interface Worker{
//     void work();
//   }
  
//   class Empo implements Worker{
//     public void work(){
//       System.out.println("work");
//     }
//     public void report(){
//       System.out.println("report");
//     }
//   }
//   class Engin extends Empo{
//     // public void work(){
//     //   System.out.println("work2");
      
//     // }
//     public void create(){
//       System.out.println("create");
      
//     }
//   }
  
//   public class Main{
//   public static void main(String[] args){
//     Worker a = new Engin();
//     Empo b = new Engin();
//     Engin c = new Engin();
    
//     b.work();

//   }
// }