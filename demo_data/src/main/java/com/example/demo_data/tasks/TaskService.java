package com.example.demo_data.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;


@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private OtherApiGateway otherApiGateway;

    @Transactional
    public void process() {
        taskRepository.findAll();
        taskRepository.count();
        otherApiGateway.callService();
    }

    @Autowired
    private TransactionTemplate transactionTemplate;

    public void process2() {
        transactionTemplate.execute(status -> {
            withTx();
            return 0;
        });
        otherApiGateway.callService();
    }

    public void withTx() {
        taskRepository.findAll();
        taskRepository.count();
    }



}
