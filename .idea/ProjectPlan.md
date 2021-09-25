Week 5 Add new user, display list of users.

Week 6 Time out from Java to get the visuals up!  HTML, CSS and either flexbox or bootstrap, TBD.

Week 7 Update user information, temporary version of deleting a user so there is full CRUD on one table in 
time for checkpoint 2.  Note that my professional developement presentation is this week also, and I hope to 
include a live injection demo - the Week to site is vulnerable.  The indie uses Hibernate, and should not be 
vulnerable to the most basic injection attacks.

Week 8 Set up table for user's travel stories, with at least basic read and add.  Build out display screen.
Most travel stories will include an image, so the database will have links.

Week 9 Deploy on time, debug on AWS. Login will need to be ready at this point, user deletion will require
an administrative login.

Week 10 Add search by location or activity.

Week 11 Add route planner feature.  Consumes web service, maybe Google maps.  Should also check for train,
bus and boat options as applicable.  

Week 12 Try to add flagging or some kind of complaint feature.  This is a bit vague at this point, but the
idea is that a registered user can note a travel story or post if something is wrong.  This could be as simple
as an outdated price to something that the site explicitly states is forbidden, such as mentioning prositutes.

Week 13 If I make any attempt to get separation of duties to work, this is the time.  The concept is that no 
one admin can kick a user off the site, no matter what the reason.  (One admin can delete a post.)  Marking 
which admin has already started the process is simple, as is allowing any other admin to finish the job.  What's
hard is unit testing a two-step process.

Week 14 Catch up, test and debug.  No more features added this late.