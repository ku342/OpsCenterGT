package com.opscenter.opscenter.dto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ServerRequest(
    @NotBlank(message = "El nombre es obligatorio")  String name,
    @NotBlank(message = "El host es obligatorio") String host,
    @NotNull (message = "El port es obligatorio") @Min(1) @Max(65535) Integer port
){}
