package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ogremancer_59918 : Card() {
    override val id = 59918
    override val name = "食人魔巫术师"
    override val description = "每当你的对手施放一个法术，召唤一个2/2并具有<b>嘲讽</b>的骷髅。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "第三次试验之后，萨格开始怀疑克鲁尔是在故意召唤骷髅。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7178428fd8292fb64bcdd9e00a4cac69ece71d8a76f9dc5fd101440241cb4435.png"
}
