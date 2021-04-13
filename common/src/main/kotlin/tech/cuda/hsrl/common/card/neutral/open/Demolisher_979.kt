package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demolisher_979 : Card() {
    override val id = 979
    override val name = "攻城车"
    override val description = "在你的回合开始时，随机对一个敌人造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "攻城这件事一点儿也不好玩，而且通常还不怎么奏效，因为现在人人都有飞行坐骑。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8a2ce7cd82aff552217de5c02aa280fa3301665226647ba4c1de7e7cae7052c0.png"
}
