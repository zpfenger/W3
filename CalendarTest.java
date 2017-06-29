import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("年" + calendar.get(Calendar.YEAR));
        System.out.println("月" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日" + calendar.get(Calendar.DATE));
        System.out.println("时" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分" + calendar.get(Calendar.MINUTE));
        System.out.println("秒" + calendar.get(Calendar.SECOND));
        System.out.println(Week.orderOf(calendar.get(Calendar.DAY_OF_WEEK)).getLabel());
        //System.out.println(Week.orderOf(10).getLabel());
    }

    enum Week {
        NULL("非法值"), SUNDAY("星期日"), MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六");
        String label;

        Week(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public static Week orderOf(int order) {
            return (order >= 1) && (order < values().length) ? values()[order] : NULL;
        }
    }
}
