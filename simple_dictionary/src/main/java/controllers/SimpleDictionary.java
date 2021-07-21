package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SimpleDictionary {

    @RequestMapping("/show")
    public String simpleDictionary(@RequestParam("txtSearch") String search , Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
//        search.toLowerCase();
        String result = dictionary.get(search.toLowerCase());
        model.addAttribute("word",search);
        model.addAttribute("result",result);
        return "show";
    }
}
