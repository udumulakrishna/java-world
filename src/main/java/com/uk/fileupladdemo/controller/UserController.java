package com.uk.fileupladdemo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uk.fileupladdemo.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadCsv(@RequestParam("file") MultipartFile file) {
        // 1. Basic Validation: Is the file empty?
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("error", "Please upload a non-empty CSV file."));
        }

        // 2. Basic Validation: Is it actually a CSV?
        String contentType = file.getContentType();
        System.out.println("UserController.uploadCsv()::  uploaded Type = "+ contentType);
        if (contentType == null || (!contentType.equals("text/csv") && !contentType.equals("application/vnd.ms-excel"))) {
            return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body(Map.of("error", "Only CSV files are allowed."));
       }

        try {
            // 3. Delegate the complex batch logic to the Service
            userService.batchInsert(file);
            
            return ResponseEntity.ok(Map.of( "message", "File processed successfully", "fileName", file.getOriginalFilename()));
        } catch (IllegalArgumentException e) {
            // Catches validation errors from your business logic
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        } catch (Exception e) {
            // Catches "Bad SQL Grammar" or "Connection" issues
            return ResponseEntity.internalServerError().body(Map.of(
                "error", "Failed to process batch",
                "details", e.getMessage()
            ));
        }
    }
}