讲师表
		讲师ID 主键 int类型
		讲师姓名 VARCHAR类型
		讲师简介 VARCHAR类型
		讲师级别 char类型 高级讲师&首席讲师
		为讲师姓名添加索引

课程分类表
		课程分类ID 主键 int类型
		课程分类名称 VARCHAR类型 比如前端开发 后端开发 数据库DBA......
		课程分类描述 VARCHAR类型
		创建时间 datetime类型
		更新时间 datetime类型

课程表
		课程ID 主键 int类型
		课程讲师ID 外键 用于描述课程的授课老师
		课程分类ID 外键 用于描述课程所属的分类 比如 Java课程就属于后端分类
		课程标题 VARCHAR类型 比如Java VUE PHP ......
		总课时 int类型
		浏览数量 bigint类型
		课程状态 char 类型,  0 未发布(默认)  1 已发布
		为 课程标题字段添加索引
		为 teacher_id & subject_id,添加外键约束


create table `lagou_teacher`(
    `id` integer AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '主键',
    `name` varchar(32),
    `desc` varchar(512),
    `level` integer,
    KEY `idx_lagou_teacher_name` (`name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '讲师表';


create table `lagou_subject`(
    `id` integer AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '主键',
    `name` varchar(32),
    `desc` varchar(512),
    `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '课程类别表';


create table `lagou_course`(
    `id` integer AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '主键',
    `teacher_id` integer,
    `subject_id` integer,
    `title` varchar(32),
    `total_time` integer,
    `view_num` bigint,
    `status` varchar(8) default '0',
    KEY `idx_lagou_course_title` (`title`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '课程表';



select * from lagou_subject where id =(select subject_id from lagou_course where teacher_id = (select id from lagou_teacher where name = '刘德华'))