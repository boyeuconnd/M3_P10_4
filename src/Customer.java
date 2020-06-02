import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getImg() {
        return img;
    }

    String name;
    String birthday;
    String address;
    String img;

    public Customer(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }



}
