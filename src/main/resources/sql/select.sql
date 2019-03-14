-- 6068,6070,6078,6087,6088,6089,6461,6462,6465,6466,6469,6496,6500,6503,6504,6507,6508,513366,513397,516924,536498,549684,549881,550194,

select * from station_no_repeat where 
name like '%人民桥%' or 
name like '%地王%' or 
name like '%深圳书城%' or 
name like '%门诊部%' or 
name like '%罗湖小学%' or
name like '%国贸%' or
name like '%新闻大厦%' or
name like '%荔枝公园%' 
order by name;


select l.line_no, ls.* , s.name
from line_station ls 
	left join line l on l.line_id = ls.line_id 
	left join station_no_repeat s on s.id = ls.station_id
where ls.station_id in 
(6068,6070,6078,6087,6088,6089,6461,6462,6465,6466,6469,6496,6500,6503,6504,6403,6480,6507,6508,513366,513397,516924,536498,549684,549881,550194)
order by veh_time;


select ls.*,s.name from line_station ls left join station_no_repeat s on s.id = ls.station_id where line_id = 22175 order by ls.veh_time