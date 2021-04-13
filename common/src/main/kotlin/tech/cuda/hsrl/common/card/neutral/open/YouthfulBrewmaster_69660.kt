package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YouthfulBrewmaster_69660 : Card() {
    override val id = 69660
    override val name = "年轻的酒仙"
    override val description = "<b>战吼：</b>使一个友方随从从战场上移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "他对酿酒的热忱并不意味着他有出色的酿酒技术。别碰魔古烈酒！"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d6373ac2b193745691dc9c2bff92f40528e50fc855753e1dec9cdd488b88d2b.png"
}
