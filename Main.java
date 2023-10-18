public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);

        Transactions.withdraw(account, 100, new TransactionListener() {
            @Override
            public void onComplete() {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }

            @Override
            public void onError() {
                System.out.println("Error occurred during the transaction.");
            }

            @Override
            public void onLoading() {
                System.out.println("Transaction is in progress...");
            }
        });
    }
}
