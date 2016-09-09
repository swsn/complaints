
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
  employeeId CHAR (8) NOT NULL,
  employeeName VARCHAR (20) NOT NULL,
  position VARCHAR (20) NOT NULL,
  employeeEmail VARCHAR (25) NOT NULL,

  PRIMARY KEY (employeeId)
);


DROP TABLE IF EXISTS Project;
CREATE TABLE Project
(
    projectId INT(5) NOT NULL,
    name VARCHAR (20) NOT NULL,
    city VARCHAR (15) NOT NULL,
    branch VARCHAR (15) NOT NULL,
    branchManager CHAR (8) NOT NULL REFERENCES Employee(employeeId),
    regionalDirector CHAR (8) NOT NULL REFERENCES Employee(employeeId),

    PRIMARY KEY (projectId)
);


DROP TABLE IF EXISTS WorksOn;
CREATE TABLE WorksOn
(
    employeeId CHAR (8) NOT NULL REFERENCES Employee(employeeId),
    projectId INT(5) NOT NULL NOT NULL REFERENCES Project (projectId),

    PRIMARY KEY (employeeId , projectId)

);

DROP TABLE IF EXISTS Visitor;
CREATE TABLE Visitor
(
  phoneNumber VARCHAR (10) NOT NULL,
  visitorName VARCHAR (30) NOT NULL,
  visitorEmail VARCHAR (25) NOT NULL,

  PRIMARY KEY (phoneNumber)
);

DROP TABLE IF EXISTS Complaint;
CREATE TABLE Complaint
(
  complaintId INT(10) NOT NULL ,
  title VARCHAR (25) NOT NULL ,
  content VARCHAR (1500) NOT NULL,
  date TIMESTAMP NOT NULL,
  type VARCHAR(30) NOT NULL,
  isOpen boolean NOT NULL,
  byVisitor boolean NOT NULL,
  employeeID VARCHAR(8) REFERENCES Employee(employeeId),
  visitorPhoneNumber VARCHAR (10) REFERENCES Visitor(phoneNumber),
  projectID int(5) NOT NULL REFERENCES Project (projectId),

  PRIMARY KEY (complaintID)
);

DROP TABLE IF EXISTS Comment;
CREATE TABLE Comment
(
  complaintId INT(10) NOT NULL REFERENCES Complaint(complaintId),
  employeeId VARCHAR(8) NOT NULL REFERENCES Employee(employeeId),
  date TIMESTAMP NOT NULL,
  content VARCHAR (1500) NOT NULL,

  PRIMARY KEY (complaintId,employeeId)
);

DROP TABLE IF EXISTS Status;
CREATE TABLE Status
(
  value boolean NOT NULL,
  complaintId INT(10) NOT NULL REFERENCES Complaint(complaintId),
  employeeId VARCHAR(8) NOT NULL REFERENCES Employee(employeeId),
  date TIMESTAMP NOT NULL,

  PRIMARY KEY (complaintId , employeeId)
);

