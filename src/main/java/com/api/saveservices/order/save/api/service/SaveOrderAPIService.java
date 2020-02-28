/**
 * 
 */
package com.api.saveservices.order.save.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.saveservices.order.save.api.common.CommonConstants;
import com.api.saveservices.order.save.api.common.Message;
import com.api.saveservices.order.save.api.domain.SaveOrderRequest;
import com.api.saveservices.order.save.api.domain.SaveOrderResponse;
import com.api.saveservices.order.save.api.domain.WFTData;
import com.api.saveservices.order.save.api.persistance.ServiceJPARequests;
import com.api.saveservices.order.save.api.persistance.ServiceRequestsRepository;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author PRASADBolla
 *
 */
@Service
public class SaveOrderAPIService {
	
	@Autowired
	private ServiceRequestsRepository servicejparequestssRepository;
	
	// temp persistance object
	public static List<SaveOrderRequest> saveOrderRequestList = new ArrayList<SaveOrderRequest>();

	public SaveOrderResponse saveOrder(SaveOrderRequest orderRequest) {
		
		ServiceJPARequests servicejparequests = new ServiceJPARequests();
		servicejparequests.setDatabasename(orderRequest.getDatabaseName());
		servicejparequests.setResourcegroup(orderRequest.getResourceGroup());
		servicejparequests.setServername(orderRequest.getServerName());
		servicejparequests.setSkuname(orderRequest.getSkuname());
		servicejparequests.setSubscriptionid(orderRequest.getSubscriptionId());
		servicejparequests.setTier(orderRequest.getTier());
		servicejparequests.setCollation(orderRequest.getCollation());
		servicejparequests.setSize(orderRequest.getSize());
		servicejparequests.setJustification(orderRequest.getJustification());
		servicejparequests.setWftData(" ");
		 String jsonWftData = null;
        ObjectMapper mapper = new ObjectMapper();
		/*
		 * try { mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		 * jsonWftData = mapper.writeValueAsString(orderRequest.getWftData()); } catch
		 * (JsonProcessingException e) { e.printStackTrace(); }
		 */
		servicejparequests.setWftData(jsonWftData);
		
		servicejparequestssRepository.save(servicejparequests);
		
		//saveOrderRequestList.add(orderRequest);
		return new SaveOrderResponse(new Message(
				CommonConstants.SUCCESS_MESSAGE_ID,
				CommonConstants.SUCCESS_MESSAGE_DESCRIPTION), orderRequest.getSubscriptionId(),orderRequest.getServerName());
	}
}
