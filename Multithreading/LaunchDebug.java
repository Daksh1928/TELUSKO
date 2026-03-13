package Multithreading;

public class LaunchDebug {
    public static void main(String[] args) {
        IO.print("Telusko learning app ");
        int a = 4;
        int b = 5;
        for (int i = 0; i < a; i++) {
            IO.println("Nothing gonna happen here " + b);
        }
        IO.print("App logged out ");
    }
}
