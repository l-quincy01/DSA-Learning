public class NthNumber{

    public static int findNthNumber(int n){

        int[] arr = new int[n+1] ;

        for(int i = 1; i < n+1; i++){

            if( i<=4){
                arr[i] = i ;
          
            }
             else if(i > 4){

                 arr[i] +=     arr[i-1] +  arr[i-2]  + arr[i-3]  + arr[i-4]  ;
             
             }
            
        }

       return arr[n] ;
    }



    public static void main(String[] args) {

        System.out.println(findNthNumber(6)) ;
 

    }
}