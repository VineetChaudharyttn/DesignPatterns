package Question1;

public class SingletonDesignedClass {

    static public SingletonDesignedClass obj;

    int var1;
    int var2;
    private SingletonDesignedClass() {
        var1=234;
        var2=343424;
    }

    public static SingletonDesignedClass getInstance(){
        if (obj==null) {
            obj=new SingletonDesignedClass();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "SingletonDesignedClass{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}
