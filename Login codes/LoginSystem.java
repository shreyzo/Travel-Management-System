class LoginSystem{
    public static void main(String[] args){
        LoginInterface li = new LoginInterface();
        LoginController lc = new LoginController();
        EntityLogin el = new EntityLogin();

        lc.setEntityLogin(el);
        lc.setLoginInterface(li);
        
        lc.li.readForm();
        boolean result = lc.authenticateUser(lc.li.getPass(), lc.el.getUserDetails(lc.li.getUname()));

        if (result)
            System.out.println("Login Succcessful !!!! ");
        else
            System.out.println("Login Failed.......");
    }
}