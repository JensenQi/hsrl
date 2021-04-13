package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CairneBloodhoof_420 : Card() {
    override val id = 420
    override val name = "凯恩·血蹄"
    override val description = "<b>亡语：</b>召唤一个5/5的贝恩·血蹄。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "凯恩被加尔鲁什杀害了，所以...别把这张牌放在战士的套牌里，这完全说不通。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68650da6c24f7018b56954d39d0ed1446fe0f69193298945d6c68197a8cdcefc.png"
}
