// package models.prototyping;

import { ActionRequest as SuperActionRequest } from 'planty-assistant-model';

export class ActionRequest extends SuperActionRequest {

    constructor(readonly action: string,
                readonly parameters: Map<string, string>) {
        super(action);
    }
}
