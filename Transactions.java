import java.util.Timer;
import java.util.TimerTask;


public class Transactions {

    public static void withdraw(Bank account, Integer value, TransactionListener event) {
        event.onLoading();
        if (value == null) {
            event.onError();
            return;
        }
        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                event.onComplete();
            }
        }, time);
    }
}
