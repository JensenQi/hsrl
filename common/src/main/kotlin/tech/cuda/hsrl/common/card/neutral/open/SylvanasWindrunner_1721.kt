package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SylvanasWindrunner_1721 : Card() {
    override val id = 1721
    override val name = "希尔瓦娜斯·风行者"
    override val description = "<b>亡语：</b>随机获得一个敌方随从的控制权。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "没有人比女王更渴望真正地死去。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c26952fb987c640d75ced8f826b3909d8898c1b168135b6a0a8fc4cf40d2916.png"
}
