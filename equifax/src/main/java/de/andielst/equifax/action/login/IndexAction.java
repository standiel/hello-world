package de.andielst.equifax.action.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndexAction {

    private static final Logger LOGGER = LogManager.getLogger(IndexAction.class);

    public String execute(){
        LOGGER.debug("Forwarding to login page");
        return "success";
    }
}
