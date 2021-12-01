package assignment_6;

public class ThreadSafeSingledon {
    private static ThreadSafeSingledon instance = null;

        protected ThreadSafeSingledon() {
        }

        public static ThreadSafeSingledon getInstance() {
            if (instance == null) {
                
                synchronized (ThreadSafeSingledon.class) {
                    if (instance == null) {
                        instance = new ThreadSafeSingledon();
                    }
                }
            }
            return instance;
        }
    }

