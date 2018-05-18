package nohi.demo.hystrix;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nohi.demo.hystrix.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nohi on 2018/5/17.
 */
@RestController
@Api(value = "ribbon测试")
public class RibbonHystrixController {

	@Autowired
	private RibbonHystrixService ribbonService;

	@GetMapping("/ribbon/{id}")
	@ApiOperation(value = "根据ID查询", notes = "根据ID查询")
	public User findById(@PathVariable Long id) {
		return this.ribbonService.findById( id );
	}

}
