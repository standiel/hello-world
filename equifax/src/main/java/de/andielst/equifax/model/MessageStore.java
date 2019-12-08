package de.andielst.equifax.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class MessageStore {

    private static final Logger logger = LogManager.getLogger(MessageStore.class.getName());
    public static String message = "Hello Struts User";
    private LocalDateTime dateTime;
    private Date date;


    public MessageStore() {
        dateTime = LocalDateTime.now();
        date = Date.from(Instant.now());
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Date getDate() {
        return date;
    }
}
