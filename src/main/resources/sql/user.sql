DROP TABLE IF EXISTS`user`;
CREATE TABLE `user` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT "自增id",
  `user_name` varchar(255) DEFAULT '' COMMENT "用户名称",
  `age` INTEGER(10) DEFAULT 0 COMMENT "用户年龄",
  `sex` INTEGER(10) DEFAULT 0 COMMENT "性别 0女 1男",
  `school` varchar(255) DEFAULT '' COMMENT "用户学校",
  `type` INTEGER(10) DEFAULT 0 COMMENT "类型 0正常 1马甲",
  `created_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
  `updated_time` DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '更新时间',
   PRIMARY KEY (`id`),
   KEY `school` (`school`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT="用户记录表";

## default db
INSERT INTO `user`(`id`, `user_name`, `age`, `sex`, `school`, `type`) VALUES (0, '王二', 25, 0, '清华',0);
INSERT INTO `user`(`id`, `user_name`, `age`, `sex`, `school`, `type`) VALUES (0, '张三', 25,1, '清华',1);
INSERT INTO `user`(`id`, `user_name`, `age`, `sex`, `school`, `type`) VALUES (0, '李四', 25,1, '清华',1);

## custom db
INSERT INTO `user`(`id`, `user_name`, `age`, `sex`, `school`, `type`) VALUES (0, ''mvp'', 25, 0, '北大',0);
INSERT INTO `user`(`id`, `user_name`, `age`, `sex`, `school`, `type`) VALUES (0, ''jack'', 25,1, '北大',1);
INSERT INTO `user`(`id`, `user_name`, `age`, `sex`, `school`, `type`) VALUES (0, ''lily'', 25,1, '北大',1);
