package p.doctor.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import p.doctor.dto.UserDto;
import p.doctor.form.UserLoginForm;
import p.doctor.service.UserService;

import java.util.List;

/**
 * @ProjectName: ex3-ssm-demo
 * @Package: p.doctor.controller
 * @ClassName: UserController
 * @Author: Kriw
 * @Description: uc
 * @Date: 2021/5/13 11:28 上午
 */
@Api(tags="用户管理模块接口")
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;


    @ApiOperation(value = "单个用户", notes="根据ID获取用户信息")
    @GetMapping("/getUserById.do")
    public UserDto getUser(Integer id){
        return userService.getUser(id);
    }

    @ApiOperation("新增用户")
    @GetMapping("/addUser.do")
    public Integer addUser(UserLoginForm form){
        return userService.addUser(form);
    }

    @ApiOperation("获取所有的用户信息")
    @GetMapping("/getAllUsers.do")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }


}
