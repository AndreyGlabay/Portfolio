CREATE FUNCTION funcA(@a int)
RETURNS varchar(30)
AS 
BEGIN
	DECLARE @res varchar(30)
	IF (@a=0)
		BEGIN
		SET @res = 'This is zero, guys!'
		END
	ELSE IF (@a%2=0)
		BEGIN
		SET @res = 'Wow! Even!'
		END
	ELSE
		BEGIN
		SET @res = 'Wow! Odd!'
		END
RETURN @res
END
GO
PRINT dbo.funcA(11)
