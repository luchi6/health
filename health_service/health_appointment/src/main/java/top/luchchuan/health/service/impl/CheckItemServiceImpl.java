package top.luchchuan.health.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import top.luchchuan.health.entity.PageResult;
import top.luchchuan.health.entity.QueryPageBean;
import top.luchchuan.health.mapper.CheckItemMapper;
import top.luchchuan.health.pojo.CheckItem;
import top.luchchuan.health.service.CheckItemService;

//import org.springframework.util.StringUtils;

/**
 * @author luch
 * @date 2021/1/9 10:32
 */

@Service
@Transactional
public class CheckItemServiceImpl extends ServiceImpl<CheckItemMapper, CheckItem> implements CheckItemService {

    @Override
    public PageResult findPage(QueryPageBean queryPageBean) {
        QueryWrapper<CheckItem> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("is_delete", 0);
        //根据条件模糊查询，无条件查询所有
        if (StringUtils.isNotBlank(queryPageBean.getQueryString())) {
            queryWrapper.like("name", queryPageBean.getQueryString());
        }
        Page<CheckItem> page = page(new Page<CheckItem>(queryPageBean.getCurrentPage(), queryPageBean.getPageSize()),queryWrapper);
        return PageResult.builder()
                .total(page.getTotal())
                .rows(page.getRecords())
                .build();
    }


}
