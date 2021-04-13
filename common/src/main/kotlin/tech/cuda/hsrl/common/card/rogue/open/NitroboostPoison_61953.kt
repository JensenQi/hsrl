package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NitroboostPoison_61953 : Card() {
    override val id = 61953
    override val name = "氮素药膏"
    override val description = "使一个随从获得+2攻击力。<b>腐蚀：</b>并使你的武器获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "倒进油箱里的冰牛奶并不能提供氮气加速，但用来做胜利纪念甜点却是一流。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f1ecd357561da71298d1ee0e54ce3a8c987a01cde3300054ee846ccd3b4836ee.png"
}
