package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnearthedRaptor_2891 : Card() {
    override val id = 2891
    override val name = "石化迅猛龙"
    override val description = "<b>战吼：</b>选择一个友方随从，获得其<b>亡语</b>的复制。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Loe
    override val background = "它至今还在寻找将其射杀的凶手。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/92fdd6914e4308d1903116258729c289820e015e01a74d84ef590149998bcd74.png"
}
