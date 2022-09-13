package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        String yearResult = year % 4 == 0 && !(year % 100 == 0) ? "leap" : year % 400 == 0 ? "leap" : "not leap";
        boolean validation = (year > 0 && month > 0) && month < 13;
    if (validation) {
        if (yearResult.equals("leap")) {
            switch (month) {
                case 2:
                    System.out.println("29");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
            }
        } else if (yearResult.equals("not leap")) {
            switch (month) {
                case 2:
                    System.out.println("28");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
            }
        }
    } else {
        System.out.println("invalid date");
    }

    }
}
