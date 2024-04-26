package com.infolounge.platform.feignclient;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "jsonPlaceholderClient", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceholderClient {
	
	
 @GetMapping("/users")
List<JsonPlaceholderResponse> getUsers();
 
 
 
 @GetMapping("/users/{id}")
 String fetchUserById(@PathVariable Integer id);
}
