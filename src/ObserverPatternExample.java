import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(float temperature);
}

// Concrete observer (Display)
class Display implements Observer {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " displaying temperature: " + temperature + "°C");
    }
}

// Subject (Weather Station)
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        // Create displays (observers)
        Observer display1 = new Display("Display 1");
        Observer display2 = new Display("Display 2");

        // Register displays with the weather station
        station.addObserver(display1);
        station.addObserver(display2);

        // Change temperature and notify observers
        station.setTemperature(25.0f);
        station.setTemperature(30.5f);
    }
}
