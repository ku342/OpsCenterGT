package com.opscenter.opscenter.dto;
import jakarta.validation.constraints.NotBlank;

public record ServerRequest(
    @NotBlank(message = "El nombre es obligatorio")  String name,
    @NotBlank(message = "El host es obligatorio") String host
){}
