package net.uwuscar.events;

import net.uwuscar.tools.mods.Event;
import net.uwuscar.tools.mods.ModLoader.Direction;

public class Movement {
    /**
     * @author ferderplays
     * @description this is registering Movement of a player
     */
    @Event.register(name = "Move")
    public void movement() {
        // the keyboard does not work, cause i don't have this as a forge mod
        switch (Keyboard.pressed()) {
            // if u pressed W, the player will go forward
            case KEY_W:
                mc.player.move(Direction.FORWARD);
                break;
            // if u pressed S, the player will go backwards
            case KEY_S:
                mc.player.move(Direction.BACKWARD);
                break;
            // if u pressed D, the player will go left
            case KEY_D:
                mc.player.move(Direction.LEFT);
                break;
            // if u pressed A, the player will go right
            case KEY_A:
                mc.player.move(Direction.RIGTH);
                break;
        }
    }
}
