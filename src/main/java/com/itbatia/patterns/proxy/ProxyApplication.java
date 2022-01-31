package main.java.com.itbatia.patterns.proxy;

public class ProxyApplication implements Application {
    private String url;
    SomeApplication someApplication;

    public ProxyApplication(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (someApplication == null) {
            someApplication = new SomeApplication(url);
        }
        someApplication.run();
    }
}
