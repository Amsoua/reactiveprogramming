package section15;

public interface CallBack {
    void pushData(String data);
    void pushComplete();
    void pushError(Exception error);
}
