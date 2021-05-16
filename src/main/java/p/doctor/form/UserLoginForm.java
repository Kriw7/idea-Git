package p.doctor.form;

/**
 * @ProjectName: ex3-ssh-demo
 * @Package: p.doctor.form
 * @ClassName: UserLoginForm
 * @Author: Kriw
 * @Description: 用户注册信息
 * @Date: 2021/5/10 9:58 下午
 */
public class UserLoginForm {
    private String name;
    private String password;
    private String email;
    private String mobile;

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
