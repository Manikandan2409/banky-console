package banky.entity.users;

public class AccountHolder  implements Userable{
    private static final String role="user";

    private String accountid;
    private Information accountholderInfo;
    
    public AccountHolder(String accountid,Information info){
        this.accountid = accountid;
        this.accountholderInfo = info;
    }
    
    @Override
    public String getRole() {
        return role;
    }
    @Override
    public String getId() {
        return accountid;
    }
    @Override
    public Information getPersonalInfo() {
        return  accountholderInfo;
    }
    
}
