package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.MathOperationResultBean;
import com.uniq.MyFirstRestService.MyFirstRestService.service.MathOperationService;

@RestController
@RequestMapping("/api")
public class MathOperationController {

	@Autowired
	private MathOperationService mathOperationService;

	// http://localhost:8080/api/calculate?operand1=5&operand2=3&operation=multiply
	@GetMapping("/calculate")
	public MathOperationResultBean performOperation(@RequestParam double operand1, @RequestParam double operand2,
			@RequestParam String operation) {
		return mathOperationService.performOperation(operand1, operand2, operation);
	}

	// http://localhost:8080/order/1001/receipts?date=12-05-2017

	@GetMapping("/order/{orderId}/receipts")
	public boolean listUsersInvoices(@PathVariable int orderId,
			@RequestParam(value = "date", required = false) String dateOrNull) {
		System.out.println("OrderId" + " " + orderId);
		System.out.println("Date" + " " + dateOrNull);

		return true;

	}
}
