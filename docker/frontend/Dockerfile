FROM node:18.12 as build-stage


RUN npm i -g pnpm

WORKDIR /app

COPY package*.json ./

RUN pnpm install

COPY . .

RUN pnpm run build

FROM nginx:alpine

COPY nginx.conf /etc/nginx/nginx.conf

COPY --from=build-stage /app/dist/book-network-ui /usr/share/nginx/html

EXPOSE 80