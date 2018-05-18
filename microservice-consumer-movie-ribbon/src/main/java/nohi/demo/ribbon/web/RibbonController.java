package nohi.demo.ribbon.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import nohi.demo.ribbon.entity.User;
import nohi.demo.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nohi on 2018/5/17.
 */
@RestController
@Api(value = "JPA测试类")
public class RibbonController {
	@Autowired
	private RibbonService ribbonService;
	@GetMapping("/ribbon/{id}")
	@ApiOperation(value="根据名称查询", notes="根据名称查询")
	public User findById(@PathVariable Long id) {
		return this.ribbonService.findById(id);
	}
}
