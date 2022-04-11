package section15;

public class CallBackDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread is running");

        Runnable run = new Runnable() {

            @Override
            public void run() {
                new CallBackDemo().runningAsSync(new CallBack() {

                    @Override
                    public void pushData(String data) {
                        System.out.println("CallBack data:"+data);
                    }

                    @Override
                    public void pushComplete() {
                        System.out.println("CallBack done!");
                    }

                    @Override
                    public void pushError(Exception ex) {
                        System.out.println("Callback error called, Got an exception :"+ex);
                    }
                });
            }
        };
        Thread thread = new Thread(run);
        thread.start();

        Thread.sleep(2000);
        System.out.println("Main thread completed");
    }

    public  void runningAsSync(CallBack callBack) {
        System.out.println("I am running in separate thread");
        sleep(1000);
        callBack.pushData("Data1");
        callBack.pushData("Data2");
        callBack.pushData("Data3");

        callBack.pushError(new RuntimeException("Oops"));

        callBack.pushComplete();
    }

    private void sleep(int duration) {

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
