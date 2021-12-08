-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 31, 2020 at 06:13 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `booksettledetails`
--

DROP TABLE IF EXISTS `booksettledetails`;
CREATE TABLE IF NOT EXISTS `booksettledetails` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MemID` int(11) NOT NULL,
  `MemName` varchar(20) NOT NULL,
  `BookID` int(11) NOT NULL,
  `BookName` varchar(20) NOT NULL,
  `DelayDates` int(11) NOT NULL,
  `Fine` float NOT NULL,
  `TotalPaid` float NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `borrowbook`
--

DROP TABLE IF EXISTS `borrowbook`;
CREATE TABLE IF NOT EXISTS `borrowbook` (
  `BorrowBID` int(11) NOT NULL AUTO_INCREMENT,
  `MemberID` int(10) NOT NULL,
  `BookID` int(11) NOT NULL,
  `MemberName` varchar(20) NOT NULL,
  `BookName` varchar(20) NOT NULL,
  `BorrowingDate` varchar(10) NOT NULL,
  `ReturningDate` varchar(10) NOT NULL,
  PRIMARY KEY (`BorrowBID`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrowbook`
--

INSERT INTO `borrowbook` (`BorrowBID`, `MemberID`, `BookID`, `MemberName`, `BookName`, `BorrowingDate`, `ReturningDate`) VALUES
(34, 12, 10, 'Malshan', 'Lod of rings ', '2020-04-18', '2020-04-20'),
(36, 12, 2, 'malshannnn', 'Harry Potter', '2020-03-27', '2020-03-30'),
(32, 12, 2, 'malshannnn', 'Harry Potter', '2020-03-27', '2020-03-30'),
(21, 12, 10, 'Malshan', 'Lod of rings ', '2020-04-18', '2020-04-20');

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE IF NOT EXISTS `invoice` (
  `BookID` int(11) NOT NULL,
  `MemberName` varchar(20) NOT NULL,
  `BookName` varchar(20) NOT NULL,
  `Fine` float NOT NULL,
  `TotalFine` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `itemtable`
--

DROP TABLE IF EXISTS `itemtable`;
CREATE TABLE IF NOT EXISTS `itemtable` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BookName` varchar(20) NOT NULL,
  `AuthorName` varchar(20) NOT NULL,
  `ISBN` varchar(15) NOT NULL,
  `Price` int(15) NOT NULL,
  `NoCopies` int(15) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `itemtable`
--

INSERT INTO `itemtable` (`ID`, `BookName`, `AuthorName`, `ISBN`, `Price`, `NoCopies`) VALUES
(2, 'Rob116', 'Robert', 'Rob116', 1500, 133),
(10, 'Lod of rings ', 'Martin', 'ISBN1010', 1500, 145);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE IF NOT EXISTS `member` (
  `MemberID` int(11) NOT NULL AUTO_INCREMENT,
  `MemberName` varchar(50) NOT NULL,
  `Contact` int(10) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `RegDate` varchar(10) NOT NULL,
  `BookID` int(10) DEFAULT NULL,
  PRIMARY KEY (`MemberID`),
  UNIQUE KEY `memberID` (`MemberID`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`MemberID`, `MemberName`, `Contact`, `Address`, `NIC`, `RegDate`, `BookID`) VALUES
(12, 'Lahiru Malshan', 775072999, 'no 8/A, Thalahena, Negombo 12', '960463196V', '2020.03.30', 0),
(3, 'aada', 158485, 'asad', '1212121', '212121', NULL),
(4, 'Malshan', 505050, '8/A', '1212121', '3030', 0),
(13, 'malshannnn', 474774444, 'asad', '552545', '2020-03-27', NULL),
(7, 'aad', 55441, 'asada', '1212', '122', NULL),
(11, 'Malshan', 7750, 'negombo', '9604', '2828', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `ID` int(5) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `UserName`, `Password`) VALUES
(1, 'Admin', 'asd123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
