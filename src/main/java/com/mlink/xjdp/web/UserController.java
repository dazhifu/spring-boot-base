package com.mlink.xjdp.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mlink.xjdp.core.Result;
import com.mlink.xjdp.core.ResultGenerator;
import com.mlink.xjdp.dao.UserMapper;
import com.mlink.xjdp.model.User;
import com.mlink.xjdp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
* Created by CodeGenerator on 2018/02/26.
*/
@RestController
@RequestMapping("/user")
public class UserController {

    final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Resource
    private UserService userService;


    @Autowired(required = false)
     private  UserMapper userMapper;

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {


        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.error("This is an error message");

        User user = userService.findById(id);

        return ResultGenerator.genSuccessResult(user);
    }
    @PostMapping("/getOne")
    public Result getOne(@RequestParam Long id) {

        User user = userMapper.getOne(id);

        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
