-- MySQL dump 10.13  Distrib 5.1.36, for Win32 (ia32)
--
-- Host: localhost    Database: final_icardeaalarmdatabase
-- ------------------------------------------------------
-- Server version	5.1.36-community-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alarmmessages`
--

CREATE DATABASE IF NOT EXISTS final_icardeaalarmdatabase;
use final_icardeaalarmdatabase;


DROP TABLE IF EXISTS `alarmmessages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alarmmessages` (
  `MessageID` int(11) NOT NULL AUTO_INCREMENT,
  `AssignmentID` int(11) DEFAULT NULL,
  `RoleId` int(11) DEFAULT NULL,
  `Urgency` int(11) DEFAULT NULL,
  `MessageContent` varchar(200) DEFAULT NULL,
  `RECEIVETIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`MessageID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alarmmessages`
--

LOCK TABLES `alarmmessages` WRITE;
/*!40000 ALTER TABLE `alarmmessages` DISABLE KEYS */;
/*!40000 ALTER TABLE `alarmmessages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guidelineassignments`
--

DROP TABLE IF EXISTS `guidelineassignments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guidelineassignments` (
  `UserID` int(11) NOT NULL DEFAULT '0',
  `AssignmentId` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`UserID`,`AssignmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guidelineassignments`
--

LOCK TABLES `guidelineassignments` WRITE;
/*!40000 ALTER TABLE `guidelineassignments` DISABLE KEYS */;
/*!40000 ALTER TABLE `guidelineassignments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mediums`
--

DROP TABLE IF EXISTS `mediums`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mediums` (
  `MediumID` int(11) NOT NULL AUTO_INCREMENT,
  `MediumName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MediumID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mediums`
--

LOCK TABLES `mediums` WRITE;
/*!40000 ALTER TABLE `mediums` DISABLE KEYS */;
INSERT INTO `mediums` VALUES (1,'GoogleTalk'),(2,'EMail'),(3,'SMS');
/*!40000 ALTER TABLE `mediums` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messageloggings`
--

DROP TABLE IF EXISTS `messageloggings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messageloggings` (
  `MessageID` int(11) NOT NULL AUTO_INCREMENT,
  `SendTime` datetime DEFAULT NULL,
  `MediumType` int(10) unsigned NOT NULL DEFAULT '0',
  `RootMessageID` int(10) unsigned NOT NULL DEFAULT '0',
  `UserID` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`MessageID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messageloggings`
--

LOCK TABLES `messageloggings` WRITE;
/*!40000 ALTER TABLE `messageloggings` DISABLE KEYS */;
/*!40000 ALTER TABLE `messageloggings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissions`
--

DROP TABLE IF EXISTS `permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permissions` (
  `userid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `assignmentid` int(10) unsigned NOT NULL DEFAULT '0',
  `givenuserid` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`userid`,`assignmentid`,`givenuserid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissions`
--

LOCK TABLES `permissions` WRITE;
/*!40000 ALTER TABLE `permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `RoleID` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(20) DEFAULT NULL,
  `RoleDescription` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'Administrator','Manages other users'),(2,'Doctor','Healthcare user'),(3,'Nurse','Healthcare user'),(4,'Patient Relative','Healthcare user');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rules`
--

DROP TABLE IF EXISTS `rules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rules` (
  `ruleid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `jessrule` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`ruleid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rules`
--

LOCK TABLES `rules` WRITE;
/*!40000 ALTER TABLE `rules` DISABLE KEYS */;
/*!40000 ALTER TABLE `rules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `urgencies`
--

DROP TABLE IF EXISTS `urgencies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `urgencies` (
  `UrgencyID` int(11) NOT NULL DEFAULT '0',
  `UrgencyName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`UrgencyID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urgencies`
--

LOCK TABLES `urgencies` WRITE;
/*!40000 ALTER TABLE `urgencies` DISABLE KEYS */;
INSERT INTO `urgencies` VALUES (1,'Low'),(2,'Medium'),(3,'High');
/*!40000 ALTER TABLE `urgencies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usercontacts`
--

DROP TABLE IF EXISTS `usercontacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usercontacts` (
  `ContactID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` int(11) DEFAULT NULL,
  `ContactType` int(11) DEFAULT NULL,
  `ContactNumber` varchar(50) DEFAULT NULL,
  `ContactIsAvailable` int(11) DEFAULT NULL,
  PRIMARY KEY (`ContactID`),
  UNIQUE KEY `UserID` (`UserID`,`ContactType`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usercontacts`
--

LOCK TABLES `usercontacts` WRITE;
/*!40000 ALTER TABLE `usercontacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `usercontacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `UserFirstName` varchar(20) DEFAULT NULL,
  `UserSurname` varchar(20) DEFAULT NULL,
  `UserRole` int(11) DEFAULT NULL,
  `UserPassword` varchar(20) DEFAULT NULL,
  `UserEMail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `Username` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2010-09-16 17:07:16
