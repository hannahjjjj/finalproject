package com.multi.dto;

import java.util.Date;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrdersDTO {
	private int orderid;
	private int itemid;
	private String custid;
	private Date odate;

}

