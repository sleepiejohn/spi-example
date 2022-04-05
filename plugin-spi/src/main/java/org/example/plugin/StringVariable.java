package org.example.plugin;

public record StringVariable(String value) implements Variable<String> {
    @Override
    public Class<String> type() {
        return String.class;
    }
}
