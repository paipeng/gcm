package com.paipeng.gcm.testing.test.integration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paipeng.gcm.Greeter;

public final class ITUnit {

    public ITUnit() {
        super();
    }

    @Test
    public final void sayHello() {
        Assert.assertEquals("Hello World!", new Greeter().sayHello());
    }

}