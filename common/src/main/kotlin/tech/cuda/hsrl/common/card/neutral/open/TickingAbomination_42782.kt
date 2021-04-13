package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TickingAbomination_42782 : Card() {
    override val id = 42782
    override val name = "自爆憎恶"
    override val description = "<b>亡语：</b>对你所有的随从造成5点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "名字的重点在第二个字。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3ba9415f7256e451e2004d16440c2ccae42b63d5bf4651b572ef07a69ad7c61.png"
}
