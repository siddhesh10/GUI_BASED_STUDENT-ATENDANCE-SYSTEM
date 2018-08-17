from Tkinter import *
import Tkinter, Tkconstants, tkFileDialog
import subprocess
import threading
import os

def delete_search_student():
	entry_search_attendance.delete(0,"end")
def delete_search_class():
	entry_search_class.delete(0,"end")

def search_class():
	studc=search_c.get()#class
	try:
	  	int(studc)
		x="Please Enter valid class eg-->6th.."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_search_class()
		return
	except:
		t=Text(ctr_right,height=350,width=200,bg="lime green",fg="black",font=("Helvetica",15,"bold"))
	 	scrollbar_v=Scrollbar(t,width=20)
	 	scrollbar_h=Scrollbar(t,orient=HORIZONTAL,width=20)
	 	t.configure(yscrollcommand=scrollbar_v.set,xscrollcommand=scrollbar_h.set)
	 	scrollbar_v.config(command=t.yview)
	 	scrollbar_h.config(command=t.xview)
         	scrollbar_v.grid(row=0,column=1,ipady=220)
	 	scrollbar_h.grid(row=44,column=0,ipadx=625)
	 	t.grid(row=0,column=0)	
		subprocess.call('./search_c.sh {0}'.format(studc),shell=True)
		print("********************************************************************************")
		p = subprocess.Popen('./file.sh',stdout=subprocess.PIPE,stderr=subprocess.PIPE)
	 	output, errors = p.communicate()
	 	t.insert("end", output)
		delete_search_class()
		
	


def search_attendance():
	s=search_a.get()#atten
	studa=s[0:len(s)-1]
	try:
		temp=int(studa)

		t=Text(ctr_right,height=350,width=200,bg="lime green",fg="black",font=("Helvetica",15,"bold"))
	 	scrollbar_v=Scrollbar(t,width=20)
	 	scrollbar_h=Scrollbar(t,orient=HORIZONTAL,width=20)
	 	t.configure(yscrollcommand=scrollbar_v.set,xscrollcommand=scrollbar_h.set)
	 	scrollbar_v.config(command=t.yview)
	 	scrollbar_h.config(command=t.xview)
         	scrollbar_v.grid(row=0,column=1,ipady=220)
	 	scrollbar_h.grid(row=44,column=0,ipadx=625)
	 	t.grid(row=0,column=0)	
		subprocess.call('./search_a.sh {0}'.format(studa),shell=True)
		print("********************************************************************************")
		p = subprocess.Popen('./file.sh',stdout=subprocess.PIPE,stderr=subprocess.PIPE)
	 	output, errors = p.communicate()
	 	t.insert("end", output)
		delete_search_student()
		
	except:
		x="Please Enter numbers in attendance with %.eg-->84%.."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_search_student()
		return


