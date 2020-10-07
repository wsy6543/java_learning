#学生表
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20), -- 姓名
	city VARCHAR(10), -- 城市
	age INT -- 年龄
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#老师表
CREATE TABLE teacher(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20) -- 姓名
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#课程表
CREATE TABLE course(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20), -- 课程名
	teacher_id INT,  -- 外键 对应老师表 主键id
	FOREIGN KEY (teacher_id) REFERENCES teacher(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#学生与课程中间表
CREATE TABLE student_course(
	student_id INT, -- 外键 对应学生表主键
	course_id INT, -- 外键 对应课程表主键
	score INT,	-- 某学员 某科的 考试分数
	FOREIGN KEY (student_id) REFERENCES student(id),
	FOREIGN KEY (course_id) REFERENCES course(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




第一题
-- 1、查询平均成绩大于70分的同学的学号,姓名,和平均成绩
-- 1.1 分组查询每个学生的 学号,姓名,平均分
-- 1.2 增加条件：平均成绩大于70
select s.id, s.name, s.city, s.age, avg(c.score) as avg_score from student s join student_course c where s.id = c.student_id group by s.id having avg_score > 70;


第二题
-- 2. 查询所有同学的学号、姓名、选课数、总成绩
-- 2.1 需要查询两张表 student表和 student_course表
-- 2.2 需要使用 student_id 学号字段,进行分组
-- 2.3 需要使用到 count函数 sum函数
select s.id, s.name, count(*) as num, sum(score) as score from student s join student_course c where s.id = c.student_id group by s.id


第三题
-- 3. 查询学过赵云老师课程的同学的学号、姓名
-- 3.1 查询赵云老师的id
-- 3.2 根据老师ID,在课程表中查询所教的课程编号
-- 3.3 将上面的子查询作为 where 后面的条件
select * from student where id in (select student_id from student_course where course_id in (select id from course where teacher_id = (select id from teacher where name = "赵云")))



第四题
-- 4. 查询选课 少于三门学科的学员
-- 4.1 查询每个学生学了几门课 条件1：小于等于三门
-- 4.2 查询 学号和姓名， 将4.1 作为临时表
select * from student where id in (select student_id from (select student_id, count(*) as num from student_course group by student_id having num < 3) a)