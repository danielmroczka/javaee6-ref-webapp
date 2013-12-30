package com.labs.dm.jee6.webapp;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public Foo createFoo() {
        return new Foo();
    }
}
