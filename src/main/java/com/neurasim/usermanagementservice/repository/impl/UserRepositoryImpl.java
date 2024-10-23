package com.neurasim.usermanagementservice.repository.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neurasim.jooq.user_task_management.Tables;
import com.neurasim.jooq.user_task_management.tables.records.UserRecord;
import com.neurasim.usermanagementservice.model.UserDetails;
import com.neurasim.usermanagementservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Objects;

import static com.neurasim.jooq.user_task_management.tables.User.USER;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final DSLContext dslContext;
    private final ObjectMapper objectMapper;

    @Override
    public Boolean createUser(UserDetails userDetails) {
        try {
            dslContext.insertInto(Tables.USER)
                    .set(Tables.USER.NAME, userDetails.getName())
                    .set(Tables.USER.EMAIL, userDetails.getEmail())
                    .set(Tables.USER.CREATEDAT, fetchLocalDateTime())
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            //use log4j for logs later
            System.out.printf("Exception occurred while creating user entry in DB. UserDetails: %s. Time: %s", userDetails, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }


    @Override
    public Boolean updateUser(Long userId, UserDetails userDetails) {
        try {
            dslContext.update(Tables.USER)
                    .set(Tables.USER.NAME, userDetails.getName())
                    .set(Tables.USER.EMAIL, userDetails.getEmail())
                    .where(Tables.USER.ID.eq(userId))
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            // use log4j for logs later
            System.out.printf("Exception occurred while updating user entry in DB. UserDetails: %s. Time: %s", userDetails, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public UserDetails fetchUserById(Long userId) {
         try {
             UserRecord userRecord = dslContext.selectFrom(Tables.USER)
                     .where(Tables.USER.ID.eq(userId))
                     .fetchOne();
             if (userRecord == null) {
                 return null;
             } else {
                 UserDetails user = new UserDetails();
                 user.setId(userRecord.get(USER.ID));
                 user.setName(userRecord.get(USER.NAME));
                 user.setEmail(userRecord.get(USER.EMAIL));
                 user.setCreatedAt(userRecord.get(USER.CREATEDAT));
                 return user;
             }
         } catch (Exception ex) {
             System.out.printf("Exception occurred while fetching user by ID from DB. UserId: %s, Time: %s", userId, fetchLocalDateTime());
             throw new RuntimeException(ex);
         }
    }

    @Override
    public List<UserDetails> fetchAllUsers() {
        try {
            return dslContext.select()
                    .from(Tables.USER)
                    .fetch()
                    .map(record -> {
                        UserDetails user = new UserDetails();
                        user.setId(record.get(USER.ID));
                        user.setName(record.get(USER.NAME));
                        user.setEmail(record.get(USER.EMAIL));
                        user.setCreatedAt(record.get(USER.CREATEDAT));
                        return user;
                    });
        } catch (Exception ex) {
            System.out.printf("Exception occurred while fetching list of all users from DB. Time: %s", fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Boolean deleteUserById(Long userId) {
        try {
            dslContext.deleteFrom(Tables.USER)
                    .where(Tables.USER.ID.eq(userId))
                    .execute();
            return Boolean.TRUE;
        } catch (Exception ex) {
            System.out.printf("Exception occurred while deleting a user by userId from DB. UserId: %s, Time: %s", userId, fetchLocalDateTime());
            throw new RuntimeException(ex);
        }
    }

    //move to utils package later
    private LocalDateTime fetchLocalDateTime() {
        long currentTimeMillis = System.currentTimeMillis();
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(currentTimeMillis), ZoneId.systemDefault());
    }
}
