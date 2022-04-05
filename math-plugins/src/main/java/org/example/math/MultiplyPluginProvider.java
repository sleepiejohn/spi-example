package org.example.math;

import org.example.plugin.Context;
import org.example.plugin.IntVariable;
import org.example.plugin.spi.Plugin;

public class MultiplyPluginProvider implements Plugin {
    @Override
    public void execute(Context context) {
        int c = context.fetch("c");
        int b = context.fetch("b");
        context.putVar("d", new IntVariable(c * b));
    }

    @Override
    public int order() {
        return 1;
    }
}
