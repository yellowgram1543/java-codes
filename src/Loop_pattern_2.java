
public class Loop_pattern_2 {
    public static void main(String[] args) {

 /*
 * * * * *
 * * * *
 * * *
 * *
 *
  */
        int i;
        int j;
        for (i=0; i<5 ; i++){
            for (j=4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
