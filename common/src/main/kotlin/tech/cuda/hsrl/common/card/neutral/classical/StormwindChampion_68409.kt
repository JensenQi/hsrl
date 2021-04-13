package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormwindChampion_68409 : Card() {
    override val id = 68409
    override val name = "暴风城勇士"
    override val description = "你的其他随从获得+1/+1。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "在死亡之翼攻击主城的时候，这个士兵是小队中唯一活下来的一个。现在，他已经变得忍辱负重，镇定自若了。"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6a40a4ae075ef279b90579ced76d35202e0ab2cea1837c5b4745487df4e32321.png"
}
