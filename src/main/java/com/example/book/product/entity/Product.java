package com.example.book.product.entity;

import com.example.book.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Product extends BaseEntity {

    //마켓아이디
    private int marketId;

    private String name;
    //설명
    private String description;

    private int price;
    //추천
    private int hit_count;
    //활성여부
    private String isActive;
}