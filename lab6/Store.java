
public class Store {

    private String name;
    private String address;
    private int employeeCount;

    private int count;

    public int getCount(){
        return count;
    }

    public void setCount(int n){
        count = n;
    }

    public Store(String n, String a,int ec , int c){
        this(n,a,ec);
        count = c;
    }

    public Store() {}

    public Store(String n, String a, int ec) {
        name = n;
        address = a;
        employeeCount = ec;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String a) {
        address = a;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
    public void setEmployeeCount(int ec) {
        employeeCount = ec;
    }

    public boolean isLarge() {
        if (employeeCount > 50) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Store{name='" + name + "', address='" + address + "', employeeCount=" + employeeCount + "}";
    }
}
