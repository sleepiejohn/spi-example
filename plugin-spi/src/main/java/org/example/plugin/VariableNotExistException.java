package org.example.plugin;

public class VariableNotExistException extends IllegalArgumentException {
    public VariableNotExistException() {
        super();
    }

    public VariableNotExistException(String name) {
        super("Variable with name %s does not exist".formatted(name));
    }

}
