package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YouthfulBrewmaster_69829 : Card() {
    override val id = 69829
    override val name = "年轻的酒仙"
    override val description = "<b>战吼：</b>使一个友方随从从战场上移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他对酿酒的热忱并不意味着他有出色的酿酒技术。别碰魔古烈酒！"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0eedf00b74550cde99aa5ebad7ffb000b309b7f500c1fbaaaaaade4310c08ea6.png"
}
