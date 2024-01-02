SELECT * FROM issdb1.employee;
SELECT DISTINCT EmployeeAge FROM issdb1.employee;
SELECT * FROM issdb1.employee WHERE EmployeeAge > 21;
SELECT * FROM issdb1.employee WHERE (EmployeeDept = 'IT' AND EmployeeAge > 21) OR (EmployeeDept = 'Development' AND EmployeeAge > 20);
SELECT * FROM issdb1.employee ORDER BY EmployeeAge;
UPDATE issdb1.employee SET EmployeeAge = 30 WHERE EmployeeID = 1;
DELETE FROM issdb1.employee WHERE EmployeeID = 2;
SELECT * FROM issdb1.employee;
SELECT * FROM issdb1.employee LIMIT 2;
SELECT * FROM issdb1.employee WHERE EmployeeName LIKE 'Sa%';
SELECT * FROM issdb1.employee WHERE EmployeeID IN (1, 3);
SELECT * FROM issdb1.employee WHERE EmployeeAge BETWEEN 20 AND 25;
SELECT EmployeeName AS "Name" FROM issdb1.employee;
SELECT issdb1.employee.EmployeeID, issdb1.employee.EmployeeName, issdb1.employee.EmployeeDept, issdb1.department.DepartmentName, issdb1.department.DepartmentZone,issdb1.department.idDepartment
FROM issdb1.employee
INNER JOIN issdb1.department ON issdb1.department.DepartmentName = issdb1.employee.EmployeeDept ;
SELECT issdb1.employee.EmployeeID, issdb1.department.idDepartment,  issdb1.employee.EmployeeName
FROM issdb1.employee
LEFT JOIN issdb1.department ON issdb1.department.DepartmentName = issdb1.employee.EmployeeDept ;
SELECT issdb1.employee.EmployeeID, issdb1.department.idDepartment,  issdb1.employee.EmployeeName
FROM issdb1.employee
RIGHT JOIN issdb1.department ON issdb1.department.DepartmentName = issdb1.employee.EmployeeDept ;
SELECT issdb1.employee.EmployeeID, issdb1.department.idDepartment,  issdb1.employee.EmployeeName
FROM issdb1.employee
FULL JOIN issdb1.department ON issdb1.department.DepartmentName = issdb1.employee.EmployeeDept ;
SELECT * FROM issdb1.employee;
SELECT  issdb1.employee.EmployeeID FROM issdb1.employee
UNION
SELECT issdb1.department.DepartmentName FROM issdb1.department;
ALTER TABLE issdb1.employee ADD CONSTRAINT chk_age CHECK (EmployeeAge > 20);
ALTER TABLE issdb1.employee DROP CONSTRAINT chk_age;
SELECT EmployeeDept, SUM(EmployeeAge) AS total_Age
FROM issdb1.employee
GROUP BY EmployeeDept;
SELECT EmployeeDept, SUM(EmployeeAge) AS total_Age
FROM issdb1.employee
GROUP BY EmployeeDept
HAVING SUM(Employeeage) > 23;











