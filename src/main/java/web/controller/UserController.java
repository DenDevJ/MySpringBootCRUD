package web.controller;
import web.model.User;
import web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String index() {
        return "redirect:/users";
    }
    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }
    @GetMapping("/addUser")
    public String showAddForm() {
        return "addUser";
    }
    @PostMapping("/addUser")
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("email") String email,
                          @RequestParam("age") int age) {
        userService.save(new User(name, email, age));
        return "redirect:/users";
    }
    @GetMapping("/editUser")
    public String showEditForm(@RequestParam("id") Long id, Model model) {
        User user = userService.findById(id);
        if (user == null) {
            return "redirect:/users";
        }
        model.addAttribute("user", user);
        return "editUser";
    }
    @PostMapping("/editUser")
    public String editUser(@RequestParam("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("email") String email,
                           @RequestParam("age") int age) {
        User user = new User(name, email, age);
        user.setId(id);
        userService.update(user);
        return "redirect:/users";
    }
    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Long id) {
        userService.delete(id);
        return "redirect:/users";
    }
}