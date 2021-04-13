package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterOfCeremonies_2493 : Card() {
    override val id = 2493
    override val name = "庆典司仪"
    override val description = "<b>战吼：</b>如果你控制任何具有<b>法术伤害</b>的随从，便获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "台风热辣，魅力四射！"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8eedb46b032d482cdcfd968816b2eba921dd447eee6b8ab989788c9a02a34aa4.png"
}
