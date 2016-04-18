import groovy.util.slurpersupport.GPathResult
import groovyx.net.http.HTTPBuilder

def http = new HTTPBuilder('http://www.google.com')

def html = http.get( path : '/search', query : [q:'Groovy'] )

assert html instanceof GPathResult
assert html.HEAD.size() == 1
assert html.BODY.size() == 1
