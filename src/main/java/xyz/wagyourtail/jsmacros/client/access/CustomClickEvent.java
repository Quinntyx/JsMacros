package xyz.wagyourtail.jsmacros.client.access;

import net.minecraft.text.ClickEvent;

public class CustomClickEvent extends ClickEvent {
    Runnable event;
    
    public CustomClickEvent(Runnable event) {
        //TODO: switch to enum extention with mixin 9.0 or whenever Mumfrey gets around to it
        super(null, "");
        this.event = event;
    }
    
    public Runnable getEvent() {
        return event;
    }
}
