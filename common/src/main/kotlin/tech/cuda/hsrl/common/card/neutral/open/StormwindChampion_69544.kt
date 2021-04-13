package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormwindChampion_69544 : Card() {
    override val id = 69544
    override val name = "暴风城勇士"
    override val description = "你的其他随从获得+1/+1。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "在死亡之翼攻击主城的时候，这个士兵是小队中唯一活下来的一个。现在，他已经变得忍辱负重，镇定自若了。"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8754d93dfd5995887ab435e604d15a2b9a439592fd1b8745a02cc12174e4266a.png"
}
