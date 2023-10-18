public interface TransactionListener {
    void onComplete();
    void onError();
    void onLoading();
}
