package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SideshowSpelleater_2573 : Card() {
    override val id = 2573
    override val name = "杂耍吞法者"
    override val description = "<b>战吼：</b>复制对手的英雄技能。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "嘿！我也想试试你的英雄技能……"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a82da2c7535efcb4a9acba6720c333b4e024b20e71869f8b85a13199597fc31.png"
}
