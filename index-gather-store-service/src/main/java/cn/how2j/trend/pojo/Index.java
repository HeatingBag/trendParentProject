/**
 * @Title: Index
 * @Auther: zhang
 * @Version: 1.0
 * @create: 2022/6/28 15:09
 */
package cn.how2j.trend.pojo;

import java.io.Serializable;

/*指数类，用于指数里的名称和代码*/
public class Index implements Serializable {

    String code;
    String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
