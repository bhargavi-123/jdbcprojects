package com.training.client;

@Table(name="Customer")
@Entity
public class Customer {
	@Id
	int id;
	@Colunm(name = "c_name", notNull = true, size = 25)
	String name;
	@Colunm(name = "c_city", notNull = true, size = 25)
	String city;
    double outStandingAmount;

}
