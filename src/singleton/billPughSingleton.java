package singleton;

class billPughSingleton {
    private billPughSingleton(){}

    private static class SingletonHelper{
        private static final billPughSingleton INSTANCE = new billPughSingleton();
    }

    public static billPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
