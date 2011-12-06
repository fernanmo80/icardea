-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.34-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema icardea
--

CREATE DATABASE IF NOT EXISTS icardea;
USE icardea;

--
-- Definition of table `at`
--

DROP TABLE IF EXISTS `at`;
CREATE TABLE `at` (
  `ID` int(11) NOT NULL,
  `STATID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `mode_sw_max_duration` varchar(50) DEFAULT NULL,
  `burden_percent` varchar(50) DEFAULT NULL,
  `mode_sw_percent_time` varchar(50) DEFAULT NULL,
  `mode_sw_percent_time_per_day` varchar(50) DEFAULT NULL,
  `mode_sw_count` varchar(50) DEFAULT NULL,
  `mode_sw_count_per_day` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKAT594459` (`STATID`),
  CONSTRAINT `FKAT594459` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `at`
--

/*!40000 ALTER TABLE `at` DISABLE KEYS */;
INSERT INTO `at` (`ID`,`STATID`,`dtm_start`,`dtm_end`,`mode_sw_max_duration`,`burden_percent`,`mode_sw_percent_time`,`mode_sw_percent_time_per_day`,`mode_sw_count`,`mode_sw_count_per_day`) VALUES 
 (1,1,'20090925000000','20091025100000','60','10','5','5','10800','360');
/*!40000 ALTER TABLE `at` ENABLE KEYS */;


--
-- Definition of table `battery`
--

DROP TABLE IF EXISTS `battery`;
CREATE TABLE `battery` (
  `ID` int(11) NOT NULL,
  `MSMTID` int(11) DEFAULT NULL,
  `dtm` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `voltage` varchar(50) DEFAULT NULL,
  `impedance` varchar(50) DEFAULT NULL,
  `remaining_longevity` varchar(50) DEFAULT NULL,
  `remaining_percentage` varchar(50) DEFAULT NULL,
  `rrt_trigger` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKBATTERY373849` (`MSMTID`),
  CONSTRAINT `FKBATTERY373849` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `battery`
--

/*!40000 ALTER TABLE `battery` DISABLE KEYS */;
INSERT INTO `battery` (`ID`,`MSMTID`,`dtm`,`status`,`voltage`,`impedance`,`remaining_longevity`,`remaining_percentage`,`rrt_trigger`,`subID`) VALUES 
 (1,1,'20090825100000','MOS','6.3','2500','39','75','Battery voltage < 5.7 V / Cap. Charge time > 12 s',0);
/*!40000 ALTER TABLE `battery` ENABLE KEYS */;


--
-- Definition of table `bradyset`
--

DROP TABLE IF EXISTS `bradyset`;
CREATE TABLE `bradyset` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `mode` varchar(50) DEFAULT NULL,
  `vendor_mode` varchar(50) DEFAULT NULL,
  `lowrate` varchar(50) DEFAULT NULL,
  `hystrate` varchar(50) DEFAULT NULL,
  `night_rate` varchar(50) DEFAULT NULL,
  `sensor_type` varchar(50) DEFAULT NULL,
  `max_tracking_rate` varchar(50) DEFAULT NULL,
  `max_sensor_rate` varchar(50) DEFAULT NULL,
  `sav_delay_high` varchar(50) DEFAULT NULL,
  `sav_delay_low` varchar(50) DEFAULT NULL,
  `pav_delay_high` varchar(50) DEFAULT NULL,
  `pav_delay_low` varchar(50) DEFAULT NULL,
  `at_mode_switch_mode` varchar(50) DEFAULT NULL,
  `at_mode_switch_rate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKBRADYSET526577` (`SETID`),
  CONSTRAINT `FKBRADYSET526577` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bradyset`
--

/*!40000 ALTER TABLE `bradyset` DISABLE KEYS */;
INSERT INTO `bradyset` (`ID`,`SETID`,`mode`,`vendor_mode`,`lowrate`,`hystrate`,`night_rate`,`sensor_type`,`max_tracking_rate`,`max_sensor_rate`,`sav_delay_high`,`sav_delay_low`,`pav_delay_high`,`pav_delay_low`,`at_mode_switch_mode`,`at_mode_switch_rate`) VALUES 
 (1,1,'DDDR','DDDR','60','55','50','Accelerometer','130','120','180','140','150','110','DDIR','180');
/*!40000 ALTER TABLE `bradyset` ENABLE KEYS */;


--
-- Definition of table `bradystat`
--

DROP TABLE IF EXISTS `bradystat`;
CREATE TABLE `bradystat` (
  `ID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `ra_percent_paced` varchar(50) DEFAULT NULL,
  `rv_percent_paced` varchar(50) DEFAULT NULL,
  `ap_vp_percent` varchar(50) DEFAULT NULL,
  `as_vp_percent` varchar(50) DEFAULT NULL,
  `ap_vs_percent` varchar(50) DEFAULT NULL,
  `as_vs_percent` varchar(50) DEFAULT NULL,
  `STATID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKBRADYSTAT250159` (`STATID`),
  CONSTRAINT `FKBRADYSTAT250159` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bradystat`
--

/*!40000 ALTER TABLE `bradystat` DISABLE KEYS */;
INSERT INTO `bradystat` (`ID`,`dtm_start`,`dtm_end`,`ra_percent_paced`,`rv_percent_paced`,`ap_vp_percent`,`as_vp_percent`,`ap_vs_percent`,`as_vs_percent`,`STATID`) VALUES 
 (1,'20090925000000','20091025100000','50','30','10','20','40','60',1);
/*!40000 ALTER TABLE `bradystat` ENABLE KEYS */;


--
-- Definition of table `cap`
--

DROP TABLE IF EXISTS `cap`;
CREATE TABLE `cap` (
  `ID` int(11) NOT NULL,
  `MSMTID` int(11) DEFAULT NULL,
  `charge_dtm` varchar(50) DEFAULT NULL,
  `charge_time` varchar(50) DEFAULT NULL,
  `charge_energy` varchar(50) DEFAULT NULL,
  `charge_type` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCAP50519` (`MSMTID`),
  CONSTRAINT `FKCAP50519` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cap`
--

/*!40000 ALTER TABLE `cap` DISABLE KEYS */;
INSERT INTO `cap` (`ID`,`MSMTID`,`charge_dtm`,`charge_time`,`charge_energy`,`charge_type`,`subID`) VALUES 
 (1,1,'20060601000000','8.4','36','Reformation',0);
/*!40000 ALTER TABLE `cap` ENABLE KEYS */;


--
-- Definition of table `cieddata`
--

DROP TABLE IF EXISTS `cieddata`;
CREATE TABLE `cieddata` (
  `ID` int(11) NOT NULL,
  `sendingApplication` varchar(255) DEFAULT NULL,
  `sendingFacility` varchar(255) DEFAULT NULL,
  `receivingApplication` varchar(255) DEFAULT NULL,
  `receivingFacility` varchar(255) DEFAULT NULL,
  `messageTime` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `ObservationID` int(11) NOT NULL,
  `receivedTime` varchar(255) DEFAULT NULL,
  `PatientID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCIEDData63170` (`ObservationID`),
  KEY `FKCIEDData420789` (`PatientID`),
  CONSTRAINT `FKCIEDData420789` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`ID`),
  CONSTRAINT `FKCIEDData63170` FOREIGN KEY (`ObservationID`) REFERENCES `observation` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cieddata`
--

/*!40000 ALTER TABLE `cieddata` DISABLE KEYS */;
INSERT INTO `cieddata` (`ID`,`sendingApplication`,`sendingFacility`,`receivingApplication`,`receivingFacility`,`messageTime`,`comment`,`ObservationID`,`receivedTime`,`PatientID`) VALUES 
 (1,'APPNAME','VENDOR','CLINIC APP','CLINIC ID','20090422152341',NULL,1,'20110201155438',1);
/*!40000 ALTER TABLE `cieddata` ENABLE KEYS */;


--
-- Definition of table `concern`
--

DROP TABLE IF EXISTS `concern`;
CREATE TABLE `concern` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `concernStatusCode` varchar(255) DEFAULT NULL,
  `effectiveTimeLow` varchar(255) DEFAULT NULL,
  `effectiveTimeHigh` varchar(255) DEFAULT NULL,
  `allergyCode` varchar(255) DEFAULT NULL,
  `allergyValue` varchar(255) DEFAULT NULL,
  `allergyValueCodeSystem` varchar(255) DEFAULT NULL,
  `allergySubstanceCode` varchar(255) DEFAULT NULL,
  `allergySubstanceCodeSystem` varchar(255) DEFAULT NULL,
  `allergyOriginalText` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  `ProblemID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKConcern308982` (`EHRPHRDataID`),
  KEY `FKConcern444326` (`ProblemID`),
  CONSTRAINT `FKConcern308982` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`),
  CONSTRAINT `FKConcern444326` FOREIGN KEY (`ProblemID`) REFERENCES `problem` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `concern`
--

/*!40000 ALTER TABLE `concern` DISABLE KEYS */;
/*!40000 ALTER TABLE `concern` ENABLE KEYS */;


--
-- Definition of table `contact`
--

DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `ID` int(11) NOT NULL,
  `AddressLine` varchar(255) DEFAULT NULL,
  `FaxNumber` varchar(20) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `MobileNumber` varchar(20) DEFAULT NULL,
  `GTalk` varchar(20) DEFAULT NULL,
  `OrganizationID` int(11) DEFAULT NULL,
  `PersonID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKContact391306` (`OrganizationID`),
  KEY `FKContact141472` (`PersonID`),
  CONSTRAINT `FKContact141472` FOREIGN KEY (`PersonID`) REFERENCES `person` (`ID`),
  CONSTRAINT `FKContact391306` FOREIGN KEY (`OrganizationID`) REFERENCES `organization` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contact`
--

/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;


--
-- Definition of table `crtset`
--

DROP TABLE IF EXISTS `crtset`;
CREATE TABLE `crtset` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `lvrv_delay` varchar(50) DEFAULT NULL,
  `paced_chambers` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCRTSET343538` (`SETID`),
  CONSTRAINT `FKCRTSET343538` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `crtset`
--

/*!40000 ALTER TABLE `crtset` DISABLE KEYS */;
INSERT INTO `crtset` (`ID`,`SETID`,`lvrv_delay`,`paced_chambers`) VALUES 
 (1,1,'-20','BiV');
/*!40000 ALTER TABLE `crtset` ENABLE KEYS */;


--
-- Definition of table `crtstat`
--

DROP TABLE IF EXISTS `crtstat`;
CREATE TABLE `crtstat` (
  `ID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `lv_percent_paced` varchar(50) DEFAULT NULL,
  `percent_paced` varchar(50) DEFAULT NULL,
  `STATID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCRTSTAT668692` (`STATID`),
  CONSTRAINT `FKCRTSTAT668692` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `crtstat`
--

/*!40000 ALTER TABLE `crtstat` DISABLE KEYS */;
INSERT INTO `crtstat` (`ID`,`dtm_start`,`dtm_end`,`lv_percent_paced`,`percent_paced`,`STATID`) VALUES 
 (1,'20090925000000','20091025100000','95','80',1);
/*!40000 ALTER TABLE `crtstat` ENABLE KEYS */;


--
-- Definition of table `ehrphrdata`
--

DROP TABLE IF EXISTS `ehrphrdata`;
CREATE TABLE `ehrphrdata` (
  `ID` int(11) NOT NULL,
  `pcc9QueryId` varchar(255) DEFAULT NULL,
  `messageDateTime` varchar(255) DEFAULT NULL,
  `PatientID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKEHRPHRData915269` (`PatientID`),
  CONSTRAINT `FKEHRPHRData915269` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ehrphrdata`
--

/*!40000 ALTER TABLE `ehrphrdata` DISABLE KEYS */;
INSERT INTO `ehrphrdata` (`ID`,`pcc9QueryId`,`messageDateTime`,`PatientID`) VALUES 
 (1,'11','20110201125520',1),
 (2,'3','20110201125525',1),
 (3,'3','20110201125525',1),
 (4,'3','20110201125525',1),
 (5,'3','20110201125525',1),
 (6,'3','20110201125525',1),
 (7,'3','20110201125525',1),
 (8,'3','20110201125525',1),
 (9,'3','20110201125525',1),
 (10,'3','20110201125525',1),
 (11,'3','20110201125525',1),
 (12,'3','20110201125525',1),
 (13,'3','20110201125525',1),
 (14,'3','20110201125525',1),
 (15,'3','20110201125525',1),
 (16,'3','20110201125525',1),
 (17,'3','20110201125525',1),
 (18,'3','20110201125525',1),
 (19,'3','20110201125525',1),
 (20,'3','20110201125525',1),
 (21,'3','20110201125525',1),
 (22,'3','20110201125525',1),
 (23,'3','20110201125525',1),
 (24,'3','20110201125525',1),
 (25,'3','20110201125525',1),
 (26,'3','20110201125525',1),
 (27,'3','20110201125525',1),
 (28,'3','20110201125525',1),
 (29,'3','20110201125525',1),
 (30,'3','20110201125525',1),
 (31,'3','20110201125525',1),
 (32,'3','20110201125525',1),
 (33,'3','20110201125525',1),
 (34,'3','20110201125525',1),
 (35,'3','20110201125525',1),
 (36,'3','20110201125525',1),
 (37,'3','20110201125525',1),
 (38,'3','20110201125525',1),
 (39,'3','20110201125525',1),
 (40,'3','20110201125525',1),
 (41,'8','20110201125529',1),
 (42,'8','20110201125529',1),
 (43,'8','20110201125529',1),
 (44,'8','20110201125529',1),
 (45,'8','20110201125529',1),
 (46,'8','20110201125529',1),
 (47,'8','20110201125529',1),
 (48,'8','20110201125529',1),
 (49,'8','20110201125529',1),
 (50,'8','20110201125529',1),
 (51,'8','20110201125529',1),
 (52,'8','20110201125529',1),
 (53,'8','20110201125529',1),
 (54,'8','20110201125529',1),
 (55,'11','20110201125529',1),
 (56,'11','20110201125529',1),
 (57,'11','20110201125529',1),
 (58,'11','20110201125529',1),
 (59,'11','20110201125529',1);
/*!40000 ALTER TABLE `ehrphrdata` ENABLE KEYS */;


--
-- Definition of table `encounter`
--

DROP TABLE IF EXISTS `encounter`;
CREATE TABLE `encounter` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `encounterCode` varchar(255) DEFAULT NULL,
  `effectiveTimeLow` varchar(255) DEFAULT NULL,
  `effectiveTimeHigh` varchar(255) DEFAULT NULL,
  `encounterText` varchar(255) DEFAULT NULL,
  `doctorID` varchar(255) DEFAULT NULL,
  `organizationID` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKEncounter885522` (`EHRPHRDataID`),
  CONSTRAINT `FKEncounter885522` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `encounter`
--

/*!40000 ALTER TABLE `encounter` DISABLE KEYS */;
/*!40000 ALTER TABLE `encounter` ENABLE KEYS */;


--
-- Definition of table `episoderoot`
--

DROP TABLE IF EXISTS `episoderoot`;
CREATE TABLE `episoderoot` (
  `ID` int(11) NOT NULL,
  `identifier` varchar(50) DEFAULT NULL,
  `dtm` varchar(50) DEFAULT NULL,
  `atrial_interval_at_detection` varchar(50) DEFAULT NULL,
  `atrial_interval_at_termination` varchar(50) DEFAULT NULL,
  `ventricular_interval_at_detection` varchar(50) DEFAULT NULL,
  `ventricular_interval_at_termination` varchar(50) DEFAULT NULL,
  `detection_therapy_details` varchar(50) DEFAULT NULL,
  `therapy_result` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  `SystemID` int(11) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `type_induced` varchar(50) DEFAULT NULL,
  `vendor_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKEPISODEROO22013` (`SystemID`),
  CONSTRAINT `FKEPISODEROO22013` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `episoderoot`
--

/*!40000 ALTER TABLE `episoderoot` DISABLE KEYS */;
INSERT INTO `episoderoot` (`ID`,`identifier`,`dtm`,`atrial_interval_at_detection`,`atrial_interval_at_termination`,`ventricular_interval_at_detection`,`ventricular_interval_at_termination`,`detection_therapy_details`,`therapy_result`,`duration`,`subID`,`SystemID`,`type`,`type_induced`,`vendor_type`) VALUES 
 (1,'1001','20090927000000','200','60',NULL,NULL,'10 ATP','Successful','10800',1,1,'Epis_AT_AF','NO','ATR'),
 (2,'1000','20090927000000',NULL,NULL,'147','95','2 ATP, 5x 30J','Successful','27',0,1,'Epis_SVT','NO','VT1');
/*!40000 ALTER TABLE `episoderoot` ENABLE KEYS */;


--
-- Definition of table `episodestat`
--

DROP TABLE IF EXISTS `episodestat`;
CREATE TABLE `episodestat` (
  `ID` int(11) NOT NULL,
  `STATID` int(11) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `type_induced` varchar(50) DEFAULT NULL,
  `vendor_type` varchar(50) DEFAULT NULL,
  `recent_count` varchar(50) DEFAULT NULL,
  `recent_count_dtm_start` varchar(50) DEFAULT NULL,
  `recent_count_dtm_end` varchar(50) DEFAULT NULL,
  `total_count` varchar(50) DEFAULT NULL,
  `total_count_dtm_start` varchar(50) DEFAULT NULL,
  `total_count_dtm_end` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKEPISODESTA811424` (`STATID`),
  CONSTRAINT `FKEPISODESTA811424` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `episodestat`
--

/*!40000 ALTER TABLE `episodestat` DISABLE KEYS */;
INSERT INTO `episodestat` (`ID`,`STATID`,`type`,`type_induced`,`vendor_type`,`recent_count`,`recent_count_dtm_start`,`recent_count_dtm_end`,`total_count`,`total_count_dtm_start`,`total_count_dtm_end`,`subID`) VALUES 
 (1,1,'Epis_SVT','NO','VT1','1',NULL,NULL,'0',NULL,NULL,1),
 (2,1,'Epis_AT_AF','NO','ATAF','2',NULL,NULL,'150',NULL,NULL,2),
 (3,1,'Epis_VF','NO','VF','1','20090501000000','20091025100000','4','20090925000000','20091025100000',0);
/*!40000 ALTER TABLE `episodestat` ENABLE KEYS */;


--
-- Definition of table `heart_rate`
--

DROP TABLE IF EXISTS `heart_rate`;
CREATE TABLE `heart_rate` (
  `ID` int(11) NOT NULL,
  `STATID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `atrial_min` varchar(50) DEFAULT NULL,
  `atrial_max` varchar(50) DEFAULT NULL,
  `atrial_mean` varchar(50) DEFAULT NULL,
  `ventricular_min` varchar(50) DEFAULT NULL,
  `ventricular_max` varchar(50) DEFAULT NULL,
  `ventricular_mean` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKHEART_RATE500119` (`STATID`),
  CONSTRAINT `FKHEART_RATE500119` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `heart_rate`
--

/*!40000 ALTER TABLE `heart_rate` DISABLE KEYS */;
INSERT INTO `heart_rate` (`ID`,`STATID`,`dtm_start`,`dtm_end`,`atrial_min`,`atrial_max`,`atrial_mean`,`ventricular_min`,`ventricular_max`,`ventricular_mean`) VALUES 
 (1,1,'20090925000000','20091025100000','60','165','72','60','165','72');
/*!40000 ALTER TABLE `heart_rate` ENABLE KEYS */;


--
-- Definition of table `imagingresult`
--

DROP TABLE IF EXISTS `imagingresult`;
CREATE TABLE `imagingresult` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `labResultCode` varchar(255) DEFAULT NULL,
  `labResultText` varchar(255) DEFAULT NULL,
  `effectiveTime` varchar(255) DEFAULT NULL,
  `labResultValue` varchar(255) DEFAULT NULL,
  `labResultValueCodeSystem` varchar(255) DEFAULT NULL,
  `mediaType` varchar(255) DEFAULT NULL,
  `base64Encoded` mediumtext,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKImagingRes295358` (`EHRPHRDataID`),
  CONSTRAINT `FKImagingRes295358` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `imagingresult`
--

/*!40000 ALTER TABLE `imagingresult` DISABLE KEYS */;
INSERT INTO `imagingresult` (`ID`,`careProvisionCode`,`labResultCode`,`labResultText`,`effectiveTime`,`labResultValue`,`labResultValueCodeSystem`,`mediaType`,`base64Encoded`,`EHRPHRDataID`) VALUES 
 (1,'LABCAT','TZ','TZ','200909090909','16','sec',NULL,NULL,41),
 (2,'LABCAT','C0023508','White Blood Cell Count procedure','200909090909','6','G/L',NULL,NULL,42),
 (3,'LABCAT','C0201836','Alanine aminotransferase','200909090909','34','U/l',NULL,NULL,43),
 (4,'LABCAT','C0201850','Alkaline phosphatase measurement','200909090909','77','U/l',NULL,NULL,44),
 (5,'LABCAT','C0202113','Lactate dehydrogenase','200909090909','180','U/l',NULL,NULL,45),
 (6,'LABCAT','C0202035','Gamma glutamyl transferase measurement','200909090909','20','U/l',NULL,NULL,46),
 (7,'LABCAT','C0016006','Fibrinogen measurement','200909090909','354','mg/dl',NULL,NULL,47),
 (8,'LABCAT','C0014772','Red Blood Cell Count measurement','200909090909','4.3','T/L',NULL,NULL,48),
 (9,'LABCAT','C0004002','Aspartate aminotransferase','200909090909','20','U/l',NULL,NULL,49),
 (10,'LABCAT','C0032181','Platelet Count measurement','200909090909','250','G/L',NULL,NULL,50),
 (11,'LABCAT','C0030605','Activated Partial Thromboplastin Time measurement','200909090909','42','sec',NULL,NULL,51),
 (12,'LABCAT','C0033707','Prothrombin time assay','200909090909','109','sec',NULL,NULL,52),
 (13,'LABCAT','C0518015','Hemoglobin measurement','200909090909','15.2','g/dl',NULL,NULL,53),
 (14,'LABCAT','C052032','INR','200909090909','1.0','-',NULL,NULL,54);
/*!40000 ALTER TABLE `imagingresult` ENABLE KEYS */;


--
-- Definition of table `immunization`
--

DROP TABLE IF EXISTS `immunization`;
CREATE TABLE `immunization` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `effectiveTime` varchar(255) DEFAULT NULL,
  `routeCode` varchar(255) DEFAULT NULL,
  `approachSiteCode` varchar(255) DEFAULT NULL,
  `doseQuantity` varchar(255) DEFAULT NULL,
  `doseQuantityUnit` varchar(255) DEFAULT NULL,
  `drugCode` varchar(255) DEFAULT NULL,
  `drugCodeSystem` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKImmunizati883033` (`EHRPHRDataID`),
  CONSTRAINT `FKImmunizati883033` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `immunization`
--

/*!40000 ALTER TABLE `immunization` DISABLE KEYS */;
/*!40000 ALTER TABLE `immunization` ENABLE KEYS */;


--
-- Definition of table `impedance`
--

DROP TABLE IF EXISTS `impedance`;
CREATE TABLE `impedance` (
  `ID` int(11) NOT NULL,
  `LEADCHNLMSMTID` int(11) NOT NULL,
  `value` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKIMPEDANCE769106` (`LEADCHNLMSMTID`),
  CONSTRAINT `FKIMPEDANCE769106` FOREIGN KEY (`LEADCHNLMSMTID`) REFERENCES `leadchnlmsmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `impedance`
--

/*!40000 ALTER TABLE `impedance` DISABLE KEYS */;
INSERT INTO `impedance` (`ID`,`LEADCHNLMSMTID`,`value`,`polarity`) VALUES 
 (1,1,'500',NULL),
 (2,2,'3000','BI'),
 (3,3,'500','BI');
/*!40000 ALTER TABLE `impedance` ENABLE KEYS */;


--
-- Definition of table `lead`
--

DROP TABLE IF EXISTS `lead`;
CREATE TABLE `lead` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `model` varchar(50) DEFAULT NULL,
  `serial` varchar(50) DEFAULT NULL,
  `mfg` varchar(50) DEFAULT NULL,
  `implant_dt` varchar(50) DEFAULT NULL,
  `polarity_type` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `location_detail_1` varchar(50) DEFAULT NULL,
  `location_detail_2` varchar(50) DEFAULT NULL,
  `location_detail_3` varchar(50) DEFAULT NULL,
  `connection_status` varchar(50) DEFAULT NULL,
  `special_function` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEAD603551` (`SystemID`),
  CONSTRAINT `FKLEAD603551` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lead`
--

/*!40000 ALTER TABLE `lead` DISABLE KEYS */;
INSERT INTO `lead` (`ID`,`SystemID`,`model`,`serial`,`mfg`,`implant_dt`,`polarity_type`,`location`,`location_detail_1`,`location_detail_2`,`location_detail_3`,`connection_status`,`special_function`,`subID`) VALUES 
 (1,1,'Supersense','1234567813','SJM','20090501000000','BI','RV','Apex',NULL,NULL,'Connected','N/A',1),
 (2,1,'Supersense','1234567814','SJM','20090501000000','BI','LV','FreeWall',NULL,NULL,'Connected','N/A',2),
 (3,1,'Supersense','1234567812','SJM','20090501000000','UNI','RA','Appendage',NULL,NULL,'Connected','Pressure Sensor',0);
/*!40000 ALTER TABLE `lead` ENABLE KEYS */;


--
-- Definition of table `leadchnlmsmt`
--

DROP TABLE IF EXISTS `leadchnlmsmt`;
CREATE TABLE `leadchnlmsmt` (
  `ID` int(11) NOT NULL,
  `MSMTID` int(11) NOT NULL,
  `chamber` varchar(50) DEFAULT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `lead_channel_status` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  `dtm` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEADCHNLMS81875` (`MSMTID`),
  CONSTRAINT `FKLEADCHNLMS81875` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leadchnlmsmt`
--

/*!40000 ALTER TABLE `leadchnlmsmt` DISABLE KEYS */;
INSERT INTO `leadchnlmsmt` (`ID`,`MSMTID`,`chamber`,`dtm_start`,`dtm_end`,`lead_channel_status`,`subID`,`dtm`) VALUES 
 (1,1,'LV','20090925100000','20091025100000','NULL',NULL,'20091025100000'),
 (2,1,'RV','20090925000000','20091025100000','CheckLead',NULL,'20091025100000'),
 (3,1,'RA','20090925000000','20091025100000','NULL',NULL,'20091025100000');
/*!40000 ALTER TABLE `leadchnlmsmt` ENABLE KEYS */;


--
-- Definition of table `leadchnlset`
--

DROP TABLE IF EXISTS `leadchnlset`;
CREATE TABLE `leadchnlset` (
  `ID` int(11) NOT NULL,
  `chamber` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  `SETID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEADCHNLSE526615` (`SETID`),
  CONSTRAINT `FKLEADCHNLSE526615` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leadchnlset`
--

/*!40000 ALTER TABLE `leadchnlset` DISABLE KEYS */;
INSERT INTO `leadchnlset` (`ID`,`chamber`,`subID`,`SETID`) VALUES 
 (1,'RV',NULL,1),
 (2,'LV',NULL,1),
 (3,'RA',NULL,1);
/*!40000 ALTER TABLE `leadchnlset` ENABLE KEYS */;


--
-- Definition of table `leadhvchannelmsmt`
--

DROP TABLE IF EXISTS `leadhvchannelmsmt`;
CREATE TABLE `leadhvchannelmsmt` (
  `ID` int(11) NOT NULL,
  `MSMTID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `impedance` varchar(50) DEFAULT NULL,
  `measurement_type` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  `dtm` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEADHVCHAN314419` (`MSMTID`),
  CONSTRAINT `FKLEADHVCHAN314419` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leadhvchannelmsmt`
--

/*!40000 ALTER TABLE `leadhvchannelmsmt` DISABLE KEYS */;
INSERT INTO `leadhvchannelmsmt` (`ID`,`MSMTID`,`dtm_start`,`dtm_end`,`impedance`,`measurement_type`,`status`,`subID`,`dtm`) VALUES 
 (1,1,'20090925100000','20091025100000','330','LowVoltage','CheckLead',0,'20091025100000');
/*!40000 ALTER TABLE `leadhvchannelmsmt` ENABLE KEYS */;


--
-- Definition of table `leadhvchannelset`
--

DROP TABLE IF EXISTS `leadhvchannelset`;
CREATE TABLE `leadhvchannelset` (
  `ID` int(11) NOT NULL,
  `subID` int(11) DEFAULT NULL,
  `SETID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEADHVCHAN935935` (`SETID`),
  CONSTRAINT `FKLEADHVCHAN935935` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leadhvchannelset`
--

/*!40000 ALTER TABLE `leadhvchannelset` DISABLE KEYS */;
INSERT INTO `leadhvchannelset` (`ID`,`subID`,`SETID`) VALUES 
 (1,NULL,1);
/*!40000 ALTER TABLE `leadhvchannelset` ENABLE KEYS */;


--
-- Definition of table `magnet`
--

DROP TABLE IF EXISTS `magnet`;
CREATE TABLE `magnet` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `resp` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKMAGNET428217` (`SETID`),
  CONSTRAINT `FKMAGNET428217` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `magnet`
--

/*!40000 ALTER TABLE `magnet` DISABLE KEYS */;
/*!40000 ALTER TABLE `magnet` ENABLE KEYS */;


--
-- Definition of table `medicalcareplantemplate`
--

DROP TABLE IF EXISTS `medicalcareplantemplate`;
CREATE TABLE `medicalcareplantemplate` (
  `ID` int(11) NOT NULL,
  `Content` mediumtext,
  `Identifier` varchar(32) DEFAULT NULL,
  `Approved` tinyint(1) DEFAULT NULL,
  `ICD10Code` varchar(20) DEFAULT NULL,
  `CreationDate` datetime DEFAULT NULL,
  `Name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `medicalcareplantemplate`
--

/*!40000 ALTER TABLE `medicalcareplantemplate` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicalcareplantemplate` ENABLE KEYS */;


--
-- Definition of table `medication`
--

DROP TABLE IF EXISTS `medication`;
CREATE TABLE `medication` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `effectiveTime` varchar(255) DEFAULT NULL,
  `routeCode` varchar(255) DEFAULT NULL,
  `approachSiteCode` varchar(255) DEFAULT NULL,
  `doseQuantity` varchar(255) DEFAULT NULL,
  `drugCode` varchar(255) DEFAULT NULL,
  `drugCodeSystem` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKMedication554854` (`EHRPHRDataID`),
  CONSTRAINT `FKMedication554854` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `medication`
--

/*!40000 ALTER TABLE `medication` DISABLE KEYS */;
INSERT INTO `medication` (`ID`,`careProvisionCode`,`text`,`effectiveTime`,`routeCode`,`approachSiteCode`,`doseQuantity`,`drugCode`,`drugCodeSystem`,`EHRPHRDataID`) VALUES 
 (1,'MEDLIST','Thrombo ass 100 mg Aspirin','200310101010','IAINJ','LF','20','C0004057','UMLS',1),
 (2,'MEDLIST','Nexium 20 mg','200310101010','IAINJ','LF','20 mg','C0939400','UMLS',55),
 (3,'MEDLIST','Plavix 75 mg','200310101010',NULL,NULL,NULL,'C0633084','UMLS',56),
 (4,'MEDLIST','Nebivolol','200310101010',NULL,NULL,NULL,NULL,'UMLS',57),
 (5,'MEDLIST','Simvastatin 20 mg','200310101010',NULL,NULL,NULL,NULL,'UMLS',58),
 (6,'MEDLIST','Drug eluting stent','200310101010',NULL,NULL,NULL,NULL,'UMLS',59);
/*!40000 ALTER TABLE `medication` ENABLE KEYS */;


--
-- Definition of table `msmt`
--

DROP TABLE IF EXISTS `msmt`;
CREATE TABLE `msmt` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKMSMT647184` (`SystemID`),
  CONSTRAINT `FKMSMT647184` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `msmt`
--

/*!40000 ALTER TABLE `msmt` DISABLE KEYS */;
INSERT INTO `msmt` (`ID`,`SystemID`,`dtm_start`,`dtm_end`) VALUES 
 (1,1,NULL,NULL);
/*!40000 ALTER TABLE `msmt` ENABLE KEYS */;


--
-- Definition of table `observation`
--

DROP TABLE IF EXISTS `observation`;
CREATE TABLE `observation` (
  `ID` int(11) NOT NULL,
  `universalServiceIdentifier` varchar(255) DEFAULT NULL,
  `observationDateTime` varchar(255) DEFAULT NULL,
  `observationEndDataTime` varchar(255) DEFAULT NULL,
  `resultRptStatusChangeDateTime` varchar(255) DEFAULT NULL,
  `resultStatus` varchar(255) DEFAULT NULL,
  `attendingDoctorID` varchar(255) DEFAULT NULL,
  `visitID` varchar(255) DEFAULT NULL,
  `patientClass` varchar(255) DEFAULT NULL,
  `SystemID` int(11) NOT NULL,
  `base64String` mediumtext,
  `abnormalFlags` varchar(10) DEFAULT NULL,
  `equipmentInstanceIdentifier` varchar(100) DEFAULT NULL,
  `fillerOrderNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKObservatio486987` (`SystemID`),
  CONSTRAINT `FKObservatio486987` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `observation`
--

/*!40000 ALTER TABLE `observation` DISABLE KEYS */;
INSERT INTO `observation` (`ID`,`universalServiceIdentifier`,`observationDateTime`,`observationEndDataTime`,`resultRptStatusChangeDateTime`,`resultStatus`,`attendingDoctorID`,`visitID`,`patientClass`,`SystemID`,`base64String`,`abnormalFlags`,`equipmentInstanceIdentifier`,`fillerOrderNumber`) VALUES 
 (1,'REMOTE FOLLOW-UP','20070422162958','20070422163006',NULL,'F','MWELBY','12345','R',1,'JVBERi0xLjMKJeLjz9MKCjEgMCBvYmoKPDwgL1R5cGUgL0NhdGFsb2cKL091dGxpbmVzIDIgMCBS Ci9QYWdlcyAzIDAgUgovT3BlbkFjdGlvbiA4IDAgUiA+PgplbmRvYmoKMiAwIG9iago8PCAvVHlw ZSAvT3V0bGluZXMgL0NvdW50IDAgPj4KZW5kb2JqCjMgMCBvYmoKPDwgL1R5cGUgL1BhZ2VzCi9L aWRzIFs2IDAgUgpdCi9Db3VudCAxCi9SZXNvdXJjZXMgPDwKL1Byb2NTZXQgNCAwIFIKL0ZvbnQg PDwgCi9GMSAxMSAwIFIKL0YyIDEyIDAgUgovRjMgMTcgMCBSID4+Ci9YT2JqZWN0IDw8IAovSTEg OSAwIFIgPj4KPj4KL01lZGlhQm94IFswLjAwMCAwLjAwMCA1OTUuMjgwIDg0MS44OTBdCiA+Pgpl bmRvYmoKNCAwIG9iagpbL1BERiAvVGV4dCAvSW1hZ2VDIF0KZW5kb2JqCjUgMCBvYmoKPDwKL0Ny ZWF0b3IgKERPTVBERiBDb252ZXJ0ZXIpCi9DcmVhdGlvbkRhdGUgKDIwMTAtMDItMTUpCj4+CmVu ZG9iago2IDAgb2JqCjw8IC9UeXBlIC9QYWdlCi9QYXJlbnQgMyAwIFIKL0Fubm90cyBbIDEzIDAg UiAxNSAwIFIgXQovQ29udGVudHMgNyAwIFIKPj4KZW5kb2JqCjcgMCBvYmoKPDwgL0ZpbHRlciAv RmxhdGVEZWNvZGUKL0xlbmd0aCA5MTcgPj4Kc3RyZWFtCnicnVbZbttGFH3XV9y3xoA8nn1IFQgg 23HSBC1cS4Uf6jyMpZE5KReXS4wG+Zi+9i97SYuLRSl2AgMUfMR77pm7nNGEEUopDJ/53YTBA3B4 DxQ+wZ/wET/XE8abb2UgiA4ZKMMIDygIqQkLQ8gdbCZ/T0LdvFX/iYDImvQxzoSMyJDCKpmc/MLg PJv8PqGP7w6emPt02YUYQxgPYLmGkwvWoLDcALy6rG5jX0RuDVkKR7D8BG+WdVwgiaFBE8cZfYzj g7hfbVHYVVQVriwLmMdfIucTl/9UwLkvnC0cXDn8zFcRnLm0dPmAWwQBCbg8LApuXrWvD0/EBucS WB2m9GGOqCzvZycniV3nK5LcRSSy+Webr4lbV4fJr94iqLBlFFvWtkuECstf51LESAYJKCWJYLRD Ylgc7IBSgij9jRbcHD132LaJIiShoi1D2BK8yxLXU+yqZzhcqg4OSIiSExCaGCU64FvaRT2C4mBi eF13fpPlVQI2XcPiev7bDJaRg8scu5+WDXpRlRWOdLaBxcoj6Dd+BdfuFs6yJKlSX3pX9PI1ryX0 z0MrJLYl4UToEJQOmxXaiq8XaO+ZxiB2vCuvaLiwvbiYNVuLxIjwLcK3yI6AGDBlR8RGROy7iHYF vIxpjAw1tUw7IvcI2Keon0IdojUg3AyDAC7bafiuURjYQcurKbqaGfM+PzUDEgyTXLUkOz63sqVH mzu3pZv9OwzGEwvFm2gh5XhFOaVmnEyhL+hW8fD1s9jmf8GyOfIHn2ZF5EuLA3zTEN0ckadrUzzY dAYl1up+UKtNV6uiL8ADFmDVF4DsqaMyuJ+KjVWd5t5t4NRnPsXcybOOodCwtJY4MvV9I2QH1I6B +UJc0EAezvczBDNgWhwzvN+GOhUJ0LmVwn7TPcV+erW8danLbQzvsuIeqxhP4dqmdzBPbqvYlln+ D5xZLNPjJQOLypcODGfnU8wDl9iHxKawKHPnyimcZkWZpdNh1TjHSxjNXeGCGLXHnp/KoZwxOYU/ FvMn88OIxvlRDC2e8THH0sXuPspSNwPNzLHh+liEgYGvcGFXhU98PPhGMsogy7v/jWHBMBlOnanr TrF+Wo2T/QfvbVpZrAybAqdo8fM4hit/F6H++lbOP+N1/6OOK+u21z9aXui47W8dnKE6rHeyFul9 q6XuHKgHeiOTQbhLtEVeSrQr4GVMY2SgqWPaEblHwB5F/wMtHGbMCmVuZHN0cmVhbQplbmRvYmoK CjggMCBvYmoKWzYgMCBSIC9GaXRdCmVuZG9iagoKOSAwIG9iago8PAovVHlwZSAvWE9iamVjdAov U3VidHlwZSAvSW1hZ2UKL1dpZHRoIDIwMAovSGVpZ2h0IDgwCi9GaWx0ZXIgL0ZsYXRlRGVjb2Rl Ci9EZWNvZGVQYXJtcyA8PCAvUHJlZGljdG9yIDE1IC9Db2xvcnMgMSAvQ29sdW1ucyAyMDAgL0Jp dHNQZXJDb21wb25lbnQgOD4+Ci9Db2xvclNwYWNlICBbIC9JbmRleGVkIC9EZXZpY2VSR0IgMzIg MTAgMCBSIF0KL0JpdHNQZXJDb21wb25lbnQgOAovTGVuZ3RoIDIwMzEgPj4Kc3RyZWFtCmje7Zlp l6soEIZNOp2OccGoGBNc+P+/cqhiK1zSduaeM33u6Ic0IhT1SBXg25H8S65oB9lBdpAdZAf5/SB1 fXflZ133r1rW7xh9v48DqaPo0xSvUXQxxbsvSnk5RFF0OD/xwUmVo49M+j7e8/snPIw+YbBLFLkB anIrT9FpYrSO3FVLX1YeBDehI0sg0U2/6oP3/qw62BafxtShRkB9WfijL8rMjZp9C0KNbgWhfZZB Dr0ewYE8jTemwbmXz8vhhG3Ayu1kpwF9N2/opgxl2PJ7kMCournW+uohNmv1GuHPc3JD+yyDRGfr kwG5RMdzdLRl3bYHf22Lu/PqfMTeODkHXX3Pvg2twGhNw5MOGd4EfZZzBAz1B/ir3VTl7G6tq/4+ wUggmc7Pq5nQzM1hOP4ayJ1a2Qhyf7FqgZVTdOw/lT8WJAPfTsZnSIvzrXf5crx6c2fllKK+6vJh 4oyOlusSSGDUh1b/CiToswyi0vwEKW9BjtEXvuEnyeFPfN39B5SPX0+bSjcgOJLViIxPUniW7NRo TRuugwR9lkFgEYX3b0BqjeCC//l1BAvazwzXjsPNpJLGyX4MQo1uBQkdWQSB1ah3ICrSLur6MMGP Jq7KxNXc3MzirILqBA0PaHoeWi/3EWJ0Y47MHVkAueNeokGe4S5krv5I3oSO+yx456+TPXOZerAT 7Yz+BGTiyAxE1tKBqFd7wuuIkdN/6Xn5gP7ZzW4ZNcTeUTfUvh3s8vu8zEGekfH/hryB0Y0gQZ9V EOlA3NoFjzKMuutT9nh+gbVaodwx6m40pp/BhniegcB2+wVmDhiw1Gi4Ia6DBH02gFx8agB777L2 qLbdD3tzpcFu2F2owcxMQeAA5B4GRsMjyipI2Od7kP7oYzjTUXFGH85629Pr7w2X9czvJwivD436 VDcFkf3ZnyhDo9tAJo68d4y/k8N5D+ee987m4Rn/vv3E/6LP/oW4g+wgO8gO8mtABs6HV/f2ann7 J1zgXJifPw0i4li8urcXi9nWYco4HteexTE3P/8VSMWqrcOwuJAvQRhr/zuQH1wsbl+D/MEcGThj rBqs4yox9NXifVeyQtOMjWomXI7AT4PvU7gmsi1YiZ4LzmVXVjLHyIIWDQkxaNZpEJ0jQ8WYyUdn QgpVyXQ3P/bMlgPpYn21BkSYe5UHqtgk5pl8YClubI6onxwqqtZ2lx1WYDDxOO4S1QxvKqxO7OyO TPfwOfKIrW1iotGVSac4E1s7FljKh4UZSXPOVU4mI52RHFwDJsZV1wRtsYcoMNgMSJxUFYyQYndl KY/TVnD9olV1nFYSAAdVI1qWkgUg5VUae5A0LsSjjIfAxBAXnDN4oapH/hBV0sI7SZSthKw2HgSn qTWOC5cdHH8LPbBQP+lIJgNBOuwH9dikxRrFoN4JN5NnjI12HIlcTJXH3IPE8UM3oCZ0B2V5UGNV +vmgrdLkJSAPzpsODLrnKipK3x7/JNovFQSUxmYsNin0CjVCmZNMVqOnjY+FRjsrOzojSYV11IQc WpWorX6LcfnQfRO0kXvrPkcSkxMeRIVRIScgsbvEGghzTTiAeNcxi1hn90F4F+E+gj6kDxmYaP2A MHsqprCvy+ApSBInrdBhaRxX3fJxDsLMajasg6SmifDe6jlplCfJ4EBG89rdhji2kMQPakJNmEqM R6l9eJSKtcKJtmvqBETo+JQexHEEIDkGG9nZ5yBVnPrjRwCiZ5m7ERvThO7sIxgkJgyvTwe19kFk Dyv7iNArZ+NBSlzxpiCtaQeMKyAqFzCz0i4EETlYSV1Yq/WqGcfGr1pj2mJaM2rCBCeuk4zrhQD6 ggND3s5XLZVoJaxyFqQJ9hEHgosmSxFnBQSGSmBzKUOQwvQc/LtD+w6kMf1aagKWiIrDIg1RFjOG diGboJiP82QHiFQ4EL4CIrnNyFUQ+UhNUgYgo+9pSKBZQXKkdf2ICSwxXLUELgLlaN3VxdlZaxDd tmNN933DQYgtPTsxrPbzRdJqFGKcF/cvxB1kB9lBdpC/DORfizu/BeRtPeH9N/DLQN5XVP4+ECvc hEoL0V9otZeOUE8dK2YbF63xR9VNNbe2sLIO0X2gv9WaBo7fbUM4GvFsC4gVbgKlxesvQTWRjvCL LMczrhGKQFFQX3Go55T0gKgVnlSrCk4YolqTsN+0wWjOs80gKNwESovXX0IBxktHMLj6lGFIp79o OgABpSc28oKeW3UaL6BTg9JFKRS+6e+0Jjibpwy+6ulozrPNIPjpGSgtTn+ZCDBeOkJHSq0Q4Rdl 22JopfpbjtOPXhTvKvyIwzlOplqTy5FgNCopbQPhM6XF6S8TAcZLRzAYM2Pzac7SqtQHR2dmqoKq 8KttyQm+aQWgIIOUE6XF6S9hNZGO7Md+qHQvgJCy8JrSCkgwGp8rDd+AuJkhSovRX8JqIh05ACvD rINUBKQ0xtZB/GgzJWYbyFxpAf0lqKbSkZ8Ju7CMyyAFpjY+HmPyT4ZFkMCJN0ECpcXrL7SaSkce RBkoBrXw5OMiiGqXC7V/wIqglaaxLBdACjmOoRPvghClhegvgQBDpCOSG7kJ68ciiPmnAkYYpF7O EsQJQXKzj9DR3gWhSgvRX2g1kY5okqPck4vl0DK6TooL6Vg6GTgEwWWkC0f7IQi9VkQXUl6RjoQY tupIa03dGBO5Z/+w2kF2kB1kB9lBdpD/E8g/QZSt+wplbmRzdHJlYW0KZW5kb2JqCgoxMCAwIG9i ago8PCAvRmlsdGVyIC9GbGF0ZURlY29kZQovTGVuZ3RoIDExMCA+PgpzdHJlYW0KeJwBYwCc/2MG EW0WIHclL4A1PopETZRUXJ5ka6hzerGCiJaWlrqSlp2dnaOjo8ShpaqqqrCwsLe3t86xtL6+vsTE xNjBw8rKytHR0eLQ0tfX197e3uvg4eXl5evr6/Xv8PLy8vj4+P///6g8Qs0KZW5kc3RyZWFtCmVu ZG9iagoKMTEgMCBvYmoKPDwgL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUxCi9OYW1lIC9GMQov QmFzZUZvbnQgL0hlbHZldGljYQovRW5jb2RpbmcgL1dpbkFuc2lFbmNvZGluZwo+PgplbmRvYmoK MTIgMCBvYmoKPDwgL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUxCi9OYW1lIC9GMgovQmFzZUZv bnQgL0hlbHZldGljYS1Cb2xkT2JsaXF1ZQovRW5jb2RpbmcgL1dpbkFuc2lFbmNvZGluZwo+Pgpl bmRvYmoKMTMgMCBvYmoKPDwgL1R5cGUgL0Fubm90Ci9TdWJ0eXBlIC9MaW5rCi9BIDE0IDAgUgov Qm9yZGVyIFswIDAgMF0KL0ggL0kKL1JlY3QgWyAzOTYuMTU2MCA3NzcuMTI4NCA1NTMuNTYwMCA3 OTEuMDAwNCBdCj4+CmVuZG9iagoxNCAwIG9iago8PCAvVHlwZSAvQWN0aW9uCi9TIC9VUkkKL1VS SSAoaHR0cDovL21hZHJjLm1naC5oYXJ2YXJkLmVkdSkKPj4KZW5kb2JqCjE1IDAgb2JqCjw8IC9U eXBlIC9Bbm5vdAovU3VidHlwZSAvTGluawovQSAxNiAwIFIKL0JvcmRlciBbMCAwIDBdCi9IIC9J Ci9SZWN0IFsgMTIuMDAwMCA3MzkuOTUwMCAzNi4wMDMwIDc1MC4zNTQwIF0KPj4KZW5kb2JqCjE2 IDAgb2JqCjw8IC9UeXBlIC9BY3Rpb24KL1MgL1VSSQovVVJJIChodHRwOi8vbWFkcmMubWdoLmhh cnZhcmQuZWR1LykKPj4KZW5kb2JqCjE3IDAgb2JqCjw8IC9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9U eXBlMQovTmFtZSAvRjMKL0Jhc2VGb250IC9IZWx2ZXRpY2EtQm9sZAovRW5jb2RpbmcgL1dpbkFu c2lFbmNvZGluZwo+PgplbmRvYmoKeHJlZgowIDE4CjAwMDAwMDAwMDAgNjU1MzUgZiAKMDAwMDAw MDAxNSAwMDAwMCBuIAowMDAwMDAwMDk4IDAwMDAwIG4gCjAwMDAwMDAxNDQgMDAwMDAgbiAKMDAw MDAwMDM0NyAwMDAwMCBuIAowMDAwMDAwMzg0IDAwMDAwIG4gCjAwMDAwMDA0NjAgMDAwMDAgbiAK MDAwMDAwMDU0OSAwMDAwMCBuIAowMDAwMDAxNTM5IDAwMDAwIG4gCjAwMDAwMDE1NjggMDAwMDAg biAKMDAwMDAwMzg2OCAwMDAwMCBuIAowMDAwMDA0MDUyIDAwMDAwIG4gCjAwMDAwMDQxNjAgMDAw MDAgbiAKMDAwMDAwNDI4MCAwMDAwMCBuIAowMDAwMDA0NDA4IDAwMDAwIG4gCjAwMDAwMDQ0ODgg MDAwMDAgbiAKMDAwMDAwNDYxNCAwMDAwMCBuIAowMDAwMDA0Njk1IDAwMDAwIG4gCnRyYWlsZXIK PDwKL1NpemUgMTgKL1Jvb3QgMSAwIFIKL0luZm8gNSAwIFIKPj4Kc3RhcnR4cmVmCjQ4MDgKJSVF T0YK',NULL,NULL,'123456');
/*!40000 ALTER TABLE `observation` ENABLE KEYS */;


--
-- Definition of table `organization`
--

DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Identifier` varchar(50) DEFAULT NULL,
  `PersonID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKOrganizati796933` (`PersonID`),
  CONSTRAINT `FKOrganizati796933` FOREIGN KEY (`PersonID`) REFERENCES `person` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `organization`
--

/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;


--
-- Definition of table `pacing`
--

DROP TABLE IF EXISTS `pacing`;
CREATE TABLE `pacing` (
  `ID` int(11) NOT NULL,
  `amplitude` varchar(50) DEFAULT NULL,
  `pulsewidth` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  `anode_location_1` varchar(50) DEFAULT NULL,
  `anode_location_2` varchar(50) DEFAULT NULL,
  `anode_location_3` varchar(50) DEFAULT NULL,
  `anode_electrode_1` varchar(50) DEFAULT NULL,
  `anode_electrode_2` varchar(50) DEFAULT NULL,
  `anode_electrode_3` varchar(50) DEFAULT NULL,
  `cathode_location_1` varchar(50) DEFAULT NULL,
  `cathode_location_2` varchar(50) DEFAULT NULL,
  `cathode_location_3` varchar(50) DEFAULT NULL,
  `cathode_electrode_1` varchar(50) DEFAULT NULL,
  `cathode_electrode_2` varchar(50) DEFAULT NULL,
  `cathode_electrode_3` varchar(50) DEFAULT NULL,
  `capture_mode` varchar(50) DEFAULT NULL,
  `LEADCHNLSETID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPACING621114` (`LEADCHNLSETID`),
  CONSTRAINT `FKPACING621114` FOREIGN KEY (`LEADCHNLSETID`) REFERENCES `leadchnlset` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pacing`
--

/*!40000 ALTER TABLE `pacing` DISABLE KEYS */;
INSERT INTO `pacing` (`ID`,`amplitude`,`pulsewidth`,`polarity`,`anode_location_1`,`anode_location_2`,`anode_location_3`,`anode_electrode_1`,`anode_electrode_2`,`anode_electrode_3`,`cathode_location_1`,`cathode_location_2`,`cathode_location_3`,`cathode_electrode_1`,`cathode_electrode_2`,`cathode_electrode_3`,`capture_mode`,`LEADCHNLSETID`) VALUES 
 (1,'2.0','0.5','BI','RV',NULL,NULL,'Tip',NULL,NULL,'RV',NULL,NULL,'Ring',NULL,NULL,'AdaptiveCapture',1),
 (2,'2.0','0.5','BI','LV',NULL,NULL,'Tip',NULL,NULL,'RV',NULL,NULL,'Ring',NULL,NULL,'AdaptiveCapture',2),
 (3,'1.8','0.5','UNI','RA',NULL,NULL,'Ring',NULL,NULL,'NA',NULL,NULL,'Can',NULL,NULL,'FixedPacing',3);
/*!40000 ALTER TABLE `pacing` ENABLE KEYS */;


--
-- Definition of table `pacingthreshold`
--

DROP TABLE IF EXISTS `pacingthreshold`;
CREATE TABLE `pacingthreshold` (
  `ID` int(11) NOT NULL,
  `LEADCHNLMSMTID` int(11) NOT NULL,
  `amplitude` varchar(50) DEFAULT NULL,
  `pulsewidth` varchar(50) DEFAULT NULL,
  `measurement_method` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPACINGTHRE209317` (`LEADCHNLMSMTID`),
  CONSTRAINT `FKPACINGTHRE209317` FOREIGN KEY (`LEADCHNLMSMTID`) REFERENCES `leadchnlmsmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pacingthreshold`
--

/*!40000 ALTER TABLE `pacingthreshold` DISABLE KEYS */;
INSERT INTO `pacingthreshold` (`ID`,`LEADCHNLMSMTID`,`amplitude`,`pulsewidth`,`measurement_method`,`polarity`) VALUES 
 (1,1,'0.6','0.5','ProgrammerAutomatic','BI'),
 (2,2,'0.6','0.5','DeviceAutomatic','BI'),
 (3,3,'0.7','0.5','ProgrammerManual','BI');
/*!40000 ALTER TABLE `pacingthreshold` ENABLE KEYS */;


--
-- Definition of table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `ID` int(11) NOT NULL,
  `assigningAuthority` varchar(255) DEFAULT NULL,
  `identifierTypeCode` varchar(255) DEFAULT NULL,
  `givenName` varchar(255) DEFAULT NULL,
  `familyName` varchar(255) DEFAULT NULL,
  `secondName` varchar(255) DEFAULT NULL,
  `dateTimeOfBirth` varchar(255) DEFAULT NULL,
  `administrativeSex` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `postalCode` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `patientIdentifier` varchar(255) DEFAULT NULL,
  `citizenshipNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `patient`
--

/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` (`ID`,`assigningAuthority`,`identifierTypeCode`,`givenName`,`familyName`,`secondName`,`dateTimeOfBirth`,`administrativeSex`,`street`,`city`,`postalCode`,`country`,`patientIdentifier`,`citizenshipNumber`) VALUES 
 (1,'BSC','1234123412341','Andreas','Schmidt',NULL,'19530104','M',NULL,NULL,'12345-1234',NULL,'1234123412341','149202063490');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;


--
-- Definition of table `patienthealthcareactorassignment`
--

DROP TABLE IF EXISTS `patienthealthcareactorassignment`;
CREATE TABLE `patienthealthcareactorassignment` (
  `ID` int(11) NOT NULL,
  `PatientIdentifier` varchar(32) DEFAULT NULL,
  `HealthcareActorIdentifier` varchar(32) DEFAULT NULL,
  `AssignmentDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `patienthealthcareactorassignment`
--

/*!40000 ALTER TABLE `patienthealthcareactorassignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `patienthealthcareactorassignment` ENABLE KEYS */;


--
-- Definition of table `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `ID` int(11) NOT NULL,
  `Identifier` varchar(50) DEFAULT NULL,
  `AlternateIdentifier` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Surname` varchar(50) DEFAULT NULL,
  `MiddleName` varchar(50) DEFAULT NULL,
  `Title` varchar(50) DEFAULT NULL,
  `Role` varchar(50) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `person`
--

/*!40000 ALTER TABLE `person` DISABLE KEYS */;
/*!40000 ALTER TABLE `person` ENABLE KEYS */;


--
-- Definition of table `personalizedmedicalcareplan`
--

DROP TABLE IF EXISTS `personalizedmedicalcareplan`;
CREATE TABLE `personalizedmedicalcareplan` (
  `ID` int(11) NOT NULL,
  `Content` mediumtext,
  `Identifier` varchar(32) DEFAULT NULL,
  `CreationDate` datetime DEFAULT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `PatientIdentifier` varchar(32) DEFAULT NULL,
  `MedicalCareplanTemplateID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPersonaliz746964` (`MedicalCareplanTemplateID`),
  CONSTRAINT `FKPersonaliz746964` FOREIGN KEY (`MedicalCareplanTemplateID`) REFERENCES `medicalcareplantemplate` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personalizedmedicalcareplan`
--

/*!40000 ALTER TABLE `personalizedmedicalcareplan` DISABLE KEYS */;
/*!40000 ALTER TABLE `personalizedmedicalcareplan` ENABLE KEYS */;


--
-- Definition of table `personalizedmedicalcareplaninstance`
--

DROP TABLE IF EXISTS `personalizedmedicalcareplaninstance`;
CREATE TABLE `personalizedmedicalcareplaninstance` (
  `ID` int(11) NOT NULL,
  `Content` mediumtext,
  `Identifier` varchar(32) DEFAULT NULL,
  `InstantiationDate` datetime DEFAULT NULL,
  `PersonalizedMedicalCareplanID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPersonaliz173738` (`PersonalizedMedicalCareplanID`),
  CONSTRAINT `FKPersonaliz173738` FOREIGN KEY (`PersonalizedMedicalCareplanID`) REFERENCES `personalizedmedicalcareplan` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personalizedmedicalcareplaninstance`
--

/*!40000 ALTER TABLE `personalizedmedicalcareplaninstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `personalizedmedicalcareplaninstance` ENABLE KEYS */;


--
-- Definition of table `pg`
--

DROP TABLE IF EXISTS `pg`;
CREATE TABLE `pg` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `model` varchar(50) DEFAULT NULL,
  `serial` varchar(50) DEFAULT NULL,
  `mfg` varchar(50) DEFAULT NULL,
  `implant_dt` varchar(50) DEFAULT NULL,
  `implanter` varchar(50) DEFAULT NULL,
  `implanter_contact_info` varchar(50) DEFAULT NULL,
  `implanting_facility` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPG273592` (`SystemID`),
  CONSTRAINT `FKPG273592` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pg`
--

/*!40000 ALTER TABLE `pg` DISABLE KEYS */;
INSERT INTO `pg` (`ID`,`SystemID`,`type`,`model`,`serial`,`mfg`,`implant_dt`,`implanter`,`implanter_contact_info`,`implanting_facility`) VALUES 
 (1,1,'CRT_D','Device Model Name','5867463524','BIO','20090501000000','Dr. Miller','Phone: +1 12 345 6789','Main Heart Center New York');
/*!40000 ALTER TABLE `pg` ENABLE KEYS */;


--
-- Definition of table `problem`
--

DROP TABLE IF EXISTS `problem`;
CREATE TABLE `problem` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `problemCode` varchar(255) DEFAULT NULL,
  `problemText` varchar(255) DEFAULT NULL,
  `effectiveTimeLow` varchar(255) DEFAULT NULL,
  `effectiveTimeHigh` varchar(255) DEFAULT NULL,
  `problemValue` varchar(255) DEFAULT NULL,
  `problemValueCodeSystem` varchar(255) DEFAULT NULL,
  `problemValueOriginalText` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  `severity` varchar(1) NOT NULL DEFAULT 'L',
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKProblem94819` (`EHRPHRDataID`),
  CONSTRAINT `FKProblem94819` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `problem`
--

/*!40000 ALTER TABLE `problem` DISABLE KEYS */;
INSERT INTO `problem` (`ID`,`careProvisionCode`,`problemCode`,`problemText`,`effectiveTimeLow`,`effectiveTimeHigh`,`problemValue`,`problemValueCodeSystem`,`problemValueOriginalText`,`EHRPHRDataID`,`severity`) VALUES 
 (4,'MEDCCAT','409586006','','201011031010','201011031011','TODO','UMLS','',5,'L'),
 (6,'MEDCCAT','409586006','','201010101010','201010101010','C0018799','UMLS','',7,'L'),
 (10,'MEDCCAT','409586006','','201010101010','201010101010','C0560180','UMLS','Sudden Death',11,'L'),
 (13,'MEDCCAT','409586006','','201010101010','201010101010','C0264897','UMLS','',14,'L'),
 (15,'MEDCCAT','409586006','','201011031010','201011031011','C1956346','UMLS','',16,'L'),
 (16,'MEDCCAT','409586006','','201010101010','201010101010','C0031046','UMLS','',17,'L'),
 (18,'MEDCCAT','409586006','','201010101010','201010101010','C0020538','UMLS','',19,'L'),
 (20,'MEDCCAT','409586006','','201010101010','201010101010','C0030920','UMLS','',21,'L'),
 (21,'MEDCCAT','409586006','','201010101010','201010101010','C0149721','UMLS','',22,'L'),
 (22,'MEDCCAT','409586006','','201010101010','201010101010','C0232201','UMLS','',23,'L'),
 (24,'MEDCCAT','409586006','','201011031010','201011031011','TODO','UMLS','',25,'L'),
 (26,'MEDCCAT','409586006','','201011031010','201011031011','TODO','UMLS','',27,'L'),
 (27,'MEDCCAT','409586006','','201010101010','201010101010','C1956346','UMLS','',28,'L'),
 (29,'MEDCCAT','409586006','','201011031010','201011031011','C0028263','UMLS','',30,'L'),
 (30,'MEDCCAT','409586006','','201011031010','201011031011','C0235480','UMLS','',31,'L'),
 (31,'MEDCCAT','409586006','','201011031010','201011031011','C0232201','UMLS','',32,'L'),
 (33,'MEDCCAT','409586006','','201010101010','201010101010','C0018801','UMLS','',34,'L'),
 (38,'MEDCCAT','409586006','','201010101010','201010101010','C1868885','UMLS','',39,'L'),
 (40,'MEDCCAT','409586006','Complaint','201010101010','201010101010','C0038454','UMLS','Stroke',37,'L');
/*!40000 ALTER TABLE `problem` ENABLE KEYS */;


--
-- Definition of table `procedure`
--

DROP TABLE IF EXISTS `procedure`;
CREATE TABLE `procedure` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `procedureCode` varchar(255) DEFAULT NULL,
  `procedureCodeSystem` varchar(255) DEFAULT NULL,
  `procedureText` varchar(255) DEFAULT NULL,
  `statusCode` varchar(255) DEFAULT NULL,
  `effectiveTimeLow` varchar(255) DEFAULT NULL,
  `effectiveTimeHigh` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKProcedure747160` (`EHRPHRDataID`),
  CONSTRAINT `FKProcedure747160` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `procedure`
--

/*!40000 ALTER TABLE `procedure` DISABLE KEYS */;
/*!40000 ALTER TABLE `procedure` ENABLE KEYS */;


--
-- Definition of table `sensingmsmt`
--

DROP TABLE IF EXISTS `sensingmsmt`;
CREATE TABLE `sensingmsmt` (
  `ID` int(11) NOT NULL,
  `LEADCHNLMSMTID` int(11) NOT NULL,
  `intr_ampl_min` varchar(50) DEFAULT NULL,
  `intr_ampl_max` varchar(50) DEFAULT NULL,
  `intr_ampl_mean` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  `intr_ampl` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSENSINGMSM958745` (`LEADCHNLMSMTID`),
  CONSTRAINT `FKSENSINGMSM958745` FOREIGN KEY (`LEADCHNLMSMTID`) REFERENCES `leadchnlmsmt` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sensingmsmt`
--

/*!40000 ALTER TABLE `sensingmsmt` DISABLE KEYS */;
INSERT INTO `sensingmsmt` (`ID`,`LEADCHNLMSMTID`,`intr_ampl_min`,`intr_ampl_max`,`intr_ampl_mean`,`polarity`,`intr_ampl`) VALUES 
 (1,1,'2.2','3.8','3.5','BI','3.5'),
 (2,2,'4.0','4.9','4.7','BI','4.7'),
 (3,3,'2.2','2.6','2.5','BI','2.5');
/*!40000 ALTER TABLE `sensingmsmt` ENABLE KEYS */;


--
-- Definition of table `sensingset`
--

DROP TABLE IF EXISTS `sensingset`;
CREATE TABLE `sensingset` (
  `ID` int(11) NOT NULL,
  `sensitivity` varchar(50) DEFAULT NULL,
  `anode_location_1` varchar(50) DEFAULT NULL,
  `anode_location_2` varchar(50) DEFAULT NULL,
  `anode_location_3` varchar(50) DEFAULT NULL,
  `anode_electrode_1` varchar(50) DEFAULT NULL,
  `anode_electrode_2` varchar(50) DEFAULT NULL,
  `anode_electrode_3` varchar(50) DEFAULT NULL,
  `cathode_location_1` varchar(50) DEFAULT NULL,
  `cathode_location_2` varchar(50) DEFAULT NULL,
  `cathode_location_3` varchar(50) DEFAULT NULL,
  `cathode_electrode_1` varchar(50) DEFAULT NULL,
  `cathode_electrode_2` varchar(50) DEFAULT NULL,
  `cathode_electrode_3` varchar(50) DEFAULT NULL,
  `adaptation_mode` varchar(50) DEFAULT NULL,
  `LEADCHNLSETID` int(11) NOT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSENSINGSET907062` (`LEADCHNLSETID`),
  CONSTRAINT `FKSENSINGSET907062` FOREIGN KEY (`LEADCHNLSETID`) REFERENCES `leadchnlset` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sensingset`
--

/*!40000 ALTER TABLE `sensingset` DISABLE KEYS */;
INSERT INTO `sensingset` (`ID`,`sensitivity`,`anode_location_1`,`anode_location_2`,`anode_location_3`,`anode_electrode_1`,`anode_electrode_2`,`anode_electrode_3`,`cathode_location_1`,`cathode_location_2`,`cathode_location_3`,`cathode_electrode_1`,`cathode_electrode_2`,`cathode_electrode_3`,`adaptation_mode`,`LEADCHNLSETID`,`polarity`) VALUES 
 (1,'1.3','RV',NULL,NULL,'Tip',NULL,NULL,'RV',NULL,NULL,'Ring',NULL,NULL,'AdaptiveSensing',1,'BI'),
 (2,'1.0','LV',NULL,NULL,'Tip',NULL,NULL,'LV',NULL,NULL,'Ring',NULL,NULL,'FixedSensing',2,'BI'),
 (3,'0.8','RA',NULL,NULL,'Tip',NULL,NULL,'NA',NULL,NULL,'Can',NULL,NULL,'AdaptiveSensing',3,'BI');
/*!40000 ALTER TABLE `sensingset` ENABLE KEYS */;


--
-- Definition of table `sess`
--

DROP TABLE IF EXISTS `sess`;
CREATE TABLE `sess` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `dtm` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `reprogrammed` varchar(50) DEFAULT NULL,
  `dtm_previous` varchar(50) DEFAULT NULL,
  `type_previous` varchar(50) DEFAULT NULL,
  `reprogrammed_previous` varchar(50) DEFAULT NULL,
  `clinician_name` varchar(50) DEFAULT NULL,
  `clinician_contact_information` varchar(50) DEFAULT NULL,
  `clinic_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSESS812661` (`SystemID`),
  CONSTRAINT `FKSESS812661` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sess`
--

/*!40000 ALTER TABLE `sess` DISABLE KEYS */;
INSERT INTO `sess` (`ID`,`SystemID`,`dtm`,`type`,`reprogrammed`,`dtm_previous`,`type_previous`,`reprogrammed_previous`,`clinician_name`,`clinician_contact_information`,`clinic_name`) VALUES 
 (1,1,'20091025100000','Remote','NO','20090925100000','InClinic','YES','Dr. Anderson','Phone: +1 12 345 6789','Main Heart Center New Jersey');
/*!40000 ALTER TABLE `sess` ENABLE KEYS */;


--
-- Definition of table `set`
--

DROP TABLE IF EXISTS `set`;
CREATE TABLE `set` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSET353027` (`SystemID`),
  CONSTRAINT `FKSET353027` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `set`
--

/*!40000 ALTER TABLE `set` DISABLE KEYS */;
INSERT INTO `set` (`ID`,`SystemID`) VALUES 
 (1,1);
/*!40000 ALTER TABLE `set` ENABLE KEYS */;


--
-- Definition of table `shockvector`
--

DROP TABLE IF EXISTS `shockvector`;
CREATE TABLE `shockvector` (
  `ID` int(11) NOT NULL,
  `anode_location_1` varchar(50) DEFAULT NULL,
  `anode_location_2` varchar(50) DEFAULT NULL,
  `anode_location_3` varchar(50) DEFAULT NULL,
  `anode_electrode_1` varchar(50) DEFAULT NULL,
  `anode_electrode_2` varchar(50) DEFAULT NULL,
  `anode_electrode_3` varchar(50) DEFAULT NULL,
  `cathode_location_1` varchar(50) DEFAULT NULL,
  `cathode_location_2` varchar(50) DEFAULT NULL,
  `cathode_location_3` varchar(50) DEFAULT NULL,
  `cathode_electrode_1` varchar(50) DEFAULT NULL,
  `cathode_electrode_2` varchar(50) DEFAULT NULL,
  `cathode_electrode_3` varchar(50) DEFAULT NULL,
  `LEADHVCHANNELSETID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSHOCKVECTO601777` (`LEADHVCHANNELSETID`),
  CONSTRAINT `FKSHOCKVECTO601777` FOREIGN KEY (`LEADHVCHANNELSETID`) REFERENCES `leadhvchannelset` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `shockvector`
--

/*!40000 ALTER TABLE `shockvector` DISABLE KEYS */;
INSERT INTO `shockvector` (`ID`,`anode_location_1`,`anode_location_2`,`anode_location_3`,`anode_electrode_1`,`anode_electrode_2`,`anode_electrode_3`,`cathode_location_1`,`cathode_location_2`,`cathode_location_3`,`cathode_electrode_1`,`cathode_electrode_2`,`cathode_electrode_3`,`LEADHVCHANNELSETID`) VALUES 
 (1,'RV','RA',NULL,'Coil','Coil',NULL,'NA',NULL,NULL,'Can',NULL,NULL,1);
/*!40000 ALTER TABLE `shockvector` ENABLE KEYS */;


--
-- Definition of table `stat`
--

DROP TABLE IF EXISTS `stat`;
CREATE TABLE `stat` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSTAT826519` (`SystemID`),
  CONSTRAINT `FKSTAT826519` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `stat`
--

/*!40000 ALTER TABLE `stat` DISABLE KEYS */;
INSERT INTO `stat` (`ID`,`SystemID`,`dtm_start`,`dtm_end`) VALUES 
 (1,1,NULL,NULL);
/*!40000 ALTER TABLE `stat` ENABLE KEYS */;


--
-- Definition of table `system`
--

DROP TABLE IF EXISTS `system`;
CREATE TABLE `system` (
  `ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `system`
--

/*!40000 ALTER TABLE `system` DISABLE KEYS */;
INSERT INTO `system` (`ID`) VALUES 
 (1);
/*!40000 ALTER TABLE `system` ENABLE KEYS */;


--
-- Definition of table `tachytherapyset`
--

DROP TABLE IF EXISTS `tachytherapyset`;
CREATE TABLE `tachytherapyset` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `vstat` varchar(50) DEFAULT NULL,
  `astat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKTACHYTHERA841972` (`SETID`),
  CONSTRAINT `FKTACHYTHERA841972` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tachytherapyset`
--

/*!40000 ALTER TABLE `tachytherapyset` DISABLE KEYS */;
INSERT INTO `tachytherapyset` (`ID`,`SETID`,`vstat`,`astat`) VALUES 
 (1,1,'On','Off');
/*!40000 ALTER TABLE `tachytherapyset` ENABLE KEYS */;


--
-- Definition of table `tachytherapystat`
--

DROP TABLE IF EXISTS `tachytherapystat`;
CREATE TABLE `tachytherapystat` (
  `ID` int(11) NOT NULL,
  `shocks_delivered_recent` varchar(50) DEFAULT NULL,
  `shocks_delivered_total` varchar(50) DEFAULT NULL,
  `shocks_aborted_recent` varchar(50) DEFAULT NULL,
  `shocks_aborted_total` varchar(50) DEFAULT NULL,
  `atp_delivered_recent` varchar(50) DEFAULT NULL,
  `atp_delivered_total` varchar(50) DEFAULT NULL,
  `total_dtm_start` varchar(50) DEFAULT NULL,
  `total_dtm_end` varchar(50) DEFAULT NULL,
  `recent_dtm_start` varchar(50) DEFAULT NULL,
  `recent_dtm_end` varchar(50) DEFAULT NULL,
  `STATID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKTACHYTHERA754367` (`STATID`),
  CONSTRAINT `FKTACHYTHERA754367` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tachytherapystat`
--

/*!40000 ALTER TABLE `tachytherapystat` DISABLE KEYS */;
INSERT INTO `tachytherapystat` (`ID`,`shocks_delivered_recent`,`shocks_delivered_total`,`shocks_aborted_recent`,`shocks_aborted_total`,`atp_delivered_recent`,`atp_delivered_total`,`total_dtm_start`,`total_dtm_end`,`recent_dtm_start`,`recent_dtm_end`,`STATID`) VALUES 
 (1,'1','4','0','1','1','3','20090501000000','20091025100000','20090925000000','20091025100000',1);
/*!40000 ALTER TABLE `tachytherapystat` ENABLE KEYS */;


--
-- Definition of table `vitalsign`
--

DROP TABLE IF EXISTS `vitalsign`;
CREATE TABLE `vitalsign` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `effectiveTime` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKVitalSign769617` (`EHRPHRDataID`),
  CONSTRAINT `FKVitalSign769617` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vitalsign`
--

/*!40000 ALTER TABLE `vitalsign` DISABLE KEYS */;
/*!40000 ALTER TABLE `vitalsign` ENABLE KEYS */;


--
-- Definition of table `zone`
--

DROP TABLE IF EXISTS `zone`;
CREATE TABLE `zone` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `vendor_type` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `detection_interval` varchar(50) DEFAULT NULL,
  `detection_beats_numerator` varchar(50) DEFAULT NULL,
  `detection_beats_denominator` varchar(50) DEFAULT NULL,
  `detection_details` varchar(50) DEFAULT NULL,
  `type_atp_1` varchar(50) DEFAULT NULL,
  `type_atp_2` varchar(50) DEFAULT NULL,
  `type_atp_3` varchar(50) DEFAULT NULL,
  `type_atp_4` varchar(50) DEFAULT NULL,
  `type_atp_5` varchar(50) DEFAULT NULL,
  `num_atp_seqs_1` varchar(50) DEFAULT NULL,
  `num_atp_seqs_2` varchar(50) DEFAULT NULL,
  `num_atp_seqs_3` varchar(50) DEFAULT NULL,
  `num_atp_seqs_4` varchar(50) DEFAULT NULL,
  `num_atp_seqs_5` varchar(50) DEFAULT NULL,
  `shock_energy_1` varchar(50) DEFAULT NULL,
  `shock_energy_2` varchar(50) DEFAULT NULL,
  `shock_energy_3` varchar(50) DEFAULT NULL,
  `shock_energy_4` varchar(50) DEFAULT NULL,
  `shock_energy_5` varchar(50) DEFAULT NULL,
  `num_shocks_1` varchar(50) DEFAULT NULL,
  `num_shocks_2` varchar(50) DEFAULT NULL,
  `num_shocks_3` varchar(50) DEFAULT NULL,
  `num_shocks_4` varchar(50) DEFAULT NULL,
  `num_shocks_5` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKZONE634871` (`SETID`),
  CONSTRAINT `FKZONE634871` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `zone`
--

/*!40000 ALTER TABLE `zone` DISABLE KEYS */;
INSERT INTO `zone` (`ID`,`SETID`,`type`,`vendor_type`,`status`,`detection_interval`,`detection_beats_numerator`,`detection_beats_denominator`,`detection_details`,`type_atp_1`,`type_atp_2`,`type_atp_3`,`type_atp_4`,`type_atp_5`,`num_atp_seqs_1`,`num_atp_seqs_2`,`num_atp_seqs_3`,`num_atp_seqs_4`,`num_atp_seqs_5`,`shock_energy_1`,`shock_energy_2`,`shock_energy_3`,`shock_energy_4`,`shock_energy_5`,`num_shocks_1`,`num_shocks_2`,`num_shocks_3`,`num_shocks_4`,`num_shocks_5`,`subID`) VALUES 
 (1,1,'VF_Zone','VF','Active','195','12','18','','Ramp',NULL,NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,'30',NULL,NULL,NULL,NULL,'5',NULL,NULL,NULL,NULL,0),
 (2,1,'VT_Zone','VT1','Active','165','9','12','Enhanced detection','Burst',NULL,NULL,NULL,NULL,'5',NULL,NULL,NULL,NULL,'20','30','30',NULL,NULL,'1','1','5',NULL,NULL,1),
 (3,1,'VT_Zone','FastVT','Active','165','9','12','Progressive Therapy','RampScan',NULL,NULL,NULL,NULL,'5',NULL,NULL,NULL,NULL,'20','30',NULL,NULL,NULL,'1','5',NULL,NULL,NULL,2);
/*!40000 ALTER TABLE `zone` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
