package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrBoom_2078 : Card() {
    override val id = 2078
    override val name = "砰砰博士"
    override val description = "<b>战吼：</b> 召唤两个1/1的砰砰机器人。<i>警告：该机器人随时可能爆炸。</i>"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "让你见识一下他的厉害！"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b422c6a7ebe73e9525875446b70381bdbcc060c3c29e13c764b6513b85bc0391.png"
}
