# jubot-template

[![Dependency Status](https://www.versioneye.com/user/projects/54e74670d1ec573c99000ba5/badge.svg?style=flat)](https://www.versioneye.com/user/projects/54e74670d1ec573c99000ba5)

A Leiningen template for [jubot](https://github.com/liquidz/jubot).

This template is based on [jubot-sample](https://github.com/liquidz/jubot-sample/).

## Usage

 * Create project
```
lein new jubot YOUR_BOT_PROJECT
```
 * Deploy to heroku
```
cd YOUR_BOT_PROJECT
git init
git add .gitignore *
git commit -am "first commit"

heroku apps:create
heroku addons:add rediscloud
git push heroku master
```

## License

Copyright (c) 2015 [@uochan](http://twitter.com/uochan)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
