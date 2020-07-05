create database configuration;

use configuration;

DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties` (
  id INT(11) NOT NULL AUTO_INCREMENT,
  application VARCHAR(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `profile` VARCHAR(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `key` VARCHAR(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `value` VARCHAR(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

ALTER TABLE `configuration`.`properties`
ADD INDEX `get configuration` (`application` ASC, `profile` ASC);
;
