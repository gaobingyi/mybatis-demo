package com.gby.mybatisdemo.user.controller;

import com.gby.mybatisdemo.user.entity.User;
import com.gby.mybatisdemo.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/getUsers")
    public ResponseEntity<PageInfo<User>> getUsers(@RequestParam("pageNum") int pageNum,
                                                   @RequestParam("pageSize") int pageSize) {
        PageInfo<User> pageInfo = userService.getUsers(pageNum, pageSize);
        return ResponseEntity.ok(pageInfo);
    }
}
