CREATE FUNCTION dbo.CircleS (@D dec(6,3)) -- dbo.CircleS – create func like DB, @... variable introduced
RETURNS dec(6,3) -- return parameter: dec(6,3) –decimal number, 6 characters in total, 3 of 6 after «.»
BEGIN -- function start 
RETURN (PI()/4)*POWER(@D, 2) -- the function itself 
END -- function end 
GO -- start of function execution 
PRINT dbo.CircleS(15) -- action - display the function-DB, where the value of the variable = 15
