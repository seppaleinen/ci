# Server 
	http://localhost:8153/go
	/var/lib/go-server       #contains the binaries and database
	/etc/go                  #contains the pipeline configuration files
	/var/log/go-server       #contains the server logs
	/usr/share/go-server     #contains the start script
	/etc/default/go-server   #contains all the environment variables with default values. These variable values can be changed as per requirement.
	You can replicate a GoCD server with all the pipeline, stage, job, tasks and materials definitions/configuration intact.

	To do this, the administrator should copy cruise-config.xml from the config directory to the new server and clear serverId attribute of server tag.
