package com.example.book.question.entity;

import com.example.book.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question extends BaseEntity {
    //회원id
    private int memberId;
    //제목
    private String title;
    //내용
    private String content;

}
