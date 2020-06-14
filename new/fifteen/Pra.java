package fifteen;

public class Pra {
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i < 100;i++){
      sb.append(i+1).append(",");
    }
    System.out.println(sb);
    String s = sb.toString();
    String[] ss = s.split(",");
    System.out.println(ss);

    for(String val:ss){
      System.out.println(val);
    }

  }
}