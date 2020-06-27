import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mon46 {
  public static void main(String[] args){
    LocalDateTime date = LocalDateTime.of(2020,06,30,1,1);
    LocalDateTime date2 = date.plusDays(30);
    date.plusMonths(1);
    System.out.println(date.format(DateTimeFormatter.ISO_DATE));
    System.out.println(date2.format(DateTimeFormatter.ISO_DATE));
  }
  
}