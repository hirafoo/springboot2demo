CREATE TABLE IF NOT EXISTS `todo` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(127) binary NOT NULL DEFAULT '',
  `description` varchar(255) NOT NULL DEFAULT '',
  `done` int(1) unsigned NOT NULL,
  `created_at` int(10) unsigned NOT NULL,
  `updated_at` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

grant all privileges on todoapp.* to 'todoapp'@'%' identified by password '';
flush privileges;
