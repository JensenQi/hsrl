package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Crush_2020 : Card() {
    override val id = 2020
    override val name = "重碾"
    override val description = "消灭一个随从。如果你控制任何受伤的随从，该法术的法力值消耗减少（4）点。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "“使用这张卡牌时的感觉将令你毕生难忘。”许多野蛮人都会这么对你说。"
    override val artist = "Michael Sutfin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7eaad8a71194875262504caa764bf7926bdf2cea4fa579cfe3bcd02f7edabde.png"
}
