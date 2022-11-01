package com.Registration.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.Registration.DTO.Registration;
import com.Registration.DTO.RegistrationDetails;

@Service
public class ClientService {

	@Autowired
	RestTemplate template;
	
	RegistrationDetails registerDetails;

	public ModelAndView templateId(int id) {
		
		HttpEntity<Integer> entity = new HttpEntity<Integer>(id);
		
		registerDetails = template.exchange("http://localhost:8080/registrationDetails",HttpMethod.POST, entity, RegistrationDetails.class).getBody();
		
	    ModelAndView mv = new ModelAndView();
	    
		mv.setViewName(registerDetails.getScreenanme().getScreenName());
		
		Map<String,String> map = (Map<String, String>) registerDetails.getScreenUiDetails().get(0);
		
		
		Set<String> keySet	= map.keySet();
		
		List<String> uiKeys = new ArrayList<>();
		
		for(String str : keySet) {
			
			uiKeys.add(str);
			
		}
		
		
		
		Map<String,String> map1 = (Map<String, String>) registerDetails.getScreenUiDetails().get(1);
		
		Map<String,String> map2 = (Map<String, String>) registerDetails.getValidator();

	    mv.addObject("sequence", uiKeys);
	    mv.addObject("fields", map1);
	    mv.addObject("validation",map2);
	    
	    return mv;
	}

	public boolean register(Registration registration) {

		HttpEntity<Registration> entity = new HttpEntity<Registration>(registration);
		
		boolean createdOrNot = template.exchange("http://localhost:8080/save",HttpMethod.POST, entity, boolean.class).getBody();

		
		
		if(createdOrNot) {
			return true;
		}
		
		
		return false;
		
	}
	
	
	
}
