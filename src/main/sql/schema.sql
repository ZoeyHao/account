CREATE TABLE user (
  user_id bigint NOT NULL AUTO_INCREMENT COMMENT '用户id',
  email varchar(100) COMMENT '邮箱',
  mobile_phone int(11) COMMENT '手机号',
  password varchar(100) COMMENT '密码',
  authority int NOT NULL COMMENT '权限',
  PRIMARY KEY (user_id),
  index(email)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='账号表';



-- 初始化图书数据
INSERT INTO user (email, password , authority)
VALUES
	('111111@qq.com', '111111', 1),
	('222222@qq.com', '222222', 1),
	('333333@qq.com', '333333', 1),
	('444444@qq.com', '444444', 1);

