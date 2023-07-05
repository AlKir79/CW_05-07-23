import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер стороны квадрата");
        int size = in.nextInt();
        for (int i=1; i<=size;i++){
            for (int j=1;j<=size;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
