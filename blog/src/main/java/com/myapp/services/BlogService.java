package com.myapp.services;

import com.myapp.entities.Blogs;

import java.util.List;

public interface BlogService {
    List<Blogs> findAll();
    Blogs findById(Long id);
    Blogs save(Blogs blog);
    void deleteById(Long id);
}