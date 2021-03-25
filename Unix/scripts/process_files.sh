#!/bin/bash
# Task 1-1. Processing files

# Process the specified files only if the user enters exactly 3 command line arguments.
if [ "$#" != 3 ]; then
	echo "Please enter exactly 3 command line arguments as file types."
else
	flist=0_summary  # The general name of a file containing the expected summary.
	
	unzip -qu un_sorted_files.zip  # Decompress the ZIP file in the scripts directory without prompting.
	echo "Decompressed the ZIP file."
	mkdir $1 $2 $3 miscellaneous
	echo "Created the 4 directories."
	
	# Loop through the 3 file types.
	for type in $@; do
		# Expand the file type scope when the file type is doc/docx or jpg/jpeg, so as to move the files of "similar" file types to the same directory.
		# Both uppercase and lowercase are considered.
		# TODO: You may get an error at the following line when using `sh` to run the script file because of Dash used by Ubuntu by default. I suggest using `source` or `./` instead to run Bash.
		if [ ${type,,} = doc ] || [ ${type,,} = docx ]; then
			scope="un_sorted_files/*.doc un_sorted_files/*.DOC un_sorted_files/*.docx un_sorted_files/*.DOCX"
		else
			if [ ${type,,} = jpg ] || [ ${type,,} = jpeg ]; then
				scope="un_sorted_files/*.jpg un_sorted_files/*.JPG un_sorted_files/*.jpeg un_sorted_files/*.JPEG"
			else
				scope="un_sorted_files/*.${type,,} un_sorted_files/*.${type^^}"
			fi
		fi
		
		for file in $scope; do
			if [ -f "$file" ]; then
				mv "$file" $type  # Move files to corresponding directories.
			fi
		done
		
		ls -I $flist.txt -lhS $type | awk '{print $9, $5}' | column -t > $type/$flist.txt  # Create a file containing a "table" of file names and sizes in the corresponding directory sorted by size order.
		
		# Supplement the file containing directory labels and files in each directory sorted in reverse alphabetical order.
		echo "....$type files...." >> $flist.txt
		ls -I $flist.txt -r $type >> $flist.txt
		echo "" >> $flist.txt
	done

	mv un_sorted_files/* miscellaneous  # Move the remaining files to the miscellaneous folder.
	ls -I $flist.txt -S miscellaneous > miscellaneous/$flist.txt  # Create a file containing a list of files in the miscellaneous folder sorted by size order.
	
	# Supplement the file containing directory labels and files in each directory sorted in reverse alphabetical order.
	echo "....miscellaneous files...." >> $flist.txt
	ls -I $flist.txt -r miscellaneous >> $flist.txt
	
	echo "Sorted the specified files and generated 5 summaries."
fi

######################### TODO: Personal Reflection #########################
# In accordance with the test results which are all as expected, the script
# files can well achieve the requirements of Task 1. For the script file
# processing the specified files, it first decompresses the ZIP file, and
# then performs any necessary operations to sort the files and generates
# summaries in the specified directories. As for the clean-up script file, it
# simply removes all the directories and files in the scripts directory. This
# task is mainly completed on a Ubuntu virtual machine with the help of some
# materials including the Linux lab (especially Part 4), the Unix command
# reference in the pre-reading section of Week 5, and the `--help` option of
# commands. The last one is really straightforward and often helpful enough.
# For example, by using `ls --help`, how to sort the list of files in REVERSE
# alphabetical order becomes clear. Apart from this skill in exploring Unix
# shell commands, there are many other things learned in this task. A
# significant one is that further steps have been taken to understand the
# command line where Linux's strength lies. For instance, the way to ouput to
# a file directly. Basic scripting becomes more familiar. Although there are
# many positive aspects during the process, improvements do exist. Next time
# sorting a similar task out, thinking in advance is necessary. In other
# words, it is better to have some logic design to avoid wasting time on
# modifying code recursively. Anyway, with the practice of this task, any task
# like this should be done more efficiently, since it gets more familiar.
#############################################################################
