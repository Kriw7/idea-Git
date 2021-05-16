package p.doctor.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.doctor.dto.UserDto;
import p.doctor.entity.User;
import p.doctor.form.UserLoginForm;
import p.doctor.mapper.UserMapper;
import p.doctor.service.UserService;
import p.doctor.util.UserChange;

import java.util.List;

/**
 * @ProjectName: ex3-ssm-demo
 * @Package: p.doctor.service.Impl
 * @ClassName: UserServiceImpl
 * @Author: Kriw
 * @Description:
 * @Date: 2021/5/13 11:30 上午
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userMapper.findAll();
        return UserChange.changeToDto(users);
    }

    @Override
    public UserDto getUser(Integer id) {
        User user = userMapper.findById(id);
        return UserChange.changeToDto(user);
    }

    @Override
    public Integer addUser(UserLoginForm user) {
        return userMapper.addOne(user);
    }
}
