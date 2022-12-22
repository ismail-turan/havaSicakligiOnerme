import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz.");
        int heat=scanner.nextInt();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat>=5 && heat<15) {
            System.out.println("Sinema");
        } else if (heat>=15 && heat<20) {
            System.out.println("Piknik");
        } else if (heat>=20) {
            System.out.println("Yüzme");
        }
    }
}