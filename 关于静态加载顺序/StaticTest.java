public class StaticTest {
    //加载类的静态属性，非静态不管
    public static int k = 0;
    //加载到这里时进行了类的 实例化，所以加载类的 非静态  属性
    //先加载类的非静态属性 再  实例化
    public static StaticTest t1 = new StaticTest("t1");
    //此出又进行实例化 重复以上加载 非静态属性
    public static StaticTest t2 = new StaticTest("t2");
    public static int i = print("i");
    //加载静态属性，不管之前n是多少， 现在n为99
    public static int n = 99;
    //前面进行了类的实例化，先加载类的非静态属性 
    public int j = print("j");
    {
        print("构造快");
    }
    static {
        print("静态块");
    }
    public StaticTest(String str) {
        System.out.println("构造方法 "+(++k) + ":" + str + " i=" + i + " n=" + n + "\n");
        ++n;
        ++i;
    }
    public static int print(String str) {
        System.out.println("print方法"+ (++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        return ++n;
    }
    public static void main(String[] args) {
        //又进行了实例化
        StaticTest t = new StaticTest("init");
    }
}