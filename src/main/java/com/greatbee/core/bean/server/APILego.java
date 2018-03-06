package com.greatbee.core.bean.server;

import com.greatbee.base.bean.Describable;
import com.greatbee.base.bean.Identified;

/**
 * API Lego
 * <p/>
 * Author :CarlChen
 * Date:17/6/26
 */
public class APILego implements Identified, Describable {

    private String description;
    private Integer id;
    private String apiAlias;
    private String legoAlias;
    private String oiAlias;
    private Integer index;

    //JSON Config Data,{name:value}
    private String attributes;

    //配置控制器别名
    private String processControllerAlias;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        APILego apiLego = (APILego) o;

        return id == apiLego.id;

    }

    public String getProcessControllerAlias() {
        return processControllerAlias;
    }

    public void setProcessControllerAlias(String processControllerAlias) {
        this.processControllerAlias = processControllerAlias;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getApiAlias() {
        return apiAlias;
    }

    public String getLegoAlias() {
        return legoAlias;
    }

    public Integer getIndex() {
        return index;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setApiAlias(String apiAlias) {
        this.apiAlias = apiAlias;
    }

    public void setLegoAlias(String legoAlias) {
        this.legoAlias = legoAlias;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getOiAlias() {
        return oiAlias;
    }

    public void setOiAlias(String oiAlias) {
        this.oiAlias = oiAlias;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
