package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str="bugun  ne cok sey ogrendik";

        // bu cumle de ki bosluk disinda ki karakter sayisini bulunuz.

        System.out.println(str.replace(" ","").length());// atama yapilmadigi surece
        // str kalici olarak degismez.


        // str da kalici degisiklik yaparak; bugun yerine yarin
        // ogrendik yerine ogrenecegiz yazdirin.

        str=str.replace("bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println(str);





    }
}
