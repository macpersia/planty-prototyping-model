// package models.prototyping;

import { ActionResponse as SuperActionResponse } from 'planty-assistant-model';

export class ActionResponse<T> extends SuperActionResponse {

    constructor(readonly statusCode: number, readonly body?: T) {
        super(statusCode);
    }
}
