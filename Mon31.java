public class Mon31 {
    int a,b;
    public Mon31(int a,int b){
      init(a,b);
    }
    public void init( int a,int b){
      this.a = a * a;
      this.b = b * b;
    }
     public static void main(String[] args){
        int a = 2,b = 3;
        Mon31 s = new Mon31(a, b);
        System.out.println(s.a + " " + s.b);
      }

 } 