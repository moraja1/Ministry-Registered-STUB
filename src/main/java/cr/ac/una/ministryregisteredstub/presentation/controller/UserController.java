package cr.ac.una.ministryregisteredstub.presentation.controller;

import cr.ac.una.ministryregisteredstub.business.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<Boolean> isUserRegistered(@PathVariable String id){
        return userService.existisUserByUsuario(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
