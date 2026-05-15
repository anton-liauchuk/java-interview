select name, max(age) from persons group by name;

select name, age from persons group by name, age having count('name') > 1
