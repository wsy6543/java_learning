--1) 查询工资最高的员工是谁？
select * from employee where salary = (select max(salary) from employee)

--2) 查询工资小于平均工资的员工有哪些？
select * from employee where salary < (select avg(salary) from employee)

--3) 查询大于5000的员工，来至于哪些部门，输出部门的名字
select * from employee e join dept d where e.salary > 5000 and e.dept_id =  d.id;

--4) 查询开发部与财务部所有的员工信息，分别使用子查询和表连接实现
select * from employee e join dept d where d.name in ("开发部", "财务部") and e.dept_id =  d.id;


--5) 查询2011年以后入职的员工信息和部门信息，分别使用子查询和表连接实现
select * from employee e join dept d where e.join_date > "2011" and e.dept_id =  d.id;