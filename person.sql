/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : 127.0.0.1:3306
Source Database       : db_person

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-09-02 17:34:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `userCode` varchar(255) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '刘炜琪', '技术开发部');
INSERT INTO `person` VALUES ('103', '大王', '研发部');
INSERT INTO `person` VALUES ('2', '李四', '人力资源部');
INSERT INTO `person` VALUES ('203', '开心果', '技术开发部');
INSERT INTO `person` VALUES ('3', '王五', '产品研发部');
INSERT INTO `person` VALUES ('303', '潜艇', '技术开发部');
INSERT INTO `person` VALUES ('4', '马六', '共享交付部');
