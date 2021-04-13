package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YouthfulBrewmaster_415 : Card() {
    override val id = 415
    override val name = "年轻的酒仙"
    override val description = "<b>战吼：</b>使一个友方随从从战场上移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他对酿酒的热忱并不意味着他有出色的酿酒技术。别碰魔古烈酒！"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3e82eebe2537ca20beba1620266c2ff82bfc0cccb2f910f33b33b8b68e1725d.png"
}
