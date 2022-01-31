package main.java.com.itbatia.patterns.proxy;

public class SomeApplication implements Application{
    private String url;

    public SomeApplication(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("App download started...");
    }

    @Override
    public void run() {
        System.out.println("App install started...");
    }
}
