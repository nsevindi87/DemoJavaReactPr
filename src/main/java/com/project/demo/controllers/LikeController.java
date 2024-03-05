package com.project.demo.controllers;

import com.project.demo.services.LikeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/like")
public class LikeController {
    private LikeService likeService;

    public LikeController (LikeService likeService) {this.likeService=likeService;}
}
