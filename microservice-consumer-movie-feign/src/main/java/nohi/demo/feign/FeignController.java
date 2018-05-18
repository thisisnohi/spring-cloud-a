package nohi.demo.feign;

import nohi.demo.feign.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nohi on 2018/5/17.
 */
@RestController
public class FeignController {
	@Autowired
	private UserFeignClient userFeignClient;
	@GetMapping("feign/{id}")
	public User findByIdFeign(@PathVariable Long id) {
		User user = this.userFeignClient.findByIdFeign(id);
		return user;
	}
}
