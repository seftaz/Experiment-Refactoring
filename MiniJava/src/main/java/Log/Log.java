package Log;

/**
 * Created by mohammad hosein on 6/29/2015.
 */

public class Log {
    private static Log instance;

    private Log() {
        // Constructor خصوصی برای جلوگیری از ایجاد نمونه‌های جدید
    }

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public void print(String message) {
        System.out.println(message);
    }
}