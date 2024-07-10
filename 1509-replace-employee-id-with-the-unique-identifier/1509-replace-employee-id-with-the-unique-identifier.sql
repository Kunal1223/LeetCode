# Write your MySQL query statement below
select EmployeeUNI.unique_id , Employees.name
from Employees
LEFT Join EmployeeUNI on EmployeeUNI.id = Employees.id