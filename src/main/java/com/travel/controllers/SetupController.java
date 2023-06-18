package com.travel.controllers;

import com.travel.services.SetupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setup")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SetupController {

    private final SetupService setupService;

    @PostMapping("/")
    public void setup() {
        setupService.setup();
    }
}
