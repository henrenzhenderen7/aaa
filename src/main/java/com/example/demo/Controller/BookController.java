package com.example.demo.Controller;

import com.example.demo.mapper.BookMapper;
import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    public BookMapper bookMapper;

    @GetMapping("/book")
    public String getAll() {
        return bookMapper.selectList(null).toString();
    }

    @GetMapping("/book/{id}")
    public String getId(@PathVariable int id) {
        System.out.println(bookMapper);
        return bookMapper.selectById(id).toString();
    }

    @PostMapping("/book")
    public String add(@RequestBody Book book) {
        bookMapper.insert(book);
        return book.toString();
    }

    @PutMapping("/book")
    public String updateOne(@RequestBody Book book){
        bookMapper.updateById(book);
        return book.toString();
    }

    @DeleteMapping("/book/{id}")
    public String deleteId(@PathVariable int id){
        System.out.println(bookMapper);
        bookMapper.deleteById(id);
        return "id :"+id;
    }
}
