package top.luchchuan.health.utils.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import top.luchchuan.health.utils.redis.DistributedRedisLock;
import top.luchchuan.health.utils.redis.RedisUtil;

import javax.annotation.Resource;

/**
 * spring ioc容器初始化完成后自动执行
 * 一般用于项目初始化
 */
@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Resource
    private DistributedRedisLock distributedRedisLock;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("=========redis-------");
        RedisUtil.register(redisTemplate);
        RedisUtil.registerLock(distributedRedisLock);
    }
}
