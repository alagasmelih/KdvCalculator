import java.util.Scanner;

public class ucgenAlani {
    public static void main(String[]args) {
        double a,b,c ,alan,u;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz: ");
        a =girdi.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz: ");
        b = girdi.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz: ");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
