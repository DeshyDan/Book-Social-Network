/* tslint:disable */
/* eslint-disable */
import { Injectable } from '@angular/core';

/**
 * Global configuration
 */
@Injectable({
  providedIn: 'root',
})
export class ApiConfiguration {
  rootUrl: string = 'http://localhost/api/v1';
}

/**
 * Parameters for `ApiModule.forRoot()`
 */
export interface ApiConfigurationParams {
  rootUrl?: string;
}
