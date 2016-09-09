------------------------* Employee *------------------------
INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345678','صالح أحمد','Operation Manager','ghaida@elm.sa');

INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345671','عبدالرحمن محمد','Operation Supervisor','sara@elm.sa');

INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345679','فيصل خالد','Regional Director','lamia@elm.sa');

INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345672','محمد عبدالعزيز','Branch Manager','mohammed@elm.sa');

INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345673','عبدالله خالد','Branch Manager','abdullah@elm.sa');

INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345674','فهد عادل','ِEmployee','fahad@elm.sa');

INSERT INTO Employee(employeeId,employeeName,position,employeeEmail)
VALUES ('12345675','ناصر صالح','Employee','nasser@eml.sa');


------------------------* Project *------------------------
insert into Project(projectId, name, city , branch, branchManager, regionalDirector)
values(1,'الأحوال','الرياض', '103','12345673' , '12345671' );

insert into Project(projectId, name , city , branch, branchManager, regionalDirector)
values(2,'طاقات','الرياض', '104' , '12345672' , '12345671');



------------------------* Works On *------------------------
INSERT INTO WorksON(employeeId , projectId)
VALUES ('12345674' , 1);
INSERT INTO WorksON(employeeId , projectId)
VALUES ('12345675' , 2);



------------------------* Visitor *------------------------
INSERT INTO Visitor(phoneNumber,visitorName,visitorEmail)
VALUES ('0506804510','Sara','sara@gmail.com');

INSERT INTO Visitor(phoneNumber,visitorName,visitorEmail)
VALUES ('0506844510','Ghaida','ghaida@gmail.com');


------------------------* Complaint *------------------------
-- By Branch Manager
INSERT INTO Complaint(complaintID,title,content,date,type,isOpen,byVisitor,employeeID,visitorPhoneNumber,projectID)
VALUES (1,'إضاءة المبنى سيئة','content',CURRENT_TIMESTAMP ,'عامة',1,0,'12345673',null ,1);

INSERT INTO Complaint(complaintID,title,content,date,type,isOpen,byVisitor,employeeID,visitorPhoneNumber,projectID)
VALUES (2,'أداء الموظف سيء','content',CURRENT_TIMESTAMP ,'على موظف',1,0,'12345673',null ,1);


-- By Employee
INSERT INTO Complaint(complaintID,title,content,date,type,isOpen,byVisitor,employeeID,visitorPhoneNumber,projectID)
VALUES (3,'مماطلة الصيانة','content',CURRENT_TIMESTAMP ,'عامة',1,0,'12345675',null,1);


INSERT INTO Complaint(complaintID,title,content,date,type,isOpen,byVisitor,employeeID,visitorPhoneNumber,projectID)
VALUES (4,'طول الدوام في رمضان',
'السلام عليكم ورحمة الله وبركاته،
من غير المعقول أن يعمل الموظف بشهر رمضان لمدة سبعة ساعات ونصف يومياً حيث يبدأ الدوام من الساعه٩:٣٠ص حتى الساعه٠٥:٠٠م!
للموظف حقوق يجب مراعاتها ويجدر بكم عدم تحميل الموظف فوق طاقته.
أرجو منكم إعادة النظر في ضبط وقت الدوام.
'
,CURRENT_TIMESTAMP,'عامة',1,0,'12345675',null,2);



-- By Visitor
INSERT INTO Complaint(complaintID,title,content,date,type,isOpen,byVisitor,employeeID,visitorPhoneNumber,projectID)
VALUES (5,'!تأخر الرد','content',CURRENT_TIMESTAMP ,'على موظف',1,1,null,'0506804510',2);

INSERT INTO Complaint(complaintID,title,content,date,type,isOpen,byVisitor,employeeID,visitorPhoneNumber,projectID)
VALUES (6,'تعامل الموظف سيء','content',CURRENT_TIMESTAMP ,'على موظف',0,1, null,'0506804510',1);


------------------------* Comment *------------------------

INSERT INTO Comment (complaintId,employeeID,date,content)
VALUES  (4,'12345671',CURRENT_TIMESTAMP ,'.تم مناقشة تعديل نظام وقت الدوام في رمضان، وسيصلكم الإعلان قريبًا بخصوص وقت الدوام الجديد');


------------------------* Status *------------------------
INSERT INTO Status (complaintId,employeeId,date,value)
VALUES (4,'12345679',CURRENT_TIMESTAMP , 1);

INSERT INTO Status (complaintId,employeeId,date,value)
VALUES (4,'12345671',CURRENT_TIMESTAMP , 0);

