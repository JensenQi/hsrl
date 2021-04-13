package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HugeToad_2918 : Card() {
    override val id = 2918
    override val name = "巨型蟾蜍"
    override val description = "<b>亡语：</b>随机对一个敌人造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "它呱呱起来没完没了，对所有人造成成吨的伤害。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/46cd28aefb5d1042e97d67071c1167e44ab42ced28a7bee6ccfef94bf91204fc.png"
}
