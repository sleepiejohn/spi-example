package org.example.plugin.spi;

import org.example.plugin.Context;

public interface Plugin {
    void execute(Context context);

    int order();
}
