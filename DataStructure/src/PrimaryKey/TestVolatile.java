package PrimaryKey;

public class TestVolatile {
    public volatile int data = 0;

    public void increment(){
        data++;
    }

    public synchronized void incrementSynchronized(){
        data++;
    }

    public void printData(){
        System.out.println(data);
    }
    public static void main(String[] args) throws Exception {
        final TestVolatile t = new TestVolatile();
/**
 *       虽然变量data被volatile修饰了，保证data的可见性，可见性指的是，一个线程T1对共享变量data修改后，会通知其他拥有该变量副本的线程的缓存失效
 *       T1将其修改后的值刷新到主内存去，当其他线程需要对该变量data读取时，去主内存中重新读取拷贝副本到自己线程的工作内存中
 *
 *       但是在多线程情况下，increment()的data++操作非原子性，所以当多个线程同时对data操作时就会出现这样的情况
 *       当线程T1先读取data的值，然后T1阻塞，此时线程T2读取data的值 并 修改 data+1 将新值刷新到主内存中去
 *       此时回到T1 因为T1已经读取了data的步骤，所以不再从主内存中重新读取，直接进行data++操作，最终data只被增加了一次值而并非两次
 *
 *       所以volatile并不一定能保证变量的原子性
        */
        for(int i=0; i<10; i++){
            new Thread(){
                @Override
                public void run() {
                    for(int j=0; j<100; j++){
                        // 不能保证原子性；
                      //  t.increment();
                        t.incrementSynchronized();
                    }
                }
            }.start();
        }
        Thread.sleep(5000);
        t.printData();
    }


}
