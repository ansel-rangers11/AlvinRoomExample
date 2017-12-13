package ui;

import java.util.Observable;
import java.util.Observer;

public class ConsoleWriter implements Observer {

    @Override
    public void update(Observable subject, Object event) {
        if (SIGame.EVENT_INVADER_HIT.equals(event))
            System.out.println("Ouch: Invader hit!");
    }

}
