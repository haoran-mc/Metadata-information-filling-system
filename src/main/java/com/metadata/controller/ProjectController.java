package com.metadata.controller;

import com.metadata.common.lang.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projects")
public class ProjectController {
    @GetMapping("select")
    public Result selectProject() {
        return null;
    }

    @PostMapping("add")
    public Result addProject() {
        return null;
    }

    @PutMapping("update")
    public Result updateProject() {
        return null;
    }

    @DeleteMapping("delete")
    public Result deleteProject() {
        return null;
    }
}
