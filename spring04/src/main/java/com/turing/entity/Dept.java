package com.turing.entity;

import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


/**
 * dept实体类
 */
@Entity //表示实体类
@Table(name = "dept") //指定表
@Data //生成geter and seter 辅助工具
@AllArgsConstructor //有参构造函数
@NoArgsConstructor //无参构造函数
public class Dept {
    @Id //标识主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增长策略
    private  int  deptno;
    private  String dname;
    private  String loc;

    @OneToMany //一对多
    @JoinColumn(name = "deptno")
    private List<Emp>  empList;

}
