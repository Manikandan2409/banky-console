package banky.entity.accounts;

public class AccountType {
    private int id;
    private String type;
    private float interest;
    private int withDrawableCountPerMonth;
    private float withDrawableAmountPerDay;
   
    public AccountType(int id, String type, float interest, int withDrawableCountPerMonth,
            float withDrawableAmountPerDay) {
        this.id = id;
        this.type = type;
        this.interest = interest;
        this.withDrawableCountPerMonth = withDrawableCountPerMonth;
        this.withDrawableAmountPerDay = withDrawableAmountPerDay;
    }
    public AccountType(String type, float interest, int withDrawableCountPerMonth,
            float withDrawableAmountPerDay) {
        
        this.type = type;
        this.interest = interest;
        this.withDrawableCountPerMonth = withDrawableCountPerMonth;
        this.withDrawableAmountPerDay = withDrawableAmountPerDay;
    }
    
    @Override
    public String toString() {
        return "AccountType [id=" + id + ", type=" + type + ", interest=" + interest + ", withDrawableCountPerMonth="
                + withDrawableCountPerMonth + ", withDrawableAmountPerDay=" + withDrawableAmountPerDay + "]";
    }
    public int getId() {
        return id;
    }
    public float getInterest() {
        return interest;
    }
    public String getType() {
        return type;
    }
    public float getWithDrawableAmountPerDay() {
        return withDrawableAmountPerDay;
    }
    public int getWithDrawableCountPerMonth() {
        return withDrawableCountPerMonth;
    }
}
