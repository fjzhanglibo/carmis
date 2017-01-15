/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : carmis

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-01-15 14:51:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_barnd` varchar(50) DEFAULT NULL,
  `car_color` varchar(50) DEFAULT NULL,
  `car_mileage` int(11) DEFAULT NULL,
  `car_number` varchar(50) NOT NULL,
  PRIMARY KEY (`car_id`),
  UNIQUE KEY `UK_h9pkwpvj3fi5pkw3mfujjilnh` (`car_number`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES ('1', '奥迪', '黑色', '2345', '津A3947');
INSERT INTO `car` VALUES ('2', '奥迪', '黑色', '2345', '津A4947');
INSERT INTO `car` VALUES ('3', '奥迪', '黑色', '2345', '津A5947');
INSERT INTO `car` VALUES ('4', '奥迪', '黑色', '2345', '津A6947');
INSERT INTO `car` VALUES ('5', '奥迪', '白色', '2345', '津A7947');
INSERT INTO `car` VALUES ('6', '奥迪', '黑色', '2345', '津A8947');
INSERT INTO `car` VALUES ('7', '奥迪', '黑色', '2345', '津A9947');
INSERT INTO `car` VALUES ('8', '奥迪', '黑色', '2345', '津A3647');
INSERT INTO `car` VALUES ('9', '奥迪', '黑色', '2345', '津A3447');
INSERT INTO `car` VALUES ('10', '奥迪', '黑色', '2345', '津A0231');
INSERT INTO `car` VALUES ('11', '奥迪', '黑色', '2345', '津A0232');
INSERT INTO `car` VALUES ('12', '奥迪', '黑色', '2345', '津A0233');
INSERT INTO `car` VALUES ('13', '奥迪', '黑色', '2345', '津A0234');
INSERT INTO `car` VALUES ('14', '奥迪', '黑色', '2345', '津A0235');
INSERT INTO `car` VALUES ('15', '奥迪', '黑色', '2345', '津A0236');
INSERT INTO `car` VALUES ('16', '', '', null, '津A2947');

-- ----------------------------
-- Table structure for carservice
-- ----------------------------
DROP TABLE IF EXISTS `carservice`;
CREATE TABLE `carservice` (
  `carService_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_id` int(11) NOT NULL,
  `rank_id` int(11) NOT NULL,
  `service_id` int(11) NOT NULL,
  PRIMARY KEY (`carService_id`),
  KEY `FK_s5eb866f553bk6be3u3mcyll0` (`car_id`),
  KEY `FK_a522hk893505qa76yp3na5fk9` (`rank_id`),
  KEY `FK_gxsxcr8g4g87ee16lt2lwty34` (`service_id`),
  CONSTRAINT `FK_a522hk893505qa76yp3na5fk9` FOREIGN KEY (`rank_id`) REFERENCES `rank` (`rank_id`),
  CONSTRAINT `FK_gxsxcr8g4g87ee16lt2lwty34` FOREIGN KEY (`service_id`) REFERENCES `service` (`service_id`),
  CONSTRAINT `FK_s5eb866f553bk6be3u3mcyll0` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of carservice
-- ----------------------------
INSERT INTO `carservice` VALUES ('1', '1', '1', '1');
INSERT INTO `carservice` VALUES ('2', '2', '2', '1');
INSERT INTO `carservice` VALUES ('3', '3', '2', '1');
INSERT INTO `carservice` VALUES ('4', '4', '3', '1');
INSERT INTO `carservice` VALUES ('5', '1', '2', '1');
INSERT INTO `carservice` VALUES ('6', '2', '2', '1');
INSERT INTO `carservice` VALUES ('7', '1', '4', '2');
INSERT INTO `carservice` VALUES ('8', '2', '5', '2');
INSERT INTO `carservice` VALUES ('9', '3', '4', '2');
INSERT INTO `carservice` VALUES ('10', '2', '3', '2');
INSERT INTO `carservice` VALUES ('11', '1', '2', '2');
INSERT INTO `carservice` VALUES ('12', '2', '1', '2');
INSERT INTO `carservice` VALUES ('13', '8', '3', '3');
INSERT INTO `carservice` VALUES ('14', '8', '3', '2');
INSERT INTO `carservice` VALUES ('15', '8', '3', '1');
INSERT INTO `carservice` VALUES ('16', '8', '3', '4');
INSERT INTO `carservice` VALUES ('17', '8', '3', '3');
INSERT INTO `carservice` VALUES ('18', '1', '2', '1');
INSERT INTO `carservice` VALUES ('19', '2', '1', '1');
INSERT INTO `carservice` VALUES ('20', '3', '1', '1');
INSERT INTO `carservice` VALUES ('21', '4', '1', '1');
INSERT INTO `carservice` VALUES ('22', '5', '1', '1');
INSERT INTO `carservice` VALUES ('23', '6', '1', '1');
INSERT INTO `carservice` VALUES ('24', '7', '1', '1');
INSERT INTO `carservice` VALUES ('25', '8', '1', '1');
INSERT INTO `carservice` VALUES ('26', '9', '1', '1');
INSERT INTO `carservice` VALUES ('27', '10', '1', '1');
INSERT INTO `carservice` VALUES ('28', '11', '1', '1');
INSERT INTO `carservice` VALUES ('29', '12', '1', '1');
INSERT INTO `carservice` VALUES ('30', '13', '1', '1');
INSERT INTO `carservice` VALUES ('31', '14', '1', '1');
INSERT INTO `carservice` VALUES ('32', '15', '1', '1');
INSERT INTO `carservice` VALUES ('33', '2', '3', '1');
INSERT INTO `carservice` VALUES ('34', '2', '3', '2');
INSERT INTO `carservice` VALUES ('35', '2', '3', '4');
INSERT INTO `carservice` VALUES ('36', '15', '1', '1');
INSERT INTO `carservice` VALUES ('37', '15', '1', '2');
INSERT INTO `carservice` VALUES ('38', '15', '1', '3');
INSERT INTO `carservice` VALUES ('39', '14', '1', '1');
INSERT INTO `carservice` VALUES ('40', '14', '1', '2');
INSERT INTO `carservice` VALUES ('41', '14', '1', '1');
INSERT INTO `carservice` VALUES ('42', '14', '1', '2');
INSERT INTO `carservice` VALUES ('43', '14', '1', '2');
INSERT INTO `carservice` VALUES ('44', '7', '2', '1');
INSERT INTO `carservice` VALUES ('45', '7', '2', '2');
INSERT INTO `carservice` VALUES ('46', '7', '2', '3');
INSERT INTO `carservice` VALUES ('47', '10', '5', '1');
INSERT INTO `carservice` VALUES ('48', '10', '5', '2');
INSERT INTO `carservice` VALUES ('49', '10', '5', '4');
INSERT INTO `carservice` VALUES ('50', '14', '1', '1');
INSERT INTO `carservice` VALUES ('51', '14', '1', '2');
INSERT INTO `carservice` VALUES ('52', '14', '1', '1');
INSERT INTO `carservice` VALUES ('53', '14', '1', '2');
INSERT INTO `carservice` VALUES ('54', '14', '1', '1');
INSERT INTO `carservice` VALUES ('55', '14', '1', '2');
INSERT INTO `carservice` VALUES ('56', '10', '5', '1');
INSERT INTO `carservice` VALUES ('57', '10', '5', '2');
INSERT INTO `carservice` VALUES ('58', '1', '1', '1');
INSERT INTO `carservice` VALUES ('59', '2', '2', '1');
INSERT INTO `carservice` VALUES ('60', '3', '2', '1');
INSERT INTO `carservice` VALUES ('61', '4', '3', '1');
INSERT INTO `carservice` VALUES ('62', '1', '2', '1');
INSERT INTO `carservice` VALUES ('63', '2', '2', '1');
INSERT INTO `carservice` VALUES ('64', '1', '4', '2');
INSERT INTO `carservice` VALUES ('65', '2', '5', '2');
INSERT INTO `carservice` VALUES ('66', '3', '4', '2');
INSERT INTO `carservice` VALUES ('67', '2', '3', '2');
INSERT INTO `carservice` VALUES ('68', '1', '2', '2');
INSERT INTO `carservice` VALUES ('69', '2', '1', '2');
INSERT INTO `carservice` VALUES ('70', '8', '3', '3');
INSERT INTO `carservice` VALUES ('71', '8', '3', '2');
INSERT INTO `carservice` VALUES ('72', '8', '3', '1');
INSERT INTO `carservice` VALUES ('73', '8', '3', '4');
INSERT INTO `carservice` VALUES ('74', '8', '3', '3');
INSERT INTO `carservice` VALUES ('75', '1', '2', '1');
INSERT INTO `carservice` VALUES ('76', '2', '1', '1');
INSERT INTO `carservice` VALUES ('77', '3', '1', '1');
INSERT INTO `carservice` VALUES ('78', '4', '1', '1');
INSERT INTO `carservice` VALUES ('79', '5', '1', '1');
INSERT INTO `carservice` VALUES ('80', '6', '1', '1');
INSERT INTO `carservice` VALUES ('81', '7', '1', '1');
INSERT INTO `carservice` VALUES ('82', '8', '1', '1');
INSERT INTO `carservice` VALUES ('83', '9', '1', '1');
INSERT INTO `carservice` VALUES ('84', '10', '1', '1');
INSERT INTO `carservice` VALUES ('85', '11', '1', '1');
INSERT INTO `carservice` VALUES ('86', '12', '1', '1');
INSERT INTO `carservice` VALUES ('87', '13', '1', '1');
INSERT INTO `carservice` VALUES ('88', '14', '1', '1');
INSERT INTO `carservice` VALUES ('89', '15', '1', '1');
INSERT INTO `carservice` VALUES ('90', '5', '5', '1');
INSERT INTO `carservice` VALUES ('91', '5', '5', '2');
INSERT INTO `carservice` VALUES ('92', '1', '1', '1');
INSERT INTO `carservice` VALUES ('93', '1', '1', '2');
INSERT INTO `carservice` VALUES ('94', '1', '1', '3');
INSERT INTO `carservice` VALUES ('95', '16', '3', '1');
INSERT INTO `carservice` VALUES ('96', '16', '3', '2');
INSERT INTO `carservice` VALUES ('97', '6', '2', '1');
INSERT INTO `carservice` VALUES ('98', '6', '2', '2');
INSERT INTO `carservice` VALUES ('99', '6', '2', '3');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_address` varchar(50) DEFAULT NULL,
  `customer_idCard` varchar(50) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `customer_script` varchar(50) DEFAULT NULL,
  `customer_sex` varchar(10) NOT NULL,
  `customer_tel` varchar(20) NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `UK_qjthyn0xrbjmcho5h127m9qk1` (`customer_idCard`),
  UNIQUE KEY `UK_cj9sr3kvxn6gsfopy314wej9m` (`customer_tel`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '天津市南开区', '120107198809108383', '孙大龙', '', '男', '18233647382');
