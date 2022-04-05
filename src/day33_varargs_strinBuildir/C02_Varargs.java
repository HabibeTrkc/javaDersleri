package day33_varargs_strinBuildir;

public class C02_Varargs {
    public static void main(String[] args) {
        /* parametre olarak bir int
        ve istedigimiz kadar String alan
        en uzun kelimenin harf sayisi ile int parametre degerini carpip sonucu yazdiran bir method yazınız
         */



        // bir methodda varargs dısında parametre kullanacaksak
        // once diger parametreleri yazıp varargsi en sona yazmalıyız.
        // bu sebeple bir methodda birden fazla varargs olamaz0
        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";

        carpim(sayi,str1,str2);


    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr="";


        for (String each : str)
        { if (each.length()>enUzunStr.length()){
            enUzunStr=each;
        }
        }
        System.out.println(enUzunStr.length()*sayi);

    }
}
