/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 8.0.18 : Database - db_food_syz_227
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_food_syz_227` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `db_food_syz_227`;

/*Table structure for table `t_food_227` */

CREATE TABLE `t_food_227` (
  `foodID227` int(11) NOT NULL AUTO_INCREMENT,
  `foodNum227` varchar(50) NOT NULL,
  `foodName227` varchar(50) NOT NULL,
  `foodTel227` varchar(50) NOT NULL,
  `foodAddress227` varchar(50) NOT NULL,
  `foodPrice227` double NOT NULL,
  PRIMARY KEY (`foodID227`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_food_227` */

insert  into `t_food_227`(`foodID227`,`foodNum227`,`foodName227`,`foodTel227`,`foodAddress227`,`foodPrice227`) values 
(4,'1623306978810','啦啦123','1321111113288','ask水电费111记录卡',71.6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
