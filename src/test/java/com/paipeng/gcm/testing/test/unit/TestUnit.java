package com.paipeng.gcm.testing.test.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paipeng.gcm.Greeter;

public final class TestUnit {

    public TestUnit() {
        super();
    }

    @Test
    public final void sayHello() {
        Assert.assertEquals("Hello World!", new Greeter().sayHello());
    }

}