package net.uwuscar.tools.mods;

import net.minecraft.*;

public class OnRun {
    /**
     * @author ferderplays
     * @description this allows forge/fabric to check, if your minecraft instance is
     *              running
     */
    public boolean runned;

    public OnRun() {
        this.runned = mc.getInstance().isRunning();
    }

    public void setRunned() {
        if (mc instanceof Minecraft) {
            this.runned = true;
            onRunned();
        } else {
            this.runned = false;
        }
    }
}
