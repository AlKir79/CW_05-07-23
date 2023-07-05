import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        int sizeA = in.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int sizeB = in.nextInt();
        for (int i=1; i<=sizeA;i++){
            for (int j=1;j<=sizeB;j++){
                if(i==1||i==sizeA) System.out.print("*");
                else if (j==1||j==sizeB) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
