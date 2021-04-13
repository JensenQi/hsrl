package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormwindChampion_753 : Card() {
    override val id = 753
    override val name = "暴风城勇士"
    override val description = "你的其他随从获得+1/+1。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "在死亡之翼攻击主城的时候，这个士兵是小队中唯一活下来的一个。现在，他已经变得忍辱负重，镇定自若了。"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a494b7a2e4b4839bc62b5dc065bfcdeb51aac6b86b429c8ebfdab9ccc1b18c17.png"
}
