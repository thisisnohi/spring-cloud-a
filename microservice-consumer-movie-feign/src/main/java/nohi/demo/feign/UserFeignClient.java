package nohi.demo.feign;

/**
 * Created by nohi on 2018/5/17.
 */

import nohi.demo.feign.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient("microservice-provider-user")注解绑定microserv
 ice-provider-user服务，还可以使用url参数指定一个URL。
 * @author eacdy
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
	@RequestMapping("/{id}")
	public User findByIdFeign(@RequestParam("id") Long id);
}
