package br.fatec.product.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProductRequest( 

     @NotBlank( message = "Nome nao pode ser deixado em branco")
     @Size(min = 6, message = "Tamanho Minimo do nome e de 6 caracteres")
    String name, 
     
     @Min(value = 0, message = "Preço nao pode ser menor que zero")
    Double price, 

     @NotBlank(message = "Categoria nao pode ser deixada em branco")
    String category
    
) {
    
}