def browse_func():
    filename = tkFileDialog.askopenfilename(initialdir = "/",title = "Select file",filetypes = (("jpeg files","*.jpg"),("all files","*.*")))
    name_label = Label(btm_frame, text=filename,fg="red",font=("Helvetica",25,"bold"),bg="gray")
    name_label.grid(row=0,column=0)
    #subprocess.call('./y.sh {0}'.format(filename),shell=True)
    toplevel = Toplevel()
    label1 = Label(toplevel, text="SUCCEFULLY INSERTED", height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    label1.grid(row=0,column=0)
    
def show_database():
	
	 t=Text(ctr_right,height=350,width=200,bg="lime green",fg="black",font=("Helvetica",15,"bold"))
	 scrollbar_v=Scrollbar(t,width=20)
	 scrollbar_h=Scrollbar(t,orient=HORIZONTAL,width=20)
	 t.configure(yscrollcommand=scrollbar_v.set,xscrollcommand=scrollbar_h.set)
	 scrollbar_v.config(command=t.yview)
	 scrollbar_h.config(command=t.xview)
         scrollbar_v.grid(row=0,column=1,ipady=220)
	 scrollbar_h.grid(row=44,column=0,ipadx=625)
	 t.grid(row=0,column=0)
	 subprocess.call('./z.sh ',shell=True)
	 p = subprocess.Popen('./file.sh',stdout=subprocess.PIPE,stderr=subprocess.PIPE)
	 output, errors = p.communicate()
	 t.insert("end", output)
	 
def get_data_student():
	
	studn=sa.get()#name
	s=sb.get()#atten
	studa=s[0:len(s)-1]
	studr_no=sc.get()#roll
	studc=sd.get()#class
        e=se.get()#email
	stude=e[-1:-5:-1]
	studp=sf.get()#phone
	
        if (studn=='') or (s=='') or (studr_no=='') or (studc=='') or (e=='') or (studp==''):
		toplevel = Toplevel()
    		label1 = Label(toplevel, text="You can't submit empty Information..", height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return
	
	try:
		temp=int(studn)
		x="Please Enter word in Name."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return
	except:
		pass

	if len(s)==3 and s[-1]=='%':
		pass
	else:
		x="Please Enter two numbers in attendance with %.eg-->84%."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return		
	
	try:
		temp=int(studa)
	except:
		x="Please Enter numbers in attendance with %.eg-->84%.."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return
			
	try:
		temp=int(studr_no)
	except:
		x="Please Enter numbers in roll_no."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return
	
        if stude=="moc.":
		stude=e
		pass
	else:
		x="Please Enter valid Email."
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return
	
        if len(studp)!=12:
		x="Please Enter 10 digit phone_no starting with 91"
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return
	try:
		temp=int(studp)
		
	except:
		x="Please Enter 10 digit phone_no starting with 91"
		toplevel = Toplevel()
    		label1 = Label(toplevel, text=x, height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    		label1.grid(row=0,column=0)
		delete_data_student()
		return

	
	subprocess.call('./x.sh {0} {1} {2} {3} {4} {5}'.format(studn,studa,studr_no,studc,stude,studp),shell=True)
	delete_data_student()
	toplevel = Toplevel()
    	label1 = Label(toplevel, text="SUCCEFULLY INSERTED", height=0, width=50,font=("Helvetica",25,"bold"),bg="coral",fg="black")
    	label1.grid(row=0,column=0)


def delete_data_student():
	entry_name_s.delete(0,"end")
	entry_attendance_s.delete(0,"end") 
	entry_roll_s.delete(0,"end")
	entry_class_s.delete(0,"end")
	entry_email_s.delete(0,"end")
	entry_phone_s.delete(0,"end")

root = Tk()
root.title('BIG DATA MADE EASY')
root.geometry ("{0}x{1}".format(700, 500))
# create all of the main frames
top_frame = Frame(root, bg='gray', width=690, height=100, pady=3)
center = Frame(root, bg='lavender', width=690, height=100, padx=3, pady=3)
btm_frame = Frame(root, bg='LightBlue1', width=690, height=300, pady=3)
# layout all of the main frames
root.grid_rowconfigure(1, weight=1)
root.grid_columnconfigure(0, weight=1)
top_frame.grid(row=0, sticky="ew")
center.grid(row=1, sticky="nsew")
btm_frame.grid(row=3, sticky="ew")
# create the widgets for the top frame
name_label = Label(top_frame, text='					ATTENDANCE SYSTEM			',fg="black",font=("Helvetica",25,"bold"),bg="gray")
name_label.grid(row=0,columnspan=3)
#deviding centre_frame (student/teacher) 
ctr_left = Frame(center, bg='lavender', width=350, height=200, padx=3, pady=3)
ctr_right = Frame(center, bg='lavender', width=350, height=200, padx=3, pady=3)
# create the center_left widgets(students)
sa=StringVar()
sb=StringVar()
sc=StringVar()
sd=StringVar()
se=StringVar()
sf=StringVar()
#writing student on top
student_label = Label(ctr_left, text='	StuDenT		',fg="blue",font=("Helvetica",25,"bold"),bg="lavender")
student_label.grid(row=1,columnspan=2)
#creating input labels
name_label = Label(ctr_left, text='Name:',fg="coral",font=("Helvetica",25,"bold"),bg="lavender")
attendance_label = Label(ctr_left, text='Attendance:',fg="coral",font=("Helvetica",25,"bold"),bg="lavender")
roll_label = Label(ctr_left, text='Roll no:',fg="coral",font=("Helvetica",25,"bold"),bg="lavender")
class_label = Label(ctr_left, text='Class:',fg="coral",font=("Helvetica",25,"bold"),bg="lavender")
email_label = Label(ctr_left, text='Email:',fg="coral",font=("Helvetica",25,"bold"),bg="lavender")
phone_label = Label(ctr_left, text='Phone:',fg="coral",font=("Helvetica",25,"bold"),bg="lavender")
#creating entries
entry_name_s = Entry(ctr_left, background="white",font=("Helvetica",25,"bold"),textvariable=sa)
entry_attendance_s = Entry(ctr_left, background="white",font=("Helvetica",25,"bold"),textvariable=sb)
entry_roll_s = Entry(ctr_left,background="white",textvariable=sc,font=("Helvetica",25,"bold"))
entry_class_s = Entry(ctr_left, background="white",font=("Helvetica",25,"bold"),textvariable=sd)
entry_email_s = Entry(ctr_left, background="white",font=("Helvetica",25,"bold"),textvariable=se)
entry_phone_s = Entry(ctr_left, background="white",font=("Helvetica",25,"bold"),textvariable=sf)
#finally grid
name_label.grid(row=4, column=0,sticky=E)
entry_name_s.grid(row=4, column=1)
attendance_label.grid(row=5, column=0,sticky=E)
entry_attendance_s.grid(row=5, column=1)
roll_label.grid(row=6, column=0,sticky=E)
entry_roll_s.grid(row=6, column=1)
class_label.grid(row=7, column=0,sticky=E)
entry_class_s.grid(row=7, column=1)
email_label.grid(row=8, column=0,sticky=E)
entry_email_s.grid(row=8, column=1)
phone_label.grid(row=9, column=0,sticky=E)
entry_phone_s.grid(row=9, column=1)
#creating buttons
buttonstudent=Button(ctr_left,text="Submit",command=get_data_student,width=10,font=("Helvetica",15,"bold"))
buttonstudent.grid(row=10,column=1)
buttonstudentb=Button(ctr_left,text="Browse and Import",command=browse_func,font=("Helvetica",15,"bold"))
buttonstudentb.grid(row=11,column=1)
buttonstudentb=Button(ctr_left,text="show database",command=show_database,font=("Helvetica",15,"bold"))
buttonstudentb.grid(row=12,column=1)

ctr_left.grid(row=0, column=1, sticky="nsew")
ctr_right.grid(row=0, column=2, sticky="nsew")

search_a=StringVar()
search_c=StringVar()

search_attendance_label = Label(btm_frame, text='Students having Attendace < than',fg="red",font=("Helvetica",25,"bold"),bg="LightBlue1")
search_class_label = Label(btm_frame, text='Students in Class:',fg="red",font=("Helvetica",25,"bold"),bg="LightBlue1")
entry_search_attendance = Entry(btm_frame, background="white",font=("Helvetica",25,"bold"),textvariable=search_a)
entry_search_class = Entry(btm_frame, background="white",font=("Helvetica",25,"bold"),textvariable=search_c)

search_attendance_label.grid(row=1,column=0,sticky=E)
entry_search_attendance.grid(row=1,column=1)
search_class_label.grid(row=2,column=0,sticky=E)
entry_search_class.grid(row=2,column=1)

buttonsearch=Button(btm_frame,text="Search and Show",command=search_attendance,font=("Helvetica",15,"bold"))
buttonsearch.grid(row=1,column=3)
buttonsearc=Button(btm_frame,text="Search and Show",command=search_class,font=("Helvetica",15,"bold"))
buttonsearc.grid(row=2,column=3)

root.mainloop()
