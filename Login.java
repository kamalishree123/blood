// Login.java
package abc.nmp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="username")
    private String username;
    
    @Column(name="password")
    private String password;
    
    // Constructors
    public Login(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
