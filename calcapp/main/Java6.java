package calcapp.main;
import calcapp.logics.CalcLogic;

public class Java6 {
  public static void main(String[] args){
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a,b);
    int delta = calcapp.logics.CalcLogic.hiku(a,b);
    java.lang.System.out.println("足すと" + total + "引くと" + delta);
  }
}