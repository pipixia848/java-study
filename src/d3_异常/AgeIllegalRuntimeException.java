package d3_异常;

//必须要让这个类继承RuntimeException，才能成为运行时异常
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
