package com.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

@Entity

public class Social {
	@Id@GeneratedValue
	private int id;
	
	private String name ;
	private String email ;
	private String provider ;
	private String provideid ;
	
	private String token ;
	private String idToken ;
	
	public Social() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Social(String name, String email, String provider, String provideid, String token, String idToken) {
		super();
		this.name = name;
		this.email = email;
		this.provider = provider;
		this.provideid = provideid;
		this.token = token;
		this.idToken = idToken;
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

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getProvideid() {
		return provideid;
	}

	public void setProvideid(String provideid) {
		this.provideid = provideid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	@Override
	public String toString() {
		return "Social [name=" + name + ", email=" + email + ", provider=" + provider + ", provideid=" + provideid
				+ ", token=" + token + ", idToken=" + idToken + "]";
	}
	
	
	
	
	

}
