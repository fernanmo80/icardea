-- MySQL dump 10.13  Distrib 5.1.36, for Win32 (ia32)
--
-- Host: localhost    Database: final_icardea
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
-- Table structure for table `alert`
--

CREATE DATABASE IF NOT EXISTS final_icardea;
use final_icardea;


DROP TABLE IF EXISTS `alert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alert` (
  `PatientID` char(36) NOT NULL,
  `AlertTime` datetime NOT NULL,
  `AlertType` varchar(2) NOT NULL,
  `AlertID` varchar(24) NOT NULL,
  PRIMARY KEY (`PatientID`,`AlertID`),
  CONSTRAINT `FK_Alert_Patient` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alert`
--

LOCK TABLES `alert` WRITE;
/*!40000 ALTER TABLE `alert` DISABLE KEYS */;
/*!40000 ALTER TABLE `alert` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authority`
--

DROP TABLE IF EXISTS `authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authority` (
  `AuthorityID` char(36) NOT NULL,
  `MenuBarID` char(36) DEFAULT NULL,
  PRIMARY KEY (`AuthorityID`),
  KEY `FK_Authority_MenuBar` (`MenuBarID`),
  CONSTRAINT `FK_Authority_MenuBar` FOREIGN KEY (`MenuBarID`) REFERENCES `menubar` (`MenuBarID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authority`
--

LOCK TABLES `authority` WRITE;
/*!40000 ALTER TABLE `authority` DISABLE KEYS */;
INSERT INTO `authority` VALUES ('d878a65d-c199-11df-82bd-8d95449521e1',NULL);
/*!40000 ALTER TABLE `authority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authorityrole`
--

DROP TABLE IF EXISTS `authorityrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorityrole` (
  `AuthorityRoleID` char(36) NOT NULL,
  `AuthorityID` char(36) NOT NULL,
  `RoleID` char(36) NOT NULL,
  PRIMARY KEY (`AuthorityRoleID`),
  UNIQUE KEY `UK_AuthorityRole` (`AuthorityID`,`RoleID`),
  KEY `FK_AuthorityRole_Role` (`RoleID`),
  CONSTRAINT `FK_AuthorityRole_Authority` FOREIGN KEY (`AuthorityID`) REFERENCES `authority` (`AuthorityID`),
  CONSTRAINT `FK_AuthorityRole_Role` FOREIGN KEY (`RoleID`) REFERENCES `role` (`RoleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorityrole`
--

LOCK TABLES `authorityrole` WRITE;
/*!40000 ALTER TABLE `authorityrole` DISABLE KEYS */;
INSERT INTO `authorityrole` VALUES ('20840457-c19b-11df-82bd-8d95449521e1','d878a65d-c199-11df-82bd-8d95449521e1','e74eba05-c199-11df-82bd-8d95449521e1');
/*!40000 ALTER TABLE `authorityrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bpmeasurement`
--

DROP TABLE IF EXISTS `bpmeasurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bpmeasurement` (
  `PatientID` char(36) NOT NULL,
  `ReportID` varchar(45) NOT NULL,
  `BPMeasurementID` varchar(45) NOT NULL,
  `IsValid` bit(1) NOT NULL,
  `TimeOfMeasurement` datetime NOT NULL,
  `TimeOfTransmission` datetime NOT NULL,
  `Systolic` int(11) NOT NULL,
  `Diastolic` int(11) NOT NULL,
  `PulseRatePerMinute` int(11) NOT NULL,
  `MeanArterialPressure` int(11) NOT NULL,
  PRIMARY KEY (`PatientID`,`ReportID`,`BPMeasurementID`),
  CONSTRAINT `FK_BpMeasurement_Report` FOREIGN KEY (`PatientID`, `ReportID`) REFERENCES `report` (`PatientID`, `ReportID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bpmeasurement`
--

LOCK TABLES `bpmeasurement` WRITE;
/*!40000 ALTER TABLE `bpmeasurement` DISABLE KEYS */;
/*!40000 ALTER TABLE `bpmeasurement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `code`
--

DROP TABLE IF EXISTS `code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `code` (
  `CodeID` char(36) NOT NULL,
  `CodeSchemaID` char(36) NOT NULL,
  `CodeName` varchar(250) NOT NULL,
  `CodeValue` varchar(250) NOT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`CodeID`),
  KEY `K_Code` (`CodeSchemaID`,`CodeName`),
  CONSTRAINT `FK_Code_CodeSchema` FOREIGN KEY (`CodeSchemaID`) REFERENCES `codeschema` (`CodeSchemaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `code`
--

LOCK TABLES `code` WRITE;
/*!40000 ALTER TABLE `code` DISABLE KEYS */;
/*!40000 ALTER TABLE `code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codeindex`
--

DROP TABLE IF EXISTS `codeindex`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `codeindex` (
  `CodeIndexID` char(36) NOT NULL,
  `CodeKey` varchar(50) NOT NULL,
  `NextValue` int(11) NOT NULL,
  PRIMARY KEY (`CodeIndexID`),
  UNIQUE KEY `UK_CodeIndex` (`CodeKey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codeindex`
--

LOCK TABLES `codeindex` WRITE;
/*!40000 ALTER TABLE `codeindex` DISABLE KEYS */;
/*!40000 ALTER TABLE `codeindex` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codeschema`
--

DROP TABLE IF EXISTS `codeschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `codeschema` (
  `CodeSchemaID` char(36) NOT NULL,
  `SchemaName` varchar(250) NOT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`CodeSchemaID`),
  KEY `K_CodeSchema` (`SchemaName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codeschema`
--

LOCK TABLES `codeschema` WRITE;
/*!40000 ALTER TABLE `codeschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `codeschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ecgmeasurement`
--

DROP TABLE IF EXISTS `ecgmeasurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ecgmeasurement` (
  `id` varchar(45) NOT NULL DEFAULT '',
  `new_lbbb_status` tinyint(1) NOT NULL DEFAULT '0',
  `st_vawe_inversion` tinyint(1) NOT NULL DEFAULT '0',
  `patient_id` char(36) NOT NULL DEFAULT '',
  `report_id` varchar(45) NOT NULL DEFAULT '',
  `av_block_status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_ECGMeasurement_Report` (`patient_id`,`report_id`),
  CONSTRAINT `FK_ECGMeasurement_Report` FOREIGN KEY (`patient_id`, `report_id`) REFERENCES `report` (`PatientID`, `ReportID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ecgmeasurement`
--

LOCK TABLES `ecgmeasurement` WRITE;
/*!40000 ALTER TABLE `ecgmeasurement` DISABLE KEYS */;
/*!40000 ALTER TABLE `ecgmeasurement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ecgmeasurementdetail`
--

DROP TABLE IF EXISTS `ecgmeasurementdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ecgmeasurementdetail` (
  `id` varchar(45) NOT NULL DEFAULT '',
  `ecg_data_id` varchar(45) NOT NULL DEFAULT '',
  `st_elevation_status` int(10) unsigned DEFAULT NULL,
  `st_depration_status` int(10) unsigned DEFAULT NULL,
  `pr_interval` float DEFAULT NULL,
  `transitory_st_elevation` int(10) unsigned DEFAULT NULL,
  `transitory_st_deviation` int(10) unsigned DEFAULT NULL,
  `dynamic_st_changes` int(10) unsigned DEFAULT NULL,
  `acquisition_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ECGMeasurement` (`ecg_data_id`),
  CONSTRAINT `FK_ECGMeasurement` FOREIGN KEY (`ecg_data_id`) REFERENCES `ecgmeasurement` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ecgmeasurementdetail`
--

LOCK TABLES `ecgmeasurementdetail` WRITE;
/*!40000 ALTER TABLE `ecgmeasurementdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `ecgmeasurementdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ecgplotdata`
--

DROP TABLE IF EXISTS `ecgplotdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ecgplotdata` (
  `ID` varchar(45) NOT NULL DEFAULT '',
  `AcquisitionDate` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Data` varchar(10000) NOT NULL DEFAULT '',
  `EcgMeasurementId` varchar(45) NOT NULL DEFAULT '',
  `LeadNo` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ecgplotdata`
--

LOCK TABLES `ecgplotdata` WRITE;
/*!40000 ALTER TABLE `ecgplotdata` DISABLE KEYS */;
/*!40000 ALTER TABLE `ecgplotdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frame`
--

DROP TABLE IF EXISTS `frame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frame` (
  `FrameID` char(36) NOT NULL,
  `ModuleID` char(36) NOT NULL,
  `FrameName` varchar(100) NOT NULL,
  `ClassName` varchar(250) DEFAULT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`FrameID`),
  UNIQUE KEY `UK_Frame` (`ModuleID`,`FrameName`),
  CONSTRAINT `FK_Frame_Module` FOREIGN KEY (`ModuleID`) REFERENCES `module` (`ModuleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frame`
--

LOCK TABLES `frame` WRITE;
/*!40000 ALTER TABLE `frame` DISABLE KEYS */;
/*!40000 ALTER TABLE `frame` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `global`
--

DROP TABLE IF EXISTS `global`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `global` (
  `GlobalID` char(36) NOT NULL,
  `GlobalKey` varchar(250) NOT NULL,
  `GlobalValue` varchar(250) NOT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`GlobalID`),
  KEY `K_Default` (`GlobalKey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `global`
--

LOCK TABLES `global` WRITE;
/*!40000 ALTER TABLE `global` DISABLE KEYS */;
/*!40000 ALTER TABLE `global` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `MenuID` char(36) NOT NULL,
  `MenuBarID` char(36) NOT NULL,
  `ParentMenuGroupID` char(36) DEFAULT NULL,
  `MenuIndex` int(11) NOT NULL,
  `ResourceKey` varchar(250) DEFAULT NULL,
  `IconKey` varchar(250) DEFAULT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`MenuID`),
  KEY `FK_Menu_MenuGroup` (`ParentMenuGroupID`),
  KEY `K_Menu` (`MenuBarID`,`ParentMenuGroupID`,`MenuIndex`),
  CONSTRAINT `FK_Menu_MenuBar` FOREIGN KEY (`MenuBarID`) REFERENCES `menubar` (`MenuBarID`),
  CONSTRAINT `FK_Menu_MenuGroup` FOREIGN KEY (`ParentMenuGroupID`) REFERENCES `menugroup` (`MenuGroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menubar`
--

DROP TABLE IF EXISTS `menubar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menubar` (
  `MenuBarID` char(36) NOT NULL,
  `MenuBarName` varchar(50) NOT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`MenuBarID`),
  UNIQUE KEY `UK_MenuBar` (`MenuBarName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menubar`
--

LOCK TABLES `menubar` WRITE;
/*!40000 ALTER TABLE `menubar` DISABLE KEYS */;
/*!40000 ALTER TABLE `menubar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menugroup`
--

DROP TABLE IF EXISTS `menugroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menugroup` (
  `MenuGroupID` char(36) NOT NULL,
  `GroupName` varchar(100) NOT NULL,
  PRIMARY KEY (`MenuGroupID`),
  KEY `K_MenuGroup` (`GroupName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menugroup`
--

LOCK TABLES `menugroup` WRITE;
/*!40000 ALTER TABLE `menugroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `menugroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menuitem`
--

DROP TABLE IF EXISTS `menuitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menuitem` (
  `MenuItemID` char(36) NOT NULL,
  `FrameID` char(36) NOT NULL,
  PRIMARY KEY (`MenuItemID`),
  KEY `FK_MenuItem_Frame` (`FrameID`),
  CONSTRAINT `FK_MenuItem_Frame` FOREIGN KEY (`FrameID`) REFERENCES `frame` (`FrameID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menuitem`
--

LOCK TABLES `menuitem` WRITE;
/*!40000 ALTER TABLE `menuitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `menuitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `module`
--

DROP TABLE IF EXISTS `module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `module` (
  `ModuleID` char(36) NOT NULL,
  `ModuleName` varchar(50) NOT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`ModuleID`),
  UNIQUE KEY `UK_Module` (`ModuleName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module`
--

LOCK TABLES `module` WRITE;
/*!40000 ALTER TABLE `module` DISABLE KEYS */;
/*!40000 ALTER TABLE `module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `PatientID` char(36) NOT NULL,
  `PatientCode` bigint(20) NOT NULL,
  `PatientName` varchar(50) NOT NULL,
  `BirthDate` datetime DEFAULT NULL,
  `Gender` varchar(1) DEFAULT NULL,
  `Height` double DEFAULT NULL,
  `Weight` double DEFAULT NULL,
  `MaritalStatus` varchar(1) DEFAULT NULL,
  `HomeAddress` varchar(250) DEFAULT NULL,
  `HospitalFileNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`PatientID`),
  UNIQUE KEY `UK_Patient` (`PatientCode`),
  KEY `K_Patient` (`PatientCode`,`PatientName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES ('31c5ea5f-e639-417d-9b7a-58323ab49323',190,'Andreas Schmidt','1953-01-04 00:00:00','M',185,80,'A','Miami, USA',NULL);
INSERT INTO `patient` VALUES ('5224aeda-a0b6-11e0-9d49-00b68faaa84c',191,'Suzie Mayr','1973-04-22 15:09:02','F',170,60,'A','Salzburg, Austria',NULL);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientadmission`
--

DROP TABLE IF EXISTS `patientadmission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientadmission` (
  `PatientAdmissionID` char(36) NOT NULL,
  `PatientID` char(36) NOT NULL,
  `AdmissionDate` datetime NOT NULL,
  `Physician` varchar(250) DEFAULT NULL,
  `Diagnosis` varchar(250) DEFAULT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`PatientAdmissionID`),
  UNIQUE KEY `UK_PatientAdmission` (`PatientID`,`AdmissionDate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientadmission`
--

LOCK TABLES `patientadmission` WRITE;
/*!40000 ALTER TABLE `patientadmission` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientadmission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientallergy`
--

DROP TABLE IF EXISTS `patientallergy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientallergy` (
  `PatientAllergyID` char(36) NOT NULL,
  `Fibrionolysis` bit(1) DEFAULT NULL,
  `Aspirin` bit(1) DEFAULT NULL,
  PRIMARY KEY (`PatientAllergyID`),
  CONSTRAINT `FK_PatientAllergy_PatientAdmission` FOREIGN KEY (`PatientAllergyID`) REFERENCES `patientadmission` (`PatientAdmissionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientallergy`
--

LOCK TABLES `patientallergy` WRITE;
/*!40000 ALTER TABLE `patientallergy` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientallergy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientecg`
--

DROP TABLE IF EXISTS `patientecg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientecg` (
  `PatientECGID` char(36) NOT NULL,
  `Rhythm` int(11) DEFAULT NULL,
  `InfarctLocalization` int(11) DEFAULT NULL,
  `LBBB` int(11) DEFAULT NULL,
  `ST` int(11) DEFAULT NULL,
  `QWaves` bit(1) DEFAULT NULL,
  `TWaveInvertion` bit(1) DEFAULT NULL,
  `LVEF` int(11) DEFAULT NULL,
  `DiastolicFunction` int(11) DEFAULT NULL,
  `LVH` int(11) DEFAULT NULL,
  `WMAs` int(11) DEFAULT NULL,
  `Tamponade` int(11) DEFAULT NULL,
  `ECGStressTest` int(11) DEFAULT NULL,
  `DobutamineStressEcho` int(11) DEFAULT NULL,
  `StressMyocardial` int(11) DEFAULT NULL,
  `CoronaryAnatomy` int(11) DEFAULT NULL,
  `CoronarySpasm` bit(1) DEFAULT NULL,
  `Thrombus` bit(1) DEFAULT NULL,
  `AbleToExcercise` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`PatientECGID`),
  CONSTRAINT `FK_PatientECG_PatientAdmission` FOREIGN KEY (`PatientECGID`) REFERENCES `patientadmission` (`PatientAdmissionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientecg`
--

LOCK TABLES `patientecg` WRITE;
/*!40000 ALTER TABLE `patientecg` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientecg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patienthistory`
--

DROP TABLE IF EXISTS `patienthistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patienthistory` (
  `PatientHistoryID` char(36) NOT NULL,
  `ValveDisease` int(11) DEFAULT NULL,
  `MI` int(11) DEFAULT NULL,
  `MIStart` datetime DEFAULT NULL,
  `MyocardialRevascularization` int(11) DEFAULT NULL,
  `Angina` int(11) DEFAULT NULL,
  `HeartFailure` int(11) DEFAULT NULL,
  `BleedingHistory` int(11) DEFAULT NULL,
  `CoronaryStenosisDegree` int(11) DEFAULT NULL,
  `DefaultBP` double DEFAULT NULL,
  `CoronaryStenosisLocation` varchar(250) DEFAULT NULL,
  `DM` bit(1) DEFAULT NULL,
  `Hypertension` bit(1) DEFAULT NULL,
  `Asthma` bit(1) DEFAULT NULL,
  `Claudication` bit(1) DEFAULT NULL,
  `Pulmonaryedema` bit(1) DEFAULT NULL,
  `DobutamineStressEcho` bit(1) DEFAULT NULL,
  `StressMyocardial` bit(1) DEFAULT NULL,
  `Smoking` bit(1) DEFAULT NULL,
  `Dyslipidemia` bit(1) DEFAULT NULL,
  `BetaBlocker` int(11) DEFAULT NULL,
  `ACEI` int(11) DEFAULT NULL,
  `Sartan` int(11) DEFAULT NULL,
  `Spironolactone` int(11) DEFAULT NULL,
  `Digoxin` int(11) DEFAULT NULL,
  `Nitrates` int(11) DEFAULT NULL,
  `Statin` int(11) DEFAULT NULL,
  `Aspirin` int(11) DEFAULT NULL,
  `OralAnticoagulant` int(11) DEFAULT NULL,
  `OtherDiuretics` int(11) DEFAULT NULL,
  `Clopidogrel` int(11) DEFAULT NULL,
  `CalciumBlocker` int(11) DEFAULT NULL,
  `DefaultTroponin` double DEFAULT NULL,
  `DefaultCKMB` double DEFAULT NULL,
  PRIMARY KEY (`PatientHistoryID`),
  CONSTRAINT `FK_PatientHistory_PatientAdmission` FOREIGN KEY (`PatientHistoryID`) REFERENCES `patientadmission` (`PatientAdmissionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patienthistory`
--

LOCK TABLES `patienthistory` WRITE;
/*!40000 ALTER TABLE `patienthistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `patienthistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientlab`
--

DROP TABLE IF EXISTS `patientlab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientlab` (
  `PatientLabID` char(36) NOT NULL,
  `PatientAdmissionID` char(36) NOT NULL,
  `LabTime` datetime NOT NULL,
  `CardiacTroponin` double DEFAULT NULL,
  `CK` double DEFAULT NULL,
  `CKMBMass` double DEFAULT NULL,
  `MB` double DEFAULT NULL,
  `CRP` double DEFAULT NULL,
  `IL6` double DEFAULT NULL,
  `Fibrinogen` double DEFAULT NULL,
  `Creatinine` double DEFAULT NULL,
  PRIMARY KEY (`PatientLabID`),
  KEY `FK_PatientLab_PatientAdmission` (`PatientAdmissionID`),
  CONSTRAINT `FK_PatientLab_PatientAdmission` FOREIGN KEY (`PatientAdmissionID`) REFERENCES `patientadmission` (`PatientAdmissionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='InnoDB free: 11264 kB; (`PatientAdmissionID`) REFER `icardea';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientlab`
--

LOCK TABLES `patientlab` WRITE;
/*!40000 ALTER TABLE `patientlab` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientlab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientmedication`
--

DROP TABLE IF EXISTS `patientmedication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientmedication` (
  `PatientMedicationID` char(36) NOT NULL,
  `BetaBloker` int(11) DEFAULT NULL,
  `ACEI` int(11) DEFAULT NULL,
  `Sartan` int(11) DEFAULT NULL,
  `Spironolactone` int(11) DEFAULT NULL,
  `Digoxin` int(11) DEFAULT NULL,
  `Nitrates` int(11) DEFAULT NULL,
  `Statin` int(11) DEFAULT NULL,
  `Aspirin` int(11) DEFAULT NULL,
  `Anticoagulant` int(11) DEFAULT NULL,
  `OtherDiuretics` int(11) DEFAULT NULL,
  `Clopidogrel` int(11) DEFAULT NULL,
  `CalciumBlocker` int(11) DEFAULT NULL,
  `GP` int(11) DEFAULT NULL,
  `Inotrops` int(11) DEFAULT NULL,
  PRIMARY KEY (`PatientMedicationID`),
  CONSTRAINT `FK_PatientMedication_PatientAdmission` FOREIGN KEY (`PatientMedicationID`) REFERENCES `patientadmission` (`PatientAdmissionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientmedication`
--

LOCK TABLES `patientmedication` WRITE;
/*!40000 ALTER TABLE `patientmedication` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientmedication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientorder`
--

DROP TABLE IF EXISTS `patientorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientorder` (
  `PatientOrderID` char(36) NOT NULL,
  `Status` int(11) NOT NULL,
  `MeasurementCode` varchar(250) NOT NULL DEFAULT '',
  `RequestDate` datetime NOT NULL,
  `Value` varchar(250) DEFAULT NULL,
  `ResponseDate` datetime DEFAULT NULL,
  `PatientId` char(36) DEFAULT NULL,
  PRIMARY KEY (`PatientOrderID`),
  KEY `K_PatientOrder` (`Status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientorder`
--

LOCK TABLES `patientorder` WRITE;
/*!40000 ALTER TABLE `patientorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientprescription`
--

DROP TABLE IF EXISTS `patientprescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientprescription` (
  `PatientPrescriptionID` char(36) NOT NULL,
  `PatientID` char(36) NOT NULL,
  `PrescriptionDate` datetime NOT NULL,
  `ServiceID` varchar(250) DEFAULT NULL,
  `ServiceName` varchar(250) DEFAULT NULL,
  `ServiceSource` varchar(250) DEFAULT NULL,
  `ApplicationDoseFrom` varchar(250) DEFAULT NULL,
  `ApplicationRoute` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`PatientPrescriptionID`),
  KEY `K_PatientPrescription` (`PatientID`,`PrescriptionDate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientprescription`
--

LOCK TABLES `patientprescription` WRITE;
/*!40000 ALTER TABLE `patientprescription` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientprescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientprescriptionnote`
--

DROP TABLE IF EXISTS `patientprescriptionnote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientprescriptionnote` (
  `PatientPrescriptionNoteID` char(36) NOT NULL,
  `PatientPrescriptionID` char(36) NOT NULL,
  `PrescriptionNote` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`PatientPrescriptionNoteID`),
  KEY `FK_PatientPrescriptionNote_PatientPrescription` (`PatientPrescriptionID`),
  CONSTRAINT `FK_PatientPrescriptionNote_PatientPrescription` FOREIGN KEY (`PatientPrescriptionID`) REFERENCES `patientprescription` (`PatientPrescriptionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientprescriptionnote`
--

LOCK TABLES `patientprescriptionnote` WRITE;
/*!40000 ALTER TABLE `patientprescriptionnote` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientprescriptionnote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientprocedure`
--

DROP TABLE IF EXISTS `patientprocedure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientprocedure` (
  `PatientProcedureID` char(36) NOT NULL,
  `PatientID` char(36) NOT NULL,
  `ProcedureDate` datetime NOT NULL,
  `ServiceID` varchar(250) DEFAULT NULL,
  `ServiceName` varchar(250) DEFAULT NULL,
  `ServiceSource` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`PatientProcedureID`),
  KEY `K_PatientProcedure` (`PatientID`,`ProcedureDate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientprocedure`
--

LOCK TABLES `patientprocedure` WRITE;
/*!40000 ALTER TABLE `patientprocedure` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientprocedure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patientsymptom`
--

DROP TABLE IF EXISTS `patientsymptom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientsymptom` (
  `PatientSymptomID` char(36) NOT NULL,
  `ChestPain` bit(1) DEFAULT NULL,
  `ChestPainStart` datetime DEFAULT NULL,
  `ChestPainStop` datetime DEFAULT NULL,
  `Dyspnea` bit(1) DEFAULT NULL,
  `AcutePulmonaryedema` bit(1) DEFAULT NULL,
  `CardiogenicShock` bit(1) DEFAULT NULL,
  `CardiacArrest` bit(1) DEFAULT NULL,
  `Palpitations` bit(1) DEFAULT NULL,
  `Peripheraledema` bit(1) DEFAULT NULL,
  `Bronchialspasm` bit(1) DEFAULT NULL,
  `KillipClass` int(11) DEFAULT NULL,
  `NYHA` int(11) DEFAULT NULL,
  `Anxiety` int(11) DEFAULT NULL,
  PRIMARY KEY (`PatientSymptomID`),
  CONSTRAINT `FK_PatientSymptom_PatientAdmission` FOREIGN KEY (`PatientSymptomID`) REFERENCES `patientadmission` (`PatientAdmissionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientsymptom`
--

LOCK TABLES `patientsymptom` WRITE;
/*!40000 ALTER TABLE `patientsymptom` DISABLE KEYS */;
/*!40000 ALTER TABLE `patientsymptom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `report`
--

DROP TABLE IF EXISTS `report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `report` (
  `PatientID` char(36) NOT NULL,
  `ReportID` varchar(45) NOT NULL,
  `ReportName` varchar(255) NOT NULL,
  `ReportType` varchar(1) NOT NULL,
  `StartType` varchar(1) NOT NULL,
  `StartTime` datetime NOT NULL,
  `EndType` varchar(1) NOT NULL,
  `EndTime` int(11) NOT NULL DEFAULT '0',
  `EndUnit` varchar(1) NOT NULL,
  `ECGTime` int(11) NOT NULL,
  `ECGUnit` varchar(1) NOT NULL,
  `SpO2Time` int(11) NOT NULL,
  `SpO2Unit` varchar(1) NOT NULL,
  `BpTime` int(11) NOT NULL DEFAULT '0',
  `BpUnit` varchar(1) NOT NULL DEFAULT '',
  PRIMARY KEY (`PatientID`,`ReportID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `report`
--

LOCK TABLES `report` WRITE;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
/*!40000 ALTER TABLE `report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `RoleID` char(36) NOT NULL,
  `RoleName` varchar(30) NOT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`RoleID`),
  UNIQUE KEY `UK_Role` (`RoleName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES ('e74eba05-c199-11df-82bd-8d95449521e1','Doctor','Doctor');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spo2measurement`
--

DROP TABLE IF EXISTS `spo2measurement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `spo2measurement` (
  `PatientID` char(36) NOT NULL,
  `ReportID` varchar(45) NOT NULL,
  `SpO2MeasurementID` varchar(45) NOT NULL,
  `TimeOfMeasurement` datetime NOT NULL,
  `TimeOfTransmission` datetime NOT NULL,
  `SpO2` float NOT NULL,
  `PulseRatePerMinute` int(11) NOT NULL,
  `Pleth` varchar(100) NOT NULL,
  `SignalQuality` float NOT NULL,
  `SignalAmplification` float NOT NULL,
  PRIMARY KEY (`PatientID`,`ReportID`,`SpO2MeasurementID`),
  CONSTRAINT `FK_SpO2Measurement_Report` FOREIGN KEY (`PatientID`, `ReportID`) REFERENCES `report` (`PatientID`, `ReportID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spo2measurement`
--

LOCK TABLES `spo2measurement` WRITE;
/*!40000 ALTER TABLE `spo2measurement` DISABLE KEYS */;
/*!40000 ALTER TABLE `spo2measurement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `UserID` char(36) NOT NULL,
  `Username` varchar(15) NOT NULL DEFAULT '',
  `Password` varchar(15) DEFAULT NULL,
  `Information` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `UK_User` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('d878a65d-c199-11df-82bd-8d95449521e1','yildiray','yildiray','YILDIRAY KABAK');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

INSERT INTO `user` (`UserID`, `Username`, `Password`, `Information`) VALUES
('1d184f4d-18b8-11e0-893c-ac57ac5bc3c1', 'erdem', 'erdem', 'ERDEM ALPAY');

INSERT INTO `authority` (`AuthorityID`, `MenuBarID`) VALUES
('1d184f4d-18b8-11e0-893c-ac57ac5bc3c1', NULL);

INSERT INTO `authorityrole` (`AuthorityRoleID`, `AuthorityID`, `RoleID`) VALUES
('31460340-18ba-11e0-893c-ac57ac5bc3c1', '1d184f4d-18b8-11e0-893c-ac57ac5bc3c1', 'e74eba05-c199-11df-82bd-8d95449521e1');

-- Dump completed on 2010-09-16 17:06:49
