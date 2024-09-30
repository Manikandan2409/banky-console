package banky.entity.users;

public class Staffs  implements Userable{
    private static final String role ="Staff";
    private String staffid;
    private Information info;
    
    public Staffs(String staffid, Information info) {
        this.staffid = staffid;
        this.info = info;
    }

    @Override
    public String getRole() {
        return role;
    }
    
    @Override
    public String getId() {
        return staffid;
    }
    
    @Override
    public Information getPersonalInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Staffs [staffid=" + staffid + ", info=" + info + "]";
    }

}
