package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightElder_38868 : Card() {
    override val id = 38868
    override val name = "暮光尊者"
    override val description = "在你的回合结束时，使你的克苏恩 获得+1/+1<i>（无论它在哪里）。</i>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "真搞不懂现在暮光的年轻人都在想些什么，整天沉迷于漫画书和摇滚乐。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b356079a1aeedf7fe5ac56a81d7e17b5b0ad2c4829c9edf7ce46e7c0c0519fdb.png"
}
