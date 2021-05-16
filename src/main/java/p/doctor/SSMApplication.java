package p.doctor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: ex3-ssm-demo
 * @Package: p.doctor
 * @ClassName: SSMApplication
 * @Author: Kriw
 * @Description: SSM项目启动
 * @Date: 2021/5/13 11:19 上午
 */
@SpringBootApplication
@MapperScan("p.doctor.mapper")
public class SSMApplication {
    public static void main(String[] args) {
        SpringApplication.run(SSMApplication.class,args);
    }
}
