/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.jee6.webapp.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author daniel
 */
@XmlRootElement
public class Foo {

    private String name;
    private String value;

    public Foo() {
    }

    public Foo(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
