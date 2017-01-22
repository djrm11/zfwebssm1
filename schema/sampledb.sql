
USE sampledb;

/*==============================================================*/
/* Table: mb_user                                                */
/*==============================================================*/
drop table if exists mb_user;
create table mb_user
(
   user_id              int not null auto_increment comment '用户Id',
   user_name            varchar(30) not null default ' ' comment '用户名',
   user_age             varchar(30) not null default ' ' comment '年龄',
   primary key (user_id),
   key AK_AK_USER_USER_NAME (user_name)
)
ENGINE = InnoDB;