INSERT INTO `customer` VALUES ('2', '天津市南开区', '120107198809108483', '孙大一', '', '男', '18233647383');
INSERT INTO `customer` VALUES ('3', '天津市南开区', '120107198809103983', '孙大二', '', '男', '18233647384');
INSERT INTO `customer` VALUES ('4', '天津市南开区', '120107198809308983', '孙大三', '', '男', '18233647385');
INSERT INTO `customer` VALUES ('5', '天津市南开区', '120107198849408983', '孙大四', '', '男', '18233647386');
INSERT INTO `customer` VALUES ('6', '天津市南开区', '120107198899108983', '孙大五', '', '男', '18233647387');
INSERT INTO `customer` VALUES ('7', '天津市南开区', '120107198849108983', '孙大楼', '', '男', '18233647388');
INSERT INTO `customer` VALUES ('8', '天津市南开区', '120107198829108983', '孙大峰', '', '男', '18233647389');
INSERT INTO `customer` VALUES ('9', '天津市南开区', '120107198809109983', '孙大和', '', '男', '18233647182');
INSERT INTO `customer` VALUES ('10', '天津市南开区', '120107198809100983', '孙大可', '', '女', '18233647282');
INSERT INTO `customer` VALUES ('11', '天津市南开区', '120107198809101983', '孙大峰', '', '男', '18233647482');
INSERT INTO `customer` VALUES ('12', '天津市南开区', '120107198809102903', '孙大第', '', '男', '18233647582');
INSERT INTO `customer` VALUES ('13', '天津市南开区', '120107198809108953', '孙大让', '', '男', '18233647682');
INSERT INTO `customer` VALUES ('14', '', '234234134213424', 'dsd', '', '男', '332455');

