create database javalon3tools;
use javalon3tools;

CREATE TABLE `tools`
(
    `id`        INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name`      VARCHAR(50)  NOT NULL,
    `type`      VARCHAR(50)  NOT NULL,
    `available` BOOLEAN      NOT NULL
);

insert into `tools` (`name`, `type`, `available`)
values ('Old saw', 'SAW', 1),
       ('Sonic screwdriver', 'SCREWDRIVER', 0),
       ('Red hammer', 'HAMMER', 1),
       ('Blue hammer', 'HAMMER', 0),
       ('Drill', 'OTHER', 1);

CREATE TABLE `users`
(
    `id`       INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `login`    VARCHAR(50)  NOT NULL UNIQUE,
    `password` VARCHAR(250) NOT NULL
);

insert into `users` (`login`, `password`)
values ('user1', 'user1'),
       ('user2', 'user2');
