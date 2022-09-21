FROM tomcat

COPY target/Servlets.war /usr/local/tomcat/webapps/

# docker build -t mytomcat .
# docker run -it -p 8080:8080 --rm mytomcat
