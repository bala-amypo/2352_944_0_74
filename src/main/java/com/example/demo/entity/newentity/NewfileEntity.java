package com.example.demo.newentity;
import jakarta.presistence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity {
    @Id
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "no blank allowed")
    private String email;
}