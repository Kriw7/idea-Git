package p.doctor.mapper;

import p.doctor.dto.UserDto;
import p.doctor.entity.User;
import p.doctor.form.UserLoginForm;

import java.util.List;

/**
 * @ProjectName: ex3-ssm-demo
 * @Package: p.doctor.mapper
 * @ClassName: UserDao
 * @Author: Kriw
 * @Description: DAo
 * @Date: 2021/5/13 11:23 上午
 */
public interface UserMapper {
    List<User> findAll();
    User findById(Integer id);
    Integer addOne(UserLoginForm form);
}
