CREATE DATABASE /*!32312 IF NOT EXISTS*/`spring` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `spring`;

DROP TABLE IF EXISTS `accountbook`;

CREATE TABLE `accountbook` (
  `id` varchar(50) NOT NULL COMMENT 'ID',
  `name` varchar(20) DEFAULT NULL COMMENT '账本名',
  `imgUrl` varchar(100) DEFAULT NULL COMMENT '描述',
  `userId` varchar(100) DEFAULT NULL COMMENT '用户',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;