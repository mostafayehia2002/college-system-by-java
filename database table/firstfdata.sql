-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2023 at 07:03 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `firstfdata`
--

-- --------------------------------------------------------

--
-- Table structure for table `computer_organization`
--

CREATE TABLE `computer_organization` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `quiz` double DEFAULT NULL,
  `midterm` double DEFAULT NULL,
  `attendance` double DEFAULT NULL,
  `final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `computer_organization`
--

INSERT INTO `computer_organization` (`id`, `name`, `subject`, `quiz`, `midterm`, `attendance`, `final`) VALUES
(1, 'mostafa', 'computer_organization', 6, 8, 5, 51),
(2, 'mohamed', 'computer_organization', 7, 19, 5, 59),
(3, 'ahmed', 'computer_organization', 5, 13, 5, 20),
(4, 'ali', 'computer_organization', 5, 11, 2, 34),
(5, 'nada', 'computer_organization', 7.5, 16, 4, 27.8),
(6, 'nesma', 'computer_organization', 5.6, 11, 5, 30),
(7, 'menna', 'operating_system', 6, 18, 4, 26);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `usernames` varchar(28) DEFAULT NULL,
  `statues` varchar(28) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `usernames`, `statues`, `password`) VALUES
(1, 'mostafa', 'student', 'mostafa'),
(2, 'mohamed', 'student', 'mohamed'),
(3, 'ahmed', 'student', 'ahmed'),
(4, 'ali', 'student', 'ali'),
(5, 'dr_hatem', 'teacher', 'hatem'),
(6, 'dr_osama', 'teacher', 'osama'),
(7, 'dr_ashrf', 'teacher', 'ashrf'),
(8, 'dr_gamal', 'teacher', 'gamal'),
(9, 'dr_anas', 'teacher', 'anas'),
(10, 'dr_eman', 'teacher', 'eman'),
(14, 'nada', 'student', 'nada'),
(15, 'nesma', 'student', 'nesma'),
(16, 'menna', 'student', 'menna');

-- --------------------------------------------------------

--
-- Table structure for table `math3`
--

CREATE TABLE `math3` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `quiz` double DEFAULT NULL,
  `midterm` double DEFAULT NULL,
  `attendance` double DEFAULT NULL,
  `final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `math3`
--

INSERT INTO `math3` (`id`, `name`, `subject`, `quiz`, `midterm`, `attendance`, `final`) VALUES
(1, 'mostafa', 'math3', 9, 15, 5, 54),
(2, 'mohamed', 'math3', 8, 14, 5, 43),
(3, 'ahmed', 'math3', 8, 13, 5, 33),
(4, 'ahmed', 'math3', 6.4, 14, 5, 35),
(5, 'ali', 'math3', 7.4, 17, 3, 28),
(6, 'nada', 'math3', 4.5, 16, 3, 29.8),
(7, 'nesma', 'math3', 5.6, 11, 5, 30),
(8, 'menna', 'math3', 6, 15, 5, 25);

-- --------------------------------------------------------

--
-- Table structure for table `modelling`
--

CREATE TABLE `modelling` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `quiz` double DEFAULT NULL,
  `midterm` double DEFAULT NULL,
  `attendance` double DEFAULT NULL,
  `final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `network`
--

CREATE TABLE `network` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `quiz` double DEFAULT NULL,
  `midterm` double DEFAULT NULL,
  `attendance` double DEFAULT NULL,
  `final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `operating_system`
--

CREATE TABLE `operating_system` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `quiz` double DEFAULT NULL,
  `midterm` double DEFAULT NULL,
  `attendance` double DEFAULT NULL,
  `final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `programming_2`
--

CREATE TABLE `programming_2` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `quiz` double DEFAULT NULL,
  `midterm` double DEFAULT NULL,
  `attendance` double DEFAULT NULL,
  `final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `computer_organization`
--
ALTER TABLE `computer_organization`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `math3`
--
ALTER TABLE `math3`
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `computer_organization`
--
ALTER TABLE `computer_organization`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `math3`
--
ALTER TABLE `math3`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
