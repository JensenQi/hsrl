package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuardianAnimals_59539 : Card() {
    override val id = 59539
    override val name = "动物保镖"
    override val description = "从你的牌库中召唤两只法力值消耗小于或等于（5）点的野兽，并使其获得<b>突袭</b>。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "入学须知中明确指出：“学生可携带一只铁喙猫头鹰，一只猫或一只蟾蜍。”但他们可没说是多大的动物。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f92e3cd77d2652f4520c4fb8557ebb5b8ca30e63f156a5f647ca861af6cb10fb.png"
}
