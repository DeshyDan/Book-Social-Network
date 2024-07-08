/* tslint:disable */
/* eslint-disable */
import { FeedbackResponse } from './feedback-response';
export interface PageResponseFeedbackResponse {
  content?: Array<FeedbackResponse>;
  first?: boolean;
  last?: boolean;
  number?: number;
  size?: number;
  totalElements?: number;
  totalPages?: number;
}
