package practice_basic_day03;

public class Q02_MethodCreation02 {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
public static void main(String[] args) {
    String input="aabbcccccdddda";
    birKezYazdirma(input);
}

    private static void birKezYazdirma(String input) {
    String sonuc="";
        for (int i = 0; i <input.length() ; i++) {
        if (!sonuc.contains(input.substring(i,i+1))){
            sonuc+=input.substring(i,i+1);
        }}
        System.out.println(sonuc);
    }

}
