# Python 3 code
import urllib.request, urllib.parse, urllib.error
 
url = 'http://www.blog.pythonlibrary.org/wp-content/uploads/2012/06/wxDbViewer.zip'
 
print("downloading with urllib")
urllib.request.urlretrieve(url, "code.zip")
 
print("downloading with urllib2")
f = urllib.request.urlopen(url)
data = f.read()
with open("code2.zip", "wb") as code:
    code.write(data)