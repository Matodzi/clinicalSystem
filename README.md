# clinicalSystem

# ***** Network Mode *****

# To run this application (locally) on network mode, start the springboot application and use the below url to call the service
# http://localhost:8080/clinicalSystem?filePath=<file-path>

# Where <file-path> is the actual path to the file on the server



# ***** Non-Network Mode *****

# To run this application (locally) on non-network mode, please refer to the commands below
# mvn clean install
# java -cp target/clinicalSystem-1.0-SNAPSHOT.jar za.co.clinicalsystem.ClinicalSystemApplication nonnetwork

# Where "nonnetwork" is an argument passed to trigger the non-network mode




#               --- PLEASE IGNORE ----

# The following was used to test the application locally ...


# ***** Network Mode *****

# http://localhost:8080/clinicalSystem?filePath=/home/matodzi/Documents/assignmentTest.txt



# ***** Non-Network Mode *****

# java -Ddebug -cp target/clinicalSystem-1.0-SNAPSHOT.jar za.co.clinicalsystem.ClinicalSystemApplication nonnetwork
# /home/matodzi/Documents/assignmentTest.txt
