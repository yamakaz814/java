import java.io.*;
class X{
  public void print()throws IOException{
    System.out.print("aaaaa");
    // throw new IOException();
  }
}

public class Main2{
  public static void main(String[] args)throws Exception{

  X obj = new X();
  try{
    obj.print();

  }catch(IOException e){

  }

  }
}








// public class Main2 {
//   void test() throws Exception{
    
//     System.out.println("test");
//   }
//   void hoge() throws RuntimeException{
//     System.out.println("hoge");
//   }
//   public static void main(String[] args)
//   //  throws Exception
//   {
//     Main2 m = new Main2();
    
//     try{
//         m.test();
//       }catch(Exception e){
//           System.out.println("Exception発生");
//         }
//       // m.test();
//       m.hoge();    
//   }
  
// }