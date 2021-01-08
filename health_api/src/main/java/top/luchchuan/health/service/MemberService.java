package top.luchchuan.health.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.luchchuan.health.pojo.Member;

public interface MemberService extends IService<Member> {
    Member findMemberByTelephone(String telephone);

    int saveMember(Member member);
}
