package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
    char finalNotu='B';
    String result="";
    result=(finalNotu=='A')? "gayet basarili" :
                    (finalNotu=='B')? "basarili " :
                    (finalNotu=='C')? "ha gayret" : "digerleri";
        System.out.println(result);




    }
}
