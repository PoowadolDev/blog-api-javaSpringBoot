package com.myapp.services;

import com.myapp.entities.Blogs;
import com.myapp.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blogs> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blogs findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Blogs save(Blogs blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteById(Long id) {
        blogRepository.deleteById(id);
    }
}