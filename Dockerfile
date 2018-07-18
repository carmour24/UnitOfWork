FROM postgres:latest

RUN mkdir /var/lib/postgresql/data/uow

ENV PGDATA /var/lib/postgresql/data/uow

EXPOSE 5432

VOLUME /var/lib/postgresql/data/uow

#RUN chown -R postgres:postgres /var/lib/postgresql/

# Select postgres user before initialising DB. Can't be done as root and should be done by postgres user
# USER postgres

# Initialise new postgres DB
# ONBUILD if [!-e /var/lib/postgresql/data/uow/postgresql.conf] \
#   then \
#     echo "initdb" \
#     /usr/lib/postgresql/10/bin/initdb -U postgres /var/lib/postgresql/data/uow \
#   fi

