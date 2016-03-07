# Host: 127.0.0.1  (Version: 5.0.87-community-nt)
# Date: 2016-03-07 17:26:47
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "admin"
#

CREATE TABLE `admin` (
  `Id` int(11) NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `type` int(11) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "admin"
#

INSERT INTO `admin` VALUES (1,'cxjhihihi','cxjhihihi',1);

#
# Source for table "all_exams"
#

CREATE TABLE `all_exams` (
  `id` int(11) NOT NULL auto_increment,
  `examrommid` int(11) default NULL,
  `examid` int(11) default NULL,
  `stuid` int(11) default NULL,
  `score` float(1,0) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "all_exams"
#


#
# Source for table "exam"
#

CREATE TABLE `exam` (
  `examid` int(11) NOT NULL auto_increment,
  `examname` varchar(255) default NULL,
  `memo` varchar(255) default NULL,
  PRIMARY KEY  (`examid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "exam"
#


#
# Source for table "examroom"
#

CREATE TABLE `examroom` (
  `examroomid` int(11) NOT NULL auto_increment,
  `roomaddress` varchar(255) default NULL,
  `is_used_time` varchar(255) default NULL,
  `room_num` int(11) default NULL,
  PRIMARY KEY  (`examroomid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "examroom"
#


#
# Source for table "student"
#

CREATE TABLE `student` (
  `stuid` int(11) NOT NULL auto_increment,
  `username` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `cardnum` varchar(255) default NULL,
  `mobile` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `fingernum` varchar(255) default NULL,
  `grade` int(11) default NULL,
  `class_no` varchar(255) default NULL,
  PRIMARY KEY  (`stuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "student"
#

