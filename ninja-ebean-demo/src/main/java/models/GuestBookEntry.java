package models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity  
@Table(name="guestbook_entry")  
public class GuestBookEntry {

    @Id
    Integer id;

    String email;
    
    String content;

    @Version
    Timestamp lastUpdate;

    
    public GuestBookEntry(String email, String content) {
        this.email = email;
        this.content = content;
    }
    
    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}