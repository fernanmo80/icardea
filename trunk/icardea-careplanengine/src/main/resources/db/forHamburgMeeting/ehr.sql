-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 01 Şubat 2011 saat 10:56:49
-- Sunucu sürümü: 5.1.36
-- PHP Sürümü: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

 

CREATE TABLE IF NOT EXISTS `patient` (
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
-- Tablo döküm verisi `patient`
--

INSERT INTO `patient` (`ID`, `assigningAuthority`, `identifierTypeCode`, `givenName`, `familyName`, `secondName`, `dateTimeOfBirth`, `administrativeSex`, `street`, `city`, `postalCode`, `country`, `patientIdentifier`, `citizenshipNumber`) VALUES
(1, NULL, NULL, 'Harry', 'Morgan', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '149202063490');



--
-- Veritabanı: `icardea`
--

-- --------------------------------------------------------

--
-- Tablo yapısı: `at`
--

CREATE TABLE IF NOT EXISTS `at` (
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
  KEY `FKAT594459` (`STATID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `at`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `battery`
--

CREATE TABLE IF NOT EXISTS `battery` (
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
  KEY `FKBATTERY373849` (`MSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `battery`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `bradyset`
--

CREATE TABLE IF NOT EXISTS `bradyset` (
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
  KEY `FKBRADYSET526577` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `bradyset`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `bradystat`
--

CREATE TABLE IF NOT EXISTS `bradystat` (
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
  KEY `FKBRADYSTAT250159` (`STATID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `bradystat`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `cap`
--

CREATE TABLE IF NOT EXISTS `cap` (
  `ID` int(11) NOT NULL,
  `MSMTID` int(11) DEFAULT NULL,
  `charge_dtm` varchar(50) DEFAULT NULL,
  `charge_time` varchar(50) DEFAULT NULL,
  `charge_energy` varchar(50) DEFAULT NULL,
  `charge_type` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCAP50519` (`MSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `cap`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `cieddata`
--

CREATE TABLE IF NOT EXISTS `cieddata` (
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
  KEY `FKCIEDData420789` (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `cieddata`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `concern`
--

CREATE TABLE IF NOT EXISTS `concern` (
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
  KEY `FKConcern444326` (`ProblemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `concern`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `contact`
--

CREATE TABLE IF NOT EXISTS `contact` (
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
  KEY `FKContact141472` (`PersonID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `contact`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `crtset`
--

CREATE TABLE IF NOT EXISTS `crtset` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `lvrv_delay` varchar(50) DEFAULT NULL,
  `paced_chambers` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCRTSET343538` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `crtset`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `crtstat`
--

CREATE TABLE IF NOT EXISTS `crtstat` (
  `ID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  `lv_percent_paced` varchar(50) DEFAULT NULL,
  `percent_paced` varchar(50) DEFAULT NULL,
  `STATID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKCRTSTAT668692` (`STATID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `crtstat`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `ehrphrdata`
--

CREATE TABLE IF NOT EXISTS `ehrphrdata` (
  `ID` int(11) NOT NULL,
  `pcc9QueryId` varchar(255) DEFAULT NULL,
  `messageDateTime` varchar(255) DEFAULT NULL,
  `PatientID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKEHRPHRData915269` (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `ehrphrdata`
--

INSERT INTO `ehrphrdata` (`ID`, `pcc9QueryId`, `messageDateTime`, `PatientID`) VALUES
(1, '11', '20110201125520', 1),
(2, '3', '20110201125525', 1),
(3, '3', '20110201125525', 1),
(4, '3', '20110201125525', 1),
(5, '3', '20110201125525', 1),
(6, '3', '20110201125525', 1),
(7, '3', '20110201125525', 1),
(8, '3', '20110201125525', 1),
(9, '3', '20110201125525', 1),
(10, '3', '20110201125525', 1),
(11, '3', '20110201125525', 1),
(12, '3', '20110201125525', 1),
(13, '3', '20110201125525', 1),
(14, '3', '20110201125525', 1),
(15, '3', '20110201125525', 1),
(16, '3', '20110201125525', 1),
(17, '3', '20110201125525', 1),
(18, '3', '20110201125525', 1),
(19, '3', '20110201125525', 1),
(20, '3', '20110201125525', 1),
(21, '3', '20110201125525', 1),
(22, '3', '20110201125525', 1),
(23, '3', '20110201125525', 1),
(24, '3', '20110201125525', 1),
(25, '3', '20110201125525', 1),
(26, '3', '20110201125525', 1),
(27, '3', '20110201125525', 1),
(28, '3', '20110201125525', 1),
(29, '3', '20110201125525', 1),
(30, '3', '20110201125525', 1),
(31, '3', '20110201125525', 1),
(32, '3', '20110201125525', 1),
(33, '3', '20110201125525', 1),
(34, '3', '20110201125525', 1),
(35, '3', '20110201125525', 1),
(36, '3', '20110201125525', 1),
(37, '3', '20110201125525', 1),
(38, '3', '20110201125525', 1),
(39, '3', '20110201125525', 1),
(40, '3', '20110201125525', 1),
(41, '8', '20110201125529', 1),
(42, '8', '20110201125529', 1),
(43, '8', '20110201125529', 1),
(44, '8', '20110201125529', 1),
(45, '8', '20110201125529', 1),
(46, '8', '20110201125529', 1),
(47, '8', '20110201125529', 1),
(48, '8', '20110201125529', 1),
(49, '8', '20110201125529', 1),
(50, '8', '20110201125529', 1),
(51, '8', '20110201125529', 1),
(52, '8', '20110201125529', 1),
(53, '8', '20110201125529', 1);

-- --------------------------------------------------------

--
-- Tablo yapısı: `encounter`
--

CREATE TABLE IF NOT EXISTS `encounter` (
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
  KEY `FKEncounter885522` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `encounter`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `episoderoot`
--

CREATE TABLE IF NOT EXISTS `episoderoot` (
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
  KEY `FKEPISODEROO22013` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `episoderoot`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `episodestat`
--

CREATE TABLE IF NOT EXISTS `episodestat` (
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
  KEY `FKEPISODESTA811424` (`STATID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `episodestat`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `heart_rate`
--

CREATE TABLE IF NOT EXISTS `heart_rate` (
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
  KEY `FKHEART_RATE500119` (`STATID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `heart_rate`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `imagingresult`
--

CREATE TABLE IF NOT EXISTS `imagingresult` (
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
  KEY `FKImagingRes295358` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `imagingresult`
--

INSERT INTO `imagingresult` (`ID`, `careProvisionCode`, `labResultCode`, `labResultText`, `effectiveTime`, `labResultValue`, `labResultValueCodeSystem`, `mediaType`, `base64Encoded`, `EHRPHRDataID`) VALUES
(1, 'LABCAT', 'TZ', 'TZ', '200909090909', '16', 'sec', NULL, NULL, 41),
(2, 'LABCAT', 'C0023508', 'White Blood Cell Count procedure', '200909090909', '203', 'G/L', NULL, NULL, 42),
(3, 'LABCAT', 'C0201836', 'Alanine aminotransferase', '200909090909', '15', 'U/l', NULL, NULL, 43),
(4, 'LABCAT', 'C0201850', 'Alkaline phosphatase measurement', '200909090909', '72', 'U/l', NULL, NULL, 44),
(5, 'LABCAT', 'C0202113', 'Lactate dehydrogenase', '200909090909', '203', 'U/l', NULL, NULL, 45),
(6, 'LABCAT', 'C0202035', 'Gamma glutamyl transferase measurement', '200909090909', '14', 'U/l', NULL, NULL, 46),
(7, 'LABCAT', 'C0016006', 'Fibrinogen measurement', '200909090909', '354', 'mg/dl', NULL, NULL, 47),
(8, 'LABCAT', 'C0014772', 'Red Blood Cell Count measurement', '200909090909', '4.3', 'T/L', NULL, NULL, 48),
(9, 'LABCAT', 'C0004002', 'Aspartate aminotransferase', '200909090909', '25', 'U/l', NULL, NULL, 49),
(10, 'LABCAT', 'C0032181', 'Platelet Count measurement', '200909090909', '7', 'G/L', NULL, NULL, 50),
(11, 'LABCAT', 'C0030605', 'Activated Partial Thromboplastin Time measurement', '200909090909', '42', 'sec', NULL, NULL, 51),
(12, 'LABCAT', 'C0033707', 'Prothrombin time assay', '200909090909', '109', 'sec', NULL, NULL, 52),
(13, 'LABCAT', 'C0518015', 'Hemoglobin measurement', '200909090909', '10', 'g/dl', NULL, NULL, 53);

-- --------------------------------------------------------

--
-- Tablo yapısı: `immunization`
--

CREATE TABLE IF NOT EXISTS `immunization` (
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
  KEY `FKImmunizati883033` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `immunization`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `impedance`
--

CREATE TABLE IF NOT EXISTS `impedance` (
  `ID` int(11) NOT NULL,
  `LEADCHNLMSMTID` int(11) NOT NULL,
  `value` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKIMPEDANCE769106` (`LEADCHNLMSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `impedance`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `lead`
--

CREATE TABLE IF NOT EXISTS `lead` (
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
  KEY `FKLEAD603551` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `lead`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `leadchnlmsmt`
--

CREATE TABLE IF NOT EXISTS `leadchnlmsmt` (
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
  KEY `FKLEADCHNLMS81875` (`MSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `leadchnlmsmt`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `leadchnlset`
--

CREATE TABLE IF NOT EXISTS `leadchnlset` (
  `ID` int(11) NOT NULL,
  `chamber` varchar(50) DEFAULT NULL,
  `subID` int(11) DEFAULT NULL,
  `SETID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEADCHNLSE526615` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `leadchnlset`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `leadhvchannelmsmt`
--

CREATE TABLE IF NOT EXISTS `leadhvchannelmsmt` (
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
  KEY `FKLEADHVCHAN314419` (`MSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `leadhvchannelmsmt`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `leadhvchannelset`
--

CREATE TABLE IF NOT EXISTS `leadhvchannelset` (
  `ID` int(11) NOT NULL,
  `subID` int(11) DEFAULT NULL,
  `SETID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKLEADHVCHAN935935` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `leadhvchannelset`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `magnet`
--

CREATE TABLE IF NOT EXISTS `magnet` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `resp` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKMAGNET428217` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `magnet`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `medicalcareplantemplate`
--

CREATE TABLE IF NOT EXISTS `medicalcareplantemplate` (
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
-- Tablo döküm verisi `medicalcareplantemplate`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `medication`
--

CREATE TABLE IF NOT EXISTS `medication` (
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
  KEY `FKMedication554854` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `medication`
--

INSERT INTO `medication` (`ID`, `careProvisionCode`, `text`, `effectiveTime`, `routeCode`, `approachSiteCode`, `doseQuantity`, `drugCode`, `drugCodeSystem`, `EHRPHRDataID`) VALUES
(1, 'MEDLIST', '', '200310101010', 'IAINJ', 'LF', '20', 'C0004057', 'UMLS', 1);

-- --------------------------------------------------------

--
-- Tablo yapısı: `msmt`
--

CREATE TABLE IF NOT EXISTS `msmt` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKMSMT647184` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `msmt`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `observation`
--

CREATE TABLE IF NOT EXISTS `observation` (
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
  KEY `FKObservatio486987` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `observation`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `organization`
--

CREATE TABLE IF NOT EXISTS `organization` (
  `ID` int(11) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Identifier` varchar(50) DEFAULT NULL,
  `PersonID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKOrganizati796933` (`PersonID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `organization`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `pacing`
--

CREATE TABLE IF NOT EXISTS `pacing` (
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
  KEY `FKPACING621114` (`LEADCHNLSETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `pacing`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `pacingthreshold`
--

CREATE TABLE IF NOT EXISTS `pacingthreshold` (
  `ID` int(11) NOT NULL,
  `LEADCHNLMSMTID` int(11) NOT NULL,
  `amplitude` varchar(50) DEFAULT NULL,
  `pulsewidth` varchar(50) DEFAULT NULL,
  `measurement_method` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPACINGTHRE209317` (`LEADCHNLMSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `pacingthreshold`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `patient`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `patienthealthcareactorassignment`
--

CREATE TABLE IF NOT EXISTS `patienthealthcareactorassignment` (
  `ID` int(11) NOT NULL,
  `PatientIdentifier` varchar(32) DEFAULT NULL,
  `HealthcareActorIdentifier` varchar(32) DEFAULT NULL,
  `AssignmentDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `patienthealthcareactorassignment`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `person`
--

CREATE TABLE IF NOT EXISTS `person` (
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
-- Tablo döküm verisi `person`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `personalizedmedicalcareplan`
--

CREATE TABLE IF NOT EXISTS `personalizedmedicalcareplan` (
  `ID` int(11) NOT NULL,
  `Content` mediumtext,
  `Identifier` varchar(32) DEFAULT NULL,
  `CreationDate` datetime DEFAULT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `PatientIdentifier` varchar(32) DEFAULT NULL,
  `MedicalCareplanTemplateID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPersonaliz746964` (`MedicalCareplanTemplateID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `personalizedmedicalcareplan`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `personalizedmedicalcareplaninstance`
--

CREATE TABLE IF NOT EXISTS `personalizedmedicalcareplaninstance` (
  `ID` int(11) NOT NULL,
  `Content` mediumtext,
  `Identifier` varchar(32) DEFAULT NULL,
  `InstantiationDate` datetime DEFAULT NULL,
  `PersonalizedMedicalCareplanID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKPersonaliz173738` (`PersonalizedMedicalCareplanID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `personalizedmedicalcareplaninstance`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `pg`
--

CREATE TABLE IF NOT EXISTS `pg` (
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
  KEY `FKPG273592` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `pg`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `problem`
--

CREATE TABLE IF NOT EXISTS `problem` (
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
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKProblem94819` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `problem`
--

INSERT INTO `problem` (`ID`, `careProvisionCode`, `problemCode`, `problemText`, `effectiveTimeLow`, `effectiveTimeHigh`, `problemValue`, `problemValueCodeSystem`, `problemValueOriginalText`, `EHRPHRDataID`) VALUES
(1, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0338656', 'UMLS', '', 2),
(2, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0041582', 'UMLS', '', 3),
(3, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0023895', 'UMLS', '', 4),
(4, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'TODO', 'UMLS', '', 5),
(5, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0017181', 'UMLS', '', 6),
(6, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0018799', 'UMLS', '', 7),
(7, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0948059', 'UMLS', '', 8),
(8, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0007766', 'UMLS', '', 9),
(9, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0019080', 'UMLS', '', 10),
(10, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0560180', 'UMLS', 'Atrial Fibrillation', 11),
(11, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0031039', 'UMLS', '', 12),
(12, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0018802', 'UMLS', '', 13),
(13, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0264897', 'UMLS', '', 14),
(14, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0151699', 'UMLS', '', 15),
(15, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'C1956346', 'UMLS', '', 16),
(16, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0031046', 'UMLS', '', 17),
(17, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0018939', 'UMLS', '', 18),
(18, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0020538', 'UMLS', '', 19),
(19, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0497327', 'UMLS', '', 20),
(20, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0030920', 'UMLS', '', 21),
(21, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0149721', 'UMLS', '', 22),
(22, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0232201', 'UMLS', '', 23),
(23, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0011849', 'UMLS', '', 24),
(24, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'TODO', 'UMLS', '', 25),
(25, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0332677', 'UMLS', '', 26),
(26, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'TODO', 'UMLS', '', 27),
(27, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C1956346', 'UMLS', '', 28),
(28, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0948807', 'UMLS', '', 29),
(29, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'C0028263', 'UMLS', '', 30),
(30, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'C0235480', 'UMLS', '', 31),
(31, 'MEDCCAT', '409586006', '', '201011031010', '201011031011', 'C0232201', 'UMLS', '', 32),
(32, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0032981', 'UMLS', '', 33),
(33, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0018801', 'UMLS', '', 34),
(34, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0001973', 'UMLS', '', 35),
(35, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0004936', 'UMLS', '', 36),
(36, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0038454', 'UMLS', '', 37),
(37, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0032979', 'UMLS', '', 38),
(38, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C1868885', 'UMLS', '', 39),
(39, 'MEDCCAT', '409586006', '', '201010101010', '201010101010', 'C0014544', 'UMLS', '', 40);

-- --------------------------------------------------------

--
-- Tablo yapısı: `procedure`
--

CREATE TABLE IF NOT EXISTS `procedure` (
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
  KEY `FKProcedure747160` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `procedure`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `sensingmsmt`
--

CREATE TABLE IF NOT EXISTS `sensingmsmt` (
  `ID` int(11) NOT NULL,
  `LEADCHNLMSMTID` int(11) NOT NULL,
  `intr_ampl_min` varchar(50) DEFAULT NULL,
  `intr_ampl_max` varchar(50) DEFAULT NULL,
  `intr_ampl_mean` varchar(50) DEFAULT NULL,
  `polarity` varchar(50) DEFAULT NULL,
  `intr_ampl` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSENSINGMSM958745` (`LEADCHNLMSMTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `sensingmsmt`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `sensingset`
--

CREATE TABLE IF NOT EXISTS `sensingset` (
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
  KEY `FKSENSINGSET907062` (`LEADCHNLSETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `sensingset`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `sess`
--

CREATE TABLE IF NOT EXISTS `sess` (
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
  KEY `FKSESS812661` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `sess`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `set`
--

CREATE TABLE IF NOT EXISTS `set` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSET353027` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `set`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `shockvector`
--

CREATE TABLE IF NOT EXISTS `shockvector` (
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
  KEY `FKSHOCKVECTO601777` (`LEADHVCHANNELSETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `shockvector`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `stat`
--

CREATE TABLE IF NOT EXISTS `stat` (
  `ID` int(11) NOT NULL,
  `SystemID` int(11) NOT NULL,
  `dtm_start` varchar(50) DEFAULT NULL,
  `dtm_end` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKSTAT826519` (`SystemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `stat`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `system`
--

CREATE TABLE IF NOT EXISTS `system` (
  `ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `system`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `tachytherapyset`
--

CREATE TABLE IF NOT EXISTS `tachytherapyset` (
  `ID` int(11) NOT NULL,
  `SETID` int(11) NOT NULL,
  `vstat` varchar(50) DEFAULT NULL,
  `astat` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKTACHYTHERA841972` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `tachytherapyset`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `tachytherapystat`
--

CREATE TABLE IF NOT EXISTS `tachytherapystat` (
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
  KEY `FKTACHYTHERA754367` (`STATID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `tachytherapystat`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `vitalsign`
--

CREATE TABLE IF NOT EXISTS `vitalsign` (
  `ID` int(11) NOT NULL,
  `careProvisionCode` varchar(255) DEFAULT NULL,
  `effectiveTime` varchar(255) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `EHRPHRDataID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID` (`ID`),
  KEY `FKVitalSign769617` (`EHRPHRDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `vitalsign`
--


-- --------------------------------------------------------

--
-- Tablo yapısı: `zone`
--

CREATE TABLE IF NOT EXISTS `zone` (
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
  KEY `FKZONE634871` (`SETID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `zone`
--


--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `at`
--
ALTER TABLE `at`
  ADD CONSTRAINT `FKAT594459` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`);

--
-- Tablo kısıtlamaları `battery`
--
ALTER TABLE `battery`
  ADD CONSTRAINT `FKBATTERY373849` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`);

--
-- Tablo kısıtlamaları `bradyset`
--
ALTER TABLE `bradyset`
  ADD CONSTRAINT `FKBRADYSET526577` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);

--
-- Tablo kısıtlamaları `bradystat`
--
ALTER TABLE `bradystat`
  ADD CONSTRAINT `FKBRADYSTAT250159` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`);

--
-- Tablo kısıtlamaları `cap`
--
ALTER TABLE `cap`
  ADD CONSTRAINT `FKCAP50519` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`);

--
-- Tablo kısıtlamaları `cieddata`
--
ALTER TABLE `cieddata`
  ADD CONSTRAINT `FKCIEDData420789` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`ID`),
  ADD CONSTRAINT `FKCIEDData63170` FOREIGN KEY (`ObservationID`) REFERENCES `observation` (`ID`);

--
-- Tablo kısıtlamaları `concern`
--
ALTER TABLE `concern`
  ADD CONSTRAINT `FKConcern444326` FOREIGN KEY (`ProblemID`) REFERENCES `problem` (`ID`),
  ADD CONSTRAINT `FKConcern308982` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `contact`
--
ALTER TABLE `contact`
  ADD CONSTRAINT `FKContact141472` FOREIGN KEY (`PersonID`) REFERENCES `person` (`ID`),
  ADD CONSTRAINT `FKContact391306` FOREIGN KEY (`OrganizationID`) REFERENCES `organization` (`ID`);

--
-- Tablo kısıtlamaları `crtset`
--
ALTER TABLE `crtset`
  ADD CONSTRAINT `FKCRTSET343538` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);

--
-- Tablo kısıtlamaları `crtstat`
--
ALTER TABLE `crtstat`
  ADD CONSTRAINT `FKCRTSTAT668692` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`);

--
-- Tablo kısıtlamaları `ehrphrdata`
--
ALTER TABLE `ehrphrdata`
  ADD CONSTRAINT `FKEHRPHRData915269` FOREIGN KEY (`PatientID`) REFERENCES `patient` (`ID`);

--
-- Tablo kısıtlamaları `encounter`
--
ALTER TABLE `encounter`
  ADD CONSTRAINT `FKEncounter885522` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `episoderoot`
--
ALTER TABLE `episoderoot`
  ADD CONSTRAINT `FKEPISODEROO22013` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `episodestat`
--
ALTER TABLE `episodestat`
  ADD CONSTRAINT `FKEPISODESTA811424` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`);

--
-- Tablo kısıtlamaları `heart_rate`
--
ALTER TABLE `heart_rate`
  ADD CONSTRAINT `FKHEART_RATE500119` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`);

--
-- Tablo kısıtlamaları `imagingresult`
--
ALTER TABLE `imagingresult`
  ADD CONSTRAINT `FKImagingRes295358` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `immunization`
--
ALTER TABLE `immunization`
  ADD CONSTRAINT `FKImmunizati883033` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `impedance`
--
ALTER TABLE `impedance`
  ADD CONSTRAINT `FKIMPEDANCE769106` FOREIGN KEY (`LEADCHNLMSMTID`) REFERENCES `leadchnlmsmt` (`ID`);

--
-- Tablo kısıtlamaları `lead`
--
ALTER TABLE `lead`
  ADD CONSTRAINT `FKLEAD603551` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `leadchnlmsmt`
--
ALTER TABLE `leadchnlmsmt`
  ADD CONSTRAINT `FKLEADCHNLMS81875` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`);

--
-- Tablo kısıtlamaları `leadchnlset`
--
ALTER TABLE `leadchnlset`
  ADD CONSTRAINT `FKLEADCHNLSE526615` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);

--
-- Tablo kısıtlamaları `leadhvchannelmsmt`
--
ALTER TABLE `leadhvchannelmsmt`
  ADD CONSTRAINT `FKLEADHVCHAN314419` FOREIGN KEY (`MSMTID`) REFERENCES `msmt` (`ID`);

--
-- Tablo kısıtlamaları `leadhvchannelset`
--
ALTER TABLE `leadhvchannelset`
  ADD CONSTRAINT `FKLEADHVCHAN935935` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);

--
-- Tablo kısıtlamaları `magnet`
--
ALTER TABLE `magnet`
  ADD CONSTRAINT `FKMAGNET428217` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);

--
-- Tablo kısıtlamaları `medication`
--
ALTER TABLE `medication`
  ADD CONSTRAINT `FKMedication554854` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `msmt`
--
ALTER TABLE `msmt`
  ADD CONSTRAINT `FKMSMT647184` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `observation`
--
ALTER TABLE `observation`
  ADD CONSTRAINT `FKObservatio486987` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `organization`
--
ALTER TABLE `organization`
  ADD CONSTRAINT `FKOrganizati796933` FOREIGN KEY (`PersonID`) REFERENCES `person` (`ID`);

--
-- Tablo kısıtlamaları `pacing`
--
ALTER TABLE `pacing`
  ADD CONSTRAINT `FKPACING621114` FOREIGN KEY (`LEADCHNLSETID`) REFERENCES `leadchnlset` (`ID`);

--
-- Tablo kısıtlamaları `pacingthreshold`
--
ALTER TABLE `pacingthreshold`
  ADD CONSTRAINT `FKPACINGTHRE209317` FOREIGN KEY (`LEADCHNLMSMTID`) REFERENCES `leadchnlmsmt` (`ID`);

--
-- Tablo kısıtlamaları `personalizedmedicalcareplan`
--
ALTER TABLE `personalizedmedicalcareplan`
  ADD CONSTRAINT `FKPersonaliz746964` FOREIGN KEY (`MedicalCareplanTemplateID`) REFERENCES `medicalcareplantemplate` (`ID`);

--
-- Tablo kısıtlamaları `personalizedmedicalcareplaninstance`
--
ALTER TABLE `personalizedmedicalcareplaninstance`
  ADD CONSTRAINT `FKPersonaliz173738` FOREIGN KEY (`PersonalizedMedicalCareplanID`) REFERENCES `personalizedmedicalcareplan` (`ID`);

--
-- Tablo kısıtlamaları `pg`
--
ALTER TABLE `pg`
  ADD CONSTRAINT `FKPG273592` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `problem`
--
ALTER TABLE `problem`
  ADD CONSTRAINT `FKProblem94819` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `procedure`
--
ALTER TABLE `procedure`
  ADD CONSTRAINT `FKProcedure747160` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `sensingmsmt`
--
ALTER TABLE `sensingmsmt`
  ADD CONSTRAINT `FKSENSINGMSM958745` FOREIGN KEY (`LEADCHNLMSMTID`) REFERENCES `leadchnlmsmt` (`ID`);

--
-- Tablo kısıtlamaları `sensingset`
--
ALTER TABLE `sensingset`
  ADD CONSTRAINT `FKSENSINGSET907062` FOREIGN KEY (`LEADCHNLSETID`) REFERENCES `leadchnlset` (`ID`);

--
-- Tablo kısıtlamaları `sess`
--
ALTER TABLE `sess`
  ADD CONSTRAINT `FKSESS812661` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `set`
--
ALTER TABLE `set`
  ADD CONSTRAINT `FKSET353027` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `shockvector`
--
ALTER TABLE `shockvector`
  ADD CONSTRAINT `FKSHOCKVECTO601777` FOREIGN KEY (`LEADHVCHANNELSETID`) REFERENCES `leadhvchannelset` (`ID`);

--
-- Tablo kısıtlamaları `stat`
--
ALTER TABLE `stat`
  ADD CONSTRAINT `FKSTAT826519` FOREIGN KEY (`SystemID`) REFERENCES `system` (`ID`);

--
-- Tablo kısıtlamaları `tachytherapyset`
--
ALTER TABLE `tachytherapyset`
  ADD CONSTRAINT `FKTACHYTHERA841972` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);

--
-- Tablo kısıtlamaları `tachytherapystat`
--
ALTER TABLE `tachytherapystat`
  ADD CONSTRAINT `FKTACHYTHERA754367` FOREIGN KEY (`STATID`) REFERENCES `stat` (`ID`);

--
-- Tablo kısıtlamaları `vitalsign`
--
ALTER TABLE `vitalsign`
  ADD CONSTRAINT `FKVitalSign769617` FOREIGN KEY (`EHRPHRDataID`) REFERENCES `ehrphrdata` (`ID`);

--
-- Tablo kısıtlamaları `zone`
--
ALTER TABLE `zone`
  ADD CONSTRAINT `FKZONE634871` FOREIGN KEY (`SETID`) REFERENCES `set` (`ID`);
