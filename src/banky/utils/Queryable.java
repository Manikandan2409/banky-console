package banky.utils;

public interface Queryable {
    
    String[] tables={"users","bank","transactions","accounts","accounttype"};
    interface Users{
        String CREATETABLE ="CREATE TABLE users (" + 
                        "    id VARCHAR(255) NOT NULL PRIMARY KEY," + 
                        "    role ENUM('staff', 'user') NOT NULL," + 
                        "    deposit DECIMAL(10,2),"+
                        "    name VARCHAR(255) NOT NULL," + 
                        "    address VARCHAR(255) NOT NULL," + 
                        "    location VARCHAR(255) NOT NULL," + 
                        "    pincode VARCHAR(20) NOT NULL" + 
                        ");";  

            }

    interface Banks{
        String CREATETABLE="CREATE TABLE bank (" + 
                        "    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," + 
                        "    name VARCHAR(255) NOT NULL," + 
                        "    address VARCHAR(255) NOT NULL," + 
                        "    location VARCHAR(255) NOT NULL," + 
                        "    pincode VARCHAR(20) NOT NULL," + 
                        "    accountstartsat VARCHAR(255) NOT NULL UNIQUE" + 
                        ");" ;              
    }

    interface Transaction{
        String CREATETABLE="";
    }
}
