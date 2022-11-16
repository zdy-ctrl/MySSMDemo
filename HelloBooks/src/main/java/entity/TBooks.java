package entity;

import java.io.Serializable;

/**
 * (TBooks)实体类
 *
 * @author makejava
 * @since 2022-11-07 21:25:49
 */
public class TBooks implements Serializable {
    private static final long serialVersionUID = -84468783039487594L;
    
    private Integer id;
    
    private String name;
    
    private String introduce;


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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

}

