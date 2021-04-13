package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WrappedGolem_53439 : Card() {
    override val id = 53439
    override val name = "被缚的魔像"
    override val description = "<b>复生</b> 在你的回合结束时，召唤一只1/1并具有<b>嘲讽</b>的甲虫。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "史上最强的背-box大赛总冠军。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/10143d7bca1acc08ee4af84cdc4d19baf1de88d3c3d1e056dd2fa73d19ab4dc5.png"
}
