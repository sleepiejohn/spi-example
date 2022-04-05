package org.example.plugin;

public interface Variable<T> {
    /**
     * @return the class type of this variable
     */
    Class<T> type();

    T value();
}
