-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 05, 2022 at 06:16 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `thesisFishTest`
--

-- --------------------------------------------------------

--
-- Table structure for table `EggFryCount`
--

CREATE TABLE `EggFryCount` (
  `testID` int(5) NOT NULL,
  `noOfEggs` int(11) DEFAULT NULL,
  `noOfFries` int(11) DEFAULT NULL,
  `eggImg` mediumblob DEFAULT NULL,
  `fryImg` mediumblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `EggFryCount`
--

INSERT INTO `EggFryCount` (`testID`, `noOfEggs`, `noOfFries`, `eggImg`, `fryImg`) VALUES
(100, 20, 15, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `EggImgCountDB`
--

CREATE TABLE `EggImgCountDB` (
  `eggTestID` int(10) NOT NULL,
  `noOfEggsInMirco` int(5) NOT NULL,
  `noOfEggsInTank` int(10) NOT NULL,
  `testDate` varchar(10) NOT NULL,
  `testTime` varchar(10) NOT NULL,
  `hatchTankNum` int(10) NOT NULL,
  `eggImage` varchar(150) NOT NULL,
  `userID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `EggImgCountDB`
--

INSERT INTO `EggImgCountDB` (`eggTestID`, `noOfEggsInMirco`, `noOfEggsInTank`, `testDate`, `testTime`, `hatchTankNum`, `eggImage`, `userID`) VALUES
(1, 20, 200, '2021-11-27', '11:44:26', 1, '/home/hans/test/fisheggs.jpg', 101),
(2, 90, 350, '2021-09-29', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test1.jpg', 5),
(3, 90, 400, '2021-09-30', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test2.jpg', 5),
(4, 90, 300, '2021-10-01', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test3.jpg', 5),
(5, 90, 1855, '2021-10-11', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test4.jpg', 5),
(6, 90, 5475, '2021-10-18', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test5.jpg', 5),
(7, 90, 3899, '2021-10-25', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test6.jpg', 5),
(8, 90, 8165, '2021-11-3', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test7.jpg', 5),
(9, 90, 3960, '2021-11-15', '08:00:45', 1, '/home/hansherrera/Pictures/egg-test8.jpg', 5),
(10, 408, 4080, '2022-01-07', '10:13:02', 1, '/home/hansherrera/Downloads/eggfrytotest/CE_460_50res.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ForecastingRateDB`
--

CREATE TABLE `ForecastingRateDB` (
  `forecastID` int(5) NOT NULL,
  `testDate` varchar(10) NOT NULL,
  `testTime` varchar(10) NOT NULL,
  `survivalRateForecast` int(5) NOT NULL,
  `startFryTestID` int(10) NOT NULL,
  `endFryTestID` int(10) NOT NULL,
  `userID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ForecastingRateDB`
--

INSERT INTO `ForecastingRateDB` (`forecastID`, `testDate`, `testTime`, `survivalRateForecast`, `startFryTestID`, `endFryTestID`, `userID`) VALUES
(1, '2021-12-20', '15:29:53', 87, 3, 10, 1),
(2, '2021-12-20', '17:09:36', 87, 3, 10, 1),
(3, '2021-12-20', '17:16:24', 87, 3, 10, 6),
(4, '2022-01-06', '15:00:58', 84, 3, 11, 1);

-- --------------------------------------------------------

--
-- Table structure for table `FryImgCountDB`
--

CREATE TABLE `FryImgCountDB` (
  `fryTestID` int(10) NOT NULL,
  `noOfFriesInTank` int(10) NOT NULL,
  `survivalRate` double NOT NULL,
  `testDate` varchar(10) NOT NULL,
  `testTime` varchar(10) NOT NULL,
  `hatchTankNum` int(10) NOT NULL,
  `fryImage` varchar(150) NOT NULL,
  `eggTestID` int(10) NOT NULL,
  `userID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `FryImgCountDB`
--

INSERT INTO `FryImgCountDB` (`fryTestID`, `noOfFriesInTank`, `survivalRate`, `testDate`, `testTime`, `hatchTankNum`, `fryImage`, `eggTestID`, `userID`) VALUES
(2, 100, 30, '2021-11-27', '11:41:24', 1, '/home/hans/test/fry.jpg', 1, 101),
(3, 200, 57, '2021-09-29', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 2, 1),
(4, 305, 76, '2021-10-07', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 3, 1),
(5, 287, 96, '2021-10-08', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 4, 1),
(6, 1579, 85, '2021-10-18', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 5, 1),
(7, 5305, 97, '2021-10-25', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 6, 1),
(8, 3789, 97, '2021-11-01', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 7, 1),
(9, 7234, 89, '2021-11-10', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 8, 1),
(10, 2996, 76, '2021-11-22', '10:20:15', 1, '/home/hansherrera/Pictures/test-data.jpg', 9, 1),
(11, 6760, 86, '2021-12-28', '12:28:17', 1, '/home/hansherrera/Downloads/eggfrytotest/CF_687_50res_crop.jpg', 4, 1),
(12, 105850, 0, '2022-01-06', '14:57:06', 1, '/home/hansherrera/Downloads/eggfrytotest/CF_687_50res_crop.jpg', 5, 1),
(13, 135200, 0, '2022-01-06', '20:55:54', 1, '/home/hansherrera/Downloads/eggfrytotest/CF_687_50res_crop.jpg', 8, 1),
(14, 10840, 1200, '2022-01-07', '10:13:59', 1, '/home/hansherrera/Downloads/eggfrytotest/CF_687_50res_crop.jpg', 7, 1);

-- --------------------------------------------------------

--
-- Table structure for table `javaTable`
--

CREATE TABLE `javaTable` (
  `id` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `javaTable`
--

INSERT INTO `javaTable` (`id`, `firstName`, `lastName`) VALUES
(1, 'java26', 'jones'),
(2, 'java23', 'jones');

-- --------------------------------------------------------

--
-- Table structure for table `userDB`
--

CREATE TABLE `userDB` (
  `userID` int(5) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `contactNum` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userDB`
--

INSERT INTO `userDB` (`userID`, `firstName`, `lastName`, `password`, `contactNum`, `email`, `address`) VALUES
(1, 'John', 'Doe', 'password', '87000', 'example@email.com', 'Jaro, Iloilo City'),
(3, 'John', 'Cena', 'Chicago, USA', '696969', 'john@email.com', ''),
(4, 'Makoto', 'Shinkai', 'abc123', '555-5555', 'example2@email.com', 'Tokyo, Japan'),
(5, 'Hans', 'Xing', 'password', '333-2222', 'h.xing@gmail.com', 'Jaro, Iloilo City'),
(6, 'Harry', 'Garcia', '123', '12345', 'harry@gmail.com', 'Manila, Philippines');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `EggFryCount`
--
ALTER TABLE `EggFryCount`
  ADD PRIMARY KEY (`testID`);

--
-- Indexes for table `EggImgCountDB`
--
ALTER TABLE `EggImgCountDB`
  ADD PRIMARY KEY (`eggTestID`);

--
-- Indexes for table `ForecastingRateDB`
--
ALTER TABLE `ForecastingRateDB`
  ADD PRIMARY KEY (`forecastID`);

--
-- Indexes for table `FryImgCountDB`
--
ALTER TABLE `FryImgCountDB`
  ADD PRIMARY KEY (`fryTestID`);

--
-- Indexes for table `javaTable`
--
ALTER TABLE `javaTable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userDB`
--
ALTER TABLE `userDB`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `EggFryCount`
--
ALTER TABLE `EggFryCount`
  MODIFY `testID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `EggImgCountDB`
--
ALTER TABLE `EggImgCountDB`
  MODIFY `eggTestID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `ForecastingRateDB`
--
ALTER TABLE `ForecastingRateDB`
  MODIFY `forecastID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `FryImgCountDB`
--
ALTER TABLE `FryImgCountDB`
  MODIFY `fryTestID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `javaTable`
--
ALTER TABLE `javaTable`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `userDB`
--
ALTER TABLE `userDB`
  MODIFY `userID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
