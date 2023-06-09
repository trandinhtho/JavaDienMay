package com.example.JavaDienMay.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String home(){

        return "home/index";
    }
    @GetMapping("/contact")
    public String contact(){

        return "home/contact";
    }
    @GetMapping("/about")
    public String about(){

        return "home/about";
    }
    @GetMapping("/cart")
    public String cart(){

        return "home/cart";
    }
    @GetMapping("/checkout")
    public String checkout(){

        return "home/checkout";
    }
    @GetMapping("/compare")
    public String compare(){

        return "home/compare";
    }
    @GetMapping("/login")
    public String login(){

        return "home/login";
    }
    @GetMapping("/myaccount")
    public String myaccount(){

        return "home/myaccount";
    }
    @GetMapping("/productdetailsdefault")
    public String productdetailsdefault(){

        return "home/productdetailsdefault";
    }
    @GetMapping("/shopgridsidebarleft")
    public String shopgridsidebarleft(){

        return "home/shopgridsidebarleft";
    }


    @GetMapping("/_layout")
    public String layout(){
        return "_Layout";
    }
}
