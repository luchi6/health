package top.luchchuan.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.luchchuan.health.pojo.User;
import top.luchchuan.health.vo.UserVO;

public interface UserService extends IService<User> {
    UserVO findUserInfoByUsername(String username);
}
