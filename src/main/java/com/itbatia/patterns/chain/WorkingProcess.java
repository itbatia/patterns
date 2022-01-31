package main.java.com.itbatia.patterns.chain;

public class WorkingProcess {
    public static void main(String[] args) {

        Signal lightSignal = new LightSignal(Priority.HIGH);
        Signal soundSignal = new SoundSignal(Priority.VERY_HIGH);
        Signal sirenSignal = new AlarmSirenSignal(Priority.CRITICAL);

        lightSignal.setNextSignal(soundSignal);
        soundSignal.setNextSignal(sirenSignal);

        lightSignal.signalManager("Light signal is beginning!", Priority.HIGH);
        System.out.println("------------------------------------------");
        lightSignal.signalManager("Sound signal is beginning!", Priority.VERY_HIGH);
        System.out.println("------------------------------------------");
        lightSignal.signalManager("Alarm siren is beginning!", Priority.CRITICAL);
        System.out.println("------------------------------------------");
    }
}
