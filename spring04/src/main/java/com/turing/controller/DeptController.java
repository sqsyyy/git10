package com.turing.controller;

import com.turing.entity.Dept;
import com.turing.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Dept控制器
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {
    @Autowired
    private DeptRepository deptRepository;//没有业务层直接使用Repository

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/findByAll")
    public List<Dept> findByAll(){
        return deptRepository.findAll();
    }

    /**
     * 根据id查
     * @param id
     * @return
     */
    @RequestMapping("/findById{id}")
    public Dept findById(@PathVariable("id") Integer id){
        Optional<Dept> byId = deptRepository.findById(id);
        if(byId.isPresent()){//判断是否是否有数据
            return byId.get();
        };
        return null;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/add")
    public Dept add(){
        Dept dept=new Dept();
        dept.setDname("张三");
        dept.setLoc("讲话");
        //调用添加方法
        deptRepository.save(dept);
        return dept;
    };

    /**
     * 自定义findByDeptnoGreaterThanOrderByDeptnoDesc 查询语句
     * @return
     */
    @RequestMapping("/findByOrder{id}")
    public List<Dept> findByOrder(@PathVariable("id") Integer id){
        return deptRepository.findByDeptnoGreaterThanOrderByDeptnoDesc(id);
    }


    @RequestMapping("/deptById{id}")
    public  Dept deptById(@PathVariable("id") Integer id){
        return deptRepository.deptById(id);
    }

}
