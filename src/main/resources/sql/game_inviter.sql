/*
SQLyog Community Edition- MySQL GUI v6.5 Beta2
MySQL - 5.7.9 : Database - game_inviter
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

create database if not exists `game_inviter`;

USE `game_inviter`;

/*Table structure for table `ability` */

DROP TABLE IF EXISTS `ability`;

CREATE TABLE `ability` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT COMMENT '运动类型主键ID',
  `name` varchar(255) NOT NULL COMMENT '运动类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ability` */

/*Table structure for table `ability_level` */

DROP TABLE IF EXISTS `ability_level`;

CREATE TABLE `ability_level` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT COMMENT '运动等级主键ID',
  `ability_id` smallint(6) NOT NULL COMMENT '运动类型ID',
  `description` text COMMENT '运动等级标注描述',
  `level` tinyint(4) DEFAULT NULL COMMENT '运动等级',
  `level_name` varchar(255) DEFAULT NULL COMMENT '运动等级名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ability_level` */

/*Table structure for table `activety` */

DROP TABLE IF EXISTS `activety`;

CREATE TABLE `activety` (
  `id` bigint(20) NOT NULL COMMENT '活动主键ID(pid)',
  `ability_id` smallint(6) NOT NULL COMMENT '运动类型ID',
  `activety_level_id` tinyint(4) DEFAULT NULL COMMENT '活动级别ID',
  `activety_arena_config_id` int(11) NOT NULL COMMENT '活动场馆配置ID',
  `arena_id` int(11) NOT NULL COMMENT '场馆ID',
  `initial_player_id` bigint(20) DEFAULT NULL COMMENT '活动发起人ID(player.id)',
  `begin_time` datetime DEFAULT NULL COMMENT '开始时间',
  `comment` varchar(255) DEFAULT NULL COMMENT '备注',
  `duration_hours` tinyint(4) DEFAULT NULL COMMENT '持续时长',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `arena_fee_id` int(11) DEFAULT NULL COMMENT '场馆活动费用ID',
  `launch_time` datetime DEFAULT NULL COMMENT '活动发起时间',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态',
  `min_age_limit` tinyint(4) DEFAULT '12' COMMENT '参与者最小年龄限制',
  `max_age_limit` tinyint(4) DEFAULT '99' COMMENT '参与者最大年龄限制',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activety` */

/*Table structure for table `activety_arena_config` */

DROP TABLE IF EXISTS `activety_arena_config`;

CREATE TABLE `activety_arena_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动配置ID',
  `arean_id` int(11) NOT NULL COMMENT '场馆ID',
  `min_players_per_court` smallint(6) DEFAULT NULL COMMENT '每个场地的最小人数',
  `max_players_per_court` smallint(6) DEFAULT NULL COMMENT '每个场地的最大人数',
  `auto_cancel_time_difference` int(11) DEFAULT NULL COMMENT '距离预定开始时间多会自动取消',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activety_arena_config` */

/*Table structure for table `activety_config` */

DROP TABLE IF EXISTS `activety_config`;

CREATE TABLE `activety_config` (
  `id` smallint(20) NOT NULL AUTO_INCREMENT COMMENT '活动配置ID',
  `abililty_id` smallint(20) NOT NULL COMMENT '运动类型ID',
  `name` varchar(50) NOT NULL COMMENT '运动比赛类别名称',
  `gender_limit` tinyint(4) NOT NULL DEFAULT '-1' COMMENT '性别限制:-1为无限制,0为女性,1为男性',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activety_config` */

/*Table structure for table `activety_join` */

DROP TABLE IF EXISTS `activety_join`;

CREATE TABLE `activety_join` (
  `id` bigint(20) NOT NULL COMMENT '参与活动ID(pid)',
  `activety_id` bigint(20) NOT NULL COMMENT '活动ID',
  `player_id` bigint(20) NOT NULL COMMENT '参与人ID',
  `extra_number` tinyint(4) DEFAULT '0' COMMENT '附加人数(影响参与人数和支付金额,且提醒用户附加人员需满足活动条件)',
  `status` tinyint(4) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activety_join` */

/*Table structure for table `activety_level` */

DROP TABLE IF EXISTS `activety_level`;

CREATE TABLE `activety_level` (
  `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '活动等级ID',
  `comment` varchar(255) DEFAULT NULL COMMENT '备注',
  `name` varchar(255) NOT NULL COMMENT '活动等级名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `activety_level` */

/*Table structure for table `arena` */

DROP TABLE IF EXISTS `arena`;

CREATE TABLE `arena` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '场馆主键ID',
  `ability_id` smallint(6) NOT NULL COMMENT '场馆运动类型ID',
  `address` varchar(255) NOT NULL COMMENT '场馆地址',
  `close_time` time DEFAULT NULL COMMENT '场馆闭馆时间',
  `comment` varchar(255) DEFAULT NULL COMMENT '场馆备注信息',
  `court_amount` tinyint(4) DEFAULT NULL COMMENT '场馆运动场数量',
  `join_time` datetime DEFAULT NULL COMMENT '场馆信息录入时间',
  `last_update_time` datetime DEFAULT NULL COMMENT '场馆信息最后更新时间',
  `location_x` decimal(38,0) DEFAULT NULL COMMENT '场馆x轴坐标',
  `location_y` decimal(38,0) DEFAULT NULL COMMENT '场馆y轴坐标',
  `name` varchar(255) NOT NULL COMMENT '场馆名称',
  `open_time` time DEFAULT NULL COMMENT '场馆开馆时间',
  `phone_number` varchar(255) NOT NULL COMMENT '场馆电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arena` */

/*Table structure for table `arena_court` */

DROP TABLE IF EXISTS `arena_court`;

CREATE TABLE `arena_court` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '场馆场地ID',
  `arena_id` int(11) NOT NULL COMMENT '场馆ID',
  `level` tinyint(4) DEFAULT NULL COMMENT '场地级别',
  `number` varchar(255) DEFAULT NULL COMMENT '场地号码',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arena_court` */

/*Table structure for table `arena_court_fix_schedule` */

DROP TABLE IF EXISTS `arena_court_fix_schedule`;

CREATE TABLE `arena_court_fix_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `arena_court_id` int(11) NOT NULL COMMENT '场地ID',
  `player_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `week` tinyint(4) NOT NULL COMMENT '星期几',
  `clock` tinyint(4) NOT NULL COMMENT '钟',
  `utility_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '生效时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arena_court_fix_schedule` */

/*Table structure for table `arena_court_reserve` */

DROP TABLE IF EXISTS `arena_court_reserve`;

CREATE TABLE `arena_court_reserve` (
  `id` bigint(20) NOT NULL COMMENT '场地预约ID(pid)',
  `arena_court_id` int(11) DEFAULT NULL COMMENT '场地ID',
  `begin_time` datetime DEFAULT NULL COMMENT '开始时间',
  `comment` varchar(255) DEFAULT NULL COMMENT '备注',
  `duration_hours` tinyint(4) DEFAULT NULL COMMENT '持续时长',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `fee` decimal(38,0) DEFAULT NULL COMMENT '费用',
  `launch_time` datetime DEFAULT NULL COMMENT '发起预约时间',
  `player_id` bigint(20) DEFAULT NULL COMMENT '发起人ID',
  `arena_court_status_id` smallint(6) DEFAULT NULL COMMENT '场地状态ID',
  `type` tinyint(4) DEFAULT NULL COMMENT '预约类型:普通预定,活动预定,固定时间场地',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arena_court_reserve` */

/*Table structure for table `arena_court_status` */

DROP TABLE IF EXISTS `arena_court_status`;

CREATE TABLE `arena_court_status` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT COMMENT '场地状态ID',
  `explain` varchar(50) NOT NULL COMMENT '场地状态说明',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '场地是否可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `arena_court_status` */

insert  into `arena_court_status`(`id`,`explain`,`status`) values (1,'使用中',0),(2,'场地损坏',0),(3,'固定预定',0),(4,'临时预定',0),(5,'活动预定',0),(6,'固定取消',1),(7,'临时取消',1),(8,'活动取消',1),(9,'空闲',1);

/*Table structure for table `arena_fee` */

DROP TABLE IF EXISTS `arena_fee`;

CREATE TABLE `arena_fee` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '场馆费用ID',
  `arena_id` int(11) DEFAULT NULL COMMENT '场馆ID',
  `clock` tinyint(4) DEFAULT NULL COMMENT '钟',
  `create_time` datetime DEFAULT NULL COMMENT '场馆费用创建时间',
  `day_in_week` tinyint(4) DEFAULT NULL COMMENT '星期几',
  `favourable_begin_time` datetime DEFAULT NULL COMMENT '优惠起始时间',
  `favourable_end_time` datetime DEFAULT NULL COMMENT '优惠结束时间',
  `fee` decimal(38,0) DEFAULT NULL COMMENT '费用',
  `level` tinyint(4) DEFAULT NULL COMMENT '费用等级(eg:VIP,空调,普通)',
  `type` tinyint(4) DEFAULT NULL COMMENT '费用类型(场地费用,活动费用)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arena_fee` */

/*Table structure for table `arena_preferential_policy` */

DROP TABLE IF EXISTS `arena_preferential_policy`;

CREATE TABLE `arena_preferential_policy` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '优惠政策ID(满多少送多少)',
  `arena_id` int(11) DEFAULT NULL COMMENT '场馆ID',
  `cash_amount` decimal(38,0) DEFAULT NULL COMMENT '充值金额',
  `create_time` datetime DEFAULT NULL COMMENT '充值时间',
  `red_packet_amount` decimal(38,0) DEFAULT NULL COMMENT '赠送红包金额',
  `valid_period` smallint(6) DEFAULT NULL COMMENT '红包有效期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arena_preferential_policy` */

/*Table structure for table `flow_cash_in` */

DROP TABLE IF EXISTS `flow_cash_in`;

CREATE TABLE `flow_cash_in` (
  `id` varchar(255) NOT NULL,
  `amount` decimal(38,0) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `player_id` bigint(20) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `type_match_action_id` bigint(20) DEFAULT NULL,
  `unique_access_str` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flow_cash_in` */

/*Table structure for table `flow_cash_out` */

DROP TABLE IF EXISTS `flow_cash_out`;

CREATE TABLE `flow_cash_out` (
  `id` varchar(255) NOT NULL,
  `amount` decimal(38,0) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `player_id` bigint(20) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `type_match_action_id` bigint(20) DEFAULT NULL,
  `unique_access_str` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flow_cash_out` */

/*Table structure for table `flow_red_packet_in` */

DROP TABLE IF EXISTS `flow_red_packet_in`;

CREATE TABLE `flow_red_packet_in` (
  `id` varchar(255) NOT NULL,
  `amount` decimal(38,0) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `expire_time` datetime DEFAULT NULL,
  `player_id` bigint(20) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `type_match_action_id` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flow_red_packet_in` */

/*Table structure for table `flow_red_packet_out` */

DROP TABLE IF EXISTS `flow_red_packet_out`;

CREATE TABLE `flow_red_packet_out` (
  `id` varchar(255) NOT NULL,
  `amount` decimal(38,0) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `player_id` bigint(20) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `type_match_action_id` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flow_red_packet_out` */

/*Table structure for table `player` */

DROP TABLE IF EXISTS `player`;

CREATE TABLE `player` (
  `id` bigint(20) NOT NULL COMMENT '用户ID(pid)',
  `age` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `grender` tinyint(4) DEFAULT NULL COMMENT '性别:0女性,1男性',
  `join_time` datetime DEFAULT NULL COMMENT '注册时间',
  `last_update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `phone_number` varchar(255) DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `player` */

/*Table structure for table `player_ability` */

DROP TABLE IF EXISTS `player_ability`;

CREATE TABLE `player_ability` (
  `player_id` bigint(20) NOT NULL COMMENT '用户ID',
  `ability_id` int(11) NOT NULL COMMENT '运动类型ID',
  `ability_level_id` int(11) DEFAULT NULL COMMENT '运动等级ID',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`player_id`,`ability_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `player_ability` */

/*Table structure for table `player_login` */

DROP TABLE IF EXISTS `player_login`;

CREATE TABLE `player_login` (
  `player_id` bigint(20) NOT NULL COMMENT '用户ID',
  `username` varchar(50) NOT NULL COMMENT '登录用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '登录密码',
  `login_type_id` tinyint(4) NOT NULL COMMENT '登录类型ID',
  PRIMARY KEY (`player_id`,`login_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `player_login` */

/*Table structure for table `player_login_type` */

DROP TABLE IF EXISTS `player_login_type`;

CREATE TABLE `player_login_type` (
  `id` smallint(6) NOT NULL AUTO_INCREMENT COMMENT '登录类型ID',
  `name` varchar(50) NOT NULL COMMENT '登录类型名称',
  `is_need_password` tinyint(4) NOT NULL DEFAULT '1' COMMENT '登录时是否需要使用密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `player_login_type` */

/*Table structure for table `wallet` */

DROP TABLE IF EXISTS `wallet`;

CREATE TABLE `wallet` (
  `player_id` varchar(255) NOT NULL,
  `arena_id` int(11) DEFAULT NULL,
  `cash_amount` decimal(38,0) DEFAULT NULL,
  `last_update_time` datetime DEFAULT NULL,
  `red_packet_amount` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wallet` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
