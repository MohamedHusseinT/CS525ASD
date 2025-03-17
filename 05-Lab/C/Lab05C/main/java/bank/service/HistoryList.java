package Lab05C.main.java.bank.service;


import java.util.ArrayList;
import java.util.Collection;

public class HistoryList {

    private Collection<ICommand> commandlist = new ArrayList();
    private Collection<ICommand> undolist = new ArrayList();


    public void undo(){
        if (commandlist.size()>0){
            ICommand commandObject = (ICommand)((ArrayList)commandlist).get(commandlist.size()-1);
            ((ArrayList)commandlist).remove(commandObject);
            commandObject.unExecute();
            undolist.add(commandObject);
        }
    }


    public void redo(){
        if (undolist.size()>0){
            ICommand commandObject = (ICommand)((ArrayList)undolist).get(undolist.size()-1);
            commandObject.execute();
            ((ArrayList)undolist).remove(commandObject);
            commandlist.add(commandObject);
        }
    }

}
