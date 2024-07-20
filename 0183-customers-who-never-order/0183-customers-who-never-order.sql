# Write your MySQL query statement below
Select c.name as Customers
from Customers c
where c.id not in 
(
    Select c.id
    from Customers c inner join Orders o
    on c.id = o.customerId
)