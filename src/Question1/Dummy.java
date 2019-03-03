package Question1;

public class Dummy {
    public static void main(String[] args) {
        SingletonDesignedClass singletonDesignedClass=SingletonDesignedClass.getInstance();
        SingletonDesignedClass singletonDesignedClass1=SingletonDesignedClass.getInstance();
        
        System.out.println(singletonDesignedClass);
        System.out.println(singletonDesignedClass1);
    }
}
