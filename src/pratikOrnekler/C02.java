package pratikOrnekler;

public class C02 {

  

    public static void main(String[] args) {
        // asagida ki multi dimensional array in ic araylerinde ki son elemanlarinin carpimini ekrana yazdiran
        //    bir program yazin.{{1,2,3},{4,5},{6}}

        int arr[][]={{1,2,3},{4,5},{6}};
        int carpim=1;

            for (int j = 0; j <arr.length ; j++) {
                   carpim*=arr[j][arr[j].length-1];
            }

        System.out.println(carpim);





    }

}
