package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter {
    @GetMapping("/convert")
    public String convert(){
        return "show";
    }
    @RequestMapping ("/success")
    public String success(@RequestParam("usd") int usd , Model model){
        float kq = usd * 22000;
        model.addAttribute("rate",22000);
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",kq);
        return "success";
    }
}
