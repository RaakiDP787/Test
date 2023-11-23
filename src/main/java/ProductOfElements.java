public class ProductOfElements {

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] arr2 = {-1,1,0,-3,3,0};

        int mul1 = 1;
        int mul2 = 1;
        int ExcpetZero = 1;
        int count=0;
         for(int a : arr){
            mul1 = mul1 * a;
        }

        for(int a : arr2) {

            if (a != 0) {
                mul2 = mul2 * a;
            } else {
                count++;
                ExcpetZero = ExcpetZero * a;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = mul1/arr[i];
            System.out.println(arr[i]);
        }

        for(int j=0;j<arr2.length;j++){
            if(arr2[j]!=0) {
                arr2[j] = mul2 / arr[j];
            }else{
                if(count==1){
                    arr2[j] = ExcpetZero;
                }else{
                    arr2[j] = 0;
                }
            }
            System.out.println(arr2[j]);
        }
    }
}
