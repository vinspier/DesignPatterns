package com.fxb.patterns.command.example;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 *
 *
 * */
public class MacroCommand implements Command {

    Stack<Command> commands = new Stack<Command>();

    public void append(Command command){
        if(command!=this){
            commands.add(command);
        }
    }

    public void clear(){
        commands.clear();
    }

    public void undo(){
        if(!commands.isEmpty()){
            commands.pop();
        }
    }

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()){
            it.next().execute();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
