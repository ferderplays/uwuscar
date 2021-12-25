package net.uwuscar.tools.mods;

public class Obfuscation {
    public @interface replace {
        String before();

        String after();
    }
}
