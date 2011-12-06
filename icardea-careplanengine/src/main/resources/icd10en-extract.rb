#!/usr/bin/env ruby

# Description: Generates xml file based on icd10 text file
# Author:      Andrei Zinca / IPA SA
# Date:        16 May 2007

#$KCODE = 'u'
#require 'jcode'

input = File.open('icd10en.txt');
output = File.open('icd10en.xml', 'w');

# Begin xml wrapper
output.puts '<?xml version="1.0" encoding="UTF-8"?>'
output.puts '<items>'

# Write the actual content
input.read.scan(/'(.*)','(.*)'/) { |code, desc| output.puts "<item code=\"#{code}\" desc=\"#{desc}\" />" }

# Close xml wrapper
output.puts '</items>'

# Release resources
input.close
output.close