package com.chinayouthedu.zqzc.entity.vo;

import com.chinayouthedu.zqzc.config.annotation.RequestVo;
import com.chinayouthedu.zqzc.config.core.BaseBean;
import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @表名称 dictionary
 * @开发日期 2018-03-16 02:39:05
 * @开发作者 :中青至诚教育咨询有限公司 
 */
@RequestVo
public class DictionaryVo extends BaseBean implements Serializable {
    /**  (主健ID) (无默认值) */
    private Long id;

    /** 字典key(可选项) (无默认值) */
    @NotBlank(message="字典编码不能为空!")
    private String code;

    /** 字典value(可选项) (无默认值) */
    @NotBlank(message="字典值不能为空!")
    private String name;

    /** 字典类型(可选项) (无默认值) */
    @NotBlank(message="字典类型不能为空!")
    private String type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}