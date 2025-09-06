# Write your MySQL query statement below
select project.project_id,round(avg(Employee.experience_years), 2) as average_years 
 from Employee  inner join project on project.employee_id = Employee.employee_id group by project.project_id ;