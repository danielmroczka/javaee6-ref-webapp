/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.jee6.webapp.jaxrs;

import com.labs.dm.jee6.webapp.jaxb.Foo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author daniel
 */
public class FooContainer implements Serializable {

    private static FooContainer instance;

    private FooContainer() {
    }

    public static FooContainer getInstance() {
        if (instance == null) {
            instance = new FooContainer();
        }

        return instance;
    }

    private final List<Foo> list = new ArrayList<Foo>();

    public void addItem(Foo foo) {
        list.add(foo);
    }

    public List<Foo> getItems() {
        return list;
    }
}
