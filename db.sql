-- Dumping database structure for springhibernate_db
CREATE DATABASE IF NOT EXISTS `springhibernate_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `springhibernate_db`;


-- Dumping structure for table springhibernate_db.employee
CREATE TABLE IF NOT EXISTS `Employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- Dumping data for table springhibernate_db.employee: ~3 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `Employee` (`id`, `first_name`, `last_name`, `email`, `phone`) VALUES
 (10, 'Virat', 'Kohli', 'virat@beingjavaguys.com', '89876787890'),
 (11, 'Sachin', 'Tendulkar', 'sachin@india.com', '89898989898'),
 (12, 'Virendra', 'Sehwag', 'viru@delhi.com', '8976778789');

