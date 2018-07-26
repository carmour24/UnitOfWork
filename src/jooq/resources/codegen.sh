#!/bin/sh
java --add-modules java.xml.bind -cp lib/jooq-3.11.2.jar:lib/jooq-meta-3.11.2.jar:lib/jooq-codegen-3.11.2.jar:lib/postgresql-42.2.2.jar:. org.jooq.codegen.GenerationTool /jooq-config.xml
