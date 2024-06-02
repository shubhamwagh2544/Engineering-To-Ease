import mongoose from "mongoose";

const EmployeeSchema = new mongoose.Schema({
    id: Number,
    name: String,
    salary: Number
})
const Employee = mongoose.model('Employee', EmployeeSchema);

async function findSecondHighestSalary() {
    try {
        mongoose.connect('')

        const res =
            await Employee.aggregate([              // aggregation pipeline
                { $sort: { salary: -1 } },
                { $group: { _id: "$salary" } },
                { $skip: 1 },
                { $limit: 1 }
            ])                                      // [ { "_id": 6000 } ]

        return res.length > 0 ? res[0]._id : null
    }
    catch (err) {
        console.log('query failed', err)
    }
}