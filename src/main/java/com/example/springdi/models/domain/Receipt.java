package com.example.springdi.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Receipt {

	private String name;

	@Value("${receipt.description}")
	private String description;

	@Autowired
	private Client client;

	@Autowired
	private List<ReceiptItem> items;

	@PostConstruct
	public void init() {
		client.setName(client.getName().concat(" ").concat("Andrés"));
		description = description.concat(" ").concat(client.getName());
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroyed receipt: ".concat(description));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ReceiptItem> getItems() {
		return items;
	}

	public void setItems(List<ReceiptItem> items) {
		this.items = items;
	}

	
	
}
