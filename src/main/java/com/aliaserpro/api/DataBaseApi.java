package com.aliaserpro.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.aliaserpro.model.Recipe;

public class DataBaseApi {

	private final String DB_URL= "http://192.168.1.70:8080";
	private final String ADD_RECIPE_URL="/recipes/body";
	
	
	public void createNewRecord(String name, String desc, Boolean isVege) {
		RestTemplate restTemplate = new RestTemplate();
		 
		HttpEntity<Recipe> request = new HttpEntity<>(new Recipe());
		Recipe recipe = restTemplate.postForObject(DB_URL+ADD_RECIPE_URL, request, Recipe.class);
		// TODO Auto-generated method stub
		
	}

}
