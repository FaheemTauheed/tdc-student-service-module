package com.infolounge.platform.rest;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infolounge.platform.feignclient.JsonPlaceholderClient;
import com.infolounge.platform.feignclient.JsonPlaceholderResponse;

@RestController
public class JsonPlaceholderController {
 private final JsonPlaceholderClient jsonPlaceholderClient;

 public JsonPlaceholderController(JsonPlaceholderClient jsonPlaceholderClient) {
     this.jsonPlaceholderClient = jsonPlaceholderClient;
 }

 @GetMapping("/fetch-users")
 public List<JsonPlaceholderResponse> fetchUsers() {
     return jsonPlaceholderClient.getUsers();
 }
 
 @GetMapping("/fetch-user/{id}")
 public String fetchUserById(@PathVariable Integer id) {
     return jsonPlaceholderClient.fetchUserById(id);
 }
 
}
