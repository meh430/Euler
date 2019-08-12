import java.util.*;

public class Euler19 {
    public static void main (String[]args) {
        int sunday = 0;


        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.SUNDAY);

        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                switch (month) {
                    case 1:
                        c.set(year, Calendar.JANUARY, 1);
                        break;
                    case 2:
                        c.set(year, Calendar.FEBRUARY, 1);

                        break;
                    case 3:
                        c.set(year, Calendar.MARCH, 1);

                        break;
                    case 4:
                        c.set(year, Calendar.APRIL, 1);

                        break;
                    case 5:
                        c.set(year, Calendar.MAY, 1);

                        break;
                    case 6:
                        c.set(year, Calendar.JUNE, 1);

                        break;
                    case 7:
                        c.set(year, Calendar.JULY, 1);

                        break;
                    case 8:
                        c.set(year, Calendar.AUGUST, 1);

                        break;
                    case 9:
                        c.set(year, Calendar.SEPTEMBER, 1);

                        break;
                    case 10:
                        c.set(year, Calendar.OCTOBER, 1);

                        break;
                    case 11:
                        c.set(year, Calendar.NOVEMBER, 1);

                        break;
                    case 12:
                        c.set(year, Calendar.DECEMBER, 1);

                        break;
                }

                if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    sunday++;
                }
            }
        }

        System.out.println(sunday);
    }
}
