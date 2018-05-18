package nohi.demo.ribbon.service;

import nohi.demo.ribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nohi on 2018/5/17.
 */
@Service
public class RibbonService {
	@Autowired
	private RestTemplate restTemplate;
	public User findById(Long id) {
		// http://服务提供者的serviceId/url
		return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
	}
}
