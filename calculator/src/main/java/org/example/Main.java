package org.example;

import org.example.plugin.Context;
import org.example.plugin.IntVariable;
import org.example.plugin.spi.Plugin;

import java.util.Comparator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        var loader = ServiceLoader.load(Plugin.class);
        var context = new Context();
        context.putVar("a", new IntVariable(1));
        context.putVar("b", new IntVariable(4));
        var plugins = loader.stream().sorted(Comparator.comparingInt(o -> o.get().order())).map(ServiceLoader.Provider::get).toList();
        for (Plugin plugin : plugins) {
            plugin.execute(context);
        }
        System.out.println(context);
    }
}
