-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16-Nov-2023 às 09:31
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clientes`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbclientes`
--

CREATE TABLE `tbclientes` (
  `cod` int(255) NOT NULL,
  `funcao` varchar(200) NOT NULL,
  `departamento` varchar(200) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `dt_nasc` varchar(10) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `tbclientes`
--

INSERT INTO `tbclientes` (`cod`, `funcao`, `departamento`, `nome`, `dt_nasc`, `telefone`, `email`) VALUES
(1, 'Especialista em Recrutamento', 'Recursos Humanos', 'Antonio', '17/03/1939', '(11)11111-1111', 'antonio@antonio.com.br'),
(2, 'Analista Financeiro', 'Finanças e Contabilidade', 'Edna', '27/03/1969', '(11)22222-2222', 'edna@edna.com.br'),
(3, 'Representante de Vendas', 'Vendas e Marketing', 'Gustavo', '27/05/2000', '(11)33333-3333', 'hustavo@gustavo.com.br'),
(4, 'Supervisor de Produção', 'Produção ou Operações', 'aaaaaaa', '01/01/2001', '(11)44444-4444', 'aaa@aaa.com.br'),
(5, 'Desenvolvedor de Software', 'Tecnologia da Informação', 'bbbbb', '02/02/2002', '(11)55555-5555', 'bbb@bbb.com.br');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `id_cliente` int(255) NOT NULL,
  `nome_usuario` varchar(255) NOT NULL,
  `senha_usuario` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`id_cliente`, `nome_usuario`, `senha_usuario`) VALUES
(1, 'ViniciusAdm', 'admin123!'),
(2, 'LayaraAdm', 'admin123!');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbclientes`
--
ALTER TABLE `tbclientes`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD PRIMARY KEY (`id_cliente`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbclientes`
--
ALTER TABLE `tbclientes`
  MODIFY `cod` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `tbusuario`
--
ALTER TABLE `tbusuario`
  MODIFY `id_cliente` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
