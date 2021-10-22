package com.turing.controller;

import com.turing.entity.Emp;
import com.turing.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * emp 控制器
 */
@RestController
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    private EmpRepository empRepository;
    @RequestMapping("/findByAll")
    public List<Emp> findByAll(){
        return  empRepository.findAll();
    }

}
