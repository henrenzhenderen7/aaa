package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@TableName("book")
public class Book {
    @TableId
    int id;
    String title;
    String author;
    @TableField("publication_date")
    LocalDateTime publicationDate;
    int price;

}
