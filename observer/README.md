# Observer Pattern

The observer pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## Explaination

![Observer Pattern Explaination UML](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/nsanitate/desing-pattern/master/observer/doc/explaination/class.puml)

![Observer Pattern Explaination UML](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/nsanitate/desing-pattern/master/observer/doc/explaination/sequence.puml)

where

```java
class ConcreteObservable {
    public void add (IObserver observer) {
        this.observers.add(observer);
    }

    public void remove (IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers () {
        for(IObserver observer : observers)
            observer.update();
    }

    public Object getState () {
        // Return internal state
    }
}
```

## Example

![Observer Pattern Example UML](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/nsanitate/desing-pattern/master/observer/doc/example/class.puml)

![Observer Pattern Example UML](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/nsanitate/desing-pattern/master/observer/doc/example/sequence.puml)

where

```java
class WeatherStation {
    int temperature;

    public void add (IObserver observer) {
        this.observers.add(observer);
    }

    public void remove (IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers () {
        for(IObserver observer : observers)
            observer.update();
    }

    public int getTemperature () {
        return temperature;
    }

    public void setTemperature (int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
```

You can execute with [repl.it](https://repl.it/@nsanitate/Observer-Pattern)