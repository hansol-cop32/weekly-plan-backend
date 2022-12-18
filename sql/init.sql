CREATE TABLE `member` (
                          `id`	INT UNSIGNED	NOT NULL AUTO_INCREMENT PRIMARY KEY,
                          `position_id`	INT UNSIGNED	NOT NULL,
                          `dept_id`	INT UNSIGNED	NOT NULL,
                          `emp_id`	VARCHAR(15)	NOT NULL,
                          `name`	VARCHAR(50)	NOT NULL,
                          `password`	TEXT	NOT NULL
);

CREATE TABLE `task` (
                        `id`	INT UNSIGNED	NOT NULL AUTO_INCREMENT primary key ,
                        `member_id`	INT UNSIGNED	NOT NULL,
                        `content`	TEXT	NULL,
                        `input_id`	INT UNSIGNED	NOT NULL,
                        `input_at`	DATE	NOT NULL,
                        `update_id`	INT UNSIGNED	NULL,
                        `update_date`	DATE	NULL,
                        `is_done`	CHAR(1)	NOT NULL	DEFAULT 'N'	COMMENT 'Y, N',
                        `is_deleted`	CHAR(1)	NOT NULL	DEFAULT 'N'	COMMENT 'Y, N'
);

CREATE TABLE `comment` (
                           `id`	INT UNSIGNED	NOT NULL AUTO_INCREMENT primary key ,
                           `member_id`	INT UNSIGNED	NOT NULL,
                           `task_id`	INT UNSIGNED	NOT NULL,
                           `content`	TEXT	NOT NULL,
                           `input_id`	INT UNSIGNED	NOT NULL,
                           `input_at`	DATE	NOT NULL,
                           `update_id`	INT UNSIGNED	NULL,
                           `update_date`	DATE	NULL,
                           `is_deleted`	CHAR(1)	NOT NULL	DEFAULT 'N'	COMMENT 'Y, N'
);

# CREATE TABLE `dining` (
#
# );

CREATE TABLE `position` (
                            `id` INT UNSIGNED	NOT NULL AUTO_INCREMENT primary key,
                            `name`	VARCHAR(50)	NOT NULL,
                            `is_used`	VARCHAR(1)	NOT NULL	DEFAULT 'Y'	COMMENT 'Y, N'
);

CREATE TABLE `dept` (
                        `id`	INT UNSIGNED	NOT NULL AUTO_INCREMENT primary key ,
                        `name`	VARCHAR(50)	NOT NULL,
                        `level`	TINYINT	NOT NULL,
                        `parent_id`	INT UNSIGNED	NOT NULL,
                        `is_used`	VARCHAR(1)	NOT NULL	DEFAULT 'Y'	COMMENT 'Y, N'
);

# CREATE TABLE `weeks` (
#                          `weeks_id`	VARCHAR(255)	NOT NULL AUTO_INCREMENT,
#                          `Field`	VARCHAR(255)	NULL,
#                          `Field2`	VARCHAR(255)	NULL,
#                          `Field3`	VARCHAR(255)	NULL
# );


# ALTER TABLE `weeks` ADD CONSTRAINT `PK_WEEKS` PRIMARY KEY (
#                                                            `weeks_id`
#     );

ALTER TABLE `member` ADD CONSTRAINT `FK_position_TO_member_1` FOREIGN KEY (
                                                                           `position_id`
    )
    REFERENCES `position` (
                           `id`
        );

ALTER TABLE `member` ADD CONSTRAINT `FK_dept_TO_member_1` FOREIGN KEY (
                                                                       `dept_id`
    )
    REFERENCES `dept` (
                       `id`
        );

ALTER TABLE `task` ADD CONSTRAINT `FK_member_TO_task_1` FOREIGN KEY (
                                                                     `member_id`
    )
    REFERENCES `member` (
                         `id`
        );

ALTER TABLE `comment` ADD CONSTRAINT `FK_member_TO_comment_1` FOREIGN KEY (
                                                                           `member_id`
    )
    REFERENCES `member` (
                         `id`
        );

ALTER TABLE `comment` ADD CONSTRAINT `FK_task_TO_comment_1` FOREIGN KEY (
                                                                         `task_id`
    )
    REFERENCES `task` (
                       `id`
        );

