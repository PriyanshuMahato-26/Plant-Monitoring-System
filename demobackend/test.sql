-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2022 at 08:38 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `city` varchar(100) NOT NULL,
  `type_of_soil` varchar(100) NOT NULL,
  `moisture_level` varchar(100) NOT NULL,
  `humidity` varchar(100) NOT NULL,
  `temperature` varchar(100) NOT NULL,
  `atmospheric_saturation` varchar(100) NOT NULL,
  `depth_of_ground_water` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`city`, `type_of_soil`, `moisture_level`, `humidity`, `temperature`, `atmospheric_saturation`, `depth_of_ground_water`) VALUES
('Jamshedpur\r\n', '\r\nRed Soil\r\n', '142m\r\n', '60%\r\n', 'Summer : 32°C   winter:- 12°C', '', ''),
('Cuttack', 'Alluvial Soil', '164m', '54%', 'Summer: - 40°C   winter:- 10°C', '', ''),
('Nagpur', 'Kali soil', '120m', '62%', 'Summer: - 42°C   winter:- 18°C', '156', ' Pre Monsoon 4.6 to 16.92 mbgl  and Post-Monsoon 4.16 to 14.34 mbgl');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
