package banky.entity.transactions;


/**
 * Transaction
 */
public class Transaction {

    private int id;
    private String accountid;
    private float amount;
    private TransactionMode modeOfTransaction;
    TransactionType typeOfTransaction;
    public int getId() {
        return id;
    }
    public String getAccountid() {
        return accountid;
    }
    public float getAmount() {
        return amount;
    }
    public TransactionMode getModeOfTransaction() {
        return modeOfTransaction;
    }
    public TransactionType getTypeOfTransaction() {
        return typeOfTransaction;
    }
    public Transaction(String accountid, float amount, TransactionMode modeOfTransaction,
            TransactionType typeOfTransaction) {
        this.accountid = accountid;
        this.amount = amount;
        this.modeOfTransaction = modeOfTransaction;
        this.typeOfTransaction = typeOfTransaction;
    }
    public Transaction(int id, String accountid, float amount, TransactionMode modeOfTransaction,
            TransactionType typeOfTransaction) {
        this.id = id;
        this.accountid = accountid;
        this.amount = amount;
        this.modeOfTransaction = modeOfTransaction;
        this.typeOfTransaction = typeOfTransaction;
    }

}