CREATE DATABASE  IF NOT EXISTS `to_do_list`;
USE `to_do_list`;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `text` tinytext NULL,
  `date_time` datetime DEFAULT NULL,
  `checked` boolean DEFAULT false,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


