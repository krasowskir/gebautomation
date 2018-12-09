# gebautomation

**Du brauchst den geckodriver
**lege ihn irgendwo auf deinem System ab

**dann git clone das Repository
** schließlich führst du ein mvn clean install aus mit dem Geckodriver in den Systemproperties
** -X sorgt für debug

mvn clean install -Dwebdriver.gecko.driver=/opt/geckodriver -X
