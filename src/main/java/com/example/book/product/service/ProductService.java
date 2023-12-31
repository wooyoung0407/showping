package com.example.book.product.service;

import com.example.book.product.entity.Product;
import com.example.book.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public void create(String name, int price) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
//        p.setCreateDate(LocalDateTime.now());
        this.productRepository.save(p);
    }

    public List<Product> getList() {
        return this.productRepository.findAll();
    }
    public Product getProduct(Long id) {
        Optional<Product> product = this.productRepository.findById(id);
        // TODO: 없을 경우 예외처리 예정
        return  product.get();
    }
}