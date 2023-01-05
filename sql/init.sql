create table member
(
    id          int unsigned auto_increment primary key,
    position_id int unsigned         not null,
    dept_id     int unsigned         not null,
    emp_id      varchar(15)          not null,
    name        varchar(50)          not null,
    password    text                 not null,
    created_at  date                 not null,
    updated_at  date                 null,
    is_deleted  tinyint(1) default 0 null,
    constraint FK_dept_TO_member_1
        foreign key (dept_id) references dept (id),
    constraint FK_position_TO_member_1
        foreign key (position_id) references position (id)
);


create table task
(
    id         int unsigned auto_increment
        primary key,
    member_id  int unsigned         not null,
    content    text                 null,
    created_at date                 not null,
    updated_at date                 null,
    is_done    tinyint(1) default 0 not null,
    is_deleted tinyint(1) default 0 not null,
    constraint FK_member_TO_task_1
        foreign key (member_id) references member (id)
);



create table comment
(
    id         int unsigned auto_increment      primary key,
    member_id  int unsigned                     not null,
    task_id    int unsigned                     not null,
    content    text                             not null,
    created_at date                             not null,
    updated_at date                             null,
    is_deleted tinyint(1)   default 0           not null,
    level      tinyint                          not null,
    parent_id  int unsigned default '0'         not null,
    constraint FK_member_TO_comment_1
        foreign key (member_id) references member (id),
    constraint FK_task_TO_comment_1
        foreign key (task_id) references task (id)
);





create table position
(
    id         int unsigned auto_increment primary key,
    name       varchar(50)          not null,
    is_deleted tinyint(1) default 0 not null,
    created_at date                 not null,
    updated_at date                 null
);



create table dept
(
    id         int unsigned auto_increment primary key,
    name       varchar(50)              not null,
    level      tinyint                  not null,
    parent_id  int unsigned default '0' not null,
    is_deleted tinyint(1)   default 0   not null,
    created_at date                     not null,
    updated_at date                     null
);



-- # CREATE TABLE `weeks` (
-- #                          `weeks_id`	VARCHAR(255)	NOT NULL AUTO_INCREMENT,
-- #                          `Field`	VARCHAR(255)	NULL,
-- #                          `Field2`	VARCHAR(255)	NULL,
-- #                          `Field3`	VARCHAR(255)	NULL
-- # );


-- # ALTER TABLE `weeks` ADD CONSTRAINT `PK_WEEKS` PRIMARY KEY (
-- #                                                            `weeks_id`
-- #     );

-- # CREATE TABLE `dining` (
-- #
-- # );