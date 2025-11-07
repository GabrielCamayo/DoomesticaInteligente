
public class Main {
    public static void main(String[] args) {
        SensorHumo sensor = new SensorHumo();

        sensor.attach(new AlarmaSonora());
        sensor.attach(new LucesEmergencia());
        sensor.attach(new NotificacionMovil());
        sensor.attach(new Rociadores());

        sensor.detectarHumo();
    }
}