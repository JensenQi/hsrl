package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HecklefangHyena_63252 : Card() {
    override val id = 63252
    override val name = "乱齿土狼"
    override val description = "<b>战吼：</b>对你的英雄造成3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "它咬你不是新闻，你咬它才是。"
    override val artist = "Jeremy Cranford"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e11bc9a012babc298ff8271de11ac312aa3ca04b68dabbe47682d46e89b738be.png"
}
