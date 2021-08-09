package com.example.filedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RedirectController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/upload")
    public String upload(Model model) {
        model.addAttribute("title", "Сраница загрузки");
        return "upload";
    }
    @GetMapping("/firefighter")
    public String firefighter(Model model) {
        model.addAttribute("title", "Сраница пожарки");
        return "firefighter";
    }

    @GetMapping("/fire/{id}")
    public String workersDetails(@PathVariable(value = "id") long id, Model model) {

            return "redirect:https://danone-my.sharepoint.com/personal/aleksey_tolstik_danone_com/Documents/14001/test/test_v_1/bd/" + id + ".pdf";
//        return "home";
    }
}