-- ----------------------------
-- Table structure for customercar
-- ----------------------------
DROP TABLE IF EXISTS `customercar`;
CREATE TABLE `customercar` (
  `customerCar_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`customerCar_id`),
  KEY `FK_o9k5yynicg04tps6dfjopjxob` (`car_id`),
  KEY `FK_3x5sqp93w1q9hossps3uvn64t` (`customer_id`),
  CONSTRAINT `FK_3x5sqp93w1q9hossps3uvn64t` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`),
  CONSTRAINT `FK_o9k5yynicg04tps6dfjopjxob` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of customercar
-- ----------------------------
INSERT INTO `customercar` VALUES ('1', '1', '1');
INSERT INTO `customercar` VALUES ('2', '2', '2');
INSERT INTO `customercar` VALUES ('3', '3', '3');
INSERT INTO `customercar` VALUES ('4', '4', '4');
INSERT INTO `customercar` VALUES ('5', '5', '5');
INSERT INTO `customercar` VALUES ('6', '6', '6');
INSERT INTO `customercar` VALUES ('7', '7', '7');
INSERT INTO `customercar` VALUES ('8', '8', '8');
INSERT INTO `customercar` VALUES ('9', '9', '9');
INSERT INTO `customercar` VALUES ('10', '10', '10');
INSERT INTO `customercar` VALUES ('11', '11', '11');
INSERT INTO `customercar` VALUES ('12', '12', '12');
INSERT INTO `customercar` VALUES ('13', '13', '13');
INSERT INTO `customercar` VALUES ('14', '16', '14');

