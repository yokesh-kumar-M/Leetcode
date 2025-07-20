public class SameTupeproduct {
    static void tupeSameProduct(int[] num){
        int l = num.length;
        int count = 0;
        int[] temp = new int[4];
        int product1 = 0;
        int product2 = 0;
        
        for(int i=0; i<l-1; i++){
            for(int j=0; j<l-1; j++){
                if(num[i] != num[j]){
                    product1 = num[i] * num[j];
                }

                for(int k=0; k<l; k++){
                    for(int n=0; n<l; n++){
                        if(num[k] != num[n]){
                            product2 = num[k] * num[n];
                        }

                        if(num[i] != num[k] && num[j] != num[n] && num[i] != num[n] && num[j] != num[k]){
                            if(product1 == product2){
                                count++;
                            }
                        } 
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[] num1 = {2,3,4,6};
        int[] num2 = {1,2,4,5,10};

        tupeSameProduct(num1);
    //  tupeSameProduct(num2);

    }   
}
