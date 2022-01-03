package net.uwuscar.tools.mods;

import net.minecraft.*;

public class Mod {
    /**
     * @author ferderplays
     * @description this allows forge/fabric to regsiter your mod
     */
    public Minecraft mc = Minecraft.getMinecraft();

    public @interface register {
        String modid();

        String version();

        String description();

        String developer();
    }
}