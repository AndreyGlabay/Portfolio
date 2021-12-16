CREATE FUNCTION func(@a  int,  @b  int)
RETURNS int
AS 
BEGIN 
RETURN  (@a*@b)
END;
GO
SELECT dbo.func(5,  8) 
