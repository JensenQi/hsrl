package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SahketSapper_54011 : Card() {
    override val id = 54011
    override val name = "沙赫柯特工兵"
    override val description = "<b>亡语：</b>随机将一个敌方随从移回对手的 手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“喏，你随从掉了。”"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/580c5336cebfc1cb57fbad0b95cdfcf7fc44a2add9c0326046f57db64f287beb.png"
}
