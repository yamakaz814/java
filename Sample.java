public class Sample {
  public static void main(String[] args){
    int [] array = {1,2,3};
    // int [] array2 = array.clone();
    int [] array2 = array;
    array2[0] = 5;
    for(int i:array){ 
      System.out.println(i);
    }

  }
  
}