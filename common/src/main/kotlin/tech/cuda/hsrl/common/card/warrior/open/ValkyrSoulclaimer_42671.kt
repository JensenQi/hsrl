package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ValkyrSoulclaimer_42671 : Card() {
    override val id = 42671
    override val name = "瓦格里摄魂者"
    override val description = "在该随从受到伤害并没有死亡后，召唤一个2/2的食尸鬼。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "我的食尸鬼朋友马上就回来，你摊上事儿了，你摊上大事儿了。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7970f4081163c256f134129323f2d21b15ffec67b92df8155e4a39209045cdaa.png"
}
