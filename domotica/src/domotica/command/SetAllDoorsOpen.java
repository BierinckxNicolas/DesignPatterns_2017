package domotica.command;

import domotica.model.DomoticaObject;
import domotica.model.ElectricityException;

/**
 * Created by nicolas on 30/08/2017.
 */
public class SetAllDoorsOpen implements Command {
    DomoticaObject object;

    public SetAllDoorsOpen(DomoticaObject object) {
        this.object = object;
    }

    @Override
    public void execute() {
        try {
            object.setAllDoorsOpened();
        }
        catch (ElectricityException e) {
            e.printStackTrace();
        }
    }
}
