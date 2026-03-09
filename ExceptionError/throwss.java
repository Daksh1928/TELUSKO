import java.util.Scanner;

class ATM {
    private int acc_num = 1111;
    private int pass = 22222;
    private int an;
    private int pw;

    public void input() {
        Scanner sc = new Scanner(System.in);
        IO.print("Kindly enter acc num");
        an = sc.nextInt();
        IO.print("Kindly enter acc pass ");
        pw = sc.nextInt();

    }

    public void verify(){
          if(acc_num == an&& pass == pw){
            IO.print("Collect fucking cash ");
          }
          else{
            IO.print("FUCk you");
          }

            }
}

public class throwss {

}
