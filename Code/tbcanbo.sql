-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th10 30, 2022 lúc 05:32 PM
-- Phiên bản máy phục vụ: 8.0.27
-- Phiên bản PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlcb`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbcanbo`
--

DROP TABLE IF EXISTS `tbcanbo`;
CREATE TABLE IF NOT EXISTS `tbcanbo` (
  `SoTK` varchar(100) NOT NULL,
  `Hoten` varchar(50) DEFAULT NULL,
  `GT` varchar(5) DEFAULT NULL,
  `Diachi` varchar(100) DEFAULT NULL,
  `Luong` int DEFAULT NULL,
  PRIMARY KEY (`SoTK`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `tbcanbo`
--

INSERT INTO `tbcanbo` (`SoTK`, `Hoten`, `GT`, `Diachi`, `Luong`) VALUES
('111122223333', 'Đặng Minh Hải', 'Nam', 'Vĩnh tường VP', 5000000),
('987654321', 'Nguyễn Trọng Ninh', 'Nữ', 'Thôn Trì Lành', 1000000),
('1212', 'Tạ Minh Quang', 'Nam', 'TT HN', 50000),
('123123', 'Tăng tự phúuuuu', 'Nam', 'Lai vu hai duong', 600000),
('8888', 'Tạ minh quang', 'nam', 'thatha', 80000),
('9999', 'abc', 'Nam', 'hn', 10000),
('111', 'TMQ', 'Nữ', 'Thạch thất', 1000),
('2222', 'test', 'Nữ', 'hn', 9999);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
