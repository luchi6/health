package top.luchchuan.health.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;
import top.luchchuan.health.entity.QueryPageBean;
import top.luchchuan.health.entity.Result;
import top.luchchuan.health.pojo.CheckItem;
import top.luchchuan.health.service.CheckItemService;

/**
 * @author luch
 * @date 2021/1/9 10:52
 */

@RestController
@RequestMapping("/checkitem")
@Api(tags = "检查项管理")
//@Log4j2
//@Log4j
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    @GetMapping("findAll")
    @ApiOperation("查询所有")
    public Result findAll() {
        return new Result(checkItemService.list());
    }

    @PostMapping("findPage")
    @ApiOperation("分页查询")
    public Result findPage(@RequestBody QueryPageBean queryPageBean) {
        return new Result(checkItemService.findPage(queryPageBean));
    }

    @GetMapping("findAll/{id}")
    @ApiOperation("根据id查询")
    public Result findById(@PathVariable Long id) {
        return new Result(checkItemService.getById(id));
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("添加")
    public Result saveOrUpdate(@RequestBody CheckItem checkItem) {
        checkItemService.saveOrUpdate(checkItem);
        return new Result();
    }

    @DeleteMapping("delete/{id}")
    @ApiOperation("删除")
    public Result deleteById(@PathVariable Integer id) {
        checkItemService.removeById(id);
        return new Result();
    }

}
