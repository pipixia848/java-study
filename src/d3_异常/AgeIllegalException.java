package d3_异常;

//必须要让这个类继承Exception，才能成为编译时异常
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
