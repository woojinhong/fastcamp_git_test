package Stars;

public class Star4 {

    public static void main(String[] args) {

        for(int i = 0; i<=4; i ++){
            for(int j = 0; j<=4; j++){
                if(i==j || j==4-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
