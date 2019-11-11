public class LoginController{
    EntityLogin el;
    LoginInterface li;

    public boolean authenticateUser(String password, String pass ){
        if (password.equals(pass))
            return true;
        else
            return false;
    }

    public void setEntityLogin( EntityLogin entityLogin){
        this.el=entityLogin;
    }
    public void setLoginInterface(LoginInterface loginInterface){
        this.li=loginInterface;
    }

    
}