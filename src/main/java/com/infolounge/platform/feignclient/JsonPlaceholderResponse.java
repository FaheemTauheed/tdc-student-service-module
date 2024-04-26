package com.infolounge.platform.feignclient;

import lombok.Data;

@Data
public class JsonPlaceholderResponse {
	
	 private int id;
	    private String name;
	    private String username;
	    private String email;
	    private Address address;
	    private String phone;
	    private String website;
	    private Company company;

}
