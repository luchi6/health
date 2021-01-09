package top.luchchuan.health.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.luchchuan.health.entity.Result;
import top.luchchuan.health.service.CheckItemService;

/**
 * @author luch
 * @date 2021/1/9 10:52
 */

@RestController
@RequestMapping("/checkitem")
@Api(tags = "检查项管理")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    @GetMapping("findAll")
    @ApiOperation("查询所有")
    public Result findAll() {
        return new Result(checkItemService.list());
    }
}
