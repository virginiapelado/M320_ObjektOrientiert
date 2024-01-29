import React, { useState } from "react";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Modal from "@mui/material/Modal";
import { Button, IconButton } from "@mui/material";
import { ErrorMessage, Field, Form, Formik } from "formik";
import { Reviews } from "../../Service/Reviews";
import ReviewService from "../../Service/ReviewService";

const style = {
  position: "absolute" as "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 500,
  bgcolor: "background.paper",
  boxShadow: 24,
  p: 2,
};

export default function AddModal() {
  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const handleClose = () => setOpen(false);

  const [reviewDetails, setReviewDetails] = useState<Reviews>();

  return (
    <div>
      <IconButton onClick={handleOpen}>
        <Button>Write a review</Button>
      </IconButton>

      <Modal open={open} onClose={handleClose}>
        <Formik
          initialValues={{
            rating: null,
            reviewTitle: "",
            description: "",
            movie: reviewDetails?.movie,
            userReviews: reviewDetails?.userReviews,
          }}
          onSubmit={(values, { setSubmitting }) => {
            ReviewService()
              .postReviewById(
                values.rating!,
                values.reviewTitle!,
                values.description!,
                values.movie!,
                values.userReviews!
              )
              .then((reviewDetails) => {
                setReviewDetails(reviewDetails);
                console.log(reviewDetails?.id);
              });
          }}
        >
          <Box sx={style}>
            <IconButton onClick={handleClose}>
              <Button>Close</Button>
            </IconButton>
            <Typography variant="h6" align="center">
              Create new Author
            </Typography>
            <Form>
              <Typography align="center" sx={{ p: 2 }}>
                Rating:
                <Field type="number" name="rating" /> <br />
                <ErrorMessage name="rating" component="div" />
                Review Title:
                <Field type="text" name="reviewTitle" /> <br />
                <ErrorMessage name="reviewTitle" component="div" />
                Description:
                <Field type="text" name="description" /> <br />
                <ErrorMessage name="description" component="div" />
                Movie:
                <Field type="text" name="movie" /> <br />
                <ErrorMessage name="movie" component="div" />
                User Reviews:
                <Field type="text" name="userReviews" /> <br />
                <ErrorMessage name="userReviews" component="div" />
                <button type="submit">Submit</button>
              </Typography>
            </Form>
          </Box>
        </Formik>
      </Modal>
    </div>
  );
}
