package com.cardenas.catalogo.factory;

import org.springframework.stereotype.Component;

import com.cardenas.catalogo.dto.ProductoRequestDTO;
import com.cardenas.catalogo.dto.ProductoResponseDTO;
import com.cardenas.catalogo.entity.Producto;

@Component
public class ProductoFactory {
    public Producto toEntity(ProductoRequestDTO dto) {
        Producto p = new Producto();
        p.setNombre(dto.getNombre());
        p.setPrecio(dto.getPrecio());
        p.setCategoria(dto.getCategoria());
        return p;
    }

    public ProductoResponseDTO toResponseDTO(Producto p) {
        ProductoResponseDTO dto = new ProductoResponseDTO();
        dto.setId(p.getId());
        dto.setNombre(p.getNombre());
        dto.setPrecio(p.getPrecio());
        dto.setCategoria(p.getCategoria());
        return dto;
    }
}
