package domotica.command;

import domotica.model.DomoticaObject;
import domotica.model.ElectricityException;

/**
 * Created by nicolas on 30/08/2017.
 */
public class SetAllDoorsClosed implements Command {
    DomoticaObject object;

    public SetAllDoorsClosed(DomoticaObject object) {
        this.object = object;
    }

    @Override
    public void execute() {
        try {
            object.setAllDoorsClosed();
        }
        catch (ElectricityException e) {
            e.printStackTrace();
        }
    }
}
