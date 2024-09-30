package banky.entity;

import banky.entity.users.Information;

public class Bank {
    private int bankid;
    private Information info;
   // List<Userable> users; // staffs & account-holders

    public Bank(int bankid, Information info) {
        this.bankid = bankid;
        this.info = info;
    }
    public int getBankid() {
        return bankid;
    }
    public Information getInfo() {
        return info;
    }
    @Override
    public String toString() {
        return "Bank [bankid=" + bankid + ", info=" + info + "]";
    }
    
}
