#!/bin/sh

#mysql -uroot -pcloudera  </home/cloudera/Desktop/EP/s.sql
#path=$1
#q=/home/cloudera/Desktop/EP/s.sql 
#mysql -uroot -pcloudera -A -e "set @path=${path}; source \"$q\";" 

mysql -uroot -pcloudera </home/cloudera/Desktop/EP/s.sql
sqoop import --connect jdbc:mysql://localhost/TS --username root --password cloudera  --table project --hive-import
