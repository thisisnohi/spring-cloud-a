package nohi.demo.user.web;

import nohi.demo.user.dao.UserRepository;
import nohi.demo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nohi on 2018/5/16.
 */
@RestController
public class UserController {
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private UserRepository userRepository;

	/**
	 * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
	 *
	 * @param id
	 * @return user信息
	 * @RequestMapping(value = "/id", method = RequestMethod.GET)
	 * 类似的注解还有@PostMapping等等
	 */
	@GetMapping("/{id}")
	public UserEntity findById(@PathVariable Long id) {
		UserEntity findOne = this.userRepository.findOne( id );
		return findOne;
	}

	/**
	 * 本地服务实例的信息
	 *
	 * @return
	 */
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
		return localServiceInstance;
	}
}
