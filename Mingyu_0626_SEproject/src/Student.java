
public class Student {
	private int login_id;
    private String password;
    private String state;

    Student (int login_id, String password, String state) {
        this.login_id = login_id;
        this.password = password;
        this.state = state;
    }

    public int getLoginId() { return this.login_id; }
    public String getPassword() { return this.password; }
    public String getState() { return this.state; }
    
    public void login() {
    	
    };
    public void viewItem() {
    	
    };
    public void addToCart() {
    	
    };
    public void checkOut() {
    	
    };
}
