package EnumAnnotations;

enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;

}

public class ENUM {
    public static void main(String[] args) {
        Week week = Week.SAT;
        IO.println(week);
        int index = Week.FRI.ordinal();
        IO.println(index);
        Week[] weeks = Week.values();
        for (Week data : weeks) {
            IO.println(data);
        }
    }
}
