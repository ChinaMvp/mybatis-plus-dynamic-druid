package com.mvp.world.mybatisplusdynamicdruid.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mvp.world.mybatisplusdynamicdruid.model.po.UserPo;

import java.util.List;

public interface UserService extends IService<UserPo> {

    List<UserPo> selectFromDefaultDB();

    List<UserPo> selectFromCustomDB();

    List<UserPo> queryFromDefaultDB();

    List<UserPo> queryFromCustomDB();

    Integer insertUserDefaultDB(UserPo user);

    Integer insertUserCustomDB(UserPo user);
}
