-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2018 a las 13:51:54
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `adrentcar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Cedula` varchar(30) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Cedula`, `Nombre`, `Apellido`, `Direccion`, `Telefono`) VALUES
('401-548796-0', 'Andy', 'Ramirez', 'C/ A #10, Los Frailes.', '809-123-4567'),
('123-422112-1', 'Juan', 'Perez', 'C/Rosas #4', '809-123-3344'),
('342-343213-3', 'Rosa', 'Vargas', 'C/Peru #5 Los Prados', '809-212-3632');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `Numero` int(10) NOT NULL,
  `Nombre_Cliente` varchar(30) NOT NULL,
  `Paquete` varchar(30) NOT NULL,
  `FechadeSalida` varchar(60) NOT NULL,
  `FechadeRegreso` varchar(60) NOT NULL,
  `Seguro` varchar(30) NOT NULL,
  `Placa` varchar(30) NOT NULL,
  `Usuario` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`Numero`, `Nombre_Cliente`, `Paquete`, `FechadeSalida`, `FechadeRegreso`, `Seguro`, `Placa`, `Usuario`) VALUES
(11, 'Rosa', 'Intermedio', 'Sun May 13 23:05:34 BOT 2018', 'Sun May 27 23:05:41 BOT 2018', 'Semi-Full', '9539A34', 'Andy'),
(12, 'Juan', 'Full', 'Fri May 18 23:05:34 BOT 2018', 'Sun May 27 23:05:41 BOT 2018', 'Full', '4984jds', 'Andy');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IDUsuario` int(10) NOT NULL,
  `NombreU` varchar(20) NOT NULL,
  `TipoUsuario` varchar(15) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IDUsuario`, `NombreU`, `TipoUsuario`, `pass`) VALUES
(1, 'Diomar', 'Admin', '123456'),
(2, 'Yoan', 'Vendedor', '123456'),
(3, 'Andy', 'Admin', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `Placa` varchar(10) NOT NULL,
  `Marca` varchar(20) NOT NULL,
  `Modelo` varchar(20) NOT NULL,
  `Color` varchar(10) NOT NULL,
  `Año` int(4) DEFAULT NULL,
  `Categoria` varchar(15) NOT NULL,
  `kilometraje` int(11) DEFAULT NULL,
  `Estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`Placa`, `Marca`, `Modelo`, `Color`, `Año`, `Categoria`, `kilometraje`, `Estado`) VALUES
('4984jds', 'Ford', 'Explorer XL', 'Gris', 2015, 'Luxury', 2313, 'Alquilado'),
('593Eb20', 'Hyundai', 'Grand10', 'Dorado', 2017, 'Compact', 123, 'Disponible'),
('9539A34', 'Audi', 'A3', 'Blanco', 2018, 'Sedan', 0, 'Alquilado'),
('A-118747', 'Toyota', '4Runner', 'Azul', 2001, 'Sedan', 1400, 'Disponible'),
('A-858749', 'Honda', 'Accord', 'Rojo', 2008, 'Sedan', 1500, 'Alquilado'),
('Lv8484', 'Toyota', 'Hilux', 'Negro', 2016, 'Pickup', 244, 'Disponible');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`Numero`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IDUsuario`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`Placa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `Numero` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IDUsuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
