import java.util.Scanner;

public class Pai35 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;
    for(int i = 0;i < N; i++){
      String str = sc.nextLine();
      String [] array = str.split(" ");
      String a = array[0];

      int num1 = Integer.parseInt(array[1]);
      int num2 = Integer.parseInt(array[2]);
      int num3 = Integer.parseInt(array[3]);
      int num4 = Integer.parseInt(array[4]);
      int num5 = Integer.parseInt(array[5]);
      
      int total = num1 + num2 + num3 + num4 + num5;

      if (total >= 350){
        if (a.equals("s")){
          
          int answer1 = num2 + num3;
          if (answer1 >= 160){
            count++;
          }
        }else if(a.equals("l")){
               
          int answer2 = num4 + num5;
          if (answer2 >= 160){
            count++;
          }
  
        }
      }
      }
      

    System.out.println(count);

  }
  
}