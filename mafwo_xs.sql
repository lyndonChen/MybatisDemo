/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50533
Source Host           : localhost:3306
Source Database       : mafwo_xs

Target Server Type    : MYSQL
Target Server Version : 50533
File Encoding         : 65001

Date: 2014-07-09 05:07:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mafwo_book
-- ----------------------------
DROP TABLE IF EXISTS `mafwo_book`;
CREATE TABLE `mafwo_book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(50) NOT NULL,
  `size` int(11) DEFAULT NULL,
  `worker_ID` int(11) DEFAULT NULL,
  `view_count` int(11) DEFAULT NULL,
  `ltype` varchar(100) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mafwo_book
-- ----------------------------
INSERT INTO `mafwo_book` VALUES ('1', '1', '1', '1', '1', '1', '1', '2014-07-08 22:47:56', '1');

-- ----------------------------
-- Table structure for mafwo_chapter
-- ----------------------------
DROP TABLE IF EXISTS `mafwo_chapter`;
CREATE TABLE `mafwo_chapter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `chapter_name` varchar(50) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `book_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mafwo_chapter
-- ----------------------------

-- ----------------------------
-- Table structure for mafwo_content
-- ----------------------------
DROP TABLE IF EXISTS `mafwo_content`;
CREATE TABLE `mafwo_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` text,
  `chapter_id` bigint(20) DEFAULT NULL,
  `previous` bigint(20) DEFAULT NULL,
  `next` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mafwo_content
-- ----------------------------

-- ----------------------------
-- Table structure for mafwo_worker
-- ----------------------------
DROP TABLE IF EXISTS `mafwo_worker`;
CREATE TABLE `mafwo_worker` (
  `id` int(11) NOT NULL,
  `nick_name` varchar(30) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  `worker_name` varchar(30) DEFAULT NULL,
  `worker_age` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mafwo_worker
-- ----------------------------
