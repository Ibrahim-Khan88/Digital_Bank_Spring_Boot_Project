-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2021 at 08:25 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `digital_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

CREATE TABLE `content` (
  `id` int(11) NOT NULL,
  `amount` bigint(20) NOT NULL,
  `channel` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `referenceid` varchar(255) DEFAULT NULL,
  `remote_account` varchar(255) DEFAULT NULL,
  `txn_id` varchar(255) DEFAULT NULL,
  `txn_time` varchar(255) DEFAULT NULL,
  `txn_type` varchar(255) DEFAULT NULL,
  `user_identifier` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`id`, `amount`, `channel`, `data`, `description`, `note`, `referenceid`, `remote_account`, `txn_id`, `txn_time`, `txn_type`, `user_identifier`) VALUES
(1, -150, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'OQDLZA3EGS', '2021-11-15T19:46:23.243', 'Send Money', '01674242986'),
(2, 150, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'OQDLZA3EGS', '2021-11-15T19:46:23.339', 'Send Money', '10100'),
(3, -100, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'H0BSZ604DB', '2021-11-15T19:47:15.604', 'Send Money', '01674242986'),
(4, 100, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'H0BSZ604DB', '2021-11-15T19:47:15.678', 'Send Money', '10100'),
(5, -200, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'CF3EE3VK6K', '2021-11-15T19:57:40.838', 'Send Money', '01674242986'),
(6, 200, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'CF3EE3VK6K', '2021-11-15T19:57:40.940', 'Send Money', '10100'),
(7, -250, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'WWBYP6EUR1', '2021-11-15T19:57:56.086', 'Send Money', '01674242986'),
(8, 250, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'WWBYP6EUR1', '2021-11-15T19:57:56.162', 'Send Money', '10100'),
(9, -350, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'ZNB2VX7NBS', '2021-11-15T19:59:52.060', 'Send Money', '01674242986'),
(10, 350, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'ZNB2VX7NBS', '2021-11-15T19:59:52.144', 'Send Money', '10100'),
(15, -650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'SRT3ZYMJFS', '2021-11-15T21:49:01.511', 'Send Money', '01674242986'),
(16, 650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'SRT3ZYMJFS', '2021-11-15T21:49:01.601', 'Send Money', '10100'),
(17, -650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'WWLH9RUY6W', '2021-11-15T22:14:26.025', 'Send Money', '01674242986'),
(18, 650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'WWLH9RUY6W', '2021-11-15T22:14:26.115', 'Send Money', '10100'),
(19, -650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', '3K1HEEU17U', '2021-11-15T22:14:31.436', 'Send Money', '01674242986'),
(20, 650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', '3K1HEEU17U', '2021-11-15T22:14:31.521', 'Send Money', '10100'),
(21, -650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'W64C3O5D3R', '2021-11-15T23:11:59.622', 'Send Money', '01674242986'),
(22, 650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'W64C3O5D3R', '2021-11-15T23:11:59.715', 'Send Money', '10100'),
(23, -650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'ETGPVECY6R', '2021-11-15T23:13:32.017', 'Send Money', '01674242986'),
(24, 650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'ETGPVECY6R', '2021-11-15T23:13:32.365', 'Send Money', '10100'),
(25, -650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'OLJAB40JJN', '2021-11-15T23:13:53.322', 'Send Money', '01674242986'),
(26, 650, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'OLJAB40JJN', '2021-11-15T23:13:53.432', 'Send Money', '10100'),
(27, -50, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'JUJR0F6U52', '2021-11-15T23:15:44.961', 'Send Money', '01674242986'),
(28, 50, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'JUJR0F6U52', '2021-11-15T23:15:45.071', 'Send Money', '10100'),
(41, -85, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'MSFXDRR5GU', '2021-11-15T23:44:40.302', 'Payment', '01674242986'),
(42, 85, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'MSFXDRR5GU', '2021-11-15T23:44:40.405', 'Payment', '10100'),
(43, -10, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'PTVD3IBFPW', '2021-11-15T23:53:31.270', 'Send Money', '01674242986'),
(44, 10, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'PTVD3IBFPW', '2021-11-15T23:53:31.374', 'Send Money', '10100'),
(45, -10, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'YEE0ROZVLI', '2021-11-15T23:54:05.782', 'Payment', '01674242986'),
(46, 10, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'YEE0ROZVLI', '2021-11-15T23:54:05.903', 'Payment', '10100'),
(47, -500, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'K02I2GTWRV', '2021-11-16T00:06:00.079', 'Add Money', '01674242986'),
(48, 500, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'K02I2GTWRV', '2021-11-16T00:06:00.144', 'Add Money', '10100'),
(49, -500, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'S1PAFGF7K1', '2021-11-16T22:19:34.266', 'Add Money', '01674242986'),
(50, 500, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'S1PAFGF7K1', '2021-11-16T22:19:34.633', 'Add Money', '10100'),
(51, -400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'CEUF21HOSS', '2021-11-16T22:32:48.359', 'Add Money', '01674242986'),
(52, 400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'CEUF21HOSS', '2021-11-16T22:32:48.505', 'Add Money', '10100'),
(53, -400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'VIBY047AQG', '2021-11-16T23:14:35.605', 'Add Money', '01674242986'),
(54, 400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'VIBY047AQG', '2021-11-16T23:14:35.744', 'Add Money', '10100'),
(55, -400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'GMIS73LU4G', '2021-11-16T23:17:15.295', 'Add Money', '01674242986'),
(56, 400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'GMIS73LU4G', '2021-11-16T23:17:15.397', 'Add Money', '10100'),
(57, -400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'FW9GJ5XSDV', '2021-11-16T23:18:15.260', 'Add Money', '01674242986'),
(58, 400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'FW9GJ5XSDV', '2021-11-16T23:18:15.352', 'Add Money', '10100'),
(59, -400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', '75SGYZPBHJ', '2021-11-16T23:23:32.571', 'Send Money', '01674242986'),
(60, 400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', '75SGYZPBHJ', '2021-11-16T23:23:32.646', 'Send Money', '10100'),
(61, -100, 'REST', 'Joma', ' ', '', '6411-AZOM', '10100', 'TV8FNHHQMK', '2021-11-16T23:33:44.896', 'Send Money', '01674242986'),
(62, 100, 'REST', 'Joma', ' ', '', '6411-AZOM', '01674242986', 'TV8FNHHQMK', '2021-11-16T23:33:44.991', 'Send Money', '10100'),
(63, -100, 'REST', NULL, '', 'market', 'L3RE345', '10100', 'BBWPNNVNB5', '2021-11-16T23:35:50.669', 'Payment', '01674242986'),
(64, 100, 'REST', NULL, '', 'market', 'L3RE345', '01674242986', 'BBWPNNVNB5', '2021-11-16T23:35:50.841', 'Payment', '10100'),
(65, -200, 'MOBILE', NULL, '', 'Test From APP', '63633-AZOM', '01674242986', '52TGEK5Y5L', '2021-11-16T23:44:54.305', 'Add Money', '10100'),
(66, 200, 'MOBILE', NULL, '', 'Test From APP', '63633-AZOM', '10100', '52TGEK5Y5L', '2021-11-16T23:44:54.464', 'Add Money', '01674242986'),
(67, -500, 'REST', 'Joma', ' ', 'Birth day gift', '6411-AZOM', '10100', 'VPY9N1HCWV', '2021-11-16T23:50:47.576', 'Send Money', '01674242986'),
(68, 500, 'REST', 'Joma', ' ', 'Birth day gift', '6411-AZOM', '01674242986', 'VPY9N1HCWV', '2021-11-16T23:50:47.806', 'Send Money', '10100'),
(69, -1000, 'REST', NULL, '', 'Market', 'L3RE345', '01674242986', 'J1Q4BZI4PY', '2021-11-16T23:52:09.915', 'Payment', '10100'),
(70, 1000, 'REST', NULL, '', 'Market', 'L3RE345', '10100', 'J1Q4BZI4PY', '2021-11-16T23:52:10.035', 'Payment', '01674242986'),
(71, -400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '10100', 'O30X8CPJZ0', '2021-11-17T00:05:53.106', 'Send Money', '01674242986'),
(72, 400, 'REST', 'Joma', '', 'Test Send Money', '6411-AZOM', '01674242986', 'O30X8CPJZ0', '2021-11-17T00:05:53.236', 'Send Money', '10100'),
(73, -500, 'REST', 'Joma', ' ', 'Gift', '6411-AZOM', '01912835586', 'C2FWT5FVD0', '2021-11-17T01:24:43.802', 'Send Money', '01674242986'),
(74, 500, 'REST', 'Joma', ' ', 'Gift', '6411-AZOM', '01674242986', 'C2FWT5FVD0', '2021-11-17T01:24:44.080', 'Send Money', '01912835586');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(75);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `identifier` varchar(50) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `balance` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`identifier`, `address`, `balance`, `name`, `password`) VALUES
('01674242986', 'Khulna', 3400, 'Md Ibrahim Khan', '112233'),
('01912835586', 'Khulna', 3500, 'Shohid', '3333344'),
('10100', 'Dhaka', 6100, 'Hasiv Ullah', '223344');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `content`
--
ALTER TABLE `content`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlw4fxwrtrn8dchvc655bvqy93` (`user_identifier`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`identifier`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `content`
--
ALTER TABLE `content`
  ADD CONSTRAINT `FKlw4fxwrtrn8dchvc655bvqy93` FOREIGN KEY (`user_identifier`) REFERENCES `user` (`identifier`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
