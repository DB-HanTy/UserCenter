-- auto-generated definition
create table user
(
    id           int auto_increment
        primary key,
    username     varchar(256)                       null comment '用户昵称',
    userAccount  varchar(256)                       null comment '账号',
    avatarUrl    varchar(1024)                      null comment ' 用户头像',
    gender       tinyint                            null comment '性别',
    userPassword varchar(512)                       not null comment '用户密码',
    phone        varchar(128)                       null comment '电话',
    email        varchar(512)                       null comment '邮箱',
    userStatus   int      default 0                 not null comment '状态 0 正常',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint  default 0                 not null comment ' 是否删除',
    userRole     int      default 0                 not null comment '用户角色 0-普通用户 1-管理员',
    userCode     varchar(512)                       null comment '用户编号'
)
    comment '用户';

insert into user (username, userAccount, userPassword, avatarUrl, gender, phone, email, userRole) values ('admin', 'admin', '123456', '', 0, '12345678901', '12345678901@163.com', 1);