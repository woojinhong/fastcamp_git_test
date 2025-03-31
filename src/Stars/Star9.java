package Stars;

public class Star9 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++){
            for(int j = 5; j >= i; j-- ){
                if(i%3==0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
