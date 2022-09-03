package ex1_Chocolate;

public class Test {
    private static int index;

    public int adbc(){
        return index++;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        Test.index = index;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.adbc();
        System.out.println(test.getIndex());
        test.adbc();
        Test test1 = new Test();
        System.out.println(test1.getIndex());
    }
}
