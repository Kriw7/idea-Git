package p.doctor.entity;

/**
 * @ProjectName: ex3-ssm-demo
 * @Package: p.doctor.entity
 * @ClassName: User
 * @Author: Kriw
 * @Description: 用户
 * @Date: 2021/5/13 11:20 上午
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
