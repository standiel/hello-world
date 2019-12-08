package de.andielst.equifax.action.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginAction {

    private static final Logger LOGGER = LogManager.getLogger(LoginAction.class);

    private String username;
    private String password;

    public String execute(){
        LOGGER.debug("comparing username to matching password");
        return username.equals(password)?"success":"error";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
