/*
 Navicat Premium Data Transfer

 Source Server         : spnooyseed
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : mystore_42sunkaikai_06

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 10/01/2021 21:27:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good`  (
  `goodId` int(0) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `goodType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品类型',
  `goodName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `goodInformation` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品信息',
  `goodSale` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '销售情况',
  `goodHave` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '现有库存',
  PRIMARY KEY (`goodId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 128 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES (1, 'Office', '签字笔', '黑墨', 0000000010, 0000000030);
INSERT INTO `good` VALUES (2, 'Office', '签字笔', '黑墨', 0000000010, 0000000030);
INSERT INTO `good` VALUES (3, 'Office', '12', '黑墨', 0000000010, 0000000030);
INSERT INTO `good` VALUES (4, 'DayUse', '卫生纸', '纸质', 0000000123, 0000000041);
INSERT INTO `good` VALUES (5, 'DayUse', '茶杯', '易碎', 0000000004, 0000000056);
INSERT INTO `good` VALUES (6, 'Food', '橘子', '保质期7天', 0000000004, 0000000534);
INSERT INTO `good` VALUES (7, 'Food', '苹果', '保质期6天', 0000000075, 0000000123);
INSERT INTO `good` VALUES (8, 'Drink', '脉动', '清甜', 0000000003, 0000000342);
INSERT INTO `good` VALUES (9, 'Office', '订书机', '送5盒订', 0000000100, 0000001000);
INSERT INTO `good` VALUES (10, 'Office', '签字笔', '黑墨', 0000000010, 0000000030);
INSERT INTO `good` VALUES (11, 'Office', '12', '黑墨', 0000000010, 0000000030);
INSERT INTO `good` VALUES (12, 'Food', '口水鸡', '13块钱一只，优惠信息', 0000000001, 0000000123);
INSERT INTO `good` VALUES (13, 'DayUse', '面纸', '无', 0000000012, 0000000123);
INSERT INTO `good` VALUES (14, 'Office', '办公椅', '可旋转', 0000000000, 0000010000);
INSERT INTO `good` VALUES (127, 'Food', '德州扒鸡', '正宗', NULL, 0000000999);
INSERT INTO `good` VALUES (128, 'Food', '方便面', '第二件九折', NULL, 0000000200);

-- ----------------------------
-- Table structure for sale_static
-- ----------------------------
DROP TABLE IF EXISTS `sale_static`;
CREATE TABLE `sale_static`  (
  `goodId` int(0) NOT NULL,
  `saleTime` date NOT NULL,
  `num` int(0) NULL DEFAULT NULL,
  `goodName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `goodType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goodId`, `saleTime`) USING BTREE,
  CONSTRAINT `ForginKey_goodId` FOREIGN KEY (`goodId`) REFERENCES `good` (`goodId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sale_static
-- ----------------------------
INSERT INTO `sale_static` VALUES (1, '2020-01-01', 10, '签字笔', 'Office');
INSERT INTO `sale_static` VALUES (3, '2021-01-07', 10, '12', 'Office');
INSERT INTO `sale_static` VALUES (4, '2021-01-09', 123, '卫生纸', 'DayUse');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `userName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `activeStatus` int(0) NULL DEFAULT NULL,
  `role` int(0) NOT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'spnooyseed', '123', '1903382950@qq.com', 1, 0);
INSERT INTO `user` VALUES (2, 'spnooyseed', 'bca533743d22710956c515a0672417a9', '1903382950@qq.com', 1, 0);
INSERT INTO `user` VALUES (3, 'admin', '202cb962ac59075b964b07152d234b70', '1587454413@qq.com', 1, 0);
INSERT INTO `user` VALUES (4, '111', '698d51a19d8a121ce581499d7b701668', '819608760@qq.com', 1, 0);
INSERT INTO `user` VALUES (5, 'admin', '202cb962ac59075b964b07152d234b70', '819608760@qq.com', 1, 0);

SET FOREIGN_KEY_CHECKS = 1;
