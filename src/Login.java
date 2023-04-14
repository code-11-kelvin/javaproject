public class Login extends Table {
    private String userName;
    private String passWord;

    public Login(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }
    public boolean validate(){
        return userName.equals("123") && passWord.equals("admin");
    }
    public String getUserName(){
        return userName;
    }
    public String getPassWord(){
        return passWord;
    }
}