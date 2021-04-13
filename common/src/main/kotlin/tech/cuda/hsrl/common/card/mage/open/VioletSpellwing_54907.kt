package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletSpellwing_54907 : Card() {
    override val id = 54907
    override val name = "紫罗兰魔翼鸦"
    override val description = "<b>亡语：</b>将一张“奥术飞弹”法术牌置入你的 手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "一鸟在手，抵得三弹在坟。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3e84a469a34f50d3ea84e614becb58a2aa6d0afd1e43aa8bd102a900412a0fd.png"
}
