-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- 主机： 127.0.0.1:3306
-- 生成日期： 2021-12-14 07:09:29
-- 服务器版本： 5.7.31
-- PHP 版本： 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `javaee`
--

-- --------------------------------------------------------

--
-- 表的结构 `continute`
--

DROP TABLE IF EXISTS `continute`;
CREATE TABLE IF NOT EXISTS `continute` (
  `continute_id` varchar(20) NOT NULL,
  `custom_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `custom_tel` varchar(20) NOT NULL,
  `continute_room` varchar(20) NOT NULL,
  `continute_room_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `live_begin_time` varchar(20) NOT NULL,
  `aleady_live_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `continute_begin_time` varchar(20) NOT NULL,
  `continute_end_time` varchar(20) NOT NULL,
  `continute_total_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `continute_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_tel` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `continute`
--

INSERT INTO `continute` (`continute_id`, `custom_name`, `custom_tel`, `continute_room`, `continute_room_type`, `live_begin_time`, `aleady_live_time`, `continute_begin_time`, `continute_end_time`, `continute_total_time`, `continute_price`, `run_staff_name`, `run_staff_tel`) VALUES
('1', '分父', '17845623456', '204', '单人房', '2021-12-15 12:00:00', '1', '2021-12-16 12:00:00', '2021-12-17 12:00:00', '1', '100元', '小明', '12346578912');

-- --------------------------------------------------------

--
-- 表的结构 `exchanged`
--

DROP TABLE IF EXISTS `exchanged`;
CREATE TABLE IF NOT EXISTS `exchanged` (
  `exchanged_id` varchar(20) NOT NULL,
  `custom_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `custom_tel` varchar(20) NOT NULL,
  `before_room` varchar(20) NOT NULL,
  `before_room_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `before_room_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `after_room` varchar(20) NOT NULL,
  `after_room_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `after_room_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `exchanged_time` varchar(20) NOT NULL,
  `run_staff_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_tel` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `exchanged`
--

INSERT INTO `exchanged` (`exchanged_id`, `custom_name`, `custom_tel`, `before_room`, `before_room_type`, `before_room_price`, `after_room`, `after_room_type`, `after_room_price`, `exchanged_time`, `run_staff_name`, `run_staff_tel`) VALUES
('1', '呃呃', '17845623456', '203', '单人房', '100元', '303', '双人房', '200元', '2021-12-15 12:00:00', '小明', '12346578912');

-- --------------------------------------------------------

--
-- 表的结构 `live_in`
--

DROP TABLE IF EXISTS `live_in`;
CREATE TABLE IF NOT EXISTS `live_in` (
  `live_in_id` varchar(20) NOT NULL,
  `custom_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `custom_identify` varchar(20) NOT NULL,
  `custom_tel` varchar(20) NOT NULL,
  `live_in_room` varchar(20) NOT NULL,
  `live_in_room_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `room_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `live_in_time` varchar(20) NOT NULL,
  `plan_leave_time` varchar(20) NOT NULL,
  `total_live_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `total_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `deposit` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_tel` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `live_in`
--

INSERT INTO `live_in` (`live_in_id`, `custom_name`, `custom_identify`, `custom_tel`, `live_in_room`, `live_in_room_type`, `room_price`, `live_in_time`, `plan_leave_time`, `total_live_time`, `total_price`, `deposit`, `run_staff_name`, `run_staff_tel`) VALUES
('1', '此次', '441621199912251816', '15645678927', '301', '双人房', '200元', '2021-12-15 12:00:00', '2021-12-16 12:00:00', '1', '200元', '50元', '小明', '12346578912'),
('2', '单独', '441621199912251816', '17845623456', '302', '双人房', '200元', '2021-12-15 12:00:00', '2021-12-16 12:00:00', '1', '100元', '50元', '小明', '12346578912');

-- --------------------------------------------------------

--
-- 表的结构 `live_out`
--

DROP TABLE IF EXISTS `live_out`;
CREATE TABLE IF NOT EXISTS `live_out` (
  `live_out_id` varchar(20) NOT NULL,
  `custom_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `custom_tel` varchar(20) NOT NULL,
  `live_out_room` varchar(20) NOT NULL,
  `live_out_room_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `live_in_time` varchar(20) NOT NULL,
  `live_out_time` varchar(20) NOT NULL,
  `total_live_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `total_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `run_staff_tel` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `live_out`
--

INSERT INTO `live_out` (`live_out_id`, `custom_name`, `custom_tel`, `live_out_room`, `live_out_room_type`, `live_in_time`, `live_out_time`, `total_live_time`, `total_price`, `run_staff_name`, `run_staff_tel`) VALUES
('1', '规格', '15645678927', '304', '双人房', '2021-12-15 12:00:00', '2021-12-16 12:00:00', '1', '100元', '小明', '12346578912');

-- --------------------------------------------------------

--
-- 表的结构 `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE IF NOT EXISTS `room` (
  `room_id` varchar(20) NOT NULL,
  `room` varchar(20) NOT NULL,
  `room_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `room_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `state` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `room`
--

INSERT INTO `room` (`room_id`, `room`, `room_type`, `room_price`, `state`) VALUES
('1', '201', '单人房', '100元', '被预定'),
('2', '202', '单人房', '100元', '被预定'),
('3', '203', '单人房', '100元', '空房'),
('4', '204', '单人房', '100元', '已住'),
('5', '205', '单人房', '100元', '空房'),
('6', '206', '单人房', '100元', '空房'),
('7', '301', '双人房', '200元', '已住'),
('8', '302', '双人房', '200元', '已住'),
('9', '303', '双人房', '200元', '已住'),
('10', '304', '双人房', '200元', '空房'),
('11', '305', '双人房', '200元', '空房'),
('12', '306', '双人房', '200元', '空房'),
('17', '405', '单人房', '100元', '空房'),
('16', '404', '单人房', '100元', '空房'),
('15', '403', '单人房', '100元', '空房'),
('14', '402', '单人房', '100元', '空房'),
('13', '401', '单人房', '100元', '空房'),
('21', '503', '大床房', '200元', '空房'),
('20', '502', '大床房', '200元', '空房'),
('19', '501', '大床房', '200元', '空房'),
('18', '406', '单人房', '100元', '空房');

-- --------------------------------------------------------

--
-- 表的结构 `scheduled`
--

DROP TABLE IF EXISTS `scheduled`;
CREATE TABLE IF NOT EXISTS `scheduled` (
  `scheduled_id` varchar(20) NOT NULL,
  `custom_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `custom_identify` varchar(20) NOT NULL,
  `custom_tel` varchar(20) NOT NULL,
  `scheduled_room` varchar(20) NOT NULL,
  `scheduled_room_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `scheduled_time` varchar(20) NOT NULL,
  `scheduled_begin_live` varchar(20) NOT NULL,
  `scheduled_end_leave` varchar(20) NOT NULL,
  `scheduled_total_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `scheduled_price` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `scheduled`
--

INSERT INTO `scheduled` (`scheduled_id`, `custom_name`, `custom_identify`, `custom_tel`, `scheduled_room`, `scheduled_room_type`, `scheduled_time`, `scheduled_begin_live`, `scheduled_end_leave`, `scheduled_total_time`, `scheduled_price`) VALUES
('1', '啊啊', '441621200112251816', '15645678923', '201', '单人房', '2021-12-15 12:00:00', '2021-12-16 12:00:00', '2021-12-17 12:00:00', '1', '100元'),
('2', '版本', '441621199912251816', '15645678927', '202', '单人房', '2021-12-15 12:00:00', '2021-12-16 12:00:00', '2021-12-17 12:00:00', '1', '100元');

-- --------------------------------------------------------

--
-- 表的结构 `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `authority` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- 转存表中的数据 `users`
--

INSERT INTO `users` (`id`, `name`, `password`, `email`, `authority`) VALUES
('17876233971', '张平', '20201225159fda21', '1183251680@qq.com', 'manage'),
('12345678912', '小明', '20201452fd22', '112536982@qq.com', 'staff'),
('78945612378', '小红', '19201452fd22', '852536982@qq.com', 'staff'),
('15917764687', '老板', '20201225fda12321', '1183251680@qq.com', 'manage');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
