import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата");
        int size = in.nextInt();
        for (int i=1; i<=size;i++){
            for (int j=1;j<=size;j++){
                if(i==1||i==size) System.out.print("*");
                else if (j==1||j==size) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
