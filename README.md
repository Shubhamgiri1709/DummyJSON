# 🧪 Dummy JSON API Testing Project

This project demonstrates REST API testing using the [Dummy JSON Products API](https://dummyjson.com/docs/products). It covers various HTTP methods (GET, POST, PUT, DELETE), along with search and filter operations.

---

## 🚀 Objective

Perform and validate common API operations for educational and testing purposes.

---

## 📌 API Endpoints Covered

| Method | Endpoint                                  | Description                          |
|--------|-------------------------------------------|--------------------------------------|
| GET    | `/products`                               | Fetch all products                   |
| GET    | `/products/1`                             | Retrieve specific product by ID      |
| GET    | `/products/search?q=phone`                | Search products using a keyword      |
| GET    | `/products/category/smartphones`          | Filter products by category          |
| POST   | `/products/add`                           | Add a new product                    |
| PUT    | `/products/1`                             | Update an existing product           |
| DELETE | `/products/1`                             | Delete a product by ID               |

---

## ✅ Tasks Performed

### 1. GET `/products`
- Retrieved all products
- Printed total count
- Displayed title & price of the first 5 products

### 2. GET `/products/1`
- Retrieved product with ID 1
- Validated: `title`, `price`, `description`, and `category`

### 3. GET `/products/search?q=phone`
- Searched for products using keyword `phone`
- Printed matched product titles and prices

### 4. GET `/products/category/smartphones`
- Fetched all products in `smartphones` category
- Ensured correct category returned for each product

### 5. POST `/products/add`
- Added a product:
  ```json
  {
    "title": "Wireless Headphones",
    "price": 129,
    "description": "Noise-cancelling over-ear headphones",
    "category": "audio"
  }
###6. PUT /products/1
Updated the price of product ID 1 to 499

Confirmed the updated response

###7. DELETE /products/1
Deleted product with ID 1

Checked the confirmation message


💡 Tools Used
java with requests library

DummyJSON for mock API testing

~~~

Dummyjson/
├── src/
│   ├── main/
│   │   ├── java/            
│   │   ├── resources/         
│   ├── test/
│   │   ├── java/
│   │   │   ├── restAssured/         
│   │   │   │   ├── TestDemo.java
│   │   ├── resources/         # Configuration files (if needed)
├── test-output/                # Test reports and logs
├── pom.xml                     # Maven configuration file
└── target/                    
~~~
