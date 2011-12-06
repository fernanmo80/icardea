-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 08, 2011 at 02:19 PM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `consent`
--

-- --------------------------------------------------------

--
-- Table structure for table `actionelements`
--

CREATE DATABASE IF NOT EXISTS CONSENT;
USE CONSENT;

CREATE TABLE IF NOT EXISTS `actionelements` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PATIENTID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=42 ;

--
-- Dumping data for table `actionelements`
--

INSERT INTO `actionelements` (`HJID`, `PATIENTID`) VALUES
(5, NULL),
(6, NULL),
(7, 'default'),
(25, NULL),
(26, NULL),
(27, NULL),
(28, NULL),
(29, NULL),
(30, NULL),
(31, NULL),
(32, NULL),
(37, NULL),
(38, NULL),
(39, NULL),
(40, NULL),
(41, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `actionelementsactionitem`
--

CREATE TABLE IF NOT EXISTS `actionelementsactionitem` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ITEM` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ACTIONITEMS_ACTIONELEMENTS_H_0` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FKED4293362FAB9D68` (`ACTIONITEMS_ACTIONELEMENTS_H_0`),
  KEY `FKED429336BF1035A1` (`ACTIONITEMS_ACTIONELEMENTS_H_0`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=51 ;

--
-- Dumping data for table `actionelementsactionitem`
--

INSERT INTO `actionelementsactionitem` (`HJID`, `ITEM`, `ACTIONITEMS_ACTIONELEMENTS_H_0`) VALUES
(6, 'UPDATE', 5),
(7, 'READ', 6),
(8, 'UPDATE', 6),
(9, 'READ', 7),
(10, 'WRITE', 7),
(11, 'UPDATE', 7),
(30, 'UPDATE', 25),
(31, 'READ', 26),
(32, 'UPDATE', 27),
(33, 'READ', 28),
(34, 'UPDATE', 28),
(35, 'UPDATE', 29),
(36, 'READ', 30),
(37, 'UPDATE', 31),
(38, 'READ', 32),
(39, 'UPDATE', 32),
(45, 'UPDATE', 37),
(46, 'WRITE', 38),
(47, 'READ', 39),
(48, 'WRITE', 40),
(49, 'UPDATE', 40),
(50, 'READ', 41);

-- --------------------------------------------------------

--
-- Table structure for table `condition_`
--

CREATE TABLE IF NOT EXISTS `condition_` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `INEMERGENCY` bit(1) DEFAULT NULL,
  `PURPOSE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TIMECONSTRAINT_CONDITION_HJID` bigint(20) DEFAULT NULL,
  `CONDITION_CONSENTRULE_HJID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FKE56E22C429231261` (`CONDITION_CONSENTRULE_HJID`),
  KEY `FKE56E22C459EBD03F` (`TIMECONSTRAINT_CONDITION_HJID`),
  KEY `FKE56E22C45D330CC8` (`CONDITION_CONSENTRULE_HJID`),
  KEY `FKE56E22C4E9506878` (`TIMECONSTRAINT_CONDITION_HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Dumping data for table `condition_`
--

INSERT INTO `condition_` (`HJID`, `INEMERGENCY`, `PURPOSE`, `TIMECONSTRAINT_CONDITION_HJID`, `CONDITION_CONSENTRULE_HJID`) VALUES
(2, NULL, NULL, 2, 25),
(3, NULL, NULL, 3, 29);

-- --------------------------------------------------------

--
-- Table structure for table `consentdocument`
--

CREATE TABLE IF NOT EXISTS `consentdocument` (
  `ID` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ISCURRENT` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CONSENTDOCUMENTMETADATA_CONS_0` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKFADE73155CC60A5C` (`CONSENTDOCUMENTMETADATA_CONS_0`),
  KEY `FKFADE7315E9FA56C3` (`CONSENTDOCUMENTMETADATA_CONS_0`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `consentdocument`
--

INSERT INTO `consentdocument` (`ID`, `ISCURRENT`, `CONSENTDOCUMENTMETADATA_CONS_0`) VALUES
('0ADC69D5-B14E-2CA6-35F1-79383C27A0C6', '1', 10),
('2E0E93C8-7817-C29D-7274-792E9FFA186E', '0', 12),
('571FBA96-CD29-72C7-2967-72D071473363', '0', 9),
('6C74DDA4-4B15-8664-30C5-A8910280FD31', '1', 14),
('A485A013-3E87-346A-1B60-85DBD6BC034D', '0', 2),
('A67E444C-5C74-7ABB-5CF6-86387ED40DBC', '0', 3),
('C8372FF0-C196-11E0-962B-0800200C9A66', '0', 13);

-- --------------------------------------------------------

--
-- Table structure for table `consentdocumentmetadatatype`
--

CREATE TABLE IF NOT EXISTS `consentdocumentmetadatatype` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATIONDATE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DEFINITION` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EXPIRATIONDATE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MODIFICATIONDATE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PATIENTID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=15 ;

--
-- Dumping data for table `consentdocumentmetadatatype`
--

INSERT INTO `consentdocumentmetadatatype` (`HJID`, `CREATIONDATE`, `DEFINITION`, `EXPIRATIONDATE`, `MODIFICATIONDATE`, `PATIENTID`) VALUES
(2, '2010-10-07 11:43:18', 'Dentist Consent Document', '2011-9-29 9:0:0', '2010-10-07 13:33:03', 'e'),
(3, '2010-10-07 13:24:30', 'Doctor Consent Document', '2011-9-29 9:0:0', '2010-10-07 13:33:20', 'e'),
(9, '2010-10-1 9:0:0', 'Temporary Rules', '2011-9-29 9:0:0', '2010-11-23 16:51:38', 'e'),
(10, '2010-11-23 16:51:57', 'Temporary Rules 2', '2011-9-29 9:0:0', '2010-11-23 16:51:57', 'e'),
(12, '2010-11-23 16:41:32', 'Personal consent document', '2010-12-17 9:0:0', '2010-12-02 16:55:54', 'e'),
(13, '2010-11-23 16:51:57', 'Doctor Access Rules', '2012-9-29 9:0:0', '2010-11-23 16:51:57', '191'),
(14, '2011-08-08 11:45:01', 'Doctor Access Rules', NULL, '2011-08-08 11:45:01', '191');

-- --------------------------------------------------------

--
-- Table structure for table `consentrule`
--

CREATE TABLE IF NOT EXISTS `consentrule` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ISALLOW` int(11) DEFAULT NULL,
  `CONSENTRULETARGET_CONSENTRUL_0` bigint(20) DEFAULT NULL,
  `OBLIGATION_CONSENTRULE_HJID` bigint(20) DEFAULT NULL,
  `CONSENTRULE_CONSENTDOCUMENT__0` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FK14E4DF642553C40` (`CONSENTRULETARGET_CONSENTRUL_0`),
  KEY `FK14E4DF6320BE4C4` (`OBLIGATION_CONSENTRULE_HJID`),
  KEY `FK14E4DF62D2A63FA` (`CONSENTRULE_CONSENTDOCUMENT__0`),
  KEY `FK14E4DF6DA38D67` (`CONSENTRULETARGET_CONSENTRUL_0`),
  KEY `FK14E4DF6A6F817D` (`OBLIGATION_CONSENTRULE_HJID`),
  KEY `FK14E4DF68A58D2E1` (`CONSENTRULE_CONSENTDOCUMENT__0`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=41 ;

--
-- Dumping data for table `consentrule`
--

INSERT INTO `consentrule` (`HJID`, `DESCRIPTION`, `ID`, `ISALLOW`, `CONSENTRULETARGET_CONSENTRUL_0`, `OBLIGATION_CONSENTRULE_HJID`, `CONSENTRULE_CONSENTDOCUMENT__0`) VALUES
(5, 'Dentists can update my basic health information and conditions', '12132923489', 1, 5, 3, 'A485A013-3E87-346A-1B60-85DBD6BC034D'),
(6, 'Doctors can update my hospital visits and operations', '12345678hnvdsad', 1, 6, NULL, 'A67E444C-5C74-7ABB-5CF6-86387ED40DBC'),
(24, 'Dentists can update my basic health information and conditions', '12132923489', 1, 24, 4, '571FBA96-CD29-72C7-2967-72D071473363'),
(25, 'Doctors and Pharmacists can read my medications and conditions', 'dsfdsffdsfsfds', 1, 25, 5, '571FBA96-CD29-72C7-2967-72D071473363'),
(26, 'Nurses can not update my basic health information', 'abnmkllhgllhgf', 0, 26, NULL, '571FBA96-CD29-72C7-2967-72D071473363'),
(27, 'Doctors can update my hospital visits and operations', '12345678hnvdsad', 1, 27, NULL, '571FBA96-CD29-72C7-2967-72D071473363'),
(28, 'Dentists can update my basic health information and conditions', '12132923489', 1, 28, 6, '0ADC69D5-B14E-2CA6-35F1-79383C27A0C6'),
(29, 'Doctors and Pharmacists can read my medications and conditions', 'dsfdsffdsfsfds', 1, 29, 7, '0ADC69D5-B14E-2CA6-35F1-79383C27A0C6'),
(30, 'Nurses can not update my basic health information', 'abnmkllhgllhgf', 0, 30, NULL, '0ADC69D5-B14E-2CA6-35F1-79383C27A0C6'),
(31, 'Doctors can update my hospital visits and operations', '12345678hnvdsad', 1, 31, NULL, '0ADC69D5-B14E-2CA6-35F1-79383C27A0C6'),
(36, 'Doctor can update allergies and operations.', 'D5CF59B4-B818-E606-B118-78FAD2D9F00A', 1, 36, NULL, '2E0E93C8-7817-C29D-7274-792E9FFA186E'),
(37, 'Dentists can not write anything.', '22238133-87B9-B893-0C32-78FB2DB186A9', 0, 37, NULL, '2E0E93C8-7817-C29D-7274-792E9FFA186E'),
(38, 'Mehmet ', '51EF6CDE-B1D9-B669-6C63-78FC4DC5E1F4', 1, 38, NULL, '2E0E93C8-7817-C29D-7274-792E9FFA186E'),
(39, 'Dentists and Mehmet ', 'C90C2BD7-08FE-A279-12C5-792CFCEAFC90', 1, 39, NULL, '2E0E93C8-7817-C29D-7274-792E9FFA186E'),
(40, 'Doctor Read Rules', '5E722AEC-966E-3391-247D-A89075395DF0', 1, 40, NULL, '6C74DDA4-4B15-8664-30C5-A8910280FD31');

-- --------------------------------------------------------

--
-- Table structure for table `consentruletarget`
--

CREATE TABLE IF NOT EXISTS `consentruletarget` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `SUBJECTELEMENTS_CONSENTRULET_0` bigint(20) DEFAULT NULL,
  `ACTIONELEMENTS_CONSENTRULETA_0` bigint(20) DEFAULT NULL,
  `RESOURCEELEMENTS_CONSENTRULE_0` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FKF6EEE307FDD3052E` (`ACTIONELEMENTS_CONSENTRULETA_0`),
  KEY `FKF6EEE307DC6DCC0F` (`SUBJECTELEMENTS_CONSENTRULET_0`),
  KEY `FKF6EEE307C128CF1` (`RESOURCEELEMENTS_CONSENTRULE_0`),
  KEY `FKF6EEE3078D379D67` (`ACTIONELEMENTS_CONSENTRULETA_0`),
  KEY `FKF6EEE307399C3AF6` (`SUBJECTELEMENTS_CONSENTRULET_0`),
  KEY `FKF6EEE30754B1FAEA` (`RESOURCEELEMENTS_CONSENTRULE_0`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=41 ;

--
-- Dumping data for table `consentruletarget`
--

INSERT INTO `consentruletarget` (`HJID`, `SUBJECTELEMENTS_CONSENTRULET_0`, `ACTIONELEMENTS_CONSENTRULETA_0`, `RESOURCEELEMENTS_CONSENTRULE_0`) VALUES
(5, 5, 5, 5),
(6, 6, 6, 6),
(24, 25, 25, 25),
(25, 26, 26, 26),
(26, 27, 27, 27),
(27, 28, 28, 28),
(28, 29, 29, 29),
(29, 30, 30, 30),
(30, 31, 31, 31),
(31, 32, 32, 32),
(36, 39, 37, 37),
(37, 40, 38, 38),
(38, 41, 39, 39),
(39, 42, 40, 40),
(40, 44, 41, 41);

-- --------------------------------------------------------

--
-- Table structure for table `group_`
--

CREATE TABLE IF NOT EXISTS `group_` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ISUSERDEFINED` bit(1) DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MEMBERS_GROUP__HJID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FK7DD0CDE08DE97B90` (`MEMBERS_GROUP__HJID`),
  KEY `FK7DD0CDE0E26CC177` (`MEMBERS_GROUP__HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=62 ;

--
-- Dumping data for table `group_`
--

INSERT INTO `group_` (`HJID`, `DESCRIPTION`, `ID`, `ISUSERDEFINED`, `NAME_`, `MEMBERS_GROUP__HJID`) VALUES
(6, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 6),
(7, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 7),
(8, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 8),
(9, 'Hemsire', 'ROLECODE:NURSE', b'0', 'Nurse', 9),
(10, 'Aile ', 'ROLECODE:FAMILY_MEMBER', b'0', 'Family Member', 10),
(11, 'Psikiyatrist', 'ROLECODE:PSYCHIATRIST', b'0', 'Psychiatrist', 11),
(12, 'Eczaci', 'ROLECODE:PHARMACIST', b'0', 'Pharmacist', 12),
(13, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 13),
(26, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 26),
(27, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 27),
(28, 'Eczaci', 'ROLECODE:PHARMACIST', b'0', 'Pharmacist', 28),
(29, NULL, 'ROLECODE:NURSE', b'0', 'Nurse', 29),
(30, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 30),
(31, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 31),
(32, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 32),
(33, 'Eczaci', 'ROLECODE:PHARMACIST', b'0', 'Pharmacist', 33),
(34, NULL, 'ROLECODE:NURSE', b'0', 'Nurse', 34),
(35, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 35),
(43, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 43),
(44, 'Hemsire', 'ROLECODE:NURSE', b'0', 'Nurse', 44),
(45, 'Aile ', 'ROLECODE:FAMILY_MEMBER', b'0', 'Family Member', 45),
(46, 'Psikiyatrist', 'ROLECODE:PSYCHIATRIST', b'0', 'Psychiatrist', 46),
(47, 'Eczaci', 'ROLECODE:PHARMACIST', b'0', 'Pharmacist', 47),
(48, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 48),
(52, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 52),
(53, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 53),
(54, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 54),
(55, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 55),
(56, 'Hemsire', 'ROLECODE:NURSE', b'0', 'Nurse', 56),
(57, 'Aile ', 'ROLECODE:FAMILY_MEMBER', b'0', 'Family Member', 57),
(58, 'Psikiyatrist', 'ROLECODE:PSYCHIATRIST', b'0', 'Psychiatrist', 58),
(59, 'Eczaci', 'ROLECODE:PHARMACIST', b'0', 'Pharmacist', 59),
(60, 'Di? Hekimi', 'ROLECODE:DENTIST', b'0', 'Dentist', 60),
(61, 'Hekim', 'ROLECODE:DOCTOR', b'0', 'Doctor', 61);

-- --------------------------------------------------------

--
-- Table structure for table `individual`
--

CREATE TABLE IF NOT EXISTS `individual` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ROLE_` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SURNAME` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INDIVIDUAL_MEMBERS_HJID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FK1A278E9999FA79E3` (`INDIVIDUAL_MEMBERS_HJID`),
  KEY `FK1A278E99EE7DBFCA` (`INDIVIDUAL_MEMBERS_HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=18 ;

--
-- Dumping data for table `individual`
--

INSERT INTO `individual` (`HJID`, `ID`, `NAME_`, `ROLE_`, `SURNAME`, `INDIVIDUAL_MEMBERS_HJID`) VALUES
(1, 'ROLECODE:INDIVIDUAL', 'Ricardo', 'ROLECODE:FAMILY_MEMBER', 'Quaresma', 10),
(2, 'ROLECODE:INDIVIDUAL', 'Mehmet', 'ROLECODE:DOCTOR', '', NULL),
(11, 'ROLECODE:INDIVIDUAL', 'Mehmet', 'ROLECODE:DOCTOR', '', NULL),
(12, 'ROLECODE:INDIVIDUAL', 'Ricardo', 'ROLECODE:FAMILY_MEMBER', 'Quaresma', 45),
(15, 'ROLECODE:INDIVIDUAL', 'Mehmet', 'ROLECODE:DOCTOR', '', NULL),
(16, 'ROLECODE:INDIVIDUAL', 'Mehmet', 'ROLECODE:DOCTOR', '', NULL),
(17, 'ROLECODE:INDIVIDUAL', 'Ricardo', 'ROLECODE:FAMILY_MEMBER', 'Quaresma', 57);

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE IF NOT EXISTS `members` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=62 ;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`HJID`) VALUES
(6),
(7),
(8),
(9),
(10),
(11),
(12),
(13),
(26),
(27),
(28),
(29),
(30),
(31),
(32),
(33),
(34),
(35),
(43),
(44),
(45),
(46),
(47),
(48),
(52),
(53),
(54),
(55),
(56),
(57),
(58),
(59),
(60),
(61);

-- --------------------------------------------------------

--
-- Table structure for table `obligation`
--

CREATE TABLE IF NOT EXISTS `obligation` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `SENTEMAILTO_OBLIGATION_HJID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FK5B2157ECEBB23DE` (`SENTEMAILTO_OBLIGATION_HJID`),
  KEY `FK5B2157E2CB1E45` (`SENTEMAILTO_OBLIGATION_HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=8 ;

--
-- Dumping data for table `obligation`
--

INSERT INTO `obligation` (`HJID`, `SENTEMAILTO_OBLIGATION_HJID`) VALUES
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7);

-- --------------------------------------------------------

--
-- Table structure for table `resourceelement`
--

CREATE TABLE IF NOT EXISTS `resourceelement` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONFIDENTIALITYCODE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NAME_` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `RESOURCEELEMENT_RESOURCEELEM_0` bigint(20) DEFAULT NULL,
  `PARENTRESOURCE_RESOURCEELEME_0` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FKA21AEB0E2446C6A3` (`RESOURCEELEMENT_RESOURCEELEM_0`),
  KEY `FKA21AEB0E6CE6349C` (`RESOURCEELEMENT_RESOURCEELEM_0`),
  KEY `FKA21AEB0EAC332A68` (`PARENTRESOURCE_RESOURCEELEME_0`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=126 ;

--
-- Dumping data for table `resourceelement`
--

INSERT INTO `resourceelement` (`HJID`, `CONFIDENTIALITYCODE`, `ID`, `NAME_`, `RESOURCEELEMENT_RESOURCEELEM_0`, `PARENTRESOURCE_RESOURCEELEME_0`) VALUES
(8, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 5, NULL),
(9, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 5, NULL),
(10, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 6, NULL),
(11, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 6, NULL),
(12, 'ALL', 'RESOURCECODE:ALLERGY', 'Allergies', 7, NULL),
(13, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 7, NULL),
(14, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 7, NULL),
(15, 'ALL', 'RESOURCECODE:MEDICATION', 'Medications', 7, NULL),
(16, 'ALL', 'RESOURCECODE:TESTRESULT', 'Test Results', 7, NULL),
(17, 'ALL', 'RESOURCECODE:IMMUNIZATION', 'Immunizations', 7, NULL),
(18, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 7, NULL),
(19, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 7, NULL),
(72, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 25, NULL),
(73, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 25, NULL),
(74, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 26, NULL),
(75, 'ALL', 'RESOURCECODE:MEDICATION', 'Medications', 26, NULL),
(76, 'LOW', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 27, NULL),
(77, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 28, NULL),
(78, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 28, NULL),
(79, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 29, NULL),
(80, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 29, NULL),
(81, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 30, NULL),
(82, 'ALL', 'RESOURCECODE:MEDICATION', 'Medications', 30, NULL),
(83, 'LOW', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 31, NULL),
(84, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 32, NULL),
(85, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 32, NULL),
(98, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 37, NULL),
(99, 'ALL', 'RESOURCECODE:ALLERGY', 'Allergies', 37, NULL),
(100, 'ALL', 'RESOURCECODE:ALLERGY', 'Allergies', 38, NULL),
(101, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 38, NULL),
(102, 'ALL', 'RESOURCECODE:MEDICATION', 'Medications', 38, NULL),
(103, 'ALL', 'RESOURCECODE:TESTRESULT', 'Test Results', 38, NULL),
(104, 'ALL', 'RESOURCECODE:IMMUNIZATION', 'Immunizations', 38, NULL),
(105, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 38, NULL),
(106, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 38, NULL),
(107, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 39, NULL),
(108, 'ALL', 'RESOURCECODE:TESTRESULT', 'Test Results', 40, NULL),
(109, 'ALL', 'RESOURCECODE:IMMUNIZATION', 'Immunizations', 40, NULL),
(110, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 41, NULL),
(111, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 41, NULL),
(112, 'ALL', 'RESOURCECODE:IMMUNIZATION', 'Immunizations', 41, NULL),
(113, 'ALL', 'RESOURCECODE:TESTRESULT', 'Test Results', 41, NULL),
(114, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 41, NULL),
(115, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 41, NULL),
(116, 'ALL', 'RESOURCECODE:ALLERGY', 'Allergies', 41, NULL),
(117, 'ALL', 'RESOURCECODE:ALLERGY', 'Allergies', 42, NULL),
(118, 'ALL', 'RESOURCECODE:CONDITION', 'Conditions', 42, NULL),
(119, 'ALL', 'RESOURCECODE:OPERATION', 'Operations', 42, NULL),
(120, 'ALL', 'RESOURCECODE:MEDICATION', 'Medications', 42, NULL),
(121, 'ALL', 'RESOURCECODE:TESTRESULT', 'Test Results', 42, NULL),
(122, 'ALL', 'RESOURCECODE:IMMUNIZATION', 'Immunizations', 42, NULL),
(123, 'ALL', 'RESOURCECODE:HOSPITALVISIT', 'Hospital Visit', 42, NULL),
(124, 'ALL', 'RESOURCECODE:BASICHEALTH', 'Basic Health Information', 42, NULL),
(125, 'B', 'RESOURCECODE:CIEDREPORT', 'CIED Reports', 42, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `resourceelements`
--

CREATE TABLE IF NOT EXISTS `resourceelements` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PATIENTID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=43 ;

--
-- Dumping data for table `resourceelements`
--

INSERT INTO `resourceelements` (`HJID`, `PATIENTID`) VALUES
(5, NULL),
(6, NULL),
(7, 'default'),
(25, NULL),
(26, NULL),
(27, NULL),
(28, NULL),
(29, NULL),
(30, NULL),
(31, NULL),
(32, NULL),
(37, NULL),
(38, NULL),
(39, NULL),
(40, NULL),
(41, NULL),
(42, '191');

-- --------------------------------------------------------

--
-- Table structure for table `sentemailto`
--

CREATE TABLE IF NOT EXISTS `sentemailto` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EMAILTEXT` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=8 ;

--
-- Dumping data for table `sentemailto`
--

INSERT INTO `sentemailto` (`HJID`, `EMAILTEXT`) VALUES
(3, 'Your information has been reached.'),
(4, 'Your information has been reached.'),
(5, 'Your information has been reached.'),
(6, 'Your information has been reached.'),
(7, 'Your information has been reached.');

-- --------------------------------------------------------

--
-- Table structure for table `sentemailtotoitem`
--

CREATE TABLE IF NOT EXISTS `sentemailtotoitem` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ITEM` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TOITEMS_SENTEMAILTO_HJID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FK82D9312DBC58017` (`TOITEMS_SENTEMAILTO_HJID`),
  KEY `FK82D9312D3FD57A7E` (`TOITEMS_SENTEMAILTO_HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=12 ;

--
-- Dumping data for table `sentemailtotoitem`
--

INSERT INTO `sentemailtotoitem` (`HJID`, `ITEM`, `TOITEMS_SENTEMAILTO_HJID`) VALUES
(4, 'hastamail@deneme.com.tr', 3),
(5, 'hastayakin@deneme.com.tr', 3),
(6, 'hastamail@deneme.com.tr', 4),
(7, 'hastayakin@deneme.com.tr', 4),
(8, 'desee@deneme.com.tr', 5),
(9, 'hastamail@deneme.com.tr', 6),
(10, 'hastayakin@deneme.com.tr', 6),
(11, 'desee@deneme.com.tr', 7);

-- --------------------------------------------------------

--
-- Table structure for table `subjectelement`
--

CREATE TABLE IF NOT EXISTS `subjectelement` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `INDIVIDUAL_SUBJECTELEMENT_HJ_0` bigint(20) DEFAULT NULL,
  `GROUP__SUBJECTELEMENT_HJID` bigint(20) DEFAULT NULL,
  `SUBJECTELEMENT_SUBJECTELEMEN_0` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`HJID`),
  KEY `FKF597C450E6066A8A` (`SUBJECTELEMENT_SUBJECTELEMEN_0`),
  KEY `FKF597C45062564F34` (`INDIVIDUAL_SUBJECTELEMENT_HJ_0`),
  KEY `FKF597C450F5457DCD` (`GROUP__SUBJECTELEMENT_HJID`),
  KEY `FKF597C4504334D971` (`SUBJECTELEMENT_SUBJECTELEMEN_0`),
  KEY `FKF597C4503AB9EBED` (`INDIVIDUAL_SUBJECTELEMENT_HJ_0`),
  KEY `FKF597C4509DF1174` (`GROUP__SUBJECTELEMENT_HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=75 ;

--
-- Dumping data for table `subjectelement`
--

INSERT INTO `subjectelement` (`HJID`, `INDIVIDUAL_SUBJECTELEMENT_HJ_0`, `GROUP__SUBJECTELEMENT_HJID`, `SUBJECTELEMENT_SUBJECTELEMEN_0`) VALUES
(6, NULL, 6, 5),
(7, NULL, 7, 6),
(8, NULL, 8, 7),
(9, NULL, 9, 7),
(10, NULL, 10, 7),
(11, NULL, 11, 7),
(12, NULL, 12, 7),
(13, NULL, 13, 7),
(14, 2, NULL, 7),
(33, NULL, 26, 25),
(34, NULL, 27, 26),
(35, NULL, 28, 26),
(36, NULL, 29, 27),
(37, NULL, 30, 28),
(38, NULL, 31, 29),
(39, NULL, 32, 30),
(40, NULL, 33, 30),
(41, NULL, 34, 31),
(42, NULL, 35, 32),
(51, 11, NULL, 34),
(52, NULL, 43, 34),
(53, NULL, 44, 34),
(54, NULL, 45, 34),
(55, NULL, 46, 34),
(56, NULL, 47, 34),
(57, NULL, 48, 34),
(63, NULL, 52, 39),
(64, NULL, 53, 40),
(65, 15, NULL, 41),
(66, 16, NULL, 42),
(67, NULL, 54, 42),
(68, NULL, 55, 43),
(69, NULL, 56, 43),
(70, NULL, 57, 43),
(71, NULL, 58, 43),
(72, NULL, 59, 43),
(73, NULL, 60, 43),
(74, NULL, 61, 44);

-- --------------------------------------------------------

--
-- Table structure for table `subjectelements`
--

CREATE TABLE IF NOT EXISTS `subjectelements` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PATIENTID` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=45 ;

--
-- Dumping data for table `subjectelements`
--

INSERT INTO `subjectelements` (`HJID`, `PATIENTID`) VALUES
(5, NULL),
(6, NULL),
(7, 'default'),
(25, NULL),
(26, NULL),
(27, NULL),
(28, NULL),
(29, NULL),
(30, NULL),
(31, NULL),
(32, NULL),
(34, 'e'),
(39, NULL),
(40, NULL),
(41, NULL),
(42, NULL),
(43, '191'),
(44, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `timeconstraint`
--

CREATE TABLE IF NOT EXISTS `timeconstraint` (
  `HJID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ALLOWFROM` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ALLOWUNTIL` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`HJID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Dumping data for table `timeconstraint`
--

INSERT INTO `timeconstraint` (`HJID`, `ALLOWFROM`, `ALLOWUNTIL`) VALUES
(2, '2001-12-17 09:30:27', '2011-12-20 19:30:27'),
(3, '2001-12-17 09:30:27', '2011-12-20 19:30:27');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `actionelementsactionitem`
--
ALTER TABLE `actionelementsactionitem`
  ADD CONSTRAINT `FKED4293362FAB9D68` FOREIGN KEY (`ACTIONITEMS_ACTIONELEMENTS_H_0`) REFERENCES `actionelements` (`HJID`),
  ADD CONSTRAINT `FKED429336BF1035A1` FOREIGN KEY (`ACTIONITEMS_ACTIONELEMENTS_H_0`) REFERENCES `actionelements` (`HJID`);

--
-- Constraints for table `condition_`
--
ALTER TABLE `condition_`
  ADD CONSTRAINT `FKE56E22C429231261` FOREIGN KEY (`CONDITION_CONSENTRULE_HJID`) REFERENCES `consentrule` (`HJID`),
  ADD CONSTRAINT `FKE56E22C459EBD03F` FOREIGN KEY (`TIMECONSTRAINT_CONDITION_HJID`) REFERENCES `timeconstraint` (`HJID`),
  ADD CONSTRAINT `FKE56E22C45D330CC8` FOREIGN KEY (`CONDITION_CONSENTRULE_HJID`) REFERENCES `consentrule` (`HJID`),
  ADD CONSTRAINT `FKE56E22C4E9506878` FOREIGN KEY (`TIMECONSTRAINT_CONDITION_HJID`) REFERENCES `timeconstraint` (`HJID`);

--
-- Constraints for table `consentdocument`
--
ALTER TABLE `consentdocument`
  ADD CONSTRAINT `FKFADE73155CC60A5C` FOREIGN KEY (`CONSENTDOCUMENTMETADATA_CONS_0`) REFERENCES `consentdocumentmetadatatype` (`HJID`),
  ADD CONSTRAINT `FKFADE7315E9FA56C3` FOREIGN KEY (`CONSENTDOCUMENTMETADATA_CONS_0`) REFERENCES `consentdocumentmetadatatype` (`HJID`);

--
-- Constraints for table `consentrule`
--
ALTER TABLE `consentrule`
  ADD CONSTRAINT `FK14E4DF62D2A63FA` FOREIGN KEY (`CONSENTRULE_CONSENTDOCUMENT__0`) REFERENCES `consentdocument` (`ID`),
  ADD CONSTRAINT `FK14E4DF6320BE4C4` FOREIGN KEY (`OBLIGATION_CONSENTRULE_HJID`) REFERENCES `obligation` (`HJID`),
  ADD CONSTRAINT `FK14E4DF642553C40` FOREIGN KEY (`CONSENTRULETARGET_CONSENTRUL_0`) REFERENCES `consentruletarget` (`HJID`),
  ADD CONSTRAINT `FK14E4DF68A58D2E1` FOREIGN KEY (`CONSENTRULE_CONSENTDOCUMENT__0`) REFERENCES `consentdocument` (`ID`),
  ADD CONSTRAINT `FK14E4DF6A6F817D` FOREIGN KEY (`OBLIGATION_CONSENTRULE_HJID`) REFERENCES `obligation` (`HJID`),
  ADD CONSTRAINT `FK14E4DF6DA38D67` FOREIGN KEY (`CONSENTRULETARGET_CONSENTRUL_0`) REFERENCES `consentruletarget` (`HJID`);

--
-- Constraints for table `consentruletarget`
--
ALTER TABLE `consentruletarget`
  ADD CONSTRAINT `FKF6EEE307399C3AF6` FOREIGN KEY (`SUBJECTELEMENTS_CONSENTRULET_0`) REFERENCES `subjectelements` (`HJID`),
  ADD CONSTRAINT `FKF6EEE30754B1FAEA` FOREIGN KEY (`RESOURCEELEMENTS_CONSENTRULE_0`) REFERENCES `resourceelements` (`HJID`),
  ADD CONSTRAINT `FKF6EEE3078D379D67` FOREIGN KEY (`ACTIONELEMENTS_CONSENTRULETA_0`) REFERENCES `actionelements` (`HJID`),
  ADD CONSTRAINT `FKF6EEE307C128CF1` FOREIGN KEY (`RESOURCEELEMENTS_CONSENTRULE_0`) REFERENCES `resourceelements` (`HJID`),
  ADD CONSTRAINT `FKF6EEE307DC6DCC0F` FOREIGN KEY (`SUBJECTELEMENTS_CONSENTRULET_0`) REFERENCES `subjectelements` (`HJID`),
  ADD CONSTRAINT `FKF6EEE307FDD3052E` FOREIGN KEY (`ACTIONELEMENTS_CONSENTRULETA_0`) REFERENCES `actionelements` (`HJID`);

--
-- Constraints for table `group_`
--
ALTER TABLE `group_`
  ADD CONSTRAINT `FK7DD0CDE08DE97B90` FOREIGN KEY (`MEMBERS_GROUP__HJID`) REFERENCES `members` (`HJID`),
  ADD CONSTRAINT `FK7DD0CDE0E26CC177` FOREIGN KEY (`MEMBERS_GROUP__HJID`) REFERENCES `members` (`HJID`);

--
-- Constraints for table `individual`
--
ALTER TABLE `individual`
  ADD CONSTRAINT `FK1A278E9999FA79E3` FOREIGN KEY (`INDIVIDUAL_MEMBERS_HJID`) REFERENCES `members` (`HJID`),
  ADD CONSTRAINT `FK1A278E99EE7DBFCA` FOREIGN KEY (`INDIVIDUAL_MEMBERS_HJID`) REFERENCES `members` (`HJID`);

--
-- Constraints for table `obligation`
--
ALTER TABLE `obligation`
  ADD CONSTRAINT `FK5B2157E2CB1E45` FOREIGN KEY (`SENTEMAILTO_OBLIGATION_HJID`) REFERENCES `sentemailto` (`HJID`),
  ADD CONSTRAINT `FK5B2157ECEBB23DE` FOREIGN KEY (`SENTEMAILTO_OBLIGATION_HJID`) REFERENCES `sentemailto` (`HJID`);

--
-- Constraints for table `resourceelement`
--
ALTER TABLE `resourceelement`
  ADD CONSTRAINT `FKA21AEB0EAC332A68` FOREIGN KEY (`PARENTRESOURCE_RESOURCEELEME_0`) REFERENCES `resourceelement` (`HJID`),
  ADD CONSTRAINT `FKA21AEB0E2446C6A3` FOREIGN KEY (`RESOURCEELEMENT_RESOURCEELEM_0`) REFERENCES `resourceelements` (`HJID`),
  ADD CONSTRAINT `FKA21AEB0E6CE6349C` FOREIGN KEY (`RESOURCEELEMENT_RESOURCEELEM_0`) REFERENCES `resourceelements` (`HJID`);

--
-- Constraints for table `sentemailtotoitem`
--
ALTER TABLE `sentemailtotoitem`
  ADD CONSTRAINT `FK82D9312D3FD57A7E` FOREIGN KEY (`TOITEMS_SENTEMAILTO_HJID`) REFERENCES `sentemailto` (`HJID`),
  ADD CONSTRAINT `FK82D9312DBC58017` FOREIGN KEY (`TOITEMS_SENTEMAILTO_HJID`) REFERENCES `sentemailto` (`HJID`);

--
-- Constraints for table `subjectelement`
--
ALTER TABLE `subjectelement`
  ADD CONSTRAINT `FKF597C4503AB9EBED` FOREIGN KEY (`INDIVIDUAL_SUBJECTELEMENT_HJ_0`) REFERENCES `individual` (`HJID`),
  ADD CONSTRAINT `FKF597C4504334D971` FOREIGN KEY (`SUBJECTELEMENT_SUBJECTELEMEN_0`) REFERENCES `subjectelements` (`HJID`),
  ADD CONSTRAINT `FKF597C45062564F34` FOREIGN KEY (`INDIVIDUAL_SUBJECTELEMENT_HJ_0`) REFERENCES `individual` (`HJID`),
  ADD CONSTRAINT `FKF597C4509DF1174` FOREIGN KEY (`GROUP__SUBJECTELEMENT_HJID`) REFERENCES `group_` (`HJID`),
  ADD CONSTRAINT `FKF597C450E6066A8A` FOREIGN KEY (`SUBJECTELEMENT_SUBJECTELEMEN_0`) REFERENCES `subjectelements` (`HJID`),
  ADD CONSTRAINT `FKF597C450F5457DCD` FOREIGN KEY (`GROUP__SUBJECTELEMENT_HJID`) REFERENCES `group_` (`HJID`);

