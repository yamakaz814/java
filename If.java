public class If{
  // public static void main(String[] args){
  //   int a = 0;
  //   if (a < 9){
  //     a++;
  //     System.out.println("10以下です");
  //   }else {
  //     System.out.println("10す");
  //   }
  // }

  // public static void main(String[] args){
  //   int isHungry = 0;
  //   String food = "もち";
  //   System.out.println("こんにちわ");
  //   if (isHungry == 0){
  //     System.out.println("お腹がいっぱいです");
  //   }else{
  //     System.out.println("はらぺこです");
  //     System.out.println(food + "をいただきます");
  //   }
  //   System.out.println("ごちそうさまでした");

  // }
  // public static void main(String[] args){
  //   System.out.print("1:検索 2:登録 3:削除 4:変更");
  //   int selected = new java.util.Scanner(System.in).nextInt();
  //   switch (selected){
  //     case 1:
  //     System.out.println("検索します");
  //     break ;
  //     case 2:
  //     System.out.println("登録します");
  //     break ;
  //     case 3:
  //     System.out.println("削除します");
  //     break ;
  //     case 4:
  //     System.out.println("変更します");
  //     break ;
  //     default :
  //   }
  public static void main(String[] args){
    System.out.println("数あてゲーム");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++){
      System.out.println("０〜９の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans){
        System.out.println("アタリ！");
        break;
      }else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}
