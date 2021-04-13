package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WickerflameBurnbristle_40636 : Card() {
    override val id = 40636
    override val name = "燃鬃·自走炮"
    override val description = "<b>圣盾，嘲讽，吸血</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "燃鬃在污手党混迹多年，一直得不到重用。其中最主要的原因就是他开炮的速度太慢了，经常错过最佳时机。后来他把自己的胡子点着了，顺利得到了晋升。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc5594950ee06f02e95a184537652919a549a174652b8c93857c622a7770f3fb.png"
}
