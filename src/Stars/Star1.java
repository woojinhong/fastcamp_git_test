package Stars;

public class Star1 {
    final static int LOOP_VALUE = 5;
    public static void main(String[] args) {

        // 단일 for 문
        for(int i = 0; i<LOOP_VALUE; i++) {
            System.out.println("*****");
        }

        // 이중 for 문
        for(int i = 0; i<LOOP_VALUE; i++){
            for(int j = 0; j<LOOP_VALUE; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
