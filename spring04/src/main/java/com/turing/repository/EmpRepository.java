package com.turing.repository;

import com.turing.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 相当于Dao层
 *
 */
public interface EmpRepository extends JpaRepository<Emp,Integer> {//继承JpaPepository 拥有简单CRUD
}