-- ----------------------------
-- Table structure for customerrank
-- ----------------------------
DROP TABLE IF EXISTS `customerrank`;
CREATE TABLE `customerrank` (
  `customerRank_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `rank_id` int(11) NOT NULL,
  PRIMARY KEY (`customerRank_id`),
  KEY `FK_fg9ux0e62em8fmw5alppiwgbx` (`customer_id`),
  KEY `FK_b9kl60vg4u99l04w53em1nw0q` (`rank_id`),
  CONSTRAINT `FK_b9kl60vg4u99l04w53em1nw0q` FOREIGN KEY (`rank_id`) REFERENCES `rank` (`rank_id`),
  CONSTRAINT `FK_fg9ux0e62em8fmw5alppiwgbx` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of customerrank
-- ----------------------------
INSERT INTO `customerrank` VALUES ('1', '1', '1');
INSERT INTO `customerrank` VALUES ('2', '2', '3');
INSERT INTO `customerrank` VALUES ('3', '3', '3');
INSERT INTO `customerrank` VALUES ('4', '4', '2');
INSERT INTO `customerrank` VALUES ('5', '5', '5');
INSERT INTO `customerrank` VALUES ('6', '6', '2');
INSERT INTO `customerrank` VALUES ('7', '7', '2');
INSERT INTO `customerrank` VALUES ('8', '8', '3');
INSERT INTO `customerrank` VALUES ('9', '9', '4');
INSERT INTO `customerrank` VALUES ('10', '10', '5');
INSERT INTO `customerrank` VALUES ('11', '11', '2');
INSERT INTO `customerrank` VALUES ('12', '12', '2');
INSERT INTO `customerrank` VALUES ('13', '13', '2');
INSERT INTO `customerrank` VALUES ('14', '14', '3');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(50) NOT NULL,
  `department_script` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`department_id`),
  UNIQUE KEY `UK_f5np34wnxt905fwmrs6133l28` (`department_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '行政部', null);
