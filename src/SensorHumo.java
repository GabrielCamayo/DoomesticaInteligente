import java.util.ArrayList;
import java.util.List;
class SensorHumo implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String mensaje) {
        for (Observer o : observers) {
            o.update(mensaje);
        }
    }

    public void detectarHumo() {
        System.out.println("Sensor detecta humo!");
        notifyObservers("¡Alerta de incendio!");
    }
}