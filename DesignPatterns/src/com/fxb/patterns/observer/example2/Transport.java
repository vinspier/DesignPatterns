package com.fxb.patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * 具体观察者，当状态发生变化时，主动向观察者发出通知
 * */
public class Transport implements Watched {
    private List<Watcher> watcherList = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyWatchers() {
        for(Watcher watcher:watcherList){
            watcher.update();
        }
    }

    @Override
    public void start() {
        System.out.println("运钞车启动出发，告知各个观察者");
        notifyWatchers();
        System.out.println("通知完毕");
    }
}
