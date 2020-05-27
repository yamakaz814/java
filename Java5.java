public class Java5 {
  //mainメソッド
  public static void main(String[] args){
  //  email("Java演習","aaa@com","演習です演習です");
  //  email("aaa@com","演習です演習です");
  double tri = calcTriangleArea(10.0, 5.0);
  System.out.println(tri);
  double circle = calcCircleArea(5.0);
  System.out.println(circle);
  }

 //5-1
  // public static void introduceOneself(){
  //   String name = "ネズミ";
  //   int age = 18;
  //   double height = 172.5;
  //   char eto = '子';
  //   System.out.println("身長:"+height);
  //   System.out.println("年齢:"+age);
  //   System.out.println("名前:"+name);
  //   System.out.println("干支:"+eto);
  // }

  //5-2
  // public static void email(String title,String address,String text){
  //   System.out.println(address + "に、以下のメールを送信しました");
  //   System.out.println("件名:" + title);
  //   System.out.println("本分:" + text);
  // }
  
  //5-3
  // public static void email(String address,String text){
  //   System.out.println(address + "に、以下のメールを送信しました");
  //   System.out.println("件名:無題");
  //   System.out.println("本分:" + text);
  // }

  //5-4
  public static double calcTriangleArea(double bottom, double height){
    double tri = (bottom * height)/2;
    return tri;
  }
  public static double calcCircleArea(double radis){
    double circle = (radis * radis * Math.PI);
    return circle;
  }
}