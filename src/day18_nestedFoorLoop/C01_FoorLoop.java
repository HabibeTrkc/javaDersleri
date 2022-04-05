package day18_nestedFoorLoop;

public class C01_FoorLoop {
    public static void main(String[] args) {
        // 5: kullanicidan 10 dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
        int input=9;
        int faktoryel=1;
        String faktoryelacikyazim="";
        for (int i = input; i >=1 ; i--) {
            faktoryel*=i;
            if (i==input){
                faktoryelacikyazim=faktoryelacikyazim + i;
            }else
                faktoryelacikyazim=faktoryelacikyazim+ "*"+i;
        }
        System.out.println(input+"! = " + faktoryelacikyazim + "=" + faktoryel);
    }

}
