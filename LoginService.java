
// LoginService.java
package abc.nmp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import abc.nmp.model.Login;
import abc.nmp.repository.LoginRepo;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepo loginRepo;

    public Login createLogin(Login login) {
        return loginRepo.save(login);
    }

    public List<Login> getAllLogins() {
        return loginRepo.findAll();
    }

    public Optional<Login> getLoginById(Integer loginId) {
        return loginRepo.findById(loginId);
    }

    public Login updateLogin(Login login) {
        return loginRepo.save(login);
    }

    public void deleteLogin(Integer loginId) {
        loginRepo.deleteById(loginId);
    }
}
