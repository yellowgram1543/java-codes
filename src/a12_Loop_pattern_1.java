public class a12_Loop_pattern_1 {
    public static void main(String[] args) {
/*
print the following pattern:
*
* *
* * *
* * * *
* * * * *

*/
        int i;
        int j;
        for (i=0; i<6;i++){
            for (j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
