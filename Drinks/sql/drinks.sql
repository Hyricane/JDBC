/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80028
Source Host           : localhost:3306
Source Database       : drinks

Target Server Type    : MYSQL
Target Server Version : 80028
File Encoding         : 65001

Date: 2023-12-12 17:39:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_drinks
-- ----------------------------
DROP TABLE IF EXISTS `t_drinks`;
CREATE TABLE `t_drinks` (
  `band` varchar(50) DEFAULT NULL,
  `origin` varchar(50) DEFAULT NULL,
  `cap` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of t_drinks
-- ----------------------------
INSERT INTO `t_drinks` VALUES ('百事', '浙江', '300ml', '碳酸饮料', '3');
INSERT INTO `t_drinks` VALUES ('美汁源', '山东', '500ml', '果汁饮料', '3.5');
