package com.tedu.sp01.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//编号
	private Integer id;
	//b编辑名称
	private String name;
	//编号 什么玩意
	private Integer number;
}