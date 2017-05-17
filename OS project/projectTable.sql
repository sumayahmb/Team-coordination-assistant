CREATE TABLE `project` (
  `idproject` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `projectName` varchar(45) DEFAULT NULL,
  `enrolledUser` varchar(45) DEFAULT NULL,
  `taskName` varchar(45) DEFAULT NULL,
  `taskStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idproject`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
SELECT * FROM os.project;