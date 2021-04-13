package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CuttingClass_60023 : Card() {
    override val id = 60023
    override val name = "劈砍课程"
    override val description = "抽两张牌。你的武器每有1点攻击力，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "这门课能教你什么叫“砍费”。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a8523f20388796087208727c853a97db59a880af13aedccba8cfe1a06333860e.png"
}
