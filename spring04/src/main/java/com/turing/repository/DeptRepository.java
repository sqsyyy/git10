package com.turing.repository;

import com.turing.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 相当dao层
 */
public interface DeptRepository extends JpaRepository<Dept,Integer>{//继承JpaRepository 有基础的CURD方法
    //查询部门编号>10，按降序排列
    List<Dept> findByDeptnoGreaterThanOrderByDeptnoDesc(Integer id);

    @Query("select d from Dept d where d.deptno =:id")
    Dept deptById(@Param("id") Integer id);

}
