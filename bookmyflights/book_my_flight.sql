DROP database if exists book_my_flight;
CREATE SCHEMA IF NOT EXISTS `book_my_flight` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `book_my_flight`;

CREATE TABLE IF NOT EXISTS `book_my_flight`.`flights` (
  `id` INT NOT NULL,
  `airlines` varchar(45) NOT NULL,
  `source` varchar(45) NOT NULL,
  `destination` varchar(45) NOT NULL,
  `departure_date` DATE NOT NULL,
  `departure_time` FLOAT NOT NULL,
  `arrival_date` DATE NOT NULL,
  `arrival_time` FLOAT NOT NULL,
  `journey_duration` FLOAT NOT NULL,
  `fare_adult` INT NOT NULL,
  `fare_child` INT NOT NULL,
  `total_seats` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


insert into flights values (1,'American Airlines','New York','London','22-09-22', 21.15,'22-09-23',06.45,9.30,630,600,10);
insert into flights values (2,'British Airways','New York','London','22-09-22', 22.00,'22-09-23',07.45,9.45,620,600,10);
SELECT * FROM book_my_flight.flights;
describe book_my_flight.flights;