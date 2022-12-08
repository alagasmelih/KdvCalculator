import java.util.Scanner;
public class KdvCalculator {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvOran2, kdvliTutar, kdvTutar;
        kdvOran = 0.18;
        kdvOran2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();
        if( tutar <= 1000) {
            kdvTutar = tutar * kdvOran;
            System.out.println("KDV tutarınız : " +kdvTutar);

           kdvliTutar = tutar + kdvTutar;
            System.out.println("Kdv li tutarınız :" + kdvliTutar);

        }else {
             kdvTutar = tutar * kdvOran2;
            System.out.println("KDV tutarınız : " + kdvTutar);

           kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'li tutar : " + kdvliTutar);
        }


    }
}