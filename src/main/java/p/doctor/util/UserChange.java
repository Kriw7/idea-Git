package p.doctor.util;

import org.springframework.beans.BeanUtils;
import p.doctor.dto.UserDto;
import p.doctor.entity.User;
import p.doctor.form.UserLoginForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: ex3-ssh-demo
 * @Package: p.doctor.util
 * @ClassName: UserChange
 * @Author: Kriw
 * @Description: User类的Dto和Entity的转换
 * @Date: 2021/5/10 6:23 下午
 */
public class UserChange {
//Entity转化为DTO
    public static UserDto changeToDto(User user) {
        if (user == null) return null;
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    public static List<UserDto> changeToDto(List<User> users) {
        if (users.isEmpty()) return new ArrayList<>();
        List<UserDto> userDtos = new ArrayList<>();
        for (User user : users) {
            userDtos.add(changeToDto(user));
        }
        return userDtos;
    }
//DTO转化为Entity
    public static User changeToEntity(UserDto userDto){
        if (userDto==null) return null;
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }

    public static List<User> changeToEntity(List<UserDto> userDtos){
        if (userDtos.isEmpty()) return new ArrayList<>();
        List<User> users = new ArrayList<>();
        for(UserDto dto :userDtos){
            users.add(changeToEntity(dto));
        }
        return users;
    }
//Form转化为Entity
    public static User changeToEntity(UserLoginForm form){
        if (form==null) return null;
        User user = new User();
        BeanUtils.copyProperties(form,user);
        return user;
    }
}
