package com.example.physicsquiz

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.physicsquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFinish.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Please confirm!")
            builder1.setMessage("Are you sure you want to Finish the test?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("YES", DialogInterface.OnClickListener { dialogInterface, i ->
                // Close the application
                finish()
            })
            builder1.setNegativeButton("NO", DialogInterface.OnClickListener { dialogInterface, i ->
                // Do Nothing
            })
            builder1.show()
        }

        binding.btn1.setOnClickListener {
            val builder2 = AlertDialog.Builder(this);
            builder2.setTitle("Select the correct option")
            val optionList1 =arrayOf("Very Low Frequency", "Very High Frequency", "Tetrahertz Radiation", "Ultra High Frequency")
            builder2.setSingleChoiceItems(optionList1,0, DialogInterface.OnClickListener { dialogInterface, i ->
                // correct answer is very high frequency
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->
                // Close the application
            })
            builder2.setNegativeButton("DISMISS", DialogInterface.OnClickListener { dialogInterface, i ->
                // Do Nothing
            })
            builder2.show()
        }

        binding.btn2.setOnClickListener {
            val builder3 = AlertDialog.Builder(this);
            builder3.setTitle("Select the correct option")
            val optionList2 = arrayOf(
                "Bats",
                "Dogs",
                "Dolphins",
                "All of the above"
            )
            builder3.setSingleChoiceItems(
                optionList2,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is all of the above
                })
            builder3.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application

                })
            builder3.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder3.show()
        }

        binding.btn3.setOnClickListener {
            val builder4 = AlertDialog.Builder(this);
            builder4.setTitle("Select the correct option")
            val optionList3 = arrayOf(
                "Momentum",
                "Position",
                "Acceleration",
                "Shape"
            )
            builder4.setSingleChoiceItems(
                optionList3,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is its Position
                })
            builder4.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application

                })
            builder4.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder4.show()
        }

        binding.btn4.setOnClickListener {
            val builder5 = AlertDialog.Builder(this);
            builder5.setTitle("Select the correct options")
            val optionList4 = arrayOf(
                "Change in pitch of the sound",
                "Change resonant frequency",
                "Change in the length of resonator",

            )
            builder5.setMultiChoiceItems(optionList4, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                // correct answer is 1,2,3
            })
            builder5.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder5.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder5.show()
        }

        binding.btn5.setOnClickListener {
            val builder6 = AlertDialog.Builder(this);
            builder6.setTitle("Select the correct option")
            val optionList5 = arrayOf(
                "A force of 1 dyne causes a displacement of 1 cm.",
                "A force of 1 dyne causes a displacement of 1 m.",
                "A force of 1 N causes a displacement of 1 cm.",
                "A force of 1 N causes a displacement of 1 m."
            )
            builder6.setSingleChoiceItems(
                optionList5,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is D
                })
            builder6.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder6.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder6.show()
        }

        binding.btn6.setOnClickListener {
            val builder7 = AlertDialog.Builder(this);
            builder7.setTitle("Select the correct option")
            val optionList6 = arrayOf(
                "Momentum",
                "Inertia",
                "Acceleration",
                "Friction"
            )
            builder7.setSingleChoiceItems(
                optionList6,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is Inertia
                })
            builder7.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder7.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder7.show()
        }

        binding.btn7.setOnClickListener {
            val builder8 = AlertDialog.Builder(this);
            builder8.setTitle("Select the correct option")
            val optionList7 = arrayOf(
                "AC is free from voltage fluctuations in comparison to DC",
                "AC can be transmitted over long distances with minimum power loss",
                "In contrast with AC, DC can not be used for high voltage devices",
                "In contrast with AC, DC cannot be run through a transformer",
                "In contrast with AC, DC can not be used in metal-plating applications."
            )
            builder8.setMultiChoiceItems(optionList7, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                // correct answer is 2,3,4
            })
            builder8.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder8.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder8.show()
        }

        binding.btn8.setOnClickListener {
            val builder9 = AlertDialog.Builder(this);
            builder9.setTitle("Select the correct option")
            val optionList8 = arrayOf(
                "Pitch",
                "Resonant Frequency",
                "Timbre"

            )
            builder9.setMultiChoiceItems(optionList8, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                // correct answer is 1,2,3
            })
            builder9.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder9.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder9.show()
        }

        binding.btn9.setOnClickListener {
            val builder10 = AlertDialog.Builder(this)
            builder10.setTitle("Select the correct option")
            val optionList9 = arrayOf(
                "Detect cracks and flaws in metal blocks",
                "Echocardiography",
                "Treatment of Kidney stones",
                "Cleaning of odd shaped objects"
            )
            builder10.setMultiChoiceItems(optionList9, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                // correct answer is 1,2,3,4
            })
            builder10.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder10.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder10.show()
        }

        binding.btn10.setOnClickListener {
            val builder11 = AlertDialog.Builder(this);
            builder11.setTitle("Select the correct option")
            val optionList10 = arrayOf(
                "Only 1",
                "Only 2",
                "Both 1 & 2",
                "Neither 1 nor 2"
            )
            builder11.setSingleChoiceItems(
                optionList10,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is only 1
                })
            builder11.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder11.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder11.show()
        }

        binding.btn11.setOnClickListener {
            val builder12 = AlertDialog.Builder(this);
            builder12.setTitle("Select the correct option")
            val optionList11 = arrayOf(
                "Increased",
                "Decreased",
                "Increased or decreased",
                "None of them"
            )
            builder12.setSingleChoiceItems(
                optionList11,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is Increased or decreased
                })
            builder12.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder12.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder12.show()
        }

        binding.btn12.setOnClickListener {
            val builder13 = AlertDialog.Builder(this);
            builder13.setTitle("Select the correct option")
            val optionList12 = arrayOf(
                "Concave lenses",
                "Concave mirror",
                "Convex mirror",
                "Plane mirror"
            )
            builder13.setMultiChoiceItems(optionList12, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                // correct answer is 1,2,3,4,5
            })
            builder13.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder13.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder13.show()
        }

        binding.btn13.setOnClickListener {
            val builder14 = AlertDialog.Builder(this);
            builder14.setTitle("Select the correct option")
            val optionList13 = arrayOf(
                "Weak Nuclear Force",
                "Strong Nuclear Force",
                "Electromagnetic Force",
                "Gravitational Force"
            )
            builder14.setSingleChoiceItems(
                optionList13,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is strong nuclear force
                })
            builder14.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder14.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder14.show()
        }

        binding.btn14.setOnClickListener {
            val builder15 = AlertDialog.Builder(this);
            builder15.setTitle("Select the correct option")
            val optionList14 = arrayOf(
                "10^2",
                "10^36",
                "10^12",
                "2"
            )
            builder15.setSingleChoiceItems(
                optionList14,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is 10^36
                })
            builder15.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder15.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder15.show()
        }

        binding.btn15.setOnClickListener {
            val builder16 = AlertDialog.Builder(this);
            builder16.setTitle("Select the correct option")
            val optionList15 = arrayOf(
                "Electromagnetic Force",
                "Gravitational Force",
                "Centripetal Force",
                "Nuclear Force"
            )
            builder16.setSingleChoiceItems(
                optionList15,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is garvitational force
                })
            builder16.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder16.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder16.show()
        }

        binding.btn16.setOnClickListener {
            val builder17 = AlertDialog.Builder(this);
            builder17.setTitle("Select the correct option")
            val optionList16 = arrayOf(
                "Slug",
                "a.m.u",
                "Hyperkg",
                "C.S.L"
            )
            builder17.setSingleChoiceItems(
                optionList16,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is C.S.L
                })
            builder17.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder17.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder17.show()
        }

        binding.btn17.setOnClickListener {
            val builder18 = AlertDialog.Builder(this);
            builder18.setTitle("Select the correct option")
            val optionList17 = arrayOf(
                "Astronomical Unit",
                "Light year",
                "Par sec",
                "slug"
            )
            builder18.setSingleChoiceItems(
                optionList17,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is slug
                })
            builder18.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder18.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder18.show()
        }

        binding.btn18.setOnClickListener {
            val builder19 = AlertDialog.Builder(this);
            builder19.setTitle("Select the correct option")
            val optionList18 = arrayOf(
                "Displacement",
                "Force",
                "Both a and b",
                "None"
            )
            builder19.setSingleChoiceItems(
                optionList18,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is both a and b
                })
            builder19.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder19.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder19.show()
        }

        binding.btn19.setOnClickListener {
            val builder20 = AlertDialog.Builder(this);
            builder20.setTitle("Select the correct option")
            val optionList19 = arrayOf(
                "reciprocal to each other",
                "equal to each other",
                "no relation between them",
                "Time period is one half of the Frequency"
            )
            builder20.setSingleChoiceItems(
                optionList19,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is reciprocal to each other
                })
            builder20.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder20.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder20.show()
        }

        binding.btn20.setOnClickListener {
            val builder21 = AlertDialog.Builder(this);
            builder21.setTitle("Select the correct option")
            val optionList20 = arrayOf(
                "Bulk modulus",
                "Thermal strain",
                "Thermal stress",
                "Force constant"
            )
            builder21.setSingleChoiceItems(
                optionList20,
                0,
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // correct answer is force constant
                })
            builder21.setPositiveButton(
                "SUBMIT",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Close the application
//                    finish()
                })
            builder21.setNegativeButton(
                "DISMISS",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    // Do Nothing
                })
            builder21.show()
        }

    }
}