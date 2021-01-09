package top.luchchuan.health.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import top.luchchuan.health.mapper.CheckItemMapper;
import top.luchchuan.health.pojo.CheckItem;
import top.luchchuan.health.service.CheckItemService;

/**
 * @author luch
 * @date 2021/1/9 10:32
 */

@Service
@Transactional
public class CheckItemServiceImpl extends ServiceImpl<CheckItemMapper, CheckItem> implements CheckItemService {
}
