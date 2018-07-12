import java.time.DayOfWeek;

public class MainClassDopDZ {
    public enum AnswerWeight {
        UNDER("under"), NORMAL("normal"), OVER("over"), OBESE("obese");
        private String name;

        AnswerWeight(String name) {
            this.name = name;
        }

        public static String getName(double bmi) {
            if (bmi < 18.5) {
                return AnswerWeight.UNDER.name;
            } else if (bmi >= 18.5 && bmi < 25) {
                return AnswerWeight.NORMAL.name;
            } else if (bmi >= 25 && bmi < 30) {
                return AnswerWeight.OVER.name;
            }
            return AnswerWeight.OBESE.name;
        }
    }

    public static void main(String[] args) {
        String str = "118 2.05\n" +
                "106 1.77\n" +
                "87 1.83\n" +
                "45 1.12\n" +
                "70 1.87\n" +
                "54 1.57\n" +
                "105 1.76\n" +
                "50 1.96\n" +
                "114 1.76\n" +
                "72 2.45\n" +
                "53 2.10\n" +
                "66 2.25\n" +
                "54 1.50\n" +
                "95 1.62\n" +
                "86 1.72\n" +
                "62 1.57\n" +
                "65 2.24\n" +
                "72 1.43\n" +
                "93 2.01\n" +
                "109 3.01\n" +
                "106 2.97\n" +
                "77 1.69\n" +
                "114 2.09\n" +
                "98 1.72\n" +
                "85 2.46\n" +
                "113 1.94\n" +
                "53 1.77\n" +
                "106 2.30";
        String[] stringArray = str.split("\n");
        for (String s : stringArray) {
            System.out.println(s + " " + getIndexBody(s));
        }
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));


    }

    public static int getWorkingHours(DayOfWeek day) {
        final int workDayHours = 8; //Длительность рабочего дня в часах
        final int workDayCount = 5;//Кол-во рабочих дней
        if (day.getValue() > 5) return 0;
        return (workDayCount - day.getValue() + 1) * workDayHours;
    }

    public static String getIndexBody(String s) {
        double weight = Double.parseDouble(s.split(" ")[0]);
        double height = Double.parseDouble(s.split(" ")[1]);
        return AnswerWeight.getName(weight / Math.pow(height, 2));
    }
}