import { bootstrapApplication } from '@angular/platform-browser';
import { Secondcomp } from './app/secondcomp/secondcomp';
import { Login } from './app/login/login';
import { Inlinecomp } from './app/inlinecomp/inlinecomp';
import { appConfig } from './app/app.config';
import { App } from './app/app';

// bootstrapApplication(App, appConfig)
//   .catch((err) => console.error(err));

// bootstrapApplication(Secondcomp, appConfig)
//   .catch((err) => console.error(err));

// bootstrapApplication(Login)
//   .catch(err => console.error(err));

bootstrapApplication(Inlinecomp)
  .catch(err => console.error(err));
