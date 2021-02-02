package com.mvp.world.mybatisplusdynamicdruid.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("`user`")
public class UserPo {
    @TableId(type = IdType.AUTO)
    Long id;
    String userName;
    Integer age;
    Integer sex;
    String school;
    Integer type;
    LocalDateTime createdTime;
    LocalDateTime updatedTime;
}
