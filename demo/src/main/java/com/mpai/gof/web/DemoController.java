package com.mpai.gof.web;

import com.mpai.gof.creational.abstractfactory.AbstractFactoryDemo;
import com.mpai.gof.creational.builder.BuilderDemo;
import com.mpai.gof.creational.factorymethod.FactoryMethodDemo;
import com.mpai.gof.creational.prototype.PrototypeDemo;
import com.mpai.gof.creational.singleton.SingletonDemo;
import com.mpai.gof.structural.adapter.AdapterDemo;
import com.mpai.gof.structural.bridge.BridgeDemo;
import com.mpai.gof.structural.composite.CompositeDemo;
import com.mpai.gof.structural.decorator.DecoratorDemo;
import com.mpai.gof.structural.facade.FacadeDemo;
import com.mpai.gof.structural.flyweight.FlyweightDemo;
import com.mpai.gof.structural.proxy.ProxyDemo;
import com.mpai.gof.behavioral.chain.ChainDemo;
import com.mpai.gof.behavioral.command.CommandDemo;
import com.mpai.gof.behavioral.interpreter.InterpreterDemo;
import com.mpai.gof.behavioral.iterator.IteratorDemo;
import com.mpai.gof.behavioral.mediator.MediatorDemo;
import com.mpai.gof.behavioral.memento.MementoDemo;
import com.mpai.gof.behavioral.observer.ObserverDemo;
import com.mpai.gof.behavioral.state.StateDemo;
import com.mpai.gof.behavioral.strategy.StrategyDemo;
import com.mpai.gof.behavioral.template.TemplateDemo;
import com.mpai.gof.behavioral.visitor.VisitorDemo;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Controller simplu: fiecare endpoint rulează un demo al unui pattern și întoarce un text.
 * Avantaj: poți testa rapid din browser/Postman fără UI.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/all")
    public Map<String, String> all() {
        return Map.ofEntries(
                Map.entry("FactoryMethod", FactoryMethodDemo.run()),
                Map.entry("AbstractFactory", AbstractFactoryDemo.run()),
                Map.entry("Builder", BuilderDemo.run()),
                Map.entry("Prototype", PrototypeDemo.run()),
                Map.entry("Singleton", SingletonDemo.run()),

                Map.entry("Adapter", AdapterDemo.run()),
                Map.entry("Bridge", BridgeDemo.run()),
                Map.entry("Composite", CompositeDemo.run()),
                Map.entry("Decorator", DecoratorDemo.run()),
                Map.entry("Facade", FacadeDemo.run()),
                Map.entry("Flyweight", FlyweightDemo.run()),
                Map.entry("Proxy", ProxyDemo.run()),

                Map.entry("Interpreter", InterpreterDemo.run()),
                Map.entry("Template", TemplateDemo.run()),
                Map.entry("ChainOfResponsibility", ChainDemo.run()),
                Map.entry("Command", CommandDemo.run()),
                Map.entry("Iterator", IteratorDemo.run()),
                Map.entry("Mediator", MediatorDemo.run()),
                Map.entry("Memento", MementoDemo.run()),
                Map.entry("Observer", ObserverDemo.run()),
                Map.entry("State", StateDemo.run()),
                Map.entry("Strategy", StrategyDemo.run()),
                Map.entry("Visitor", VisitorDemo.run())
        );
    }
}
