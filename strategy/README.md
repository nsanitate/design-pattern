# Strategy Pattern

The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Explaination

![Strategy Pattern Explaination UML](http://www.plantuml.com/plantuml/proxy?src=https://raw.github.com/n.sanitate/design-patter/master/strategy/doc/explaination.puml)

where

```java
class Client {
    IBehaviour behaviour;

    public Client (IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void execute () {
        this.behaviour.run();
    }
}
```

## Example

![Strategy Pattern Example UML](http://www.plantuml.com/plantuml/proxy?src=https://raw.github.com/n.sanitate/design-patter/master/strategy/doc/example.puml)

where

```java
class Duck {
    IFlyBehaviour flyBehaviour;

    public Client (IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void execute () {
        this.flyBehaviour.fly();
    }
}
```

You can execute with [repl.it](https://repl.it/@nsanitate/Strategy-Pattern)