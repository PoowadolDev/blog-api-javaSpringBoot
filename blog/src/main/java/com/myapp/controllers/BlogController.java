package com.myapp.controllers;

import com.myapp.entities.Blogs;
import com.myapp.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blogs")
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blogs> getAllBlogs() {
        return blogService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blogs> getBlogById(@PathVariable Long id) {
        Blogs blog = blogService.findById(id);

        if (blog == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(blog);
    }

    @PostMapping
    public Blogs createBlog(@RequestBody Blogs blog) {
        return blogService.save(blog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blogs> updateBlog(@PathVariable Long id, @RequestBody Blogs blogDetails) {
        Blogs blog = blogService.findById(id);
        if (blog == null) {
            return ResponseEntity.notFound().build();
        }

        blog.setTitle(blogDetails.getTitle());
        blog.setContent(blogDetails.getContent());
        Blogs updateBlog = blogService.save(blog);
        return ResponseEntity.ok(updateBlog);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
        Blogs blog = blogService.findById(id);
        if (blog == null) {
            return ResponseEntity.notFound().build();
        }
        blogService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}