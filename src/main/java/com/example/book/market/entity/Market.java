package com.example.book.market.entity;

import com.example.book.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Market extends BaseEntity {

    private int memberId;
    private String email;
    private String name;
    private String info;

}
