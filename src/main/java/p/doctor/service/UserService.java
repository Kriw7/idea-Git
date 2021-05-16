package p.doctor.service;

import p.doctor.dto.UserDto;
import p.doctor.form.UserLoginForm;

import java.util.List;

/**
 * @ProjectName: ex3-ssm-demo
 * @Package: p.doctor.service
 * @ClassName: UserService
 * @Author: Kriw
 * @Description: us
 * @Date: 2021/5/13 11:28 上午
 */
public interface UserService {
    public List<UserDto> getAllUsers();
    public UserDto getUser(Integer id);
    public Integer addUser(UserLoginForm user);
}
