package com.cardenas.catalogo.service;

import java.util.List;

import com.cardenas.catalogo.dto.ProductoRequestDTO;
import com.cardenas.catalogo.dto.ProductoResponseDTO;

public interface ProductoService {
    ProductoResponseDTO crear(ProductoRequestDTO dto);
    ProductoResponseDTO buscarPorId(Long id);
    List<ProductoResponseDTO> listarActivos();
    void eliminar(Long id);
}
