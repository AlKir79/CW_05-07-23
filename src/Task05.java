import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int A = in.nextInt();
        System.out.println("Введите второе число");
        int B = in.nextInt();
        if (A>B) {
            int temp = A;
            B = A;
            A = temp;
        }
        for (int i=A; i<=B;i++){
            for (int j=1;j<10;j++){
                System.out.printf("%d x %d = %d", i,j,i*j);
                System.out.println();
            }
            System.out.println();
        }
}
}
