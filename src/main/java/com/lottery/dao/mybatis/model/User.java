package com.lottery.dao.mybatis.model;

import javax.persistence.Table;


@Table(name="TBL_USER")
public class User {

    private String name;

    private Integer platformId;
    
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


    
}