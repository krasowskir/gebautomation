# gebautomation

* Du brauchst den [geckodriver](https://github.com/mozilla/geckodriver/releases)

* lege ihn irgendwo auf deinem System ab

* dann git clone das Repository
* schließlich führst du ein mvn clean install aus mit dem Geckodriver in den Systemproperties
* -X sorgt für debug
* ersetze /opt/geckodriver mit deinem windows Pfad

```bash
mvn clean install -Dwebdriver.gecko.driver=/opt/geckodriver -X
```

