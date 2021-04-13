package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CairneBloodhoof_69851 : Card() {
    override val id = 69851
    override val name = "凯恩·血蹄"
    override val description = "<b>亡语：</b>召唤一个4/5的贝恩·血蹄。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "凯恩被加尔鲁什杀害了，所以...别把这张牌放在战士的套牌里，这完全说不通。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/080e87286f4e4687b4ac80f61a728f14270bea4329c98a8ec8d266d58bce264c.png"
}
