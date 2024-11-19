# ServerSeekerV2

ServerSeekerV2 is a complete rewrite of the original ServerSeeker in Java. It takes a JSON output file from [masscan](https://github.com/robertdavidgraham/masscan) and uses it as input to asynchronously ping each IP address on the port returned using a [Server List Ping](https://wiki.vg/Server_List_Ping). This returns the server's information, which is then stored in a PostgreSQL database. 

Unlike the original ServerSeeker, V2 has some additional features:
- Faster
- Open Source
- Configurable
- Self-hostable (Host your own scanner and database!)
- Support for searching servers based on Forge mods
- Ability to detect if (some) servers are running in cracked mode

**Please Note:**
This is just the backend. There is no frontend yet for easily searching for servers from the database. I plan to make a Discord bot and a page on my website to handle this, so don't worry.

## Currently Under Heavy Development
ServerSeekerV2 is **NOT** production-ready! Please report any issues you find. Although I am likely aware of most of them already, tracking them is helpful.

### Currently Lacking Features:
- Async and concurrency support (it will be unusably slow for large scans)
- General code cleanup and refactoring

### Long-term Goals:
- Bedrock support
- Support for scanning across multiple servers for increased scanning speed

## Getting Started
Currently, there are no prebuilt JAR files. You will have to build it yourself. Thankfully, this is easy:
1. Clone or download the repository locally.
2. Run `./gradlew buildShadow`. The JAR file will be located in the `build/libs` folder.

### Getting Server IP Information
To retrieve information about a server's IP address (e.g., country, ASN), you will need an account with [IpInfo](https://ipinfo.io). 
1. After creating an account, go to your dashboard.
2. Your token should be at the bottom of the page.
3. Place this token in the `config.json` file.

## Storing Data in the Database

### Setting Up PostgreSQL
To store information in a database, you will need to set up PostgreSQL.

### Installation
#### Ubuntu
```sh
sudo apt-get install postgresql
```
#### Arch
```sh
sudo pacman -S postgresql
```

  
### Configuration
```sh
sudo -u postgres psql
```
After that you should get a terminal like this  
```
postgres=#
```  
Run the commands below to create a new user:  
```sql
ALTER USER postgres with encrypted password 'your_password';
```
Then put the new password in the `config.json` file.

## Special thanks
- [EngurRuzgar](https://github.com/EngurRuzgar): Documentation and providing me with valid testing servers
- [coolGi](https://github.com/coolGi69): Code cleanup and general tips
