package p.doctor.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ProjectName: ex3-ssh-demo
 * @Package: p.doctor.dto
 * @ClassName: UserDto
 * @Author: Kriw
 * @Description: User的DTO
 * @Date: 2021/5/10 6:18 下午
 */

@ApiModel("前端使用的用户信息")
public class UserDto {
    @ApiModelProperty("ID")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("电话号码")
    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
