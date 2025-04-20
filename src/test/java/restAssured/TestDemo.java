package restAssured;

import static io.restassured.RestAssured.given;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TestDemo {

	@Test
	public void GetAllUser(){
		given()
		   .when()
		   .get("https://dummyjson.com/products")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	
	@Test
	public void GetOneUser(){
		given()
		   .when()
		   .get("https://dummyjson.com/products/1")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	@Test
	public void GetPhone(){
		given()
		   .when()
		   .get("https://dummyjson.com/products/search?q=phone")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	
	@Test
	public void GetTitelPrise(){
		given()
		   .when()
		   .get("https://dummyjson.com/products?limit=10&skip=10&select=title,price")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	
	@Test
	public void GetSmartphones(){
		given()
		   .when()
		   .get("https://dummyjson.com/products/search?q=smartphones")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
	
	
	@Test
	public void postrequest(){
		JSONObject js = new JSONObject();
        js.put("title", "Wireless Headphones");
		js.put("price", 129);
		js.put("description", "Noise-cancelling over-ear headphones");
		js.put("category", "audio");
		
		given()
		   .contentType("application/json")
		   .body(js.toJSONString())
		   .when()
		   .post("https://dummyjson.com/products/add")
		   .then()
		   .statusCode(201)
		   .log()
		   .all();
	}
	
	@Test
	public void putrequest(){
		JSONObject js = new JSONObject();
		js.put("price", 499);
		given()
		   .contentType("application/json")
		   .body(js.toJSONString())
		   .when()
		   .put("https://dummyjson.com/products/1")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}

	
	
	@Test
	public void deleterequest(){
		
		given()
		   .when()
		   .delete("https://dummyjson.com/products/1")
		   .then()
		   .statusCode(200)
		   .log()
		   .all();
	}
}