INSERT INTO `department` VALUES ('2', '前台', null);
INSERT INTO `department` VALUES ('3', '洗车部', null);
INSERT INTO `department` VALUES ('4', '汽车美容部', null);
INSERT INTO `department` VALUES ('5', '顾客', '');

-- ----------------------------
-- Table structure for part
-- ----------------------------
DROP TABLE IF EXISTS `part`;
CREATE TABLE `part` (
  `part_id` int(11) NOT NULL AUTO_INCREMENT,
  `part_name` varchar(50) NOT NULL,
  `part_script` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`part_id`),
  UNIQUE KEY `UK_n70uxl9um67etm2nwsgo7pg91` (`part_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of part
-- ----------------------------
INSERT INTO `part` VALUES ('1', '经理', null);
INSERT INTO `part` VALUES ('2', '前台', null);
INSERT INTO `part` VALUES ('3', '普通员工', null);
INSERT INTO `part` VALUES ('4', '顾客', null);
INSERT INTO `part` VALUES ('5', '系统管理员', null);

-- ----------------------------
-- Table structure for partrights
-- ----------------------------
DROP TABLE IF EXISTS `partrights`;
CREATE TABLE `partrights` (
  `partRights_id` int(11) NOT NULL AUTO_INCREMENT,
  `part_id` int(11) NOT NULL,
  `rights_id` int(11) NOT NULL,
  PRIMARY KEY (`partRights_id`),
  KEY `FK_499olkpmlgg34o6nvrwjnoif8` (`part_id`),
  KEY `FK_bl5awcipfh1576xpqofom8r7s` (`rights_id`),
  CONSTRAINT `FK_499olkpmlgg34o6nvrwjnoif8` FOREIGN KEY (`part_id`) REFERENCES `part` (`part_id`),
  CONSTRAINT `FK_bl5awcipfh1576xpqofom8r7s` FOREIGN KEY (`rights_id`) REFERENCES `rights` (`rights_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of partrights
-- ----------------------------
INSERT INTO `partrights` VALUES ('9', '1', '1');
INSERT INTO `partrights` VALUES ('10', '1', '2');
INSERT INTO `partrights` VALUES ('11', '1', '3');
INSERT INTO `partrights` VALUES ('12', '1', '4');
INSERT INTO `partrights` VALUES ('13', '1', '5');
INSERT INTO `partrights` VALUES ('14', '1', '6');
INSERT INTO `partrights` VALUES ('15', '1', '7');
INSERT INTO `partrights` VALUES ('16', '1', '8');
INSERT INTO `partrights` VALUES ('17', '2', '2');
INSERT INTO `partrights` VALUES ('18', '2', '3');
INSERT INTO `partrights` VALUES ('19', '2', '4');
INSERT INTO `partrights` VALUES ('20', '2', '5');
INSERT INTO `partrights` VALUES ('21', '3', '2');
INSERT INTO `partrights` VALUES ('22', '3', '8');
INSERT INTO `partrights` VALUES ('23', '4', '8');
INSERT INTO `partrights` VALUES ('26', '5', '2');
INSERT INTO `partrights` VALUES ('27', '5', '3');

-- ----------------------------
-- Table structure for rank
-- ----------------------------
DROP TABLE IF EXISTS `rank`;
CREATE TABLE `rank` (
  `rank_id` int(11) NOT NULL AUTO_INCREMENT,
  `rank_cost` double NOT NULL,
  `rank_discount` double NOT NULL,
  `rank_name` varchar(50) NOT NULL,
  `rank_script` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rank_id`),
  UNIQUE KEY `UK_qaplm45wpg9sugk22v1mc1x7d` (`rank_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of rank
-- ----------------------------
INSERT INTO `rank` VALUES ('1', '0', '1', '普通顾客', '');
INSERT INTO `rank` VALUES ('2', '200', '0.9', '一级会员', '');
INSERT INTO `rank` VALUES ('3', '300', '0.8', '二级会员', '');
INSERT INTO `rank` VALUES ('4', '350', '0.75', '三级会员', '');
INSERT INTO `rank` VALUES ('5', '400', '0.7', '四级会员', '');

-- ----------------------------
-- Table structure for rights
-- ----------------------------
DROP TABLE IF EXISTS `rights`;
CREATE TABLE `rights` (
  `rights_id` int(11) NOT NULL AUTO_INCREMENT,
  `rights_name` varchar(50) NOT NULL,
  `rights_script` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`rights_id`),
  UNIQUE KEY `UK_dpcxvv70a2pb67v20366ygcid` (`rights_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of rights
-- ----------------------------
INSERT INTO `rights` VALUES ('1', '系统管理', null);
INSERT INTO `rights` VALUES ('2', '账户', null);
INSERT INTO `rights` VALUES ('3', '车辆信息管理', null);
INSERT INTO `rights` VALUES ('4', '顾客信息管理', null);
INSERT INTO `rights` VALUES ('5', '结账', null);
INSERT INTO `rights` VALUES ('6', '会员卡管理', null);
INSERT INTO `rights` VALUES ('7', '服务项目管理', null);
INSERT INTO `rights` VALUES ('8', '自助查询', null);

-- ----------------------------
-- Table structure for service
-- ----------------------------
DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
  `service_id` int(11) NOT NULL AUTO_INCREMENT,
  `service_name` varchar(50) NOT NULL,
  `service_number` varchar(50) NOT NULL,
  `service_price` double NOT NULL,
  `service_Unit` varchar(20) NOT NULL,
  PRIMARY KEY (`service_id`),
  UNIQUE KEY `UK_m9d3s95xpk0hhpr9khgqgvijv` (`service_number`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of service
-- ----------------------------
INSERT INTO `service` VALUES ('1', '洗车', '0001', '25', '次');
INSERT INTO `service` VALUES ('2', '喷漆', '0002', '290', '次');
INSERT INTO `service` VALUES ('3', '打蜡', '0003', '65', '次');
INSERT INTO `service` VALUES ('4', '贴膜', '0004', '245', '次');
INSERT INTO `service` VALUES ('5', '清洗发动机', '0005', '54', '次');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) NOT NULL,
  `user_enterDegree` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `department_id` int(11) DEFAULT NULL,
  `part_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_cjn1wn3ecn1kacgqxryr6a5c6` (`user_account`),
  KEY `FK_tb5gq05t7xhddh2idsdy8ddd` (`department_id`),
  KEY `FK_j7ibem7qrpqp4b2qwcuhfo1m0` (`part_id`),
  CONSTRAINT `FK_j7ibem7qrpqp4b2qwcuhfo1m0` FOREIGN KEY (`part_id`) REFERENCES `part` (`part_id`),
  CONSTRAINT `FK_tb5gq05t7xhddh2idsdy8ddd` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aaa', '15', '李总', 'aaa', '1', '1');
INSERT INTO `user` VALUES ('2', 'bbb', '9', '小王', 'bbb', '2', '2');
INSERT INTO `user` VALUES ('3', 'ccc', '6', '小赵', 'ccc', '1', '5');
INSERT INTO `user` VALUES ('4', 'ddd', '0', '小钱', 'ddd', '3', '3');
INSERT INTO `user` VALUES ('5', 'eee', '0', '小孙', 'eee', '3', '3');
INSERT INTO `user` VALUES ('6', 'fff', '0', '小周', 'fff', '4', '3');
INSERT INTO `user` VALUES ('7', 'ggg', '0', '小吴', 'ggg', '4', '3');
INSERT INTO `user` VALUES ('8', 'hhh', '1', '顾客', 'hhh', '5', '4');
INSERT INTO `user` VALUES ('9', 'customer', '3', '顾客', 'customer', '5', '4');
