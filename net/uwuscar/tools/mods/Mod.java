package net.uwuscar.tools.mods;

public class Mod {
    /**
     * @author ferderplays
     * @description this allows forge/fabric to regsiter your mod
     */
    public @interface register {
        String modid();

        String version();

        String description();

        String developer();
    }
}