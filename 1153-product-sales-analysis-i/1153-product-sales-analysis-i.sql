# Write your MySQL query statement below
Select Product.product_name , Sales.year , Sales.price 
from Sales
Join Product on Product.product_id = Sales.product_id