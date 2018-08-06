x=\"
y=\"
echo "Here"
#n=$1
#a=$2
#r=$3
#c=$4
#e=$5
#p=$6



#echo $x$1$y
#echo $2
#echo $3
#echo $4
#echo "e"
#echo p


#hql="INSERT INTO students(name,attendace,roll_no,class,email,phone) VALUES ((${hiveconf:name}),${hiveconf:attendance},${hiveconf:roll},(${hiveconf:class}),(${hiveconf:email}),${hiveconf:phone})"


#hive --hiveconf name=$x$1$y --hiveconf attendance=$2 --hiveconf roll=$3 --hiveconf class=$x$4$y --hiveconf email=$x$5$y --hiveconf phone=$6 -f students.hql

hive --hiveconf name=$1 --hiveconf attendance=$2 --hiveconf roll=$3 --hiveconf class=$4 --hiveconf email=$5 --hiveconf phone=$6 -f students.hql
