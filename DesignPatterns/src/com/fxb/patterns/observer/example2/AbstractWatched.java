package com.fxb.patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象悲观者
 *
 * 抽取定义公共方法
 *
 * @author  vinspier
 * @date    2021/9/3 9:41 上午
 * @version 1.0
 * @menu
*/
public abstract class AbstractWatched implements Watched {

    /**
     * 观察者管理列表
     */
    private List<Watcher> watcherList = new ArrayList<>();


    public void registerWatcher(Watcher watcher) {
        watcher.registerListen(this);
        watcherList.add(watcher);
    }

    @Override
    public void registerWatchers(List<Watcher> watchers) {
        watcherList.addAll(watchers);
    }

    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    /**
     * 此处通知 可根据业务 做成同步/异步方式
     */
    public void notifyWatchers() {
        for(Watcher watcher : watcherList){
            watcher.listen();
        }
    }

    /**
     * 定义被观察者的触发入口
     */
    protected void start(){

    }

}
