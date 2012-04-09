-- MySQL dump 10.13  Distrib 5.1.36, for Win32 (ia32)
--
-- Host: localhost    Database: final_icardea_repository
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
-- Table structure for table `assignment`
--

CREATE DATABASE IF NOT EXISTS final_icardea_repository;
use final_icardea_repository;


DROP TABLE IF EXISTS `assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assignment` (
  `ID` bigint(20) NOT NULL,
  `PID` bigint(20) DEFAULT NULL,
  `GID` int(11) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL,
  `ASSIGNED_BY` varchar(15) DEFAULT NULL,
  `APPROVED_BY` varchar(15) DEFAULT NULL,
  `ASSIGNMENT_DATE` datetime NOT NULL,
  `APPROVAL_DATE` datetime DEFAULT NULL,
  `START_DATE` datetime DEFAULT NULL,
  `ProcessedGuidelineURL` varchar(255) DEFAULT NULL,
  `IS_ACTIVE` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PID` (`PID`,`GID`,`ASSIGNMENT_DATE`),
  KEY `FK5A1572CD5832198A` (`APPROVED_BY`),
  KEY `FK5A1572CD96188713` (`ASSIGNED_BY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (1,190,1,2,'yildiray','yildiray','2010-05-08 01:01:01','2010-05-10 01:01:01',NULL,'http://localhost:8080/icardea/guidelines/icardea/ManagementofAF-1.owl','true');
INSERT INTO `assignment` VALUES (2,191,2,2,'yildiray','yildiray','2010-05-08 01:01:01','2010-05-10 01:01:01',NULL,'http://localhost:8080/icardea/guidelines/icardea/ManagementofVT-2.owl','true');
INSERT INTO `assignment` VALUES (3,191,3,2,'yildiray','yildiray','2010-05-08 01:01:01','2010-05-10 01:01:01',NULL,'http://localhost:8080/icardea/guidelines/icardea/ManagementofTechnicalCP-3.owl','true');
/*!40000 ALTER TAsBLE `assignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignment_customization`
--

DROP TABLE IF EXISTS `assignment_customization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assignment_customization` (
  `ASSIGN_ID` bigint(20) NOT NULL,
  `C_ID` int(11) NOT NULL,
  PRIMARY KEY (`ASSIGN_ID`,`C_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment_customization`
--

LOCK TABLES `assignment_customization` WRITE;
/*!40000 ALTER TABLE `assignment_customization` DISABLE KEYS */;
/*!40000 ALTER TABLE `assignment_customization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignment_sensors_set`
--

DROP TABLE IF EXISTS `assignment_sensors_set`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assignment_sensors_set` (
  `ASSIGN_ID` bigint(20) NOT NULL,
  `SENSOR_ID` int(11) NOT NULL,
  PRIMARY KEY (`ASSIGN_ID`,`SENSOR_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment_sensors_set`
--

LOCK TABLES `assignment_sensors_set` WRITE;
/*!40000 ALTER TABLE `assignment_sensors_set` DISABLE KEYS */;
/*!40000 ALTER TABLE `assignment_sensors_set` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customization_info`
--

DROP TABLE IF EXISTS `customization_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customization_info` (
  `C_ID` int(11) NOT NULL,
  `IMPORTANCE` varchar(255) DEFAULT NULL,
  `MESSAGE` varchar(255) DEFAULT NULL,
  `EXPRESSION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`C_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customization_info`
--

LOCK TABLES `customization_info` WRITE;
/*!40000 ALTER TABLE `customization_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `customization_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnosiscode`
--

DROP TABLE IF EXISTS `diagnosiscode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnosiscode` (
  `DIAGNOSIS_CODE` varchar(255) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DIAGNOSIS_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnosiscode`
--

LOCK TABLES `diagnosiscode` WRITE;
/*!40000 ALTER TABLE `diagnosiscode` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnosiscode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gehistory`
--

DROP TABLE IF EXISTS `gehistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gehistory` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `sessionID` bigint(20) unsigned NOT NULL,
  `tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `col1` text,
  `col2` text,
  `col3` text,
  `col4` text,
  `col5` text,
  `col6` text,
  `col7` text,
  `col8` text,
  `col9` text,
  `subguidelineID` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_gehistory_1` (`sessionID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gehistory`
--

LOCK TABLES `gehistory` WRITE;
/*!40000 ALTER TABLE `gehistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `gehistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gehistory_header`
--

DROP TABLE IF EXISTS `gehistory_header`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gehistory_header` (
  `sessionID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `assignmentID` bigint(20) unsigned NOT NULL,
  `tstamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sessionID`),
  UNIQUE KEY `assignmentID` (`assignmentID`,`tstamp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gehistory_header`
--

LOCK TABLES `gehistory_header` WRITE;
/*!40000 ALTER TABLE `gehistory_header` DISABLE KEYS */;
/*!40000 ALTER TABLE `gehistory_header` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guideline_diagnosis`
--

DROP TABLE IF EXISTS `guideline_diagnosis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guideline_diagnosis` (
  `GUIDELINE_ID` int(11) NOT NULL DEFAULT '0',
  `DIAGNOSIS_CODE` varchar(255) NOT NULL,
  PRIMARY KEY (`GUIDELINE_ID`,`DIAGNOSIS_CODE`),
  KEY `FK708991F7B1350AA7` (`DIAGNOSIS_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guideline_diagnosis`
--

LOCK TABLES `guideline_diagnosis` WRITE;
/*!40000 ALTER TABLE `guideline_diagnosis` DISABLE KEYS */;
/*!40000 ALTER TABLE `guideline_diagnosis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guideline_entity`
--

DROP TABLE IF EXISTS `guideline_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guideline_entity` (
  `GUIDELINE_ID` int(11) NOT NULL DEFAULT '0',
  `TITLE` varchar(255) DEFAULT NULL,
  `VERSION` varchar(255) DEFAULT NULL,
  `INSTITUTE` varchar(255) DEFAULT NULL,
  `GUIDELINE_URL` varchar(255) DEFAULT NULL,
  `INTERNAL_GUIDELINE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`GUIDELINE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guideline_entity`
--

LOCK TABLES `guideline_entity` WRITE;
/*!40000 ALTER TABLE `guideline_entity` DISABLE KEYS */;
INSERT INTO `guideline_entity` VALUES (1,'Management of AF','0.1','SRDC','http://localhost:8080/icardea/guidelines/icardea/ManagementofAF-1.owl','ICARDEA_GUIDELINE_Instance_1');
INSERT INTO `guideline_entity` VALUES (2,'Management of VT','0.1','SRDC','http://localhost:8080/icardea/guidelines/icardea/ManagementofVT-2.owl','ICARDEA_GUIDELINE_Instance_1');
INSERT INTO `guideline_entity` VALUES (3,'Management of Technical CP','0.1','SRDC','http://localhost:8080/icardea/guidelines/icardea/ManagementofTechnicalCP-3.owl','ICARDEA_GUIDELINE_Instance_1');
/*!40000 ALTER TABLE `guideline_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monitoring_messages`
--

DROP TABLE IF EXISTS `monitoring_messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monitoring_messages` (
  `MM_ID` bigint(20) NOT NULL,
  `TYPE` varchar(255) DEFAULT NULL,
  `STEP_NAME` varchar(255) DEFAULT NULL,
  `INFO` varchar(255) DEFAULT NULL,
  `SENT_DATE` datetime DEFAULT NULL,
  `ASSIGNMENT_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`MM_ID`),
  KEY `FK693B63639618AA6F` (`ASSIGNMENT_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monitoring_messages`
--

LOCK TABLES `monitoring_messages` WRITE;
/*!40000 ALTER TABLE `monitoring_messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `monitoring_messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sensor_tmp`
--

DROP TABLE IF EXISTS `sensor_tmp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sensor_tmp` (
  `pid` varchar(50) NOT NULL,
  `ECGNewLBBBStatus` varchar(10) DEFAULT NULL,
  `ECGSTElevationStatus` varchar(10) DEFAULT NULL,
  `PatientGeneratedEvent` varchar(50) DEFAULT NULL,
  `ECGPRStatus` double DEFAULT NULL,
  `HeartRate` double DEFAULT NULL,
  `SystolicBP` double DEFAULT NULL,
  `SaO2Status` double DEFAULT NULL,
  `ECGDynamicSTChangesStatus` varchar(10) DEFAULT NULL,
  `ECGTransitorySTElevationStatus` varchar(10) DEFAULT NULL,
  `ECGTransitorySTDeviation` varchar(10) DEFAULT NULL,
  `RecurrentChestPainStatus` varchar(10) DEFAULT NULL,
  `ECGAVBlockStatus` double DEFAULT NULL,
  `ECGSTElevationValue` double DEFAULT NULL,
  `STDepressionValue` double DEFAULT NULL,
  `TWavesInversion` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sensor_tmp`
--

LOCK TABLES `sensor_tmp` WRITE;
/*!40000 ALTER TABLE `sensor_tmp` DISABLE KEYS */;
/*!40000 ALTER TABLE `sensor_tmp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sensors_set_info`
--

DROP TABLE IF EXISTS `sensors_set_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sensors_set_info` (
  `SENSOR_ID` int(11) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `AVAILABLE` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`SENSOR_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sensors_set_info`
--

LOCK TABLES `sensors_set_info` WRITE;
/*!40000 ALTER TABLE `sensors_set_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `sensors_set_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscriptions`
--

DROP TABLE IF EXISTS `subscriptions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscriptions` (
  `ID` bigint(20) NOT NULL,
  `USER_ID` bigint(20) NOT NULL,
  `ASSIGNMENT_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscriptions`
--

LOCK TABLES `subscriptions` WRITE;
/*!40000 ALTER TABLE `subscriptions` DISABLE KEYS */;
/*!40000 ALTER TABLE `subscriptions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2010-09-16 17:07:05
