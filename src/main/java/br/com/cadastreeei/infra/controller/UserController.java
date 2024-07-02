package br.com.cadastreeei.infra.controller;

import br.com.cadastreeei.application.gateways.user.UserService;
import br.com.cadastreeei.domain.dto.user.UserDTO;
import br.com.cadastreeei.domain.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<UserDTO> users = userService.listUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody User user) {
        UserDTO updatedUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(updatedUser);
    }
}
