package com.todoapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ToDoController {

    private List<String> tasks = new ArrayList<>();

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam("task") String task) {
        tasks.add(task);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteTask(@RequestParam("index") int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
        return "redirect:/";
    }
}
