package com.turing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * emp实体类
 */
@Entity //SpringBook 标识是一个实体类
@Table(name = "emp") //表
@Data //生成geter and seter 辅助工具
@AllArgsConstructor //有参构造函数
@NoArgsConstructor //无参构造
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //标识自增长
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Integer sal;
    private Integer comm;

//    @ManyToOne //多对一
//    @JoinColumn(name = "deptno") //关联字段
//    private  Dept dept;


}
