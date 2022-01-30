package net.uwuscar.tools.mods;

public class Event {
    /**
     * @author ferderplays
     * @descition Event system
     */
    public @interface register {
        String name();
    }

    public @interface onRanEvent {
    }

    public @interface FollowEvent {
    }

    public @interface onEnableEvent {
    }

    public @interface onDisableEvent {
    }
}
