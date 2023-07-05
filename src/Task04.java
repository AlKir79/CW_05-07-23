import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало диапазона");
        int A = in.nextInt();
        System.out.println("Введите конец диапазона");
        int B = in.nextInt();
        if (A>B) {
            int temp = A;
            B = A;
            A = temp;
        }
        for (int i=A; i<=B;i++){
         boolean Simple = true;
         for (int j = 2;j<i;j++){
             if (i%j==0) {Simple=false;break;}
         }
        if(Simple==true) System.out.println(i);
        }
    }
}
