package org.example.plugin;

import java.util.HashMap;
import java.util.Map;

public final class Context {
    private final Map<String, Variable<?>> variables = new HashMap<>();

    public void putVar(String name, Variable<?> variable) {
        variables.putIfAbsent(name, variable);
    }

    public void overwrite(String name, Variable<?> variable) {
        variables.put(name, variable);
    }

    public <T> T fetch(String name) throws ClassCastException {
        if (!variables.containsKey(name)) {
            throw new VariableNotExistException(name);
        }
        Variable<?> variable = variables.get(name);
        //noinspection unchecked
        return (T) variable.type().cast(variable.value());
    }

    @Override
    public String toString() {
        return "Context{" +
                "variables=" + variables +
                '}';
    }
}
