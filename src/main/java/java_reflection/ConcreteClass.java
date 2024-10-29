package java_reflection;

/**
 * Created by NghiaPV on 1/2/2018.
 */
@Deprecated
public class ConcreteClass extends BaseClass implements BaseInterface{

    public int publicInt;
    private String privateString="private string";
    protected boolean protectedBoolean;
    Object defaultObject;

    public ConcreteClass() {
    }

    public ConcreteClass(int publicInt) {
        this.publicInt = publicInt;
    }

    @Override
    public void method1() {
        System.out.println("Method1 impl.");
    }

    @Override
    public int method2(String str) {
        System.out.println("Method2 impl.");
        return 0;
    }

    @Override
    public int method4() {
        System.out.println("Method4 overriden.");
        return 0;
    }

    public int method5(int i){
        System.out.println("Method4 overriden.");
        return 0;
    }

    // inner classes
    public class ConcreteClassPublicClass{}
    private class ConcreteClassPrivateClass{}
    protected class ConcreteClassProtectedClass{}
    class ConcreteClassDefaultClass{}

    //member enum
    enum ConcreteClassDefaultEnum{}
    public enum ConcreteClassPublicEnum{}

    //member interface
    public interface ConcreteClassPublicInterface{}
}
