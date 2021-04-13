package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrakonidOperative_40378 : Card() {
    override val id = 40378
    override val name = "龙人侦测者"
    override val description = "<b>战吼：</b> 如果你的手牌中有龙牌，便<b>发现</b>你对手牌库中一张牌的复制。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "他的工作是监视污手党和玉莲帮的一举一动。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/500ca6d9e1854b079defab91119c60827be23f56d71181243c21397ff18ad8e8.png"
}
