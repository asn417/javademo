package classloader;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //启动（Bootstrap）类加载器的加载路径
        System.out.println(System.getProperty("sun.boot.class.path"));
        //扩展（Extension）类加载器的加载路径
        System.out.println(System.getProperty("java.ext.dirs"));
        //系统（System）类加载器的加载路径
        System.out.println(System.getProperty("java.class.path"));

        //获取系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());
        //获取扩展类加载器
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        //获取启动类加载器：由于启动类加载器无法被Java程序直接引用，因此jvm默认用null代替
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());

    }
}
