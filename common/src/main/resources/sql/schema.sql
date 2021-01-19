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
mysql> select PASSWORD('todoapp_password');
+-------------------------------------------+
| PASSWORD('todoapp_password')              |
+-------------------------------------------+
| *28D47294836F7B98196E21ACD6BEBBFD0410CE3F |
+-------------------------------------------+
1 row in set, 1 warning (0.00 sec)
*/
grant all privileges on todoapp.* to 'todoapp'@'127.0.0.1' identified by password '*28D47294836F7B98196E21ACD6BEBBFD0410CE3F';
grant all privileges on todoapp.* to 'todoapp'@'localhost' identified by password '*28D47294836F7B98196E21ACD6BEBBFD0410CE3F';
flush privileges;

-- test
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

/*
mysql> select PASSWORD('todoapp_test_password');
+-------------------------------------------+
| PASSWORD('todoapp_test_password')         |
+-------------------------------------------+
| *2E06B92D1595731E4E66DF32564D57A12931E91C |
+-------------------------------------------+
1 row in set, 1 warning (0.00 sec)
*/
grant all privileges on todoapp_test.* to 'todoapp_test'@'127.0.0.1' identified by password '*2E06B92D1595731E4E66DF32564D57A12931E91C';
grant all privileges on todoapp_test.* to 'todoapp_test'@'localhost' identified by password '*2E06B92D1595731E4E66DF32564D57A12931E91C';
flush privileges;
