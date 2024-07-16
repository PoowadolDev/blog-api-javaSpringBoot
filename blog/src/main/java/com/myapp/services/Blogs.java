package com.myapp.services;

import com.myapp.entities.Blogs;
import com.myapp.repositories.Blogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public List<Blogs> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blogs getBlogsById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    public Blogs postBlogs(Blogs blog) {
        return blogRepository.save(blog);
    }

    public void deleteBlogs(Long id) {
        blogRepository.deleteById(id);
    }
}