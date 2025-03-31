/**
 * Inner Class 사용 이유
 * 객체 생성없이 외부 클래스가 접근 가능하게
 *
 * **/
class InnerTest{
    int innerI = 0;
    String innerS = "";
    class OuterTest{
        void mthd(){
            innerI =1;
            innerS ="control";
        }
    }

    void printOuter(){

    }
}





public class InnerClass {
    public static void main(String[] args) {
        InnerTest innerTest = new InnerTest();

    }
}
