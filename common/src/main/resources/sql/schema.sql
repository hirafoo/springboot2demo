create database todoapp;
use todoapp;

CREATE TABLE IF NOT EXISTS `todo` (
    `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(127) binary NOT NULL DEFAULT '',
    `description` varchar(255) NOT NULL DEFAULT '',
    `done` int(1) unsigned NOT NULL,
    `term` int(10) unsigned NOT NULL,
    `created_at` int(10) unsigned NOT NULL,
    `updated_at` int(10) unsigned NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
mysql> select PASSWORD('todoapp_test-password');
+-------------------------------------------+
| PASSWORD('todoapp_test-password')         |
+-------------------------------------------+
| *4030D554D77831279D15A0B9762048030BB020DF |
+-------------------------------------------+
*/
grant all privileges on todoapp_test.* to 'todoapp_test'@'127.0.0.1' identified by password '*4030D554D77831279D15A0B9762048030BB020DF';
flush privileges;

-- for test

create database todoapp_test;
use todoapp_test;

CREATE TABLE IF NOT EXISTS `todo` (
    `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(127) binary NOT NULL DEFAULT '',
    `description` varchar(255) NOT NULL DEFAULT '',
    `done` int(1) unsigned NOT NULL,
    `term` int(10) unsigned NOT NULL,
    `created_at` int(10) unsigned NOT NULL,
    `updated_at` int(10) unsigned NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

grant all privileges on todoapp_test.* to 'todoapp_test'@'127.0.0.1' identified by password '*4030D554D77831279D15A0B9762048030BB020DF';
flush privileges;
