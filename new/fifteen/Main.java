package fifteen;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws Exception {
    // Date d = new Date();
    // Calendar c = Calendar.getInstance();
    // c.setTime(d);
    // int day = c.get(Calendar.DAY_OF_MONTH);
    // day += 100;
    // c.set(Calendar.DAY_OF_MONTH,day);
    // Date future =c.getTime();

    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    // System.out.println(sdf.format(future));

    // Instant i = Instant.now();
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    for (String s :colors){
      System.out.println(s);
    }

  }
}