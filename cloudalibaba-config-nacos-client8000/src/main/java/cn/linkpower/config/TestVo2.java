package cn.linkpower.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 结合 http://localhost:8001/getInfo2 测试<br/>
 * @Component
 * @RefreshScope
 */
@Component
@RefreshScope
public class TestVo2 {

    @Value("${change.info2}")
    private String info;

    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return this.info;
    }
    public TestVo2() {

    }

}
