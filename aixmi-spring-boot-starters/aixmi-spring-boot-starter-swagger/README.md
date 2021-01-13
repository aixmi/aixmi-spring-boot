```java
@RestController
@Api(tags = "测试为接口添加描述信息")
public class TestDecorateApiDocController {
	
	@GetMapping("testDescBaseTypeParamApi")
	@ApiOperation(value="测试为基础类型请求参数添加说明", notes="测试为基础类型请求参数添加说明")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "username", value = "用户名", required = false, defaultValue = "danyuan"),
		@ApiImplicitParam(name = "age", value = "年龄", required = true, defaultValue = "23"),
		 })
	public String testDescBaseTypeParamApi( 
			@RequestParam(required = false) String username
			, @RequestParam Integer age){
		return "测试为基础类型请求参数添加说明!";
	}
	
	@PostMapping("testDescModelTypeParamApi")
	@ApiOperation(value="测试为域模型类型请求参数添加说明", notes="测试为域模型类型请求参数添加说明")
	public String testDescModelTypeParamApi(@RequestBody ModelDto req){
		return "测试为域模型类型请求参数添加说明！";
	}
}
```
```java

/**  
* Title ModelDto.java  
* Description  
* @author danyuan
* @date Dec 30, 2020
* @version 1.0.0
* site: www.danyuanblog.com
*/ 
package com.danyuanblog.framework.demo.popularmvc.controller;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@ApiModel(description="域模型类型请求参数")
public class ModelDto implements Serializable{/** 
	 *serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(
			required=false,
			allowEmptyValue=false,
			notes="用户名",
			example="danyuan"
			)
	private String username;
	
	@ApiModelProperty(
			required=false,
			allowEmptyValue=false,
			notes="用户年龄",
			example="23"
			)
	@NotNull
	private Integer age;
}
```