package singleton;

 class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance = new ThreadSafeSingleton();

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
