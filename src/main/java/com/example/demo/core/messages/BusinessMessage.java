package com.example.demo.core.messages;

public class BusinessMessage {

	 public static class GlobalMessages {

	        public static final String DATA_LISTED_SUCCESSFULLY = "Data Listed Successfully";
	        public static final String DATA_ADDED_SUCCESSFULLY = "Data Added Successfully";
	        public static final String DATA_UPDATED_SUCCESSFULLY = "Data Updated Successfully ";
	        public static final String DATA_DELETED_SUCCESSFULLY = "Data Deleted successfully";
	        public static final String DATA_NAME_LISTED_SUCCESSFULLY = "Data Name Listed Successfully";
}
	 
	 
	 public static class Employee{
	        public static final String ID_NOT_FOUND = "Employee Id Not Found ";
	        public static final String EMPLOYEE_LIST_EMPTY="This List is Empty";
	    }
	 
	 public static class Product{
		 public static final String PRODUCT_LIST_EMPTY="This List is Product";
		 public static final String PRODUCT_NAME_EXISTS="Product name already exists";
	 }
	 
	 public static class Category{
		 public static final String CATEGORY_LIST_EMPTY="This List is Category";
		 public static final String CATEGORY_NAME_EXISTS="Category name already exists";
	 }
}
