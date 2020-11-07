package classloader;

public class ClassInitialTest {
    static {
        System.out.println("类构造代码块");
    }
    public ClassInitialTest(){
        System.out.println("类实例化构造器");
    }
    public ClassInitialTest(int i){
        System.out.println("类实例化构造器"+i);
    }
    public static void main(String[] args) {
        new ClassInitialTest();
    }
}
