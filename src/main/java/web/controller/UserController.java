package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.UserDao;

@Controller
public class UserController {
    private final UserDao userDao;
    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }
    @GetMapping("/users")
    public String getCarPage(Model model) {
        model.addAttribute("users", userDao.getAll());
        return "users";
    }
}
