import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3 {
  public static void main(String args[]){
    Date a = new Date();
    Calendar b = Calendar.getInstance();
    b.setTime(a);
    int day = b.get(Calendar.DAY_OF_MONTH);
    day += 100;
    b.set(Calendar.DAY_OF_MONTH, day);
    Date future = b.getTime();

    SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}