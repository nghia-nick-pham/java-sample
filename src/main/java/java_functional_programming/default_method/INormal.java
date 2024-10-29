package java_functional_programming.default_method;


public interface INormal {
    int calName();
    int increase(int number);

    default int decrease(int number){
        return number--;
    }
}
