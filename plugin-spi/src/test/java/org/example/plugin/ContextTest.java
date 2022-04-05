package org.example.plugin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    @Test
    void overwrite() {
        var ctx = new Context();
        ctx.putVar("a", new StringVariable("abc"));
        ctx.overwrite("a", new StringVariable("def"));
        assertEquals("def", ctx.fetch("a"));
    }

    @Test
    void fetch() {
        var ctx = new Context();
        ctx.putVar("a", new IntVariable(1));
        int a = ctx.fetch("a");
        assertEquals(1, a);

    }
}