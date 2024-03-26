package cr.ac.una.ministryregisteredstub.controller;

import cr.ac.una.ministryregisteredstub.data.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<Boolean> isUserRegistered(@PathVariable String id){
        return userRepository.existsByUsuario(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
