package com.example.springdi;

import java.util.Arrays;
import java.util.List;

import com.example.springdi.models.domain.Product;
import com.example.springdi.models.domain.ReceiptItem;
import com.example.springdi.models.services.IMyService;
import com.example.springdi.models.services.MyService;
import com.example.springdi.models.services.MyService2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean("myDummyService")
	public IMyService registerMyService() {
		return new MyService();
	}

	@Primary
	@Bean("myDummyService2")
	public IMyService registerMyService2() {
		return new MyService2();
	}

	@Bean("receiptItems")
	public List<ReceiptItem> registerItems() {
		Product product1 = new Product("Camera", 100);
		Product product2 = new Product("Bicycle", 200);

		ReceiptItem item1 = new ReceiptItem(product1, 1);
		ReceiptItem item2 = new ReceiptItem(product2, 1);

		return Arrays.asList(item1, item2);
	}

	@Primary
	@Bean("officeReceiptItems")
	public List<ReceiptItem> registerOfficeItems() {
		Product product1 = new Product("Laptop", 900);
		Product product2 = new Product("PC Screen", 800);
		Product product3 = new Product("Cannon Printer", 500);
		Product product4 = new Product("Desktop", 300);

		ReceiptItem item1 = new ReceiptItem(product1, 1);
		ReceiptItem item2 = new ReceiptItem(product2, 1);
		ReceiptItem item3 = new ReceiptItem(product3, 1);
		ReceiptItem item4 = new ReceiptItem(product4, 1);


		return Arrays.asList(item1, item2, item3, item4);
	}

}
