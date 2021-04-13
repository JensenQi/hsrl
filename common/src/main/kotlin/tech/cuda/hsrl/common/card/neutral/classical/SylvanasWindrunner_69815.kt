package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SylvanasWindrunner_69815 : Card() {
    override val id = 69815
    override val name = "希尔瓦娜斯·风行者"
    override val description = "<b>亡语：</b>随机获得一个敌方随从的控制权。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "没有人比女王更渴望真正地死去。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b620726acbd7f1d9e474569af9b5bfb386d5b2810538abc2f15a408f0b1f7e2.png"
}
