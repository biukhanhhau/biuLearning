package org.biukhanhhau.loginweb;

import org.biukhanhhau.loginweb.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    InformationService informationService;

    @RequestMapping("/")
    public String login(){
        return "index";
    }

    @RequestMapping("index")
    public String homepage(){
        return "index";
    }

    @RequestMapping("forgetPass")
    public String forgetPass(){
        return "forgetPass";
    }


    @PostMapping("handleLoggin")
    public String handleLoggin(@RequestParam("username") String username,
                               @RequestParam("password") String nhapPass, // <== SỬA Ở ĐÂY: name="password" khớp với HTML
                               Model model){

        Information temp = informationService.findByUsername(username);

        // Kiểm tra user tồn tại chưa
        if (temp == null){
            model.addAttribute("checkRegister", "User not found!");
            return "index";
        }

        // So sánh mật khẩu nhập vào (nhapPass) với mật khẩu trong DB (temp.getPass())
        if (nhapPass.equals(temp.getPassword())){
            return "done";
        }

        model.addAttribute("checkRegister", "Wrong password!");
        return "index";
    }

    @GetMapping ("register")
    public String register(){
        return "register";
    }

    @PostMapping("handleRegister")
    public String handleRegister(String username, String email, String password, String confirm_password, Model model){
        if (informationService.findByUsername(username) != null){
            model.addAttribute("userInUse", "exist username, choose another one!");
            return "register";
        }

        if (!confirm_password.equals(password)){
            model.addAttribute("dontmatchpass", "password don't match!");
            return "register";
        }

        if (informationService.findByEmail(email) != null){
            model.addAttribute("emailInUse", "this email is existed, brooo, try again!!");
            return "register";
        }

        Information information = new Information();
        information.setUsername(username);
        information.setEmail(email);
        information.setPassword(password);

        informationService.save(information);
        return "done";
    }
}