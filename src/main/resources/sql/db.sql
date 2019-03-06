create database if not exists testrbac;
use testrbac;

drop table if exists `sys_user`;
create table `sys_user` (
  `id` int(80) not null auto_increment,
  `name` varchar(255) not null,
  `password` varchar(255) not null,
  `create_time` timestamp null default current_timestamp ,
  `update_time` timestamp null default current_timestamp on update current_timestamp ,
  `delete_status` varchar(1) default 0 comment '0 为有效，1为禁用',
  primary key (`id`)
)  ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='user_table, 首行从id=100开始';

insert into `sys_user`
(`name`, `password`)values
('a', '123456'),
('b', '123456'),
('c', '123456');

drop table if exists `sys_role`;
create table `sys_role`(
  `id` int(80) not null auto_increment,
  `name` varchar(255) not null,
  `create_time` timestamp null default current_timestamp ,
  `update_time` timestamp null default current_timestamp on update current_timestamp ,
  `delete_status` varchar(1) default 0 comment '0 为有效，1为禁用',
  primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='role_table';

insert into `sys_role`
(`name`) values
('student'),
('teacher'),
('admin');

drop table if exists `user_role`;
create table `user_role`(
  `id` int(80) not null auto_increment,
  `uid` int(80) not null,
  `rid` int(80) not null,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_status` varchar(1) DEFAULT '1' COMMENT '0 为有效，1为禁用',
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user_role';

insert into `user_role`
(`uid`, `rid`) values
(100, 1),
(101, 2),
(102, 3);

drop table if exists `sys_permission`;
create table `sys_permission`(
  `id` int(80) not null auto_increment COMMENT '自定id,主要供前端展示权限列表分类排序使用.',
  `name` varchar(255) default  '' comment '菜单名称',
  `menu_code` varchar(255) default '' comment '归属菜单,前端判断并展示菜单使用',
  `permission_code` varchar(255) not null comment '权限代码/通配符， 对应代码中@RequiresPermissions 的value',
  `required_permission` tinyint(1) default '0' comment '0为非必选， 1为必选',
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='后台权限表';

insert into `sys_permission`
(`name`, `menu_code`, `permission_code`, `required_permission`)values
('课程管理', 'course', 'course:list', 1),
('课程管理', 'course', 'course:add', 0),
('课程管理', 'course', 'course:delete', 0);

drop table if exists `role_permission`;
create table `role_permission`(
  `id` int(80) not null auto_increment,
  `rid` int(80) not null,
  `pid` int(80) not null,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `delete_status` varchar(1) DEFAULT '1' COMMENT '0 为有效，1为禁用',
  primary key (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='role_permission';

insert into `role_permission`
(`rid`, `pid`) values
(1, 1),
(2, 2),
(3, 3);







